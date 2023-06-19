package com.saikumar.GetAPIAndMailIntegrationSB;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CarConfiguration {
    @Bean
    public Car carobj(){
       String name = "POLO";
       String color = "Red";
       int mileage = 18;
       int topSpeed = 160;
       int seatCap = 5;
       return new Car(name,color,mileage,topSpeed,seatCap);
    }
}
