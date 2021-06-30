package com.codedecode.microservices.VaccinationCenter.Model;

import java.util.List;

import com.codedecode.microservices.VaccinationCenter.Entity.VaccinationCenter;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RequiredResponse {
	
	private VaccinationCenter center;
	private List<Citizen> citizens;
	

}

