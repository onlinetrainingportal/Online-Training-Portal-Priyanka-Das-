package com.training.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.Model.Trainer;
import com.training.Repository.TrainerRepository;

@Service
public class TrainerService {
	@Autowired
	TrainerRepository repo;
	
	public Trainer addTrainerDetails(Trainer tn) {
		return repo.save(tn);
		 }
}

