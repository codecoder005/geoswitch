package com.jpmc.geoswitch.mapper;

import com.jpmc.geoswitch.entity.ContinentEntity;
import com.jpmc.geoswitch.model.ContinentModel;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ContinentMapper {
    public static ContinentModel map(ContinentEntity entity) {
        return ContinentModel.builder()
                .continentId(entity.getContinentId())
                .name(entity.getName())
                .build();
    }
}
