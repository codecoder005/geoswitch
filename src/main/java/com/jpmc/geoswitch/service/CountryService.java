package com.jpmc.geoswitch.service;

import com.jpmc.geoswitch.exception.ContinentNotFoundException;
import com.jpmc.geoswitch.exception.CountryNotFoundException;
import com.jpmc.geoswitch.model.CountryModel;

import java.util.List;
import java.util.UUID;

public interface CountryService {
    List<CountryModel> getAllCountries();

    CountryModel getCountryById(final UUID countryId) throws CountryNotFoundException;

    List<CountryModel> getCountriesOfContinentByContinentId(final UUID continentId) throws ContinentNotFoundException;
}
