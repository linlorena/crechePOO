public class Funcionario extends Pessoa {
    private String cargo;
    private String turno;

    public Funcionario(String nome, String cargo, String turno) {
        super(nome);
        this.cargo = cargo;
        this.turno = turno;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("nome: " + getNome() + ", cargo: " + cargo);
    }

    public void exibirInformacoes(String turno) {
        System.out.println("nome: " + getNome() + ", cargo: " + cargo + ", turno: " + turno);
    }

    @Override
    public String toString() {
        return "funcionario (" +
                "nome = '" + getNome() + '\'' +
                ", cargo = '" + cargo + '\'' +
                ", turno = '" + turno + '\'' +
                ')';
    }
}
