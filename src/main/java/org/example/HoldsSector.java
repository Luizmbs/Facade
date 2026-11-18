package org.example;

public class HoldsSector extends Sector {

    private static HoldsSector holdsSector = new HoldsSector();

    private HoldsSector() {};

    public static HoldsSector getInstancia() {
        return holdsSector;
    }
}
