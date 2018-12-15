package com.example.demo.service;

import com.example.demo.builder.RepairsBuilder;
import com.example.demo.controler.mappers.RepairsToRepairsMapper;
import com.example.demo.domain.Repairs;
import com.example.demo.model.RepairsModel;
import com.example.demo.repository.RepairsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class RepairsServiceImpl implements RepairsService {

    @Autowired
    private RepairsRepository repairsRepository;

    @Autowired
    private RepairsToRepairsMapper mapper;

    @Override
    public RepairsModel create(RepairsModel repairsModel) {
        RepairsBuilder builder = RepairsBuilder.getRepairsBuilder();
        Repairs repairs = builder.setDateTime(repairsModel.getDateTime())
                .setrState(repairsModel.getrState())
                .setrType(repairsModel.getrType())
                .setrCost(repairsModel.getrCost())
                .setOwner(repairsModel.getOwner())
                .setDescription(repairsModel.getDescription()).createRepairs();
        Repairs savedRepairs = repairsRepository.save(repairs);
        return mapper.mapToRepairsModel(savedRepairs);
    }

    @Override
    public List<RepairsModel> getAll() {
        return repairsRepository
            .findAll()
            .stream()
            .map(repairs -> mapper.mapToRepairsModel(repairs))
            .collect(Collectors.toList());
    }
}
