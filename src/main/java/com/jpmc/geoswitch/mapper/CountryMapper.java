package com.jpmc.geoswitch.mapper;

import com.jpmc.geoswitch.entity.CountryEntity;
import com.jpmc.geoswitch.model.CountryModel;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CountryMapper {
    public static CountryModel map(CountryEntity entity) {
        return CountryModel.builder()
                .countryId(entity.getCountryId())
                .continentId(entity.getContinentId())
                .name(entity.getName())
                .build();
    }
}
