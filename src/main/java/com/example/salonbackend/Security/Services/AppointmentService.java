package com.example.salonbackend.Security.Services;
import com.example.salonbackend.Models.Appointment;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public interface AppointmentService {
    Appointment saveAppointment(Appointment appointment);
    List<Appointment> getAllAppointments();
    Appointment getAppointmentById(int id);
    void deleteAppointment(int id);
    Appointment updateAppointment(Appointment appointment,int id);

}


