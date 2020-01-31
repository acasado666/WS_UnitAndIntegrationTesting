package com.ps.bk.hotel.booking.service;

import com.ps.bk.hotel.booking.model.Booking;
import org.springframework.stereotype.Service;

import java.util.Optional;


public interface BookingService {
	public Optional<Booking> getBookingById(long id);
	public Iterable<Booking> getBookings();
	public void addBooking(Booking booking);
	public void updateBooking(Booking booking);
	public void deleteBooking(long id);
}
