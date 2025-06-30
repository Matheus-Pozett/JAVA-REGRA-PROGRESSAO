package com.trybe.java.regraprogressao;

import java.util.Scanner;

/**
 * The type Cadastro atividades.
 */
public class CadastroAtividades {
  int somaDosPesos;

  /**
   * Cadastro.
   *
   * @param scanner       the scanner
   * @param qntAtividades the qnt atividades
   */
  void cadastro(Scanner scanner, int qntAtividades) {
    for (int i = 1; i <= qntAtividades; i += 1) {
      System.out.println("Digite o nome da atividade " + i + ":");
      String nome = scanner.nextLine();

      System.out.println("Digite o peso da atividade " + i + ":");
      String peso = scanner.nextLine();
      somaDosPesos += Integer.parseInt(peso);

      System.out.println("Digite a nota obtida para " + nome + ":");
      String nota = scanner.nextLine();
    }
    verificaSomaDosPesos(somaDosPesos);
  }

  void verificaSomaDosPesos(int pesos) {
    if (pesos == 100) {
      System.out.println("Passou");
    } else {
      System.out.println("A soma dos pesos é diferente de 100!");
    }
  }
}
