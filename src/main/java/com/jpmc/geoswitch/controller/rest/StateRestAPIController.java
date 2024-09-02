package com.jpmc.geoswitch.controller.rest;

import com.jpmc.geoswitch.api.PingAPI;
import com.jpmc.geoswitch.dto.response.PingAPIResponse;
import com.jpmc.geoswitch.model.StateModel;
import com.jpmc.geoswitch.service.StateService;
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
@RequestMapping("/api/v1/states")
@RequiredArgsConstructor
@Slf4j
public class StateRestAPIController implements PingAPI {
    private final StateService stateService;
    @Override
    public PingAPIResponse ping() {
        return PingAPIResponse.builder()
                .status(HttpStatus.OK.value())
                .message("Up and Running")
                .timestamp(ZonedDateTime.now())
                .build();
    }
    
    @GetMapping(produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<List<StateModel>> getAllStates() {
        log.info("StateRestAPIController::getAllStates");
        return ResponseEntity.status(HttpStatus.OK)
                .body(stateService.getAllCountries());
    }
    
    @GetMapping(value = "/{stateId}", produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<StateModel> getStateById(@PathVariable final UUID stateId) {
        log.info("StateRestAPIController::getStateById");
        return ResponseEntity.status(HttpStatus.OK)
                .body(stateService.getCountryById(stateId));
    }
}
