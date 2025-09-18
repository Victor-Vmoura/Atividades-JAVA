package Atividade1;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        ArrayList<Pessoa> listaDePessoa = new ArrayList<>();

        Pessoa pessoa1 = new Pessoa();
        Pessoa pessoa2 = new Pessoa();
        Pessoa pessoa3 = new Pessoa();

        pessoa1.setNome("Victor");
        pessoa1.setIdade(29);

        pessoa2.setNome("Yasmin");
        pessoa2.setIdade(30);

        pessoa3.setNome("Rose");
        pessoa3.setIdade(56);

        listaDePessoa.add(pessoa1);
        listaDePessoa.add(pessoa2);
        listaDePessoa.add(pessoa3);

        System.out.println(listaDePessoa.size());
        System.out.println(listaDePessoa.get(0).getNome());
        System.out.println("lista de pessoas");
        for (Pessoa pessoa : listaDePessoa){
            System.out.println(pessoa.getNome());
        }


    }
}
