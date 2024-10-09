package org.gustavotbett;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class Departamento extends CustoComponent {
    private List<CustoComponent> custoComponents;

    public Departamento(String caminho, String nome) {
        super(caminho, nome, 0l);
        this.custoComponents = new ArrayList<>();
    }

    @Override
    void adicionar(CustoComponent custoComponent) {
        custoComponents.add(custoComponent);
    }

    Long getCusto() {
        Long valorTotal = 0l;
        for(CustoComponent custoComponent : custoComponents) {
            valorTotal += custoComponent.getCusto();
        }
        return valorTotal;
    }

    @Override
    void exibir() {
        Long valorTotal = getCusto();
        System.out.println("- Nome: " + getNome() + " - Custo: " + valorTotal + " - Caminho: " + getCaminho());
        for(CustoComponent custoComponent : custoComponents) {
            custoComponent.exibir();
        }
    }

    void remover(CustoComponent custoComponent) {
        custoComponents.remove(custoComponent);
    }

    @Override
    CustoComponent recuperarFilho(int numero) {
        if (custoComponents.get(numero) != null) {
            return custoComponents.get(numero);
        } else {
            return null;
        }
    }
}
