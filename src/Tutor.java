public class Tutor extends Pessoa {
    public Tutor(String nome) {
        super(nome);
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("=== informações do tutor ===");
        System.out.println("nome: " + getNome());
    }

}