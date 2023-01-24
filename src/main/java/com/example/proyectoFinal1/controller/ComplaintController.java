package com.example.proyectoFinal1.controller;

import com.example.proyectoFinal1.model.Complaint;
import com.example.proyectoFinal1.service.ComplaintService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/complaints")
public class ComplaintController {

    private final ComplaintService complaintService;

    public ComplaintController(ComplaintService complaintService) {
        this.complaintService = complaintService;
    }

    @GetMapping
    public List<Complaint> getAllComplaints(){

        return complaintService.getAllComplaints();
    }

    @PostMapping
    public void registerNewComplaint(@RequestBody Complaint complaint){
        complaintService.addNewComplaint(complaint);
    }

}
