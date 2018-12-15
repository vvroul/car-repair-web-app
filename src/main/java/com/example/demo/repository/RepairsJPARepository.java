package com.example.demo.repository;

import com.example.demo.domain.Repairs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDate;
import java.util.List;

public interface RepairsJPARepository extends JpaRepository <Repairs, Long>{

    @Query(value = "SELECT ALL FROM USERS u INNER JOIN REPAIRS r ON u.u_id = r.owner WHERE r.dateTime = ?1 OR u.aFM = ?2 OR u.vPlate = ?3",
    nativeQuery = true)
    List<Repairs> findRepairsByDateAndAFMAndPlate(LocalDate dateTime, Long aFM, String vPlate);
}
