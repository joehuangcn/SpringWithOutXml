package com.joeTest.service;

import org.springframework.stereotype.Service;

@Service
public class MyService {

    public String getInfo(String url){
        return  "Helllo   "+ url;
    }
}
