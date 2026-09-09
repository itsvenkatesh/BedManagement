package com.flm.bed.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.flm.bed.model.BedAssignmentHistory;
@Repository
public interface BedAssignmentHistoryRepository extends JpaRepository<BedAssignmentHistory, Long>{

}
