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
    Scanner scanner = new Scanner(System.in);
    CadastroAtividades cadastroAtividades = new CadastroAtividades(scanner);
    cadastroAtividades.cadastro();
    scanner.close();
  }
}