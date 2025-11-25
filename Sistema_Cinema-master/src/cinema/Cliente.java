package cinema;

public class Cliente {
    private String nome;
    private int idade;
    private String cpf;
    private double saldo;
    private Ingresso ingresso;
    private Filme filme;

    public Cliente() {

    }

    public Cliente(String nome, int idade, String cpf, double saldo, Ingresso ingresso, Filme filme) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.saldo = saldo;
        this.ingresso = ingresso;
        this.filme = filme;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        if (idade <= 0) {
            System.out.println("idade invalida");
        } else {
            this.idade = idade;
        }
    }

    public void verClassi() {
        if (idade < filme.getFaixaEtaria()) {
            System.out.println("idade incompativel com a classificacao indicativa");
        } else {
            System.out.println("idade compativel com a classificacao indicativa");
        }
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void comprarIng() {
        if (ingresso.getEstoque() >= 1) {
            if (saldo >= ingresso.getPreco()) {
                System.out.println("Compra efetuada com sucesso");
                ingresso.diminuirEstoque();;
            } else {
                System.out.println("saldo insufiente");
            }
        } else {
            System.out.println("estoque indisponivel");
        }
    }
    
    public void verDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Cpf: " + cpf);
        System.out.println("cadastro realizado.");
    }

}
