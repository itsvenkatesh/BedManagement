package com.flm.bed.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor 
@NoArgsConstructor
public class BedDetailsResponseDTO {
	
    private long bedNumber;
	
	private long roomNumber;
	
	private boolean isOccupied;
	

}
