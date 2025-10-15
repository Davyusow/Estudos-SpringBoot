package com.example.demo.config;

import com.example.demo.impl.*;
import com.example.demo.services.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PrinterConfig {

    @Bean
    public BluePrinter bluePrinter() {
        return new PortugueseBluePrinter();
    }

    @Bean
    public GreenPrinter greenPrinter() {
        return new PortugueseGreenPrinter();
    }

    @Bean
    public RedPrinter redPrinter() {
        return new PortugueseRedPrinter();
    }

    @Bean
    public ColourPrinter colourPrinter(
        BluePrinter bluePrinter,
        GreenPrinter greenPrinter,
        RedPrinter redPrinter
    ) {
        return new ColourPrinterImpl(bluePrinter, greenPrinter, redPrinter);
    }
}
