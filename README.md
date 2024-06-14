# Sistema de Gerenciamento de Creche de Animais

## Descrição
Este projeto é um sistema de gerenciamento para uma creche de animais, desenvolvido com programação orientada a objetos em Java. Ele permite gerenciar informações sobre tutores, animais, funcionários e serviços oferecidos pela creche, como banho, hospedagem e passeio. 

## Funcionalidades (CRUD)
- Adicionar, listar, atualizar e remover tutores, animais e funcionários.
- Listar serviços oferecidos pela creche.
- Agendar serviços para os animais.

## Estrutura do Projeto
O projeto está organizado em várias classes e interfaces, cada uma responsável por diferentes partes da funcionalidade do sistema.

### Classes Principais
- `MenuCrechePet`: Classe principal que inicializa o sistema e gerencia a interação com o usuário.
- `Pessoa`: Classe abstrata que representa uma pessoa, com atributos como nome e métodos comuns.
- `Tutor`: Subclasse de `Pessoa` que representa um tutor de animal.
- `Funcionario`: Subclasse de `Pessoa` que representa um funcionário da creche.
- `Animal`: Classe abstrata que representa um animal, com métodos abstratos para serviços como dar banho e hospedar.
- `Cachorro` e `Gato`: Subclasses de `Animal` que implementam os métodos específicos para cães e gatos.
- `Servico`: Classe abstrata para serviços oferecidos pela creche.
- `ServicoBanho`, `ServicoHospedagem` e `ServicoPasseio`: Subclasses de `Servico` que implementam serviços específicos.

### Interfaces
- `BanhoPet`: Interface para serviços de banho.
- `Hospedagem`: Interface para serviços de hospedagem.
- `PasseioPet`: Interface para serviços de passeio.
- `Adestramento`: Interface para serviços de adestramento.


## Como Usar
Após executar o projeto, você verá um menu com as seguintes opções:
- Adicionar, listar, atualizar e remover tutores.
- Adicionar, listar, atualizar e remover animais.
- Adicionar, listar, atualizar e remover funcionários.
- Listar serviços oferecidos pela creche.
- Agendar serviços para os animais.
- Visualizar valores totais dos serviços selecionados.

