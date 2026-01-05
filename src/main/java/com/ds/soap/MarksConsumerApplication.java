package com.ds.soap;

import com.ds.soap.client.MarksResponse;
import com.ds.soap.client.service.MarksClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MarksConsumerApplication {
//        implements CommandLineRunner {

    @Autowired
    private MarksClient marksClient;

    public static void main(String[] args) {
        SpringApplication.run(MarksConsumerApplication.class, args);
    }

//    @Override
//    public void run(String... args) {
//        MarksResponse response = marksClient.getResult(75, 85, 90, 50, 80);
//        System.out.println("Total: " + response.getTotal());
//        System.out.println("Percentage: " + response.getPercentage());
//    }
}
