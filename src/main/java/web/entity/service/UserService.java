package web.entity.service;

import web.entity.models.User;
import java.util.List;

public interface UserService {
    void add(User user);
    List<User> allUsers();
    public User findById(Long id);
    void updateUser(User user);
    void deleteById(Long id);
}
