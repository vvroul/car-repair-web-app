package com.example.demo.controller.mappers;

import com.example.demo.forms.RepairsSearchForm;
import com.example.demo.model.RepairsModel;
import org.springframework.stereotype.Component;

@Component
public class SearchFormToRepairsMapper {

    public RepairsModel mapToRepairsModel(RepairsSearchForm searchForm) {
        RepairsModel repairModel = new RepairsModel();
        repairModel.setDateTime(searchForm.getDateTime());
        repairModel.setOwner(searchForm.getOwner());
        return repairModel;
    }
}
