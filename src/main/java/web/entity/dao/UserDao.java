package web.entity.dao;


import web.entity.models.User;
import java.util.List;

public interface UserDao {
   void add(User user);
   public List<User> allUsers();
   public User findById(Long id);
   void updateUser(User user);
   void deleteById(Long id);
}
