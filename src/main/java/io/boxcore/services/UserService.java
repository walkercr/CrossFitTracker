package io.boxcore.services;

import io.boxcore.model.User;

import java.util.List;

/**
 * The User Service Interface.
 *
 * @author Craig Walker
 * @version 1.0
 * @since 8/16/2016
 *
 */
public interface UserService {
    List<User> getAllUsers();
    Integer createUser(User user);
    boolean updateUser(int id, User user);
    boolean deleteUser(int id);
}
