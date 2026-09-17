package com.flm.bed.advice;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.flm.bed.exceptions.BedNotFoundException;
import com.flm.bed.exceptions.BedUnavailableException;
import com.flm.bed.exceptions.RoomNotFoundException;

@RestControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(RoomNotFoundException.class)
	public ResponseEntity<String> handleRoomNotFoundException(RoomNotFoundException roomNotFoundException){
		return new ResponseEntity<>(roomNotFoundException.getMessage(), HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(BedNotFoundException.class)
	public ResponseEntity<String> handleBedNotFoundException(BedNotFoundException bedNotFoundException){
		return new ResponseEntity<>(bedNotFoundException.getMessage(), HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(BedUnavailableException.class)
	public ResponseEntity<String> handleBedUnavailableException(BedUnavailableException bedUnavailableException){
		return new ResponseEntity<>(bedUnavailableException.getMessage(), HttpStatus.CONFLICT);
	}
}
