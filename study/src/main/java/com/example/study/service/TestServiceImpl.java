package com.example.study.service;

import com.example.study.dao.TestDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private TestDao testDao;

    public String getMember(){
        return testDao.getMember();
    }
}
