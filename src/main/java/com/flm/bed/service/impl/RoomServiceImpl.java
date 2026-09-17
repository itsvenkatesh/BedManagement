package com.flm.bed.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.flm.bed.builder.BedBuilder;
import com.flm.bed.builder.RoomDTOBuilder;
import com.flm.bed.dao.RoomRepository;
import com.flm.bed.dto.BedRequestDTO;
import com.flm.bed.dto.RoomRequestDTO;
import com.flm.bed.model.Bed;
import com.flm.bed.model.Room;
import com.flm.bed.service.RoomService;

@Service 
public class RoomServiceImpl implements RoomService{
    @Autowired 
    RoomRepository roomRepository;
     
    @Override
    public ResponseEntity addRoom(RoomRequestDTO roomRequestDTO) {
        // TODO Auto-generated method stub
        Room room = new Room(roomRequestDTO.getRoomType(), roomRequestDTO.getRoomCapacity());
         
        if(roomRequestDTO.getBeds() != null) {
           List< BedRequestDTO > bedRequestDTOList = roomRequestDTO.getBeds();
           List<Bed> bedList=new ArrayList<>();
           for(BedRequestDTO bedRequestDTO: bedRequestDTOList) {
               Bed bed=BedBuilder.buildBedFromBedRequestDto(bedRequestDTO, room);
               bedList.add(bed);

           }
             room.getBeds().addAll(bedList);
            
        }
        
        Room savedRoom = roomRepository.save(room);
        return new ResponseEntity<>(
        RoomDTOBuilder.buildRoomResponseDTOFromRoom(savedRoom),
        HttpStatus.CREATED
);
    }
    
}
