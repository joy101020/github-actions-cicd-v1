package com.example.cicdDemo.repository;

import com.example.cicdDemo.model.CicdUsers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CicdRepository extends JpaRepository<CicdUsers, Long> {
}
