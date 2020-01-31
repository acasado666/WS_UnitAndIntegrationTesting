package com.ps.bk.hotel.booking.service.impl;

import com.ps.bk.hotel.booking.model.Booking;
import com.ps.bk.hotel.booking.repo.BookingRepo;
import com.ps.bk.hotel.booking.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BookingServiceImpl implements BookingService {

	private BookingRepo repo;
	
	public BookingServiceImpl(BookingRepo repo) {
		this.repo = repo;
	}

	@Override
	public Optional<Booking> getBookingById(long id) {
		Optional<Booking> byId = repo.findById(id);
		return byId;
	}

	@Override
	public Iterable<Booking> getBookings() {
		return repo.findAll();
	}

	@Override
	public void addBooking(Booking booking) {
		repo.save(booking);
	}

	@Override
	public void updateBooking(Booking booking) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteBooking(long id) {
		repo.deleteById(id);
	}

}
