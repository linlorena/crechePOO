public class ServicoHospedagem extends Servico {
    public ServicoHospedagem(String descricao, double preco) {
        super(descricao, preco);
    }

    @Override
    public void realizarServico() {
        System.out.println("realizando hospedagem do pet..");
    }

    @Override
    public String toString() {
        return super.toString() + " ";    }
}