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
	private long roomNumber;
	 
	@Column(name = "room_type")
	private String roomType;
	 
	@Column(name = "room_capacity")
	private long roomCapacity;
	 
	@OneToMany(mappedBy = "room")
	private List<Bed> beds;

	public Room(String roomType, long roomCapacity, List<Bed> beds) {
		super();
		this.roomType = roomType;
		this.roomCapacity = roomCapacity;
		this.beds = beds;
	 }
}
