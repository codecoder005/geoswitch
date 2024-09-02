package com.jpmc.geoswitch.controller.rest;

import com.jpmc.geoswitch.api.PingAPI;
import com.jpmc.geoswitch.dto.response.PingAPIResponse;
import com.jpmc.geoswitch.model.CountryModel;
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

import java.time.ZonedDateTime;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/v1/countries")
@RequiredArgsConstructor
@Slf4j
public class CountryRestAPIController implements PingAPI {
    private final CountryService countryService;

    @Override
    public PingAPIResponse ping() {
        return PingAPIResponse.builder()
                .status(HttpStatus.OK.value())
                .message("Up and Running")
                .timestamp(ZonedDateTime.now())
                .build();
    }

    @GetMapping(produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<List<CountryModel>> getAllCountries() {
        log.info("CountryRestAPIController::getAllCountries");
        return ResponseEntity.status(HttpStatus.OK)
                .body(countryService.getAllCountries());
    }

    @GetMapping(value = "/{countryId}", produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<CountryModel> getCountryById(@PathVariable final UUID countryId) {
        log.info("CountryRestAPIController::getCountryById");
        return ResponseEntity.status(HttpStatus.OK)
                .body(countryService.getCountryById(countryId));
    }
}
