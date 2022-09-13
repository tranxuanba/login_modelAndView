package com.macOfBa.dao;

import com.macOfBa.model.Login;
import com.macOfBa.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserDao {
    private static List<User> users;
    static {
        users = new ArrayList<>();
        User user = new User();
        user.setAge(20);
        user.setAccount("admin");
        user.setEmail("thoitran2107@gmail.com");
        user.setName("batran");
        user.setPassword("123456");
        users.add(user);
        User user1 = new User();
        user1.setAge(25);
        user1.setAccount("admin1");
        user1.setEmail("thoitran2107@gmail.com");
        user1.setName("batran1");
        user1.setPassword("1234567");
        users.add(user1);
        User user2 = new User();
        user2.setAge(30);
        user2.setAccount("admin2");
        user2.setEmail("thoitran2107@gmail.com");
        user2.setName("batran2");
        user2.setPassword("1234568");
        users.add(user2);
    }
    public static User checkLogin(Login login) {
        for (User u:
             users) {
            if (u.getAccount().equals(login.getAccount()) && u.getPassword().equals(login.getPassword())){
                return u;
            }
        }
        return null;
    }
}
