package com.flm.bed.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.flm.bed.dto.RoomDetailsResponseDTO;
import com.flm.bed.dto.RoomRequestDTO;
import com.flm.bed.service.RoomService;

@RestController 
@RequestMapping("rooms")
public class RoomController {
     @Autowired 
     RoomService roomService;
    @PostMapping("/addRoom") 
    public ResponseEntity<RoomDetailsResponseDTO> createRoom(@RequestBody RoomRequestDTO roomRequestDTO)
    {
return roomService.addRoom( roomRequestDTO);
    }

}
