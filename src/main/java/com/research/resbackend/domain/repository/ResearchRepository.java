package com.research.resbackend.domain.repository;

import com.research.resbackend.domain.Research;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResearchRepository extends JpaRepository<Research, Long>  {
}
