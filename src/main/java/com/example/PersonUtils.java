package com.example;

import java.time.LocalDate;

public class PersonUtils {

    public static Person parsePerson(String line) {
        String[] parts = line.split(",");
        return new Person(parts[0].trim(), parts[1].trim(), LocalDate.parse(parts[2].trim()));
    }
}
