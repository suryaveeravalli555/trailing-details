package com.example.Trainer.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Trainer.dto.TrainerDto;
import com.example.Trainer.service.TrainerService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("api/trainers")
@AllArgsConstructor
public class TrainerController {
	
	private TrainerService trainerService;
	
	@PostMapping
	public ResponseEntity<TrainerDto> saveTrainer(@RequestBody TrainerDto trainerDto){
		TrainerDto savedTrainer = trainerService.saveTrainer(trainerDto);
		return new ResponseEntity<>(savedTrainer, HttpStatus.CREATED);
	}

	@GetMapping("{trainer-code}")
	public ResponseEntity<TrainerDto> getTrainer(@PathVariable("trainer-code")String trainerCode){
		TrainerDto trainerDto = trainerService.getTrainerByCode(trainerCode);
		return new ResponseEntity<>(trainerDto, HttpStatus.OK);
		
	}
	
	
}
