# Regra de Progressão

## Descrição

Este é um projeto simples em Java que calcula a nota final de um aluno com base nos pesos e notas de várias atividades. O objetivo é determinar se o aluno foi aprovado, com base em uma nota mínima de 85%.

## Funcionalidades

-   Cadastro de múltiplas atividades com nome, peso e nota.
-   Cálculo da média ponderada das notas.
-   Verificação se a soma dos pesos das atividades é igual a 100.
-   Exibição de uma mensagem de aprovação ou reprovação com base na nota final.

## Como Executar o Projeto

Para executar o projeto, siga os passos abaixo:

1.  **Clone o repositório:**
    ```bash
    git clone git@github.com:Matheus-Pozett/JAVA-REGRA-PROGRESSAO.git
    ```

2.  **Navegue até o diretório do projeto:**
    ```bash
    cd java-regra-progressao
    ```

3.  **Instale as dependências com o Maven:**
    Este comando irá baixar as dependências necessárias listadas no `pom.xml`.
    ```bash
    mvn install
    ```

4.  **Execute a aplicação:**
    Este comando inicia a aplicação a partir da classe principal `App.java`.
    ```bash
    mvn exec:java -Dexec.mainClass="com.trybe.java.regraprogressao.App"
    ```

Ao executar a aplicação, o console solicitará a quantidade de atividades a serem cadastradas e, em seguida, os detalhes de cada atividade (nome, peso e nota).

## Estrutura do Projeto

-   `src/main/java/com/trybe/java/regraprogressao/App.java`: Classe principal que inicia a aplicação.
-   `src/main/java/com/trybe/java/regraprogressao/CadastroAtividades.java`: Classe que contém a lógica para cadastrar as atividades e calcular o resultado final.
-   `pom.xml`: Arquivo de configuração do Maven com as dependências e configurações do projeto.

## Tecnologias Utilizadas

-   Java 17
-   Maven

## Autor

-   **Matheus Pozett** - [Linkedin](https://www.linkedin.com/in/matheus-pozett/)