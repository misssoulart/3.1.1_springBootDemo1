package service;

import model.User;

import java.util.List;

public interface UserService {
     void addUser(User user);

     User updateUser (User user);

     void deleteUser (int id);

     User getUserById (int id);

     List<User> getUsers();
}
