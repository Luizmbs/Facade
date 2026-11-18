package org.example;

public class ReaderFacade {

    public static boolean verificarPendenciasEncerramento(Reader leitor) {
        if (LoanSector.getInstancia().verificarLeitorComPendencia(leitor)) {
            return false;
        }
        if (FinanceSector.getInstancia().verificarLeitorComPendencia(leitor)) {
            return false;
        }
        if (HoldsSector.getInstancia().verificarLeitorComPendencia(leitor)) {
            return false;
        }
        return true;
    }
}
