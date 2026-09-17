package com.flm.bed.exceptions;

public class RoomNotFoundException extends RuntimeException{

	public RoomNotFoundException(String message) {
		super(message);
	}
}
