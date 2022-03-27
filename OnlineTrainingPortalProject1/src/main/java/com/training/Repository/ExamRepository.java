package com.training.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.training.Model.Exam;

@Repository
public interface ExamRepository extends JpaRepository<Exam, Integer> {
	
	List<Exam> findResultByExamIdAndSubjectName(int examId, String subjectName);
	

}
