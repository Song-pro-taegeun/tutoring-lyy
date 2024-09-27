package com.example.study.repository;

import com.example.study.entity.StudyUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudyUserReopsitory extends JpaRepository<StudyUser, Long>{

}
