package com.flm.bed.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class RoomDetailsResponseDTO {

	private long roomNumber;
	
	private String roomType;
	
	private long roomCapacity;
	
	private List<BedDetailsResponseDTO> beds;
	
}
