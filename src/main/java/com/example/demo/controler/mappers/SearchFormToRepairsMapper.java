package com.example.demo.controler.mappers;

import com.example.demo.form.RepairsSearchForm;
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
