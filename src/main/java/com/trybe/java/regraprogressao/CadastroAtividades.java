package com.trybe.java.regraprogressao;

import java.util.Scanner;

/**
 * The type Cadastro atividades.
 */
public class CadastroAtividades {
  private int somaDosPesos;
  private int somaDasNotas;
  private static final int SOMA_VALIDA_PESOS = 100;
  private static final double NOTA_MINIMA_APROVACAO = 85.0;
  private final Scanner scanner;

  /**
   * Instantiates a new Cadastro atividades.
   *
   * @param scanner the scanner
   */
  public CadastroAtividades(Scanner scanner) {
    this.scanner = scanner;
  }

  /**
   * Cadastro.
   */
  public void cadastro() {
    System.out.println("Digite a quantidade de atividades para cadastrar:");
    String qntAtividades = scanner.nextLine();

    for (int i = 1; i <= Integer.parseInt(qntAtividades); i += 1) {
      System.out.println("Digite o nome da atividade " + i + ":");
      String nome = scanner.nextLine();

      int peso = solicitarNumero("Digite o peso da atividade " + i + ":");
      somaDosPesos += peso;

      int nota = solicitarNumero("Digite a nota obtida para " + nome + ":");

      int calculoNota = peso * nota;
      somaDasNotas += calculoNota;
    }
    verificaSomaDosPesos(somaDosPesos);
  }

  private void verificaSomaDosPesos(int pesos) {
    if (pesos == SOMA_VALIDA_PESOS) {
      double media = (double) somaDasNotas / somaDosPesos;

      if (media >= NOTA_MINIMA_APROVACAO) {
        System.out.println("Parabéns! Você alcançou " + media + "%! "
                + "E temos o prazer de informar que você obteve aprovação!");
      } else {
        System.out.println(
                "Lamentamos informar que, com base na sua pontuação alcançada neste período, "
                        + media + "%, você não atingiu a pontuação mínima "
                        + "necessária para sua aprovação.");
      }
    } else {
      System.out.println("A soma dos pesos é diferente de 100!");
    }
  }

  private int solicitarNumero(String mensagem) {
    while (true) {
      System.out.println(mensagem);
      try {
        String input = scanner.nextLine();
        return Integer.parseInt(input);
      } catch (NumberFormatException e) {
        System.out.println("Entrada inválida. Por favor, digite um número inteiro.");
      }
    }
  }
}
