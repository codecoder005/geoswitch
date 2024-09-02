package com.jpmc.geoswitch.mapper;

import com.jpmc.geoswitch.entity.StateEntity;
import com.jpmc.geoswitch.model.StateModel;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class StateMapper {
    public static StateModel map(StateEntity entity) {
        return StateModel.builder()
                .stateId(entity.getStateId())
                .countryId(entity.getCountryId())
                .name(entity.getName())
                .build();
    }
}
