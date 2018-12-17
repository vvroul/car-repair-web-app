package com.example.demo.service;

import com.example.demo.builder.RepairsBuilder;
import com.example.demo.controller.mappers.RepairsToRepairsMapper;
import com.example.demo.domain.Repairs;
import com.example.demo.domain.Users;
import com.example.demo.exception.UsersNotFoundException;
import com.example.demo.forms.RepairsEditForm;
import com.example.demo.forms.UsersEditForm;
import com.example.demo.model.HybridModel;
import com.example.demo.model.RepairsModel;
import com.example.demo.model.UsersModel;
import com.example.demo.repository.RepairsJPARepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class RepairsServiceImpl implements RepairsService {

    @Autowired
    private RepairsJPARepository repairsJPARepository;

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
        Repairs savedRepairs = repairsJPARepository.save(repairs);
        return mapper.mapToRepairsModel(savedRepairs);
    }

    @Override
    public List<RepairsModel> getAll() {
        return repairsJPARepository
            .findAll()
            .stream()
            .map(repairs -> mapper.mapToRepairsModel(repairs))
            .collect(Collectors.toList());
    }


    @Override
    public List<RepairsModel> getRepairsByDateAndAFMAndPlate(HybridModel hybridModel) {
        System.out.println("In SERVICE : " + hybridModel.getDateTime());
        return repairsJPARepository.findRepairsByDateAndAFMAndPlate(hybridModel.getDateTime(),
                hybridModel.getaFM(), hybridModel.getVPlate())
                .stream()
                .map(repairs -> mapper.mapToRepairsModel(repairs))
                .collect(Collectors.toList());

    }

    @Override
    public void deleteRepairsById(Long r_id) {
        repairsJPARepository.deleteById(r_id);
    }

    @Override
    public void update(RepairsEditForm repairsEditForm){
        Repairs repairs = repairsJPARepository.findById(Long.parseLong(repairsEditForm.getR_id())).get();
        if (repairs==null){throw new UsersNotFoundException();}
        repairs.setDateTime(repairsEditForm.getDateTime());
        repairs.setrState(repairsEditForm.getrState());
        repairs.setrType(repairsEditForm.getrType());
        repairs.setrCost(repairsEditForm.getrCost());
        repairs.setDescription(repairsEditForm.getDescription());
        repairsJPARepository.save(repairs);
    }

    @Override
    public Optional<RepairsModel> findRepairs(Long id) {
        return repairsJPARepository
                .findById(id)
                .map(repairs -> mapper.mapToRepairsModel(repairs));
    }

    @Override
    public List<RepairsModel> getFirst10tByDateTime() {
        return repairsJPARepository
                .findFirst10tByDateTime()
                .stream()
                .map(repairs -> mapper.mapToRepairsModel(repairs))
                .collect(Collectors.toList());
    }


}



