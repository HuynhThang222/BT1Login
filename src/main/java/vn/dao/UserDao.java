package vn.dao;

import vn.model.User;

public interface UserDao {
	User get(String username);
}
