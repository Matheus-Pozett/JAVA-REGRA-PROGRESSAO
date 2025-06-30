package com.trybe.java.regraprogressao;

import java.util.Scanner;

public class CadastroEstudante {
  Scanner scanner = new Scanner(System.in);

  void cadastro(int qntAtividades) {
    for (int i = 1; i <= qntAtividades; i += 1) {
      System.out.println("Digite o nome da atividade " + i + ":");
      String nomeAtividade = scanner.nextLine();
      System.out.println("Digite o peso da atividade " + i + ":");
      String pesoAtividade = scanner.nextLine();
    }
    scanner.close();
  }

}
