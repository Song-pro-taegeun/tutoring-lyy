package com.example.study.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.ToString;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Data
@Table(name="STUDY_BOARD")
public class StudyBoard {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="SB_ID")
    private int sbId;

    @Column(name="SB_TITLE")
    private String sbTitle;

    @Column(name="SB_CONTENT")
    private String sbContent;

    @Column(name="SB_USER_ID")
    private String sbUserId;

    @Column(name="SB_REG_DT")
    private Timestamp sbRegDt;

    @ManyToOne
    @JoinColumn(name = "SB_USER_ID", insertable = false, updatable = false)
    private StudyUser studyUser;

//    @ManyToOne
//    @JoinColumn(name = "SB_USER_ID", insertable = false, updatable = false)
//    @ToString.Exclude // toString()을 재귀적으로 호출되기에 제외시킨다.
//    @JsonIgnore // Json 직렬화에서 제외 시킨다.
//    private StudyUser studyUser;
}
