package org.example;

import java.util.ArrayList;
import java.util.List;

public abstract class Sector {

    private List<Reader> leitoresComPendencia = new ArrayList<Reader>();

    public void addLeitorPendente(Reader leitor) {
        this.leitoresComPendencia.add(leitor);
    }

    public boolean verificarLeitorComPendencia(Reader leitor) {
        return this.leitoresComPendencia.contains(leitor);
    }

}
