import java.util.ArrayList;
import java.util.Scanner;

public class MenuCrechePet {
    private ArrayList<Animal> animais;
    private ArrayList<Funcionario> funcionarios;
    private ArrayList<Tutor> tutores;
    private ArrayList<Servico> servicos;

    public MenuCrechePet() {
        this.animais = new ArrayList<Animal>();
        this.funcionarios = new ArrayList<Funcionario>();
        this.tutores = new ArrayList<Tutor>();
        this.servicos = new ArrayList<Servico>();
        inicializarServicos();
    }

    private void inicializarServicos() {
        servicos.add(new ServicoBanho("banho", 50.00));
        servicos.add(new ServicoHospedagem("hospedagem", 100.00));
        servicos.add(new ServicoPasseio("passeio", 80.00));
    }

    private Animal leituraAnimal(Scanner scanner) {
        System.out.print("digite o nome do animal: ");
        String nome = scanner.nextLine();
        System.out.print("digite a raça do animal: ");
        String raca = scanner.nextLine();
        Animal animal = null;

        while (animal == null) {
            System.out.print("digite o tipo de animal (cachorro/gato): ");
            String tipo = scanner.nextLine();
            if (tipo.equalsIgnoreCase("cachorro")) {
                animal = new Cachorro(nome, raca);
            } else if (tipo.equalsIgnoreCase("gato")) {
                animal = new Gato(nome, raca);
            } else {
                System.out.println("tipo de animal inválido.");
            }
        }
        return animal;
    }

    public void adicionarAnimal(Animal animal) {
        animais.add(animal);
        System.out.println("animal adicionado.");
    }

    public void listarAnimais() {
        for (Animal animal : animais) {
            System.out.println(animal);
        }
    }

    public void atualizarAnimal(String nome) {
        Scanner scanner = new Scanner(System.in);
        for (Animal animal : animais) {
            if (animal.getNome().equals(nome)) {
                System.out.print("digite o novo nome do animal: ");
                String novoNome = scanner.nextLine();
                System.out.print("digite a nova raça do animal: ");
                String novaRaca = scanner.nextLine();
                animal.setNome(novoNome);
                animal.setRaca(novaRaca);
                System.out.println("informações do animal atualizadas.");
                return;
            }
        }
        System.out.println("animal não encontrado na creche.");
    }

    public void removerAnimal(String nome) {
        for (int i = 0; i < animais.size(); i++) {
            Animal animal = animais.get(i);
            if (animal.getNome().equals(nome)) {
                animais.remove(i);
                System.out.println("animal removido.");
                return;
            }
        }
        System.out.println("animal não encontrado na creche.");
    }

    private Funcionario leituraFuncionario(Scanner scanner) {
        Funcionario funcionario = null;
        while (funcionario == null) {
            System.out.print("digite o nome do funcionário: ");
            String nome = scanner.nextLine();
            System.out.print("digite o cargo do funcionário: ");
            String cargo = scanner.nextLine();
            System.out.print("digite o turno do funcionário (manhã/tarde/noite): ");
            String turno = scanner.nextLine();
            funcionario = new Funcionario(nome, cargo, turno);
        }
        return funcionario;
    }

