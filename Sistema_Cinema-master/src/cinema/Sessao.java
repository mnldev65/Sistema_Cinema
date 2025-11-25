package cinema;

public class Sessao {
    private Filme filme;
    private Ingresso ingresso;

    public Sessao() {
        
    }

    public Sessao(Filme filme, Ingresso ingresso) {
        this.filme = filme;
        this.ingresso = ingresso;
    }

    public void exibirSessao() {
        System.out.println("Filme: " + filme.getTitulo());
        System.out.println("preco: " + ingresso.getPreco());
        System.out.println("Sala: " + ingresso.getSala());
        System.out.println("Assento: " + ingresso.getAssento());
        System.out.println("Data: " + ingresso.getData());
        System.out.println("Hora: " + ingresso.getHora());
    }
}
