package com.example.salonbackend.Controller;

import com.example.salonbackend.Models.Appointment;
import com.example.salonbackend.Security.Services.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/test/appointment")

public class AppointmentController {
    @Autowired
    private AppointmentService appointmentService;

    public AppointmentController(AppointmentService appointmentService) {
        this.appointmentService = appointmentService;
    }
    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Appointment> saveAppointment(@RequestBody Appointment appointment)
    {
        System.out.println(appointment);
        return new ResponseEntity<Appointment>(appointmentService.saveAppointment(appointment), HttpStatus.CREATED);
    }
    @GetMapping
    public List<Appointment> getAllAppointments()
    {
        return appointmentService.getAllAppointments();
    }
    @GetMapping("{id}")
    public ResponseEntity<Appointment> getAppointmentById(@PathVariable("id")int id)
    {
        return new ResponseEntity<Appointment>(appointmentService.getAppointmentById(id),HttpStatus.OK);
    }
    @PutMapping("{id}")
    public ResponseEntity<Appointment> updateAppointment(@PathVariable("id")int id,@RequestBody Appointment appointment)
    {
        return new ResponseEntity<Appointment>(appointmentService.updateAppointment(appointment,id), HttpStatus.OK);
    }
    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteAppointment(@PathVariable("id")int id)
    {
        appointmentService.deleteAppointment(id);
        return new ResponseEntity<String>("Appointment deleted successfully",HttpStatus.OK);
    }
}
