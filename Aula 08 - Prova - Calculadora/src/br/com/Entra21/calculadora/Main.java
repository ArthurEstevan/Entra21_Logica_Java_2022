package br.com.Entra21.calculadora;

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    System.out.println();
    System.out.println("Hello!");
    System.out.println();

    // Crie um programa que fa�a v�rios c�lculos
    // Informe qual opera��o matem�tica deseja realizar
    // caso informe 0 deve encerrar o programa
    // 1 = somar
    // 2 = subtrair
    // 3 = multiplicar
    // 4 = dividir
    // Capturar os 2 valores e informar o resultado e esperar o pr�ximo calculo

    startSystem();
  }

  public static void startSystem() {

    Scanner inPut = new Scanner(System.in); //captura do teclado
    String operacoes;                       //v�riavel para captura da opera��o
    float numeroA, numeroB;                 //v�riavel para captura dos n�meros

    System.out.println("Which operation do you want to perform?");    //perguta de qual c�lculo quer fazer
    System.out.println("================================");
    System.out.println("| 01 - Soma                    |");
    System.out.println("| 02 - Subtra��o               |");
    System.out.println("| 03 - Multiplica��o           |");
    System.out.println("| 04 - Divis�o                 |");
    System.out.println("| 0 -  Encerrar                |");
    System.out.println("================================");
    operacoes = inPut.next();                                       //captura da respota do usu�rio
    System.out.println("n�mero: ");                                 //pergutando o primeiro n�mero
    numeroA = inPut.nextFloat();                                    //captura da respota do usu�rio
    System.out.println("n�mero: ");                                 //pergutando o segundo n�mero
    numeroB = inPut.nextFloat();                                    //captura da respota do usu�rio
                                                                    //toLowerCase() transforma a resposta do usu�rio em min�scula
    switch (operacoes.toLowerCase()) {                              //cria��o do switch para resolu��o do c�lculo

      case "1", "soma":
        //faz opera��o de soma
        soma(numeroA, numeroB);                                     //fun��o do tipo par�metro que executa o conjunto de linhas no escopo
      case "2", "subtra��o":
        //faz opera��o de subtra��o
        subtracao(numeroA, numeroB);                                //fun��o do tipo par�metro que executa o conjunto de linhas no escopo
        break;
      case "3", "multiplica��o":
        //faz opera��o de multiplica��o
        multiplicao(numeroA, numeroB);                              //fun��o do tipo par�metro que executa o conjunto de linhas no escopo
        break;
      case "4", "divis�o":
        //faz opera��o de divis�o
        divisao(numeroA, numeroB);                                  //fun��o do tipo par�metro que executa o conjunto de linhas no escopo
        break;
      case "0", "encerrar":
        //ecerra o programa
        System.exit(1);                                             //faz o encerramento do programa
        break;
    }
  }

  //------------------FAZENDO A SOMA DAS V�RIVAEIS--------------------//
  public static void soma(float numeroA, float numeroB) { 

    float resultado = numeroA + numeroB;                           //soma das variaveis passada atr�ves da fun��o par�metro

    System.out.println(numeroA + " + " + numeroB + " = " + resultado); //mostrando o resultado

    operacao();
  }


  //------------------FAZENDO A SUBTRA��O DAS V�RIVAEIS--------------------//
  public static void subtracao(float numeroA, float numeroB) {    //subtra��o das variaveis passada atr�ves da fun��o par�metro

    float resultado = numeroA - numeroB;

    System.out.println(numeroA + " - " + numeroB + " = " + resultado);  //mostrando o resultado

    operacao();
  }
  

  //------------------FAZENDO A MULTIPLICA��O DAS V�RIVAEIS--------------------//
  public static void multiplicao(float numeroA, float numeroB) {    

    float resultado = numeroA * numeroB;                           //subtra��o das variaveis passada atr�ves da fun��o par�metro          

    System.out.println(numeroA + " x " + numeroB + " = " + resultado); //mostrando o resultado

    operacao();
  }


  //------------------FAZENDO A DIVIS�O DAS V�RIVAEIS--------------------//
  public static void divisao(float numeroA, float numeroB) {

    float resultado = numeroA / numeroB;                           //soma das variaveis passada atr�ves da fun��o par�metro

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
