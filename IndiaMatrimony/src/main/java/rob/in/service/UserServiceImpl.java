package rob.in.service;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import rob.in.dao.UserDao;
import rob.in.model.User;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao usrDao;

	@Override
	public List<User> getAllUsers() {
		return usrDao.getAllUsers();
	}

	@Override
	public void addUser(@Valid User user) {
		usrDao.addUser(user);
	}

	@Override
	public void updateUser(@Valid User user) {
		usrDao.updateUser(user);
	}
	
	
}
