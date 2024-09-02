package com.jpmc.geoswitch.service.impl;

import com.jpmc.geoswitch.exception.ContinentNotFoundException;
import com.jpmc.geoswitch.mapper.ContinentMapper;
import com.jpmc.geoswitch.model.ContinentModel;
import com.jpmc.geoswitch.repository.ContinentRepository;
import com.jpmc.geoswitch.service.ContinentService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
@Slf4j
public class ContinentServiceImpl implements ContinentService {
    private final ContinentRepository continentRepository;

    @Override
    public List<ContinentModel> getAllContinents() {
        log.info("ContinentServiceImpl::getAllContinents");
        return continentRepository.findAll().stream()
                .map(ContinentMapper::map)
                .toList();
    }

    @Override
    public ContinentModel getContinentById(UUID continentId) throws ContinentNotFoundException {
        log.info("ContinentServiceImpl::getContinentById");
        return continentRepository.findById(continentId)
                .map(ContinentMapper::map)
                .orElseThrow(() -> new ContinentNotFoundException(String.format("no continent found with id: %s", continentId)));
    }
}
