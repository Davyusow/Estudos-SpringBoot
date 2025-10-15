package com.example.demo.impl;

import com.example.demo.services.BluePrinter;
import com.example.demo.services.RedPrinter;

public class EnglishBluePrinter implements BluePrinter {

    @Override
    public String print() {
        return "Blue";
    }
}
