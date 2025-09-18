public class Musica {
    String titulo;
    String artista;
    int anoDeLancamento;
    double avaliacao;
    int numeroDeAvaliacoes;

    public void fichaTecnica(){
        System.out.println("Titulo da música: " + titulo);
        System.out.println("Nome do Artista: " + artista);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        System.out.println("Número de Avaliações: " + numeroDeAvaliacoes);
        System.out.println("Avaliação: " + avaliacao/ numeroDeAvaliacoes);
    }

    public void avalia(double nota){
        avaliacao = avaliacao + nota;
        numeroDeAvaliacoes++;

    }

}
