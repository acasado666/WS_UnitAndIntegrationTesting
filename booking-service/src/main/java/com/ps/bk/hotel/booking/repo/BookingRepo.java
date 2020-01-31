package com.ps.bk.hotel.booking.repo;

import org.springframework.data.repository.CrudRepository;

import com.ps.bk.hotel.booking.model.Booking;
import org.springframework.stereotype.Repository;

@Repository
public interface BookingRepo extends CrudRepository<Booking, Long> {
    /**
     * Deletes the product with the specified id.
     * @param id        The id of the product to delete.
     * @return          True if the operation was successful.
     */
//    deleteById(Long id);
}
