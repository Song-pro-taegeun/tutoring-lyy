package com.example.study.service;

import com.example.study.dto.StudyUserDto;
import com.example.study.entity.StudyUser;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TestService {
    String getMember();
    List<StudyUserDto> getJpaMember();
//    List<StudyUser> getJpaMember();
}
