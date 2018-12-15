package com.example.demo.service;

import com.example.demo.model.RepairsModel;

import java.util.List;

public interface RepairsService {

    RepairsModel create(RepairsModel repairs);

    List<RepairsModel> getAll();

}
