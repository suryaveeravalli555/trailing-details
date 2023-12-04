package com.example.Trainer.dto;

import lombok.*;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class TrainerDto {
	private Long id;
	private String firstName;
	private String lastName;
	private String courseName;
	private String status;
	private String courseCode;

}
