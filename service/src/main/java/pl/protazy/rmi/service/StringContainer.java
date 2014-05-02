package pl.protazy.rmi.service;

import java.io.Serializable;

public class StringContainer implements Serializable {
    private String string;

    public StringContainer(String string) {
        this.string = string;
    }

    public String getString() {
        return string;
    }
}
