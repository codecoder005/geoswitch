package com.jpmc.geoswitch.service.impl;

import com.jpmc.geoswitch.exception.CountryNotFoundException;
import com.jpmc.geoswitch.mapper.JPMCApplicationMapper;
import com.jpmc.geoswitch.model.JPMCApplicationModel;
import com.jpmc.geoswitch.repository.JPMCApplicationRepository;
import com.jpmc.geoswitch.service.JPMCApplicationService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
@Slf4j
public class JPMCApplicationServiceImpl implements JPMCApplicationService {
    private final JPMCApplicationRepository jpmcApplicationRepository;

    @Override
    public List<JPMCApplicationModel> getAllApplications() {
        log.info("JPMCApplicationServiceImpl::getAllApplications");
        return jpmcApplicationRepository.findAll().stream().map(JPMCApplicationMapper::map).toList();
    }

    @Override
    public JPMCApplicationModel getApplicationById(UUID applicationId) throws CountryNotFoundException {
        log.info("JPMCApplicationServiceImpl::getApplicationById");
        return null;
    }
}
