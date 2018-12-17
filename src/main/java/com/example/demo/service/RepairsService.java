package com.example.demo.service;

import com.example.demo.domain.Repairs;
import com.example.demo.forms.RepairsEditForm;
import com.example.demo.model.HybridModel;
import com.example.demo.model.RepairsModel;
import com.example.demo.model.UsersModel;

import java.util.List;
import java.util.Optional;

public interface RepairsService {

    RepairsModel create(RepairsModel repairs);

    List<RepairsModel> getAll();

    List<RepairsModel> getRepairsByDateAndAFMAndPlate(HybridModel hybridModel);

    void deleteRepairsById (Long r_id);

    void update(RepairsEditForm repairsEditForm);

    Optional<RepairsModel> findRepairs(Long id);

    List<RepairsModel> getFirst10tByDateTime();

}
