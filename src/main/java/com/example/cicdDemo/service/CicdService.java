package com.example.cicdDemo.service;

import com.example.cicdDemo.model.CicdUsers;
import com.example.cicdDemo.repository.CicdRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CicdService {

    @Autowired
    private CicdRepository cicdRepository;

    public CicdUsers addUser(CicdUsers cicdUsers) {
        return cicdRepository.save(cicdUsers);
    }

    public List<CicdUsers> getAllCicdUsers() {
        return cicdRepository.findAll();
    }
}
