public class Gato extends Animal implements BanhoPet, Hospedagem {
    public Gato(String nome, String raca) {
        super(nome, raca);
    }

    @Override
    public void darBanho() {
        System.out.println("dando banho no gato: " + getNome());
    }

    @Override
    public void hospedar() {
        System.out.println("hospedando o gato: " + getNome());
    }

    @Override
    public void emitirSom() {
        System.out.println("miau!");
    }

    public void emitirSom(boolean feliz) {
        if (feliz) {
            System.out.println("ronronando!");
        } else {
            System.out.println("hiss!");
        }
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("nome: " + getNome());
        System.out.println("raça: " + getRaca());
    }

    @Override
    public String toString() {
        return "gato {" +
                "nome='" + getNome() + '\'' +
                ", raca='" + getRaca() + '\'' +
                ", tipo='gato'" +
                '}';
    }
}