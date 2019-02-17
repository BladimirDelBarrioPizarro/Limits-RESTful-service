package com.bladi.microservice.config;

import com.bladi.microservice.microserviceController.MicroserviceController;
import com.bladi.microservice.microserviceController.MicroserviceControllerImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean
    public Properties properties(){
        return new Properties();
    }

    @Bean
    public MicroserviceController microserviceController(Properties properties){
        return new MicroserviceControllerImpl(properties);
    }

}
