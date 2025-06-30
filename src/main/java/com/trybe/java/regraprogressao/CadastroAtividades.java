package com.trybe.java.regraprogressao;

import java.util.Scanner;

public class CadastroAtividades {

  void cadastro(Scanner scanner, int qntAtividades) {
    for (int i = 1; i <= qntAtividades; i += 1) {
      System.out.println("Digite o nome da atividade " + i + ":");
      String nome = scanner.nextLine();
      System.out.println("Digite o peso da atividade " + i + ":");
      String peso = scanner.nextLine();
      System.out.println("Digite a nota obtida para " + nome + ":");
      String nota = scanner.nextLine();
    }
  }

}
