package com.example.Kafka.Controller;

import com.example.Kafka.New.KafkaProducer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping(path="api/v5/New")

public class KafkaController {
    private KafkaProducer producer;

    public KafkaController(KafkaProducer producer){
        this.producer = producer;
    }


}
