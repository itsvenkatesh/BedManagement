package com.flm.bed.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RoomRequestDTO {

	private long roomNumber;
	
	private String roomType;
	
	private long roomCapacity;
	
	private List<BedRequestDTO> beds;
}
