package com.engineeringwithramaa.batchexample.batch;

import com.engineeringwithramaa.batchexample.Entity.User;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class Processor implements ItemProcessor<User, User> {

    private static Map<String, String> DEPT_NAMES = new HashMap<>();

    public Processor() {
        DEPT_NAMES.put("PW001","Software Engineering");
        DEPT_NAMES.put("TX14","Research & Development");
        DEPT_NAMES.put("MC990","IT Ops");
    }

    @Override
    public User process(User user) throws Exception {
        String departmentName = user.getDepartment();
        user.setDepartment(DEPT_NAMES.get(departmentName));
        System.out.println("Processor Logging - Department Name transformed from " + departmentName + " to "+ user.getDepartment());
        return user;
    }
}
