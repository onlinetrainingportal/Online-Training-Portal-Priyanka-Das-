package com.training.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.Model.Trainee;
import com.training.Repository.TraineeRepository;

@Service
public class TraineeService {
	
	@Autowired
	TraineeRepository repo;
	
	public Trainee addTraineeDetails(Trainee t) {
		  return repo.save(t);
	}
}
