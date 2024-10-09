package org.gustavotbett;

public class Main {
    public static void main(String[] args) {
        Departamento raiz = new Departamento("/", "Raiz");

        Departamento dep1 = new Departamento("/dep1", "Dep1");
        Departamento dep2 = new Departamento("/dep2", "Dep2");
        Departamento dep3 = new Departamento("/dep3", "Dep3");

        raiz.adicionar(dep1);
        raiz.adicionar(dep2);
        raiz.adicionar(dep3);

        Funcionario funcionario1 = new Funcionario("/funcionario1", "Funcionario 1", 1500l);
        Funcionario funcionario2 = new Funcionario("/funcionario2", "Funcionario 2", 2000l);

        dep1.adicionar(funcionario1);
        dep1.adicionar(funcionario2);

        Funcionario funcionario3 = new Funcionario("/funcionario3", "Funcionario 3", 3000l);
        Funcionario funcionario4 = new Funcionario("/funcionario4", "Funcionario 4", 3500l);

        dep2.adicionar(funcionario3);
        dep2.adicionar(funcionario4);

        Departamento dep4 = new Departamento("/dep4", "Dep4");
        Funcionario funcionario5 = new Funcionario("/funcionario5", "Funcionario 5", 2000l);
        dep4.adicionar(funcionario5);

        dep2.adicionar(dep4);

        Funcionario funcionario6 = new Funcionario("/funcionario6", "Funcionario 6", 3000l);

        dep3.adicionar(funcionario6);

        GerenciadorCusto gerenciadorCusto = new GerenciadorCusto(raiz);
        gerenciadorCusto.exibirTudo();
    }
}