    public void adicionarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
        System.out.println("funcionário adicionado.");
    }

    public void listarFuncionarios() {
        for (Funcionario funcionario : funcionarios) {
            System.out.println(funcionario);
        }
    }

    public void atualizarFuncionario(String nome) {
        Scanner scanner = new Scanner(System.in);
        for (Funcionario funcionario : funcionarios) {
            if (funcionario.getNome().equals(nome)) {
                System.out.print("digite o novo nome do funcionário: ");
                String novoNome = scanner.nextLine();
                System.out.print("digite o novo cargo do funcionário: ");
                String novoCargo = scanner.nextLine();
                funcionario.setNome(novoNome);
                funcionario.setCargo(novoCargo);
                System.out.println("informações do funcionário atualizadas.");
                return;
            }
        }
        System.out.println("funcionário não encontrado.");
    }

    public void removerFuncionario(String nome) {
        for (int i = 0; i < funcionarios.size(); i++) {
            Funcionario funcionario = funcionarios.get(i);
            if (funcionario.getNome().equals(nome)) {
                funcionarios.remove(i);
                System.out.println("funcionário removido.");
                return;
            }
        }
        System.out.println("funcionário não encontrado.");
    }

    private Tutor leituraTutor(Scanner scanner) {
        Tutor tutor = null;
        while (tutor == null) {
            System.out.print("digite o nome do tutor: ");
            String nome = scanner.nextLine();
            tutor = new Tutor(nome);
        }
        return tutor;
    }

    public void adicionarTutor(Tutor tutor) {
        tutores.add(tutor);
        System.out.println("tutor adicionado.");
    }

    public void listarTutores() {
        for (Tutor tutor : tutores) {
            System.out.println(tutor);
        }
    }

    public void atualizarTutor(String nome) {
        Scanner scanner = new Scanner(System.in);
        for (Tutor tutor : tutores) {
            if (tutor.getNome().equals(nome)) {
                System.out.print("digite o novo nome do tutor: ");
                String novoNome = scanner.nextLine();
                tutor.setNome(novoNome);
                System.out.println("informações do tutor atualizadas.");
                return;
            }
        }
        System.out.println("tutor não encontrado.");
    }

    public void removerTutor(String nome) {
        for (int i = 0; i < tutores.size(); i++) {
            Tutor tutor = tutores.get(i);
            if (tutor.getNome().equals(nome)) {
                tutores.remove(i);
                System.out.println("tutor removido.");
                return;
            }
        }
        System.out.println("tutor não encontrado.");
    }

    public void listarServicos() {
        for (Servico servico : servicos) {
            System.out.println(servico);
        }
    }

    public void selecionarServicos() {
        Scanner scanner = new Scanner(System.in);
        double total = 0;
        String opcao;

        do {
            System.out.println("selecione o serviço que deseja:");
            System.out.println("1. banho - R$50.00");
            System.out.println("2. hospedagem - R$100.00");
            System.out.println("3. passeio - R$80.00");
            System.out.print("escolha uma opção: ");
            int escolha = scanner.nextInt();
            scanner.nextLine();

            Servico servicoSelecionado = null;
            switch (escolha) {
                case 1:
                    servicoSelecionado = new ServicoBanho("banho", 50.00);
                    break;
                case 2:
                    servicoSelecionado = new ServicoHospedagem("hospedagem", 100.00);
                    break;
                case 3:
                    servicoSelecionado = new ServicoPasseio("passeio", 80.00);
                    break;
                default:
                    System.out.println("opção inválida.");
            }

            if (servicoSelecionado != null) {
                total += servicoSelecionado.getPreco();
                System.out.println("serviço adicionado ao carrinho.");
            }

            System.out.print("deseja adicionar outro serviço? (s/n): ");
            opcao = scanner.nextLine();
        } while (opcao.equalsIgnoreCase("s"));

        System.out.println("total dos serviços selecionados: R$ " + total);
    }

    public void menuPrincipal() {
        Scanner scanner = new Scanner(System.in);
        int opcao;
        do {
            System.out.println("=== MENU CRECHE PET ===");
            System.out.println("1. adicionar animal");
            System.out.println("2. listar animais");
            System.out.println("3. atualizar animal");
            System.out.println("4. remover animal");
            System.out.println("5. adicionar funcionário");
            System.out.println("6. listar funcionários");
            System.out.println("7. atualizar funcionário");
            System.out.println("8. remover funcionário");
            System.out.println("9. adicionar tutor");
            System.out.println("10. listar tutores");
            System.out.println("11. atualizar tutor");
            System.out.println("12. remover tutor");
            System.out.println("13. listar serviços");
            System.out.println("14. selecionar serviços e calcular total");
            System.out.println("0. sair");
            System.out.print("escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    adicionarAnimal(leituraAnimal(scanner));
                    break;
                case 2:
                    listarAnimais();
                    break;
                case 3:
                    System.out.print("digite o nome do animal a ser atualizado: ");
                    String nomeAtualizar = scanner.nextLine();
                    atualizarAnimal(nomeAtualizar);
                    break;
                case 4:
                    System.out.print("digite o nome do animal a ser removido: ");
                    String nomeRemover = scanner.nextLine();
                    removerAnimal(nomeRemover);
                    break;
                case 5:
                    adicionarFuncionario(leituraFuncionario(scanner));
                    break;
                case 6:
                    listarFuncionarios();
                    break;
                case 7:
                    System.out.print("digite o nome do funcionário a ser atualizado: ");
                    String nomeFuncAtualizar = scanner.nextLine();
                    atualizarFuncionario(nomeFuncAtualizar);
                    break;
                case 8:
                    System.out.print("digite o nome do funcionário a ser removido: ");
                    String nomeFuncRemover = scanner.nextLine();
                    removerFuncionario(nomeFuncRemover);
                    break;
                case 9:
                    adicionarTutor(leituraTutor(scanner));
                    break;
                case 10:
                    listarTutores();
                    break;
                case 11:
                    System.out.print("digite o nome do tutor a ser atualizado: ");
                    String nomeTutorAtualizar = scanner.nextLine();
                    atualizarTutor(nomeTutorAtualizar);
                    break;
                case 12:
                    System.out.print("digite o nome do tutor a ser removido: ");
                    String nomeTutorRemover = scanner.nextLine();
                    removerTutor(nomeTutorRemover);
                    break;
                case 13:
                    listarServicos();
                    break;
                case 14:
                    selecionarServicos();
                    break;
                case 0:
                    System.out.println("programa encerrado");
                    break;
                default:
                    System.out.println("opção inválida.");
            }
        } while (opcao != 0);
        scanner.close();
    }
}

