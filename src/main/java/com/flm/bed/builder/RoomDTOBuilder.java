package com.flm.bed.builder;

import java.util.List;

import com.flm.bed.dto.BedDetailsResponseDTO;
import com.flm.bed.dto.RoomDetailsResponseDTO;
import com.flm.bed.model.Bed;
import com.flm.bed.model.Room;

public class RoomDTOBuilder {

    public static RoomDetailsResponseDTO buildRoomResponseDTOFromRoom(Room room) {

        return RoomDetailsResponseDTO.builder()
                .roomNumber(room.getRoomNumber())
                .roomType(room.getRoomType())
                .roomCapacity(room.getRoomCapacity())
                .beds(buildBedDetailsResponseDTOFromBeds(room.getBeds()))
                .build();
    }

    private static List<BedDetailsResponseDTO> buildBedDetailsResponseDTOFromBeds(
            List<Bed> beds) {

        return beds.stream()
                .map(bed -> BedDetailsResponseDTO.builder()
                        .bedNumber(bed.getBedNumber())
                        .roomNumber(bed.getRoom().getRoomNumber())
                        .isOccupied(Boolean.TRUE.equals(bed.getIsOccupied()))
                        .build())
                .toList();
    }
}

