package com.example.demo.impl;

import com.example.demo.services.ColourPrinter;
import com.example.demo.services.GreenPrinter;

public class EnglishGreenPrinter implements GreenPrinter {

    @Override
    public String print() {
        return "Green";
    }
}
