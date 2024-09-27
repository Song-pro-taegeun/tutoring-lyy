package com.example.study.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.ToString;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@Table(name="STUDY_USER")
public class StudyUser {
    @Id
    @Column(name="SU_USER_ID")
    private String suUserId;

    @Column(name="SU_PWD")
    private String suPwd;

    @Column(name="SU_NAME")
    private String suName;

    @Column(name="SU_PHONE")
    private String suPhone;

    @Column(name="PM_REG_DT")
    private Timestamp pmRegDt;

//    @OneToMany(mappedBy = "studyUser", fetch = FetchType.EAGER)
    @OneToMany(mappedBy = "studyUser")
    private List<StudyBoard> studyBoards;

//    @OneToMany(mappedBy = "studyUser", fetch = FetchType.EAGER)
//    @ToString.Exclude // toString()을 재귀적으로 호출되기에 제외시킨다.
//    private List<StudyBoard> studyBoards;
}