package com.example.Kafka.Controller;

import com.example.Kafka.New.KafkaProducer;

public class KafkaControllerBuilder {
    private KafkaProducer producer;

    public KafkaControllerBuilder setProducer(KafkaProducer producer) {
        this.producer = producer;
        return this;
    }

    public KafkaController createKafkaController() {
        return new KafkaController(producer);
    }
}