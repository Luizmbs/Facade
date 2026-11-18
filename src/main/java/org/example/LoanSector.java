package org.example;

public class LoanSector extends Sector {

    private static LoanSector loanSector = new LoanSector();

    private LoanSector() {};

    public static LoanSector getInstancia() {
        return loanSector;
    }

}
