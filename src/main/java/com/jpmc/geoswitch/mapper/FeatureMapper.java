package com.jpmc.geoswitch.mapper;

import com.jpmc.geoswitch.entity.FeatureEntity;
import com.jpmc.geoswitch.model.FeatureModel;

public class FeatureMapper {
    public static FeatureModel map(FeatureEntity entity) {
        return FeatureModel.builder()
                .featureId(entity.getFeatureId())
                .applicationId(entity.getApplicationId())
                .name(entity.getName())
                .description(entity.getDescription())
                .enabled(entity.getEnabled())
                .build();
    }
}
