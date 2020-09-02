package com.research.resbackend.security.service;

import com.research.resbackend.domain.Research;
import com.research.resbackend.domain.repository.ResearchRepository;
import com.research.resbackend.domain.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ResearchService {
    @Autowired
    ResearchRepository repo;

//    public List<Research> getAllresearch(){
//        List<Research> research = new ArrayList<>();
//        repo.findAll().forEach(research1 -> research.add(research1));
//        return research;
//    }




}
