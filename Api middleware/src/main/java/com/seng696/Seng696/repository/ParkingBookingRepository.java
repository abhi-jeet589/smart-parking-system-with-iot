package com.seng696.Seng696.repository;

import com.seng696.Seng696.entity.ParkingBookingEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParkingBookingRepository extends JpaRepository<ParkingBookingEntity, Long> {
}

