package org.example;

public class Reader {

    public boolean encerrarCadastro() {
        return ReaderFacade.verificarPendenciasEncerramento(this);
    }
}
