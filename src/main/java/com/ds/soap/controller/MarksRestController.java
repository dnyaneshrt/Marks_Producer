package com.ds.soap.controller;

import com.ds.soap.client.MarksResponse;
import com.ds.soap.client.service.MarksClient;
import com.ds.soap.dto.MarksInput;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MarksRestController {

    @Autowired
    private MarksClient marksClient;

    @PostMapping("/calculate")
    public MarksResponse calculate(@RequestBody MarksInput input) {
        return marksClient.getResult(
                input.getS1(),
                input.getS2(),
                input.getS3(),
                input.getS4(),
                input.getS5(),
                input.getS6()
        );
    }
}
