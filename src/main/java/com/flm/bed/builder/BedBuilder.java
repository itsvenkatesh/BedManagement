package com.flm.bed.builder;

import com.flm.bed.dto.BedRequestDTO;
import com.flm.bed.model.Bed;
import com.flm.bed.model.Room;

public class BedBuilder {
	
	public static Bed buildBedFromBedRequestDto(BedRequestDTO bedRequestDto, Room room) {
		return Bed.builder()
				  .bedNumber(bedRequestDto.getBedNumber())
				  .room(room)
				  .isOccupied(bedRequestDto.isOccupied())
				  .patientId(0)
				  .build();
	}
	
}
