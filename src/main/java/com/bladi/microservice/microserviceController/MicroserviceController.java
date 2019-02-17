package com.bladi.microservice.microserviceController;

import com.bladi.microservice.model.LimitConfiguration;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.Serializable;

@RestController
public interface MicroserviceController extends Serializable {

    @GetMapping(path="/microservice",produces = {MediaType.APPLICATION_JSON_VALUE})
    ResponseEntity<LimitConfiguration > getMicroservice()throws Exception;
}
