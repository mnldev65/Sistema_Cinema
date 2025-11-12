package cinema;

public class Filme {
    private String titulo;
    private String genero;
    private int faixaEtaria;
    private int duracao;

    public Filme(String titulo, String genero, int faixaEtaria, int duracao){
        this.titulo = titulo;
        this.genero = genero;
        this.faixaEtaria = faixaEtaria;
        this.duracao = duracao;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getGenero(){
        return genero;
    }

    public int getFaixaEtaria() {
        return faixaEtaria;
    }

    public int getDuracao() {
        return duracao;
    }

    public void status() {
       System.out.println("Filme: " + titulo); 
       System.out.println("Gênero: " + genero);
       System.out.printf("Faixa etaria: %d anos", faixaEtaria);
       System.out.println("\nDuração: " + duracao);
    }
}
