package com.trybe.java.regraprogressao;

import java.util.Scanner;

/**
 * App.
 */
public class App {
  /**
   * Metodo main.
   */
  public static void main(String[] args) {
    CadastroEstudante cadastroEstudante = new CadastroEstudante();
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite a quantidade de atividades para cadastrar:");
    String qntAtividades = scanner.nextLine();

    cadastroEstudante.cadastro(Integer.parseInt(qntAtividades));
    scanner.close();
  }
}