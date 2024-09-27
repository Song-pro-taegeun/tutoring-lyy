package com.example.study.dto;

import lombok.Data;

import java.util.List;

@Data
public class StudyUserDto {
    private String suUserId;
    private String suName;
    private List<StudyBoardDto> studyBoardList;
}
