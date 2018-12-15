package com.example.demo.controller.mappers;

import com.example.demo.domain.Repairs;
import com.example.demo.model.RepairsModel;
import org.springframework.stereotype.Component;

@Component
public class RepairsToRepairsMapper {

    public RepairsModel mapToRepairsModel(Repairs repair){
        RepairsModel repairModel = new RepairsModel();
        repairModel.setR_id(repair.getR_id());
        repairModel.setDateTime(repair.getDateTime());
        repairModel.setrState(repair.getrState());
        repairModel.setrState(repair.getrState());
        repairModel.setrCost(repair.getrCost());
        repairModel.setOwner(repair.getOwner());
        repairModel.setDescription(repair.getDescription());
        return repairModel;
    }
}
