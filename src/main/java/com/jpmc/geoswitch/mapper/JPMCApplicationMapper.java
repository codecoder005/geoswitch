package com.jpmc.geoswitch.mapper;

import com.jpmc.geoswitch.entity.JPMCApplicationEntity;
import com.jpmc.geoswitch.model.JPMCApplicationModel;

public class JPMCApplicationMapper {
    public static JPMCApplicationModel map(JPMCApplicationEntity entity) {
        return JPMCApplicationModel.builder()
                .applicationId(entity.getApplicationId())
                .sealId(entity.getSealId())
                .name(entity.getName())
                .description(entity.getDescription())
                .version(entity.getVersion())
                .build();
    }
}
