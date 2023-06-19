package com.saikumar.GetAPIAndMailIntegrationSB;

import org.saikumar.MailHandler;
import org.saikumar.MailMetaData;
import org.saikumar.Main;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarController {

    @Autowired
    private Car car;

@GetMapping("testing/parameters/Car")
    public String postSpecifications(){
        String details = car.toString();
        System.out.println(details);
        System.out.println("Calling an API and start sending mail");
        MailMetaData.Details = details;
          Main.main(null);
        return details;
    }
}
