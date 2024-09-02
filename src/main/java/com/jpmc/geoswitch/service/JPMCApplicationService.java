package com.jpmc.geoswitch.service;

import com.jpmc.geoswitch.exception.CountryNotFoundException;
import com.jpmc.geoswitch.model.JPMCApplicationModel;

import java.util.List;
import java.util.UUID;

public interface JPMCApplicationService {
    List<JPMCApplicationModel> getAllApplications();

    JPMCApplicationModel getApplicationById(final UUID applicationId) throws CountryNotFoundException;
}
