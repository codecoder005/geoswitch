package com.jpmc.geoswitch.service.impl;

import com.jpmc.geoswitch.exception.StateNotFoundException;
import com.jpmc.geoswitch.mapper.StateMapper;
import com.jpmc.geoswitch.model.StateModel;
import com.jpmc.geoswitch.repository.StateRepository;
import com.jpmc.geoswitch.service.StateService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
@Slf4j
public class StateServiceImpl implements StateService {
    private final StateRepository stateRepository;

    @Override
    public StateModel getCountryById(UUID stateId) throws StateNotFoundException {
        log.info("StateServiceImpl::getCountryById");
        return stateRepository.findById(stateId)
                .map(StateMapper::map)
                .orElseThrow(() -> new StateNotFoundException(String.format("no state found with id: %s", stateId)));
    }

    @Override
    public List<StateModel> getAllCountries() {
        log.info("StateServiceImpl::getAllCountries");
        return stateRepository.findAll().stream()
                .map(StateMapper::map)
                .toList();
    }
}
