package com.ps.bk.hotel.room.controller;

import com.ps.bk.hotel.room.model.Room;
import com.ps.bk.hotel.room.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/rooms")
public class RoomController {

    @Autowired
    private RoomService service;

    @GetMapping
    public ResponseEntity<Iterable<Room>> getAllRooms() {
        return ResponseEntity.ok(service.getAllRooms());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Room>> findRoomById(long id) {
        Optional<Room> room = service.findRoom(id);
        if (room.isPresent()) {
            return ResponseEntity.ok(room);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public ResponseEntity<?> addRoom(Room room) {
        return ResponseEntity.ok().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> updateRoom(Room room) {
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteRoom(long id) {
        return ResponseEntity.ok().build();
    }
}
