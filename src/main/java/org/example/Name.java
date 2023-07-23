package org.example;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter


public class Name {

    private String firstName;
    private String lastName;

    public Name(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
}