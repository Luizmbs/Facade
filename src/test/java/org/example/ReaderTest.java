package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReaderTest {

    @Test
    void deveRetornarPendenciaEmprestimoEncerramento() {
        Reader leitor = new Reader();
        LoanSector.getInstancia().addLeitorPendente(leitor);

        assertEquals(false, leitor.encerrarCadastro());
    }

    @Test
    void deveRetornarPendenciaFinanceiroEncerramento() {
        Reader leitor = new Reader();
        FinanceSector.getInstancia().addLeitorPendente(leitor);

        assertEquals(false, leitor.encerrarCadastro());
    }

    @Test
    void deveRetornarPendenciaReservaEncerramento() {
        Reader leitor = new Reader();
        HoldsSector.getInstancia().addLeitorPendente(leitor);

        assertEquals(false, leitor.encerrarCadastro());
    }

    @Test
    void deveRetornarLeitorSemPendenciaEncerramento() {
        Reader leitor = new Reader();

        assertEquals(true, leitor.encerrarCadastro());
    }

}
