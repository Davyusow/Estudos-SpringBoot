package com.example.demo.impl;

import com.example.demo.services.*;
import lombok.extern.java.Log;
import org.springframework.stereotype.Component;

@Component
public class ColourPrinterImpl implements ColourPrinter {

    private BluePrinter bluePrinter;
    private GreenPrinter greenPrinter;
    private RedPrinter redPrinter;

    public ColourPrinterImpl(
        BluePrinter bluePrinter,
        GreenPrinter greenPrinter,
        RedPrinter redPrinter
    ) {
        this.bluePrinter = bluePrinter;
        this.greenPrinter = greenPrinter;
        this.redPrinter = redPrinter;
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
