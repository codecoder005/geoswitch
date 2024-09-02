package com.jpmc.geoswitch.service.impl;

import com.jpmc.geoswitch.exception.ContinentNotFoundException;
import com.jpmc.geoswitch.exception.CountryNotFoundException;
import com.jpmc.geoswitch.mapper.CountryMapper;
import com.jpmc.geoswitch.model.CountryModel;
import com.jpmc.geoswitch.repository.CountryRepository;
import com.jpmc.geoswitch.service.CountryService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
@Slf4j
public class CountryServiceImpl implements CountryService {
    private final CountryRepository countryRepository;

    @Override
    public List<CountryModel> getAllCountries() {
        log.info("CountryServiceImpl::getAllCountries");
        return countryRepository.findAll().stream()
                .map(CountryMapper::map)
                .toList();
    }

    @Override
    public CountryModel getCountryById(final UUID countryId) throws CountryNotFoundException {
        log.info("CountryServiceImpl::getCountryById {}", countryId);
        return countryRepository.findById(countryId)
                .map(CountryMapper::map)
                .orElseThrow(() -> new CountryNotFoundException(String.format("no country found with countryId: %s", countryId)));
    }

    @Override
    public List<CountryModel> getCountriesOfContinentByContinentId(final UUID continentId) throws ContinentNotFoundException {
        log.info("CountryServiceImpl::getCountriesOfContinentByContinentId {}", continentId);
        return countryRepository.findByContinentId(continentId)
                .stream()
                .map(CountryMapper::map)
                .toList();
    }
}
