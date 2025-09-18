import Atividade1.Carro;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Carro onix = new Carro();

        onix.nomeDoModelo("Onix");
        onix.definirPreco(45504, 40510, 60000);
        onix.exibirInformacoes();



    }
}