package com.example.salonbackend.Security.Services;
import com.example.salonbackend.Models.Appointment;
import com.example.salonbackend.Repository.AppointmentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppointmentServiceImpl implements AppointmentService{
    @Autowired
    private AppointmentRepo appointmentRepo;

    public AppointmentServiceImpl(AppointmentRepo appointmentRepo) {
        this.appointmentRepo = appointmentRepo;
    }
    @Override
    public Appointment saveAppointment(Appointment appointment)
    {
        return appointmentRepo.save(appointment);
    }

    @Override
    public List<Appointment> getAllAppointments() {
        return appointmentRepo.findAll();
    }
    @Override
    public void deleteAppointment(int id)
    {
        appointmentRepo.findById(id);
        appointmentRepo.deleteById(id);
    }
    @Override
    public Appointment updateAppointment(Appointment appointment,int id)
    {
        Appointment existingAppointment=appointmentRepo.findById(id).orElseThrow();
        existingAppointment.setFirstname(appointment.getFirstname());
        existingAppointment.setLastname(appointment.getLastname());
        existingAppointment.setAddress(appointment.getAddress());
        existingAppointment.setService(appointment.getService());
        existingAppointment.setCity(appointment.getCity());
        existingAppointment.setDate(appointment.getDate());
        existingAppointment.save(existingAppointment);
        return existingAppointment;
    }

    @Override
    public Appointment getAppointmentById(int id){
        return appointmentRepo.findById(id).orElseThrow();
    }
}
