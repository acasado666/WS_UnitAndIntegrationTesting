package com.ps.bk.hotel.room.service;

import com.ps.bk.hotel.room.model.Room;

import java.util.Optional;

public interface RoomService {
	Iterable<Room> getAllRooms();
	Optional<Room> findRoom(long roomId);
	void updateRoom(Room room);
	void addRoom(Room room);
	Room findByRoomNumber(String string);
}
