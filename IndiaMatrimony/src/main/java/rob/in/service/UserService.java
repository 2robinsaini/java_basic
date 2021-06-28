package rob.in.service;

import java.util.List;

import javax.validation.Valid;

import rob.in.model.User;

public interface UserService {

	public List<User> getAllUsers();

	public void addUser(@Valid User user);

	public void updateUser(@Valid User user);


	
}
