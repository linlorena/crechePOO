public class ServicoPasseio extends Servico {
    public ServicoPasseio(String descricao, double preco) {
        super(descricao, preco);
    }

    @Override
    public void realizarServico() {
        System.out.println("levando cachorro para passear..");
    }

    @Override
    public String toString() {
        return super.toString() + " ";    }
}