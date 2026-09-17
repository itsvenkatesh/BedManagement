package com.flm.bed.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Beds")
@Builder
public class Bed {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "bed_number")
	private long bedNumber;
	
	@ManyToOne
	@JoinColumn(name = "room_number")
	private Room room;
	
	@Column(name = "is_occupied")
	private Boolean isOccupied;
	
	@Column(name = "patient_id")
	private long patientId;

	@OneToMany(mappedBy = "bed", cascade = CascadeType.ALL)
	private List<BedAssignmentHistory> bedAssignmentHistoryList;

	public Bed(Room room, Boolean isOccupied, long patientId,List<BedAssignmentHistory> bedAssignmentHistoryList) {
		super();
		this.room = room;
		this.isOccupied = isOccupied;
		this.patientId = patientId;
		this.bedAssignmentHistoryList = bedAssignmentHistoryList;
	}
}
