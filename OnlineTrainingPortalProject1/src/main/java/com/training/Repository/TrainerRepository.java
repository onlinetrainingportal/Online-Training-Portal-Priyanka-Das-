package com.training.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.training.Model.Trainer;

@Repository
public interface TrainerRepository extends JpaRepository<Trainer, String> {

}
