package com.flm.bed.service;

import org.springframework.http.ResponseEntity;

import com.flm.bed.dto.RoomDetailsResponseDTO;
import com.flm.bed.dto.RoomRequestDTO;


public interface RoomService {

    public ResponseEntity<RoomDetailsResponseDTO> addRoom(RoomRequestDTO roomRequestDTO);
 

}
