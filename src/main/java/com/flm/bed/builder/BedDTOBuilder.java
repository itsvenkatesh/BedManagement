package com.flm.bed.builder;

import com.flm.bed.dto.BedDetailsResponseDTO;
import com.flm.bed.model.Bed;

 
public class BedDTOBuilder {
public static BedDetailsResponseDTO buildBedDetailsResponseDtoFromBed(Bed bed)
{
   
  return BedDetailsResponseDTO.builder()
      .bedNumber(bed.getBedNumber())
      .isOccupied(bed.getIsOccupied())
      .roomNumber(bed.getRoom().getRoomNumber())
      .build();
    

}
}
