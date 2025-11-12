package cinema;

public class Sala {
    private int numSala;
    private int qtdePessoas;
    
    public Sala(int numSala, int qtdePessoas) {
        this.numSala = numSala;
        this.qtdePessoas = qtdePessoas;
    }

    public int getNumSala() {
        return numSala;
    }

    public int getQtdePessoas(){
        return qtdePessoas;
    }
}
