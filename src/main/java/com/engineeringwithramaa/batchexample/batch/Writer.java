package com.engineeringwithramaa.batchexample.batch;

import com.engineeringwithramaa.batchexample.DAO.UserDAO;
import com.engineeringwithramaa.batchexample.Entity.User;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Writer implements ItemWriter<User> {

    @Autowired
    private UserDAO userDAO;

    @Override
    public void write(List<? extends User> users) throws Exception {
        userDAO.saveAll(users);
        System.out.println("Writer Logging - User Data loaded into H2 db " + users);
    }
}
