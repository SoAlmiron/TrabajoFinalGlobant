package com.example.proyectoFinal1.service;

import com.example.proyectoFinal1.model.Complaint;
import com.example.proyectoFinal1.repository.ComplaintRepository;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ComplaintService {

    private final ComplaintRepository repository;

    public ComplaintService(ComplaintRepository repository) {
        this.repository = repository;
    }

    public List<Complaint> getAllComplaints() {
        return repository.findAll();
    }

    public void addNewComplaint(Complaint complaint) {
        repository.save(complaint);
    }
}
