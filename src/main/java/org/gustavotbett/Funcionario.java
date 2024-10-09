package org.gustavotbett;

public class Funcionario extends CustoComponent {

    public Funcionario(String caminho, String nome, Long custo) {
        super(caminho, nome, custo);
    }

    @Override
    Long getCusto() {
        return super.getCusto();
    }

    void exibir() {
        System.out.println("- Nome: " + getNome() + " - Custo: " + getCusto() + " - Caminho: " + getCaminho());
    }
}
