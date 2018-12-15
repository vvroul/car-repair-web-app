package com.example.demo.mappers;

import com.example.demo.form.RepairsSearchForm;
import com.example.demo.model.RepairsModel;
import org.springframework.stereotype.Component;

@Component
public class SearchFormToRepairsMapper {

    public RepairsModel mapToRepairsModel(RepairsSearchForm searchForm) {
        RepairsModel repairModel = new RepairsModel(
                searchForm.getR_id(),
                searchForm.getOwner());
        return repairModel;
    }
}
