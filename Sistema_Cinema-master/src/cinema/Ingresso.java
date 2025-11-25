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

    public void setMeia(boolean meia) {
        this.meia = meia;
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

   public double getPreco() {
        if (meia == true) {
            return precoBase / 2;
        } else {
            return precoBase;
        }
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

    public void diminuirEstoque() {
        this.estoque -= 1;
    } 
}
