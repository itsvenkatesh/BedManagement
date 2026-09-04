package com.flm.bed.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "beds")
public class Bed {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "bed_number")
	private Long bedNum;
	
	@ManyToOne
	@JoinColumn(name = "room_number")
	private Room room;
	
	@Column(name = "is_occupied")
	private Boolean isOccupied;
	
	@Column(name = "patient_id")
	private Long patientId;
	
//	private List<BedAssignmentHistory> bedAssignmentHistory;

	public Bed(Room room, Boolean isOccupied, Long patientId) {
		super();
		this.room = room;
		this.isOccupied = isOccupied;
		this.patientId = patientId;
	}
}
