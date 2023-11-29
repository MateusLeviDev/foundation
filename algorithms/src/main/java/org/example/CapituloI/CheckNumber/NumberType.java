package org.example.CapituloI.CheckNumber;

public enum NumberType {
    POSITIVE("positive"),
    NEGATIVE("negative"),
    ZERO("zero");

    NumberType(String label) {
        this.label = label;
    }

    private String label;

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
}
