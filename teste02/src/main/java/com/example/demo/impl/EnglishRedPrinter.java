package com.example.demo.impl;

import com.example.demo.services.ColourPrinter;
import com.example.demo.services.RedPrinter;

public class EnglishRedPrinter implements RedPrinter {

    @Override
    public String print() {
        return "Red";
    }
}
