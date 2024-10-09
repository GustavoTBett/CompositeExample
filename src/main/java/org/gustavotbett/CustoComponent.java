package org.gustavotbett;

public abstract class CustoComponent {
    private String nome;
    private String caminho;
    private Long custo;

    public CustoComponent(String caminho, String nome, Long custo) {
        this.caminho = caminho;
        this.nome = nome;
        this.custo = custo;
    }

    String getNome() {
        return nome;
    }

    String getCaminho() {
        return caminho;
    }

    Long getCusto() {
        return custo;
    }

    void calcularCusto() {
        throw new Error("Metodo nao suportado.");
    }

    void exibir() {
        throw new Error("Metodo nao suportado.");
    }

    void adicionar(CustoComponent custoComponent) {
        throw new Error("Metodo nao suportado.");
    }

    void remover(CustoComponent custoComponent) {
        throw new Error("Metodo nao suportado.");
    }

    CustoComponent recuperarFilho(int numero) {
        throw new Error("Metodo nao suportado.");
    }
}
