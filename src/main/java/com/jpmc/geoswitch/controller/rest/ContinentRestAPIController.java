package com.jpmc.geoswitch.controller.rest;

import com.jpmc.geoswitch.model.ContinentModel;
import com.jpmc.geoswitch.model.CountryModel;
import com.jpmc.geoswitch.service.ContinentService;
import com.jpmc.geoswitch.service.CountryService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/v1/continents")
@RequiredArgsConstructor
@Slf4j
public class ContinentRestAPIController {
    private final ContinentService continentService;
    private final CountryService countryService;

    @GetMapping(produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<List<ContinentModel>> getAllContinents() {
        log.info("ContinentRestAPIController::getAllContinents");
        return ResponseEntity.status(HttpStatus.OK)
                .body(continentService.getAllContinents());
    }

    @GetMapping(value = "/{continentId}", produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<ContinentModel> getContinentById(@PathVariable final UUID continentId) {
        log.info("ContinentRestAPIController::getContinentById");
        return ResponseEntity.status(HttpStatus.OK)
                .body(continentService.getContinentById(continentId));
    }

    @GetMapping(value = "/{continentId}/countries", produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<List<CountryModel>> getCountriesOfContinentByContinentId(@PathVariable final UUID continentId) {
        log.info("ContinentRestAPIController::getCountriesOfContinentByContinentId {}", continentId);
        return ResponseEntity.status(HttpStatus.OK)
                .body(countryService.getCountriesOfContinentByContinentId(continentId));
    }
}
