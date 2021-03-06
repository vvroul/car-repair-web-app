package com.example.demo.repository;

import com.example.demo.domain.Repairs;
import com.example.demo.domain.Users;
import com.example.demo.model.RepairsModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDate;
import java.util.List;

public interface RepairsJPARepository extends JpaRepository <Repairs, Long>{
    @Query(value = "SELECT r.* FROM USERS u INNER JOIN REPAIRS r ON u.u_id = r.owner WHERE r.dateTime = ?1 OR u.aFM = ?2 OR u.vPlate = ?3", nativeQuery = true)
    List<Repairs> findRepairsByDateAndAFMAndPlate(LocalDate dateTime, String aFM, String vPlate);

    List<Repairs> findAll();

    @Query(value = "SELECT r.* FROM REPAIRS r ORDER BY r.dateTime DESC LIMIT 10", nativeQuery = true)
    List<Repairs> findFirst10RepairsByDateTime();

    @Query(value = "SELECT r.* FROM REPAIRS r WHERE r.owner = ?1", nativeQuery = true)
    List<Repairs> findRepairsByOwner(Long owner);

}
