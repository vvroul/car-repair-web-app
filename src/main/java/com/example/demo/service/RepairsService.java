package com.example.demo.service;

import com.example.demo.domain.Repairs;
import com.example.demo.model.HybridModel;
import com.example.demo.model.RepairsModel;
import com.example.demo.model.UsersModel;

import java.util.List;

public interface RepairsService {

    RepairsModel create(RepairsModel repairs);

    List<RepairsModel> getAll();

    List<RepairsModel> getRepairsByDateAndAFMAndPlate(HybridModel hybridModel);

}
