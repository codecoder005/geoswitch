package com.jpmc.geoswitch.service;

import com.jpmc.geoswitch.exception.FeatureNotFoundException;
import com.jpmc.geoswitch.exception.StateNotFoundException;
import com.jpmc.geoswitch.model.FeatureModel;
import com.jpmc.geoswitch.model.StateModel;

import java.util.List;
import java.util.UUID;

public interface FeatureService {
    List<FeatureModel> getAllFeatures();

    FeatureModel getFeatureById(final UUID featureId) throws FeatureNotFoundException;
}
