package dao;

import entity.User;

import java.util.List;

public interface UserDao {
    public List<User> getAll();
    public void add(User user);
    public void update(User user);
    public void delete(User user);
}
