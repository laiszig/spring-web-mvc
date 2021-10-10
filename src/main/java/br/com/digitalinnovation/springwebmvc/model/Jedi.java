package br.com.digitalinnovation.springwebmvc.model;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

public class Jedi {

    @NotBlank
    private String lastName;

    @NotBlank
    private String name;

    public Jedi(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public Jedi() {
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
