package com.training.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.training.Model.Trainee;

@Repository
public interface TraineeRepository extends JpaRepository<Trainee, String>{

}
