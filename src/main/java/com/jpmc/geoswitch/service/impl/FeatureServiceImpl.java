package com.jpmc.geoswitch.service.impl;

import com.jpmc.geoswitch.exception.FeatureNotFoundException;
import com.jpmc.geoswitch.exception.StateNotFoundException;
import com.jpmc.geoswitch.mapper.FeatureMapper;
import com.jpmc.geoswitch.model.FeatureModel;
import com.jpmc.geoswitch.repository.FeatureRepository;
import com.jpmc.geoswitch.service.FeatureService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
@Slf4j
public class FeatureServiceImpl implements FeatureService {
    private final FeatureRepository featureRepository;

    @Override
    public List<FeatureModel> getAllFeatures() {
        log.info("FeatureServiceImpl::getAllFeatures");
        return featureRepository.findAll().stream()
                .map(FeatureMapper::map)
                .toList();
    }

    @Override
    public FeatureModel getFeatureById(UUID featureId) throws StateNotFoundException {
        log.info("FeatureServiceImpl::getFeatureById");
        return featureRepository.findById(featureId)
                .map(FeatureMapper::map)
                .orElseThrow(() -> new FeatureNotFoundException(String.format("no feature found with featureId: %s", featureId)));
    }
}
