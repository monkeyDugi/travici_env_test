package com.example.traviscienvtest;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Getter
@Component
public class Env {

    @Value("${api.youtube}")
    private String api;

}
