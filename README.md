# Processo Seletivo - SC Cloud

Este repositório contém a implementação de dois desafios desenvolvidos para o processo seletivo de estágio na SC Cloud.

## Estrutura do Projeto

O projeto está organizado em pacotes Java, cada um contendo soluções para problemas específicos:

### 1. **Números Primos**
- **Localização:** `alexandre/src/main/java/com/numeroPrimo`
- **Arquivos:**
  - `Main.java`: Classe principal para execução do programa.
  - `NumerosPrimos.java`: Contém os métodos para verificar e listar números primos.
- **Descrição:**
  - Implementação de métodos **recursivos** e **lineares** para encontrar números primos até um número informado pelo usuário.
  - **Validações:**
    - O número deve ser maior que 1.
  - **Exemplo de saída:**
    ```
    Digite um número para verificar se ele é primo:
    10
    Números primos até 10: [2, 3, 5, 7]
    ```

### 2. **Fibonacci**
- **Localização:** `alexandre/src/main/java/com/fibonacci`
- **Arquivos:**
  - `Main.java`: Classe principal para execução do programa.
  - `Fibonacci.java`: Contém os métodos para calcular a sequência de Fibonacci.
- **Descrição:**
  - Implementação de métodos **recursivos** e **lineares** para calcular o Fibonacci de um número informado pelo usuário.
  - **Validações:**
    - O número deve ser maior ou igual a zero.
  - **Exemplo de saída:**
    ```
    Digite um número para ver seu Fibonacci usando método recursivo:
    5
    O Fibonacci de 5 é: 5
    ```

## Como Executar

### Pré-requisitos
- **Java Development Kit (JDK)** versão 17 ou superior.
- Um ambiente de execução para projetos Java, como **IntelliJ IDEA**, **Eclipse**, ou o terminal com o comando `java`.

### Passos
1. Clone o repositório:
   ```bash
   git clone https://github.com/AlexandreLiberatto/Estagio.git
````

````
2. Navegue até o diretório do projeto:
   ```bash
   cd Estagio/alexandre
   ```
3. Compile o projeto:
   ```bash
   mvn clean compile
   ```
4. Execute o programa de sua escolha:
   - Para **Números Primos**:
     ```bash
     java -cp target/classes com.numeroPrimo.Main
     ```
   - Para **Fibonacci**:
     ```bash
     java -cp target/classes com.fibonacci.Main
     ```

## Estrutura do Diretório

```
Estagio/
├── alexandre/
│   ├── pom.xml                 # Configuração do Maven
│   ├── target/                 # Saída dos binários compilados
│   └── src/
│       ├── main/
│       │   ├── resources/      # Recursos adicionais (vazio)
│       │   └── java/
│       │       ├── com/
│       │       │   ├── numeroPrimo/
│       │       │   │   ├── Main.java
│       │       │   │   └── NumerosPrimos.java
│       │       │   └── fibonacci/
│       │       │       ├── Main.java
│       │       │       └── Fibonacci.java
│       └── test/               # Testes (vazio)
```

## Tecnologias Utilizadas
- **Java 17**
- **Maven** para gerenciamento de dependências e compilação do projeto.

## Autor
- **Alexandre Liberato**
- [GitHub](https://github.com/AlexandreLiberatto)

## Observação
Este projeto foi desenvolvido como parte de um desafio técnico para o processo seletivo da SC Cloud.

---

**Nota**: Caso encontre algum problema ou dúvida, entre em contato através de issues no repositório.
```
