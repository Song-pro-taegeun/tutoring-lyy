package com.example.study.dao;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TestDao {
    String getMember();
}