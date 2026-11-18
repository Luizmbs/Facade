package org.example;

public class FinanceSector extends Sector {

    private static FinanceSector financeSector = new FinanceSector();

    private FinanceSector() {};

    public static FinanceSector getInstancia() {
        return financeSector;
    }
}
