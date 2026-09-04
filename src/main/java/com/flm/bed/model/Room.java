package com.flm.bed.model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "rooms")
public class Room {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "room_number")
	private Long roomNum;
	 
	@Column(name = "room_type")
	private Long roomType;
	 
	private Long capacity;
	 
	@OneToMany(mappedBy = "room")
	private List<Bed> listOfBeds;

	public Room(Long roomType, Long capacity, List<Bed> listOfBeds) {
		super();
		this.roomType = roomType;
		this.capacity = capacity;
		this.listOfBeds = listOfBeds;
	 }
}
