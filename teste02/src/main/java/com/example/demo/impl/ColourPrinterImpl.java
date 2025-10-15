package com.example.demo.impl;

import com.example.demo.services.*;
import lombok.extern.java.Log;

public class ColourPrinterImpl implements ColourPrinter {

    private RedPrinter redPrinter;
    private GreenPrinter greenPrinter;
    private BluePrinter bluePrinter;

    public ColourPrinterImpl() {
        this.redPrinter = new EnglishRedPrinter();
        this.greenPrinter = new EnglishGreenPrinter();
        this.bluePrinter = new EnglishBluePrinter();
    }

    @Override
    public String print() {
        return String.join(
            ", ",
            redPrinter.print(),
            greenPrinter.print(),
            bluePrinter.print()
        );
    }
}
