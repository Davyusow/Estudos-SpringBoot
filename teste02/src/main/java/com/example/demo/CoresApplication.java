package com.example.demo;

import com.example.demo.impl.ColourPrinterImpl;
import com.example.demo.services.ColourPrinter;
import lombok.extern.java.Log;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Log
public class CoresApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(CoresApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        final ColourPrinter colourPrinter = new ColourPrinterImpl();
        log.info(colourPrinter.print());
    }
}
