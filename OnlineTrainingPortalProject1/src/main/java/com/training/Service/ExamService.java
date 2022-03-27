package com.training.Service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.Model.Exam;
import com.training.Repository.ExamRepository;

@Service
@Transactional
public class ExamService {

	@Autowired
	ExamRepository repo;
	
	public Exam addExamDetails(Exam e) {
         return repo.save(e);
    }

	public List<Exam> findResultByExamIdAndSubjectName(int examId, String subjectName) {
		return repo.findResultByExamIdAndSubjectName(examId, subjectName);
	}
}
