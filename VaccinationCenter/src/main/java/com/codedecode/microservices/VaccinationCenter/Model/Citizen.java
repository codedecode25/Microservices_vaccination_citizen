package com.codedecode.microservices.VaccinationCenter.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Citizen {
	
	private int id;
	
	private String name;
	
	private int vaccinationCenterId;
	

}
