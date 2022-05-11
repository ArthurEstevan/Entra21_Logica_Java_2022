package br.com.entra21.mesdoaniversario;

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    
    //---------PROGRAMA QUE INFORMA M�S DO ANIVERS�RIO---------//
    
    //Solicite ao usu�rio ome e o m�s do anivers�rio.
    //Capture o m�s em n�mero.
    //Exibir mensagem com nome e m�s no formato normal. (Ex: 4  Abril, 12 Dezembro)
    //Caso n�o seja escolhido um m�s v�lido deve exibir uma mensagem
    
    startSystem();

  }
    //---------START PROGRAM---------//
  public static void startSystem() {
    
    String nome = nameUser(); //String que atribui o valor de retorno de uma fun��o
    mesAniversario(nome); //uso de uma fun��o de par�metro passando um valor em String
  } //fun��o do tipo procedimento que apenas executo as linhas em seu escopo

  
    //---------CAPTURE MONTH BIRTHDAY---------//
  public static void mesAniversario(String nome){ 

    byte mes;                                      //v�riavel para informar o m�s
    Scanner inPut = new Scanner(System.in);        //captura de informa��o no console
    
    System.out.println("\t" +nome+ "   enter your birthday month"); //pergunta para o usu�rio
    System.out.println("================================================================"); //informando os meses
    System.out.println("| 01 - January   | 04 - April | 07 - July      | 10 - October  |");
    System.out.println("| 02 - February  | 05 - May   | 08 - August    | 11 - November |");
    System.out.println("| 03 - March     | 06 - June  | 09 - September | 12 - December |");
    System.out.println("================================================================");
    
    mes = inPut.nextByte(); //captura da resposta do usu�rio
    System.out.println();

    switch (mes) {

      case 1:
      System.out.println(nome+ " your birthday is on January.");
        break;
      case 2:
      System.out.println(nome+ " your birthday is on February.");
        break;
      case 3:
      System.out.println(nome+ " your birthday is on March.");
        break;
      case 4:
      System.out.println(nome+ " your birthday is on April.");
        break;
      case 5:
      System.out.println(nome+ " your birthday is on May.");
        break;
      case 6:
      System.out.println(nome+ " your birthday is on June.");
        break;
      case 7:
      System.out.println(nome+ " your birthday is on July.");
        break;
      case 8:
      System.out.println(nome+ " your birthday is on August.");
        break;
      case 9:
      System.out.println(nome+ " your birthday is on September.");
        break;
      case 10:
      System.out.println(nome+ " your birthday is on October.");
        break;
      case 11:
      System.out.println(nome+ " your birthday is on November.");
        break;
      case 12:
      System.out.println(nome+ " your birthday is on December.");
        break;
    } //switch informando o m�s de anivers�rio do usu�rio
  } //fun��o do tipo par�metro com valores din�mico

  
    //---------CAPTURE NAME USER---------//
  public static String nameUser(){    
    
    Scanner inPut = new Scanner(System.in);             //capturar informa��o do usu�rio
    String firstNameUser, lastNameUser;                 //String para nome do usu�rio

    System.out.println();
    System.out.println("What is your first name?");    //pergunta de informa��es
    firstNameUser = inPut.nextLine();                  //captura de inform��o do usu�rio
    
    System.out.println("What is your last name?");    //pergunta de informa��es
    lastNameUser = inPut.nextLine();                  //captura de inform��o do usu�rio
    System.out.println();

    String firstLatterName = firstNameUser.substring(0,1).toUpperCase();          //transforma primeira letra do nome em mai�scula
    firstLatterName = firstLatterName+firstNameUser.substring(1).toLowerCase();   //com a primeira letra em mai�scula adiciona o resto do nome em min�sculo

    String lastLatterName = lastNameUser.substring(0,1).toUpperCase();            //transforma primeira letra do nome em mai�scula
    lastLatterName = lastLatterName+lastNameUser.substring(0).toLowerCase();      //com a primeira letra em mai�scula adiciona o resto do nome em min�sculo

    String fullNameUser = firstLatterName+ " " +lastLatterName;                  //faz a concatena��o das Strings
    
    return fullNameUser;                                                         //retorna a concatena��o das strings
  } //fun��o com retorno que retorna uma String
}