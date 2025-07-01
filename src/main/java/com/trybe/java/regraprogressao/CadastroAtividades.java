package com.trybe.java.regraprogressao;

import java.util.Scanner;

/**
 * The type Cadastro atividades.
 */
public class CadastroAtividades {
  int somaDosPesos;
  int somaDasNotas;

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

      int calculoNota = Integer.parseInt(peso) * Integer.parseInt(nota);
      somaDasNotas += calculoNota;
    }
    verificaSomaDosPesos(somaDosPesos);
  }

  void verificaSomaDosPesos(int pesos) {
    if (pesos == 100) {
      double media = (double) somaDasNotas / somaDosPesos;

      if (media >= 85) {
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
}
