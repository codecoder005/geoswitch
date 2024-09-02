package com.jpmc.geoswitch.service;

import com.jpmc.geoswitch.exception.ContinentNotFoundException;
import com.jpmc.geoswitch.model.ContinentModel;

import java.util.List;
import java.util.UUID;

public interface ContinentService {
    List<ContinentModel> getAllContinents();

    ContinentModel getContinentById(final UUID continentId) throws ContinentNotFoundException;
}
