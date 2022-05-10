package br.com.Entra21.calculadora;

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    System.out.println();
    System.out.println("Hello!");
    System.out.println();

    // Crie um programa que faça vários cálculos
    // Informe qual operação matemática deseja realizar
    // caso informe 0 deve encerrar o programa
    // 1 = somar
    // 2 = subtrair
    // 3 = multiplicar
    // 4 = dividir
    // Capturar os 2 valores e informar o resultado e esperar o próximo calculo

    startSystem();
  }

  public static void startSystem() {

    Scanner inPut = new Scanner(System.in); //captura do teclado
    String operacoes;                       //váriavel para captura da operação
    float numeroA, numeroB;                 //váriavel para captura dos números

    System.out.println("Which operation do you want to perform?");    //perguta de qual cálculo quer fazer
    System.out.println("================================");
    System.out.println("| 01 - Soma                    |");
    System.out.println("| 02 - Subtração               |");
    System.out.println("| 03 - Multiplicação           |");
    System.out.println("| 04 - Divisão                 |");
    System.out.println("| 0 -  Encerrar                |");
    System.out.println("================================");
    operacoes = inPut.next();                                       //captura da respota do usuário
    System.out.println("número: ");                                 //pergutando o primeiro número
    numeroA = inPut.nextFloat();                                    //captura da respota do usuário
    System.out.println("número: ");                                 //pergutando o segundo número
    numeroB = inPut.nextFloat();                                    //captura da respota do usuário
                                                                    //toLowerCase() transforma a resposta do usuário em minúscula
    switch (operacoes.toLowerCase()) {                              //criação do switch para resolução do cálculo

      case "1", "soma":
        //faz operação de soma
        soma(numeroA, numeroB);                                     //função do tipo parâmetro que executa o conjunto de linhas no escopo
      case "2", "subtração":
        //faz operação de subtração
        subtracao(numeroA, numeroB);                                //função do tipo parâmetro que executa o conjunto de linhas no escopo
        break;
      case "3", "multiplicação":
        //faz operação de multiplicação
        multiplicao(numeroA, numeroB);                              //função do tipo parâmetro que executa o conjunto de linhas no escopo
        break;
      case "4", "divisão":
        //faz operação de divisão
        divisao(numeroA, numeroB);                                  //função do tipo parâmetro que executa o conjunto de linhas no escopo
        break;
      case "0", "encerrar":
        //ecerra o programa
        System.exit(1);                                             //faz o encerramento do programa
        break;
    }
  }

  //------------------FAZENDO A SOMA DAS VÁRIVAEIS--------------------//
  public static void soma(float numeroA, float numeroB) { 

    float resultado = numeroA + numeroB;                           //soma das variaveis passada atráves da função parâmetro

    System.out.println(numeroA + " + " + numeroB + " = " + resultado); //mostrando o resultado

    operacao();
  }


  //------------------FAZENDO A SUBTRAÇÃO DAS VÁRIVAEIS--------------------//
  public static void subtracao(float numeroA, float numeroB) {    //subtração das variaveis passada atráves da função parâmetro

    float resultado = numeroA - numeroB;

    System.out.println(numeroA + " - " + numeroB + " = " + resultado);  //mostrando o resultado

    operacao();
  }
  

  //------------------FAZENDO A MULTIPLICAÇÃO DAS VÁRIVAEIS--------------------//
  public static void multiplicao(float numeroA, float numeroB) {    

    float resultado = numeroA * numeroB;                           //subtração das variaveis passada atráves da função parâmetro          

    System.out.println(numeroA + " x " + numeroB + " = " + resultado); //mostrando o resultado

    operacao();
  }


  //------------------FAZENDO A DIVISÃO DAS VÁRIVAEIS--------------------//
  public static void divisao(float numeroA, float numeroB) {

    float resultado = numeroA / numeroB;                           //soma das variaveis passada atráves da função parâmetro

    System.out.println(numeroA + " / " + numeroB + " = " + resultado); //mostrando o resultado

    operacao();
  }


  //------------------FAZENDO RECURSIVIDADE PARA IMPLMENTAR LOOP--------------------//
  public static void operacao() {

    Scanner inPut = new Scanner(System.in);
    byte operacao;
    
    System.out.println();
    System.out.println("do you want to try again?");
    System.out.println("================================");
    System.out.println("| 01 - Yes                     |");
    System.out.println("| 02 - No                      |");
    System.out.println("================================");
    operacao = inPut.nextByte();

    if (operacao == 1) {
      startSystem();
    } else if (operacao == 2) {
      System.exit(1);
    } else {
      System.out.println("Answer incorret, try again");
      operacao();
    }
  }

}
