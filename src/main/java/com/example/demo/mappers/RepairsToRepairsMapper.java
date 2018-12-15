package com.example.demo.mappers;

import com.example.demo.domain.Repairs;
import com.example.demo.model.RepairsModel;
import org.springframework.stereotype.Component;

@Component
public class RepairsToRepairsMapper {

    public RepairsModel mapToRepairsModel(Repairs repair){
        RepairsModel repairModel = new RepairsModel(
                repair.getR_id(),
                repair.getDateTime(),
                repair.getrState(),
                repair.getrType(),
                repair.getrCost(),
                repair.getOwner(),
                repair.getDescription()
        );
        return repairModel;
    }
}
