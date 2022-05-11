package br.com.entra21.mesdoaniversario;

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    
    //---------PROGRAMA QUE INFORMA MêS DO ANIVERSÁRIO---------//
    
    //Solicite ao usuário ome e o mês do aniversário.
    //Capture o mês em número.
    //Exibir mensagem com nome e mês no formato normal. (Ex: 4  Abril, 12 Dezembro)
    //Caso não seja escolhido um mês válido deve exibir uma mensagem
    
    startSystem();

  }
    //---------START PROGRAM---------//
  public static void startSystem() {
    
    String nome = nameUser(); //String que atribui o valor de retorno de uma função
    mesAniversario(nome); //uso de uma função de parâmetro passando um valor em String
  } //função do tipo procedimento que apenas executo as linhas em seu escopo

  
    //---------CAPTURE MONTH BIRTHDAY---------//
  public static void mesAniversario(String nome){ 

    byte mes;                                      //váriavel para informar o mês
    Scanner inPut = new Scanner(System.in);        //captura de informação no console
    
    System.out.println("\t" +nome+ "   enter your birthday month"); //pergunta para o usuário
    System.out.println("================================================================"); //informando os meses
    System.out.println("| 01 - January   | 04 - April | 07 - July      | 10 - October  |");
    System.out.println("| 02 - February  | 05 - May   | 08 - August    | 11 - November |");
    System.out.println("| 03 - March     | 06 - June  | 09 - September | 12 - December |");
    System.out.println("================================================================");
    
    mes = inPut.nextByte(); //captura da resposta do usuário
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
    } //switch informando o mês de aniversário do usuário
  } //função do tipo parâmetro com valores dinâmico

  
    //---------CAPTURE NAME USER---------//
  public static String nameUser(){    
    
    Scanner inPut = new Scanner(System.in);             //capturar informação do usuário
    String firstNameUser, lastNameUser;                 //String para nome do usuário

    System.out.println();
    System.out.println("What is your first name?");    //pergunta de informações
    firstNameUser = inPut.nextLine();                  //captura de informção do usuário
    
    System.out.println("What is your last name?");    //pergunta de informações
    lastNameUser = inPut.nextLine();                  //captura de informção do usuário
    System.out.println();

    String firstLatterName = firstNameUser.substring(0,1).toUpperCase();          //transforma primeira letra do nome em maiúscula
    firstLatterName = firstLatterName+firstNameUser.substring(1).toLowerCase();   //com a primeira letra em maiúscula adiciona o resto do nome em minúsculo

    String lastLatterName = lastNameUser.substring(0,1).toUpperCase();            //transforma primeira letra do nome em maiúscula
    lastLatterName = lastLatterName+lastNameUser.substring(0).toLowerCase();      //com a primeira letra em maiúscula adiciona o resto do nome em minúsculo

    String fullNameUser = firstLatterName+ " " +lastLatterName;                  //faz a concatenação das Strings
    
    return fullNameUser;                                                         //retorna a concatenação das strings
  } //função com retorno que retorna uma String
}