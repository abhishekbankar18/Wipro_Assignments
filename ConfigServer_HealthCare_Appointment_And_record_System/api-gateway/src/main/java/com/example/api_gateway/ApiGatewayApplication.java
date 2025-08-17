package com.example.api_gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiGatewayApplication.class, args);
	}
	
	@Bean
    public RouteLocator routes(RouteLocatorBuilder builder) {
        return builder.routes()
                .route("patient-service", r -> r.path("/api/patients/**")
                        .uri("http://localhost:1111"))
                .route("doctor-service", r -> r.path("/api/doctors/**")
                        .uri("http://localhost:2222"))
                .route("appointment-service", r -> r.path("/api/appointments/**")
                        .uri("http://localhost:3333"))
                .route("medicalrecords-service", r -> r.path("/api/medicalrecords/**")
                        .uri("http://localhost:4444"))
                .route("billing-service", r -> r.path("/api/billings/**")
                        .uri("http://localhost:5555"))
                .build();
    }
}
