package com.example.proyectoFinal1.repository;

import com.example.proyectoFinal1.model.Complaint;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public interface ComplaintRepository extends JpaRepository<Complaint, Long> {
    List<Complaint> complaintRepository = new ArrayList<>();
}
