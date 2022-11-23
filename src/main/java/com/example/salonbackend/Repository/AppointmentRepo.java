package com.example.salonbackend.Repository;
import com.example.salonbackend.Models.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;


public interface AppointmentRepo extends JpaRepository<Appointment, Integer> {
}

