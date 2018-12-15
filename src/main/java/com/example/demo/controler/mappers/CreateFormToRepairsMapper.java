package com.example.demo.controler.mappers;

import com.example.demo.form.RepairsCreateForm;
import com.example.demo.model.RepairsModel;
import org.springframework.stereotype.Component;

@Component
public class CreateFormToRepairsMapper {

    public RepairsModel mapToRepairsModel(RepairsCreateForm createForm) {
        RepairsModel repairModel = new RepairsModel();
        repairModel.setR_id(createForm.getR_id());
        repairModel.setDateTime(createForm.getDateTime());
        repairModel.setrState(createForm.getrState());
        repairModel.setrState(createForm.getrState());
        repairModel.setrCost(createForm.getrCost());
        repairModel.setOwner(createForm.getOwner());
        repairModel.setDescription(createForm.getDescription());
        return repairModel;
    }
}
