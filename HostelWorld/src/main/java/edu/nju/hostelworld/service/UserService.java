package edu.nju.hostelworld.service;

import edu.nju.hostelworld.model.Record;
import edu.nju.hostelworld.model.User;

import java.util.List;

/**
 * Created by yyy on 2017/3/10.
 */
public interface UserService {

    User saveUser(User user);

    User updateUser(User user);

    void deleteUser(String username);

    User findUser(String username, String password);

    User findUser(String username);

    boolean isCardExist(String cardId);

    List<User> findAllUser();

    Record saveRecord(String message,double money,User user);

    List<Record> getRecordList(int userId);

    User pay(User user,double money);

    User addBalance(User user,double money);




}
