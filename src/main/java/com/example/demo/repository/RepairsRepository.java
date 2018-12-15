package com.example.demo.repository;

import com.example.demo.domain.Repairs;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepairsRepository extends JpaRepository <Repairs, Long>{
    Repairs findRepairsByOwner(Long owner);

}
