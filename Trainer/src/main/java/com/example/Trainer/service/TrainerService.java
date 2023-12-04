package com.example.Trainer.service;

import com.example.Trainer.dto.TrainerDto;

public interface TrainerService {
	TrainerDto saveTrainer(TrainerDto trainerDto);
	
	TrainerDto getTrainerByCode(String Code);
}
