package com.bladi.microservice.microserviceController;

import com.bladi.microservice.config.Properties;
import com.bladi.microservice.model.LimitConfiguration;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class MicroserviceControllerImpl implements MicroserviceController {

    private Properties properties;

    public MicroserviceControllerImpl(Properties properties){
        this.properties=properties;
    }

    @Override
    public ResponseEntity<LimitConfiguration> getMicroservice() {
        LimitConfiguration lc = new LimitConfiguration(Integer.parseInt(properties.getMin()), Integer.parseInt(properties.getMax()));
        return new ResponseEntity(lc,HttpStatus.OK);
    }
}
