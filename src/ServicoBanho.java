public class ServicoBanho extends Servico {
    public ServicoBanho(String descricao, double preco) {
        super(descricao, preco);
    }

    @Override
    public void realizarServico() {
        System.out.println("realizando serviço de banho..");
    }

    @Override
    public String toString() {
        return super.toString() + " ";
    }
}