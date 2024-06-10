public class Cachorro extends Animal implements BanhoPet, Hospedagem, PasseioPet {
    public Cachorro(String nome, String raca) {
        super(nome, raca);
    }

    @Override
    public void darBanho() {
        System.out.println("dando banho no cachorro: " + getNome());
    }

    @Override
    public void hospedar() {
        System.out.println("hospedando o cachorro: " + getNome());
    }

    public void passear() {
        System.out.println("passeando com o cachorro: " + getNome());
    }

    @Override
    public void emitirSom() {
        System.out.println("au au!");
    }

    public void emitirSom(int vezes) {
        for (int i = 0; i < vezes; i++) {
            System.out.print("au ");
        }
        System.out.println();
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("nome: " + getNome());
        System.out.println("raça: " + getRaca());
    }

    @Override
    public String toString() {
        return "cachorro {" +
                "nome='" + getNome() + '\'' +
                ", raca='" + getRaca() + '\'' +
                ", tipo='cachorro'" +
                '}';
    }
}