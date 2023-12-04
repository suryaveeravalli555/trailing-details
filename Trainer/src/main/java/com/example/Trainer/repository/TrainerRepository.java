package com.example.Trainer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.Trainer.entity.Trainer;

public interface TrainerRepository extends JpaRepository<Trainer, Long>{
	Trainer findByCourseCode(String courseCode);

}
