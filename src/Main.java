public class Main {
    public static void main(String[] args) {
        MenuCrechePet menu = new MenuCrechePet();

        Tutor tutor = new Tutor("joão");
        menu.adicionarTutor(tutor);

        Funcionario funcionario = new Funcionario("maria", "tosador", "manhã");
        menu.adicionarFuncionario(funcionario);

        Animal animal = new Cachorro("max", "golden retriever");
        menu.adicionarAnimal(animal);

        System.out.println(tutor.toString());
        System.out.println(funcionario.toString());
        System.out.println(animal.toString());

        ServicoBanho servicoBanho = new ServicoBanho("banho completo", 50.0);
        ServicoHospedagem servicoHospedagem = new ServicoHospedagem("hospedagem diária", 100.0);
        ServicoPasseio servicoPasseio = new ServicoPasseio("passeio longo", 80.0);

        System.out.println(servicoBanho.toString());
        System.out.println(servicoHospedagem.toString());
        System.out.println(servicoPasseio.toString());

        menu.selecionarServicos();

        menu.menuPrincipal();
    }
}