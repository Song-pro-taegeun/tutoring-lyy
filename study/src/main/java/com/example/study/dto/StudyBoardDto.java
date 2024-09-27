package com.example.study.dto;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class StudyBoardDto {
    private int sbId;
    private String sbTitle;
    private String sbContent;
    private Timestamp sbRegDt;
}
