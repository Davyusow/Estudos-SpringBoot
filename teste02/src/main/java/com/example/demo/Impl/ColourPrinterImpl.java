package com.example.demo.impl;

import com.example.demo.interfaces.BluePrinter;
import com.example.demo.interfaces.ColourPrinter;
import com.example.demo.interfaces.GreenPrinter;
import com.example.demo.interfaces.RedPrinter;

public class ColourPrinterImpl implements ColourPrinter {

    private final RedPrinter redPrinter;
    private final GreenPrinter greenPrinter;
    private final BluePrinter bluePrinter;

    public ColourPrinterImpl() {
        this.redPrinter = new EnglishRedPrinter();
        this.greenPrinter = new EnglishGreenPrinter();
        this.bluePrinter = new EnglishBluePrinter();
    }

    @Override
    public String printColour(String colour) {
        return String.join(
            " ",
            redPrinter.printRed(colour),
            greenPrinter.printGreen(colour),
            bluePrinter.printBlue(colour)
        );
    }
}
