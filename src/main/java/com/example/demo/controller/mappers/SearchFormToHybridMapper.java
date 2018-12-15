package com.example.demo.controller.mappers;

import com.example.demo.forms.RepairsSearchForm;
import com.example.demo.model.HybridModel;
import com.example.demo.model.RepairsModel;
import org.springframework.stereotype.Component;

@Component
public class SearchFormToHybridMapper {

    public HybridModel mapToHybridModel(RepairsSearchForm searchForm) {
        HybridModel hybridModel = new HybridModel();
        hybridModel.setDateTime(searchForm.getDateTime());
        hybridModel.setaFM(searchForm.getaFM());
        hybridModel.setVPlate(searchForm.getvPlate());
        return hybridModel;
    }
}
