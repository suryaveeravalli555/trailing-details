package com.example.Trainer.service;

import org.springframework.stereotype.Service;

import com.example.Trainer.dto.TrainerDto;
import com.example.Trainer.entity.Trainer;
import com.example.Trainer.repository.TrainerRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class TrainerServiceImpl implements TrainerService{
	
	private TrainerRepository trainerRepository;

	@Override
	public TrainerDto saveTrainer(TrainerDto trainerDto) {
		
		Trainer trainer = new Trainer(
				trainerDto.getId(),
				trainerDto.getFirstName(),
				trainerDto.getLastName(),
				trainerDto.getCourseName(),
				trainerDto.getStatus(),
				trainerDto.getCourseCode()
		);
				
		Trainer savedTrainer = trainerRepository.save(trainer);
		
		TrainerDto savedTrainerDto = new TrainerDto(
				savedTrainer.getId(),
				savedTrainer.getFirstName(),
				savedTrainer.getLastName(),
				savedTrainer.getCourseName(),
				savedTrainer.getStatus(),
				savedTrainer.getCourseCode()
				);
		return savedTrainerDto;
	}


	@Override
	public TrainerDto getTrainerByCode(String courseCode) {
		
		Trainer trainer =trainerRepository.findByCourseCode(courseCode);
		
		TrainerDto trainerDto = new TrainerDto(
				trainer.getId(),
				trainer.getFirstName(),
				trainer.getLastName(),
				trainer.getCourseName(),
				trainer.getStatus(),
				trainer.getCourseCode()
		);
		return trainerDto;
	}

}
