package org.gustavotbett;

public class GerenciadorCusto {
    private CustoComponent custo;

    public GerenciadorCusto(CustoComponent custo) {
        this.custo = custo;
    }

    public void exibirTudo() {
        custo.exibir();
    }
}
