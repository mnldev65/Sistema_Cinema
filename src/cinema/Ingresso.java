package cinema;

public class Ingresso {
    private double precoBase;
    private boolean meia;
    private String assento;
    private String data;
    private String hora;
    private int estoque;
    private int sala;

    public Ingresso() {
        
    }

      public Ingresso(double precoBase, boolean meia, String assento, String data, String hora, int estoque, int sala) {
        this.precoBase = precoBase;
        this.meia = meia;
        this.assento = assento;
        this.data = data;
        this.hora = hora;
        this.estoque = estoque;
        this.sala = sala;
    }

    public double getPreco() {
        return precoBase;
    }

    public double getMeiaEntrada() {
        return precoBase / 2;
    }

    public double calcMeia(boolean meia) {
        if (meia) {
            return getMeiaEntrada();
        } else {
            return getPreco();
        }
    }

    public void setAssento(String assento) {
        this.assento = assento;
    }

    public void setData (String data) {
        this.data = data;
    }
    
    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getAssento() {
        return assento;
    }

    public String getData() {
        return data;
    }

    public String getHora() {
        return hora;
    }
    
    public int getSala() {
        return sala;
    }

    public int getEstoque() {
        return estoque;
    }

    public void comprarIng() {
        if (estoque <= 0) {
            System.out.println("Sem Cadeiras disponiveis...");
        } else {
            this.estoque -= 1;
            System.out.println("Compra feita com sucesso");
        }
    }
}
