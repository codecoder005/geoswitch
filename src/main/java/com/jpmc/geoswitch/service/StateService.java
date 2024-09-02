package com.jpmc.geoswitch.service;

import com.jpmc.geoswitch.exception.StateNotFoundException;
import com.jpmc.geoswitch.model.StateModel;

import java.util.List;
import java.util.UUID;

public interface StateService {
    List<StateModel> getAllCountries();

    StateModel getCountryById(final UUID stateId) throws StateNotFoundException;
}
