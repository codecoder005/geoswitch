package com.jpmc.geoswitch.controller.rest;

import com.jpmc.geoswitch.model.JPMCApplicationModel;
import com.jpmc.geoswitch.service.JPMCApplicationService;
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
@RequestMapping("/api/v1/applications")
@RequiredArgsConstructor
@Slf4j
public class JPMCApplicationRestController {
    private final JPMCApplicationService jpmcApplicationService;

    @GetMapping(produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<List<JPMCApplicationModel>> getAllApplications() {
        log.info("JPMCApplicationRestController::getAllApplications");
        return ResponseEntity.status(HttpStatus.OK)
                .body(jpmcApplicationService.getAllApplications());
    }

    @GetMapping(value = "/{applicationId}", produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<JPMCApplicationModel> getApplicationById(@PathVariable final UUID applicationId) {
        log.info("JPMCApplicationRestController::getApplicationById");
        return ResponseEntity.status(HttpStatus.OK)
                .body(jpmcApplicationService.getApplicationById(applicationId));
    }
}
