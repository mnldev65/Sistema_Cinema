package cinema;

public class Main {
    public static void main(String[] args) {
        Filme f1 = new Filme("Vingadores: Ultimato", "Ação", 12, "1h20m");
        Ingresso i1 = new Ingresso(80, true, "g4", "27/04", "16:00", 10, 15);
        
       Sessao s1 = new Sessao(f1, i1);
        
        s1.exibirSessao();

        i1.comprarIng();
    }
}
