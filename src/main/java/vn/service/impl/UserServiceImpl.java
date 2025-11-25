package vn.service.impl;

import vn.dao.UserDao;
import vn.dao.impl.UserDaoImpl;
import vn.model.User;
import vn.service.UserService;

public class UserServiceImpl implements UserService {
	UserDao userDao = new UserDaoImpl();

	@Override
	public User login(String username, String password) {
	User user = this.get(username);
	if (user != null && password.equals(user.getPassWord())) {
	return user;
	}
	return null;
	}
	@Override
	public User get(String username) {
	return userDao.get(username);
	}
}
