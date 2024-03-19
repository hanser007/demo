package com.yyb.Service;

import com.yyb.Dao.StuMapper;
import com.yyb.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class StuServiceImpl  implements StuService{

    @Autowired
    private StuMapper stuMapper;


    @Override
    public boolean getPS(String username, String password) {
        Student student = stuMapper.getPS(username);
        boolean bool = student != null && student.getPassword().equals(password);

        return bool;
    }
}

