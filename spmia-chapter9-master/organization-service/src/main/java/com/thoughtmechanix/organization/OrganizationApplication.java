package com.thoughtmechanix.organization;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;


@SpringBootApplication
@EnableEurekaClient
@EnableCircuitBreaker
@EnableBinding(Source.class)
public class OrganizationApplication {

   /* @Bean
    public Sampler defaultSampler() {
        return new AlwaysSampler();
    }*/

    public static void main(String[] args) {
        SpringApplication.run(OrganizationApplication.class, args);
    }
}
