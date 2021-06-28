package rob.in.controller;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import javax.net.ssl.HttpsURLConnection;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import rob.in.model.User;
import rob.in.service.UserService;

@Controller
public class UserController {

	private String nextView = null;

	@Autowired
	private UserService usrService;

	@GetMapping("/")
	public String login(Model model) {
		nextView = "login";
		System.out.println("In Login page");
		return nextView;
	}

	@GetMapping("/error")
	public String error(Model model) {
		nextView = "login";
		System.out.println("In Login page");
		return nextView;
	}
	
	@GetMapping("/home")
	public String home(Model model,HttpSession session) {
		
		
		if (session.getAttribute("signinuser") == null) {
			return "login";
		}
		
		nextView = "home";
		return nextView;
	}

	
	@RequestMapping(value = "/signout", method = RequestMethod.POST)
	public String signout(ModelMap model, HttpSession session) {
		System.out.println(session.getAttribute("signinuser") + " Signout Successfully..");
		session.removeAttribute("signinuser");
		return "login";
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String showWelcomePage(ModelMap model, @RequestParam String username, @RequestParam String password,
			HttpSession session) {

		List<User> allUsers = usrService.getAllUsers();

		List<User> authUser = allUsers.stream().filter(user -> user.getEmail() != null
				&& user.getEmail().equals(username) && user.getPassword().equals(password)).collect(Collectors.toList());
		
		if (authUser.size()==1) {
			nextView = "home";
			session.setAttribute("signinuser", username);
			session.setAttribute("gender", authUser.get(0).getGender());
		} else {
			nextView = "login";
			model.addAttribute("msg", "Bad Credentials!");
		}

		return nextView;
	}

	@PostMapping("/update")
	public String getAllUsers(ModelMap map, @RequestParam(value = "email") String email, HttpSession session) {

		if (session.getAttribute("signinuser") == null) {
			return "login";
		}

		nextView = "signup";

		
		
		List<User> allUsers = usrService.getAllUsers();

		List<User> signInuser = allUsers.stream().filter(usr -> usr.getEmail() != null && usr.getEmail().equals(email))
				.collect(Collectors.toList());

		
		System.out.println("Email: " + email + " ==> " + signInuser.size());
		
		if (signInuser.size() > 0) {
			map.addAttribute("user", signInuser.get(0));
		} else {
			User user = new User();
			map.addAttribute("user", user);
		}

		return nextView;
	}

	@GetMapping("/users")
	public String getAllUsers(Model model, HttpSession session) {

		if (session.getAttribute("signinuser") == null) {
			return "login";
		}

		nextView = "users";
		List<User> allUsers = usrService.getAllUsers();

		allUsers = allUsers.stream().filter(usr -> !usr.getEmail().equals(session.getAttribute("signinuser")))
				.filter(usr -> !usr.getGender().equals(session.getAttribute("gender"))).collect(Collectors.toList());

		model.addAttribute("userList", allUsers);

		model.addAttribute("City", allUsers.stream().map(usr -> usr.getCity()).collect(Collectors.toSet()));
		model.addAttribute("State", allUsers.stream().map(usr -> usr.getState()).collect(Collectors.toSet()));

		model.addAttribute("Profession", allUsers.stream().map(usr -> usr.getProfession()).collect(Collectors.toSet()));
		model.addAttribute("Salary", allUsers.stream().map(usr -> usr.getSalary()).collect(Collectors.toSet()));
		model.addAttribute("Gotra", allUsers.stream().map(usr -> usr.getGotra()).collect(Collectors.toSet()));
		model.addAttribute("FoodType", allUsers.stream().map(usr -> usr.getFoodType()).collect(Collectors.toSet()));
		model.addAttribute("Religion", allUsers.stream().map(usr -> usr.getReligion()).collect(Collectors.toSet()));
		model.addAttribute("Cast", allUsers.stream().map(usr -> usr.getCast()).collect(Collectors.toSet()));
		return nextView;
	}

	@GetMapping("/filteruser")
	public String getfilteruser(Model model, @RequestParam(value = "state", required = false) String state,
			@RequestParam(value = "city", required = false) String city,
			@RequestParam(value = "profession", required = false) String profession,
			@RequestParam(value = "salary", required = false) String salary,
			@RequestParam(value = "gotra", required = false) String gotra,
			@RequestParam(value = "foodtype", required = false) String foodType,
			@RequestParam(value = "religion", required = false) String religion,
			@RequestParam(value = "cast", required = false) String cast, HttpSession session) {

		if (session.getAttribute("signinuser") == null) {
			return "login";
		}

		nextView = "users";
		List<User> allUsers = usrService.getAllUsers();

		System.out.println("Filter State " + state + " " + session.getAttribute("gender"));

		List<User> filterUser = allUsers;

		filterUser = filterUser.stream().filter(usr -> !usr.getEmail().equals(session.getAttribute("signinuser")))
				.filter(usr -> !usr.getGender().equals(session.getAttribute("gender"))).collect(Collectors.toList());
		
		
		if (state != null && !state.equals("")) {
			if (state.contains(",")) {
				List<String> stateList = Arrays.asList(state.split(","));
				filterUser = filterUser.stream().filter(usr -> stateList.contains(usr.getState()))
						.collect(Collectors.toList());
			} else {
				filterUser = filterUser.stream().filter(usr -> usr.getState().equals(state))
						.collect(Collectors.toList());
			}
		}

		if (city != null && !city.equals("")) {

			if (city.contains(",")) {
				List<String> cityList = Arrays.asList(city.split(","));
				filterUser = filterUser.stream().filter(usr -> cityList.contains(usr.getCity()))
						.collect(Collectors.toList());
			} else {
				filterUser = filterUser.stream().filter(usr -> usr.getCity().equals(city)).collect(Collectors.toList());
			}

		}

		if (profession != null && !profession.equals("")) {

			if (profession.contains(",")) {
				List<String> professionList = Arrays.asList(profession.split(","));
				filterUser = filterUser.stream().filter(usr -> professionList.contains(usr.getProfession()))
						.collect(Collectors.toList());
			} else {
				filterUser = filterUser.stream().filter(usr -> usr.getProfession().equals(profession))
						.collect(Collectors.toList());
			}

		}

		if (salary != null && !salary.equals("")) {

			if (salary.contains(",")) {
				List<String> salryList = Arrays.asList(salary.split(","));
				filterUser = filterUser.stream().filter(usr -> salryList.contains(usr.getSalary()))
						.collect(Collectors.toList());
			} else {
				filterUser = filterUser.stream().filter(usr -> usr.getSalary().equals(salary))
						.collect(Collectors.toList());
			}

		}

		if (gotra != null && !gotra.equals("")) {

			if (gotra.contains(",")) {
				List<String> gotraList = Arrays.asList(gotra.split(","));
				filterUser = filterUser.stream().filter(usr -> gotraList.contains(usr.getGotra()))
						.collect(Collectors.toList());
			} else {
				filterUser = filterUser.stream().filter(usr -> usr.getGotra().equals(gotra))
						.collect(Collectors.toList());
			}

		}

		if (foodType != null && !foodType.equals("")) {

			if (foodType.contains(",")) {
				List<String> foodList = Arrays.asList(foodType.split(","));
				filterUser = filterUser.stream().filter(usr -> foodList.contains(usr.getFoodType()))
						.collect(Collectors.toList());
			} else {
				filterUser = filterUser.stream().filter(usr -> usr.getFoodType().equals(foodType))
						.collect(Collectors.toList());
			}

		}

		if (religion != null && !religion.equals("")) {
			if (religion.contains(",")) {
				List<String> religionList = Arrays.asList(religion.split(","));
				filterUser = filterUser.stream().filter(usr -> religionList.contains(usr.getReligion()))
						.collect(Collectors.toList());
			} else {
				filterUser = filterUser.stream().filter(usr -> usr.getReligion().equals(religion))
						.collect(Collectors.toList());
			}
		}

		if (cast != null && !cast.equals("")) {
			if (cast.contains(",")) {
				List<String> castList = Arrays.asList(cast.split(","));
				filterUser = filterUser.stream().filter(usr -> castList.contains(usr.getCast()))
						.collect(Collectors.toList());
			} else {
				filterUser = filterUser.stream().filter(usr -> usr.getCast().equals(cast)).collect(Collectors.toList());
			}
		}

		model.addAttribute("userList", filterUser);

		model.addAttribute("City", allUsers.stream().map(usr -> usr.getCity()).collect(Collectors.toSet()));
		model.addAttribute("State", allUsers.stream().map(usr -> usr.getState()).collect(Collectors.toSet()));

		model.addAttribute("Profession", allUsers.stream().map(usr -> usr.getProfession()).collect(Collectors.toSet()));
		model.addAttribute("Salary", allUsers.stream().map(usr -> usr.getSalary()).collect(Collectors.toSet()));
		model.addAttribute("Gotra", allUsers.stream().map(usr -> usr.getGotra()).collect(Collectors.toSet()));
		model.addAttribute("FoodType", allUsers.stream().map(usr -> usr.getFoodType()).collect(Collectors.toSet()));
		model.addAttribute("Religion", allUsers.stream().map(usr -> usr.getReligion()).collect(Collectors.toSet()));
		model.addAttribute("Cast", allUsers.stream().map(usr -> usr.getCast()).collect(Collectors.toSet()));

		return nextView;
	}

	@PutMapping("/signup")
	public String signup(ModelMap map, HttpSession session) {

		if (session.getAttribute("signinuser") == null) {
			return "login";
		}

		nextView = "signup";
		User user = new User();
		map.addAttribute("user", user);
		return nextView;
	}

	@PostMapping("/addNewUsr")
	public String registration(@Valid @ModelAttribute("user") User user, BindingResult br, Model model,
			HttpSession session) {

		if (br.hasErrors()) {
			nextView = "registration";
			model.addAttribute("user", user);
			model.addAttribute("message", "Please Provide Proper Data!!");
			return nextView;
		} else {
			nextView = "users";

			System.out.println(user.toString());

			usrService.addUser(user);
			List<User> allUsers = usrService.getAllUsers();
			
			allUsers = allUsers.stream().filter(usr -> !usr.getEmail().equals(session.getAttribute("signinuser")))
					.filter(usr -> !usr.getGender().equals(session.getAttribute("gender"))).collect(Collectors.toList());
			
			model.addAttribute("userList", allUsers);
			return nextView;
		}

	}

	@GetMapping("/createUser")
	public String createUser() {

		nextView = "registration";
		return nextView;
	}

	@PostMapping("/createUser")
	public String createNewUser(Model model, HttpSession session) {

		User user = new User();
		model.addAttribute("user", user);
		nextView = "newuser";
		return nextView;
	}

	@PostMapping("/updateUser")
	public String addNewStd(@Valid @ModelAttribute("user") User user, BindingResult br, Model model,
			HttpSession session) {

		if (session.getAttribute("signinuser") == null) {
			return "login";
		}

		nextView = "home";
		usrService.updateUser(user);
		List<User> allUsers = usrService.getAllUsers();
		
		allUsers = allUsers.stream().filter(usr -> !usr.getEmail().equals(session.getAttribute("signinuser")))
				.filter(usr -> !usr.getGender().equals(session.getAttribute("gender"))).collect(Collectors.toList());
		
		model.addAttribute("userList", allUsers);
		return nextView;
	}

}
