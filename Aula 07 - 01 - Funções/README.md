## _Estrutura Funções_ 

### _Tipos de Funções_

- Funções de procedimento
- Funções com parâmetros
- Funções com retornos
- Funções com parâmetros e retornos 

#### _Declaração de uma Função_

>visibilidade = (private, public ou protected);
>
>static = quando for static contexto de uma classe, caso não informe será contexto de objeto;
>
>retorno = void quando não houver retorno, quando houver deve informar o tipo da variável;
>
>nome = verboComplemento
>
>(parametros) =  quando houver serão informados pelo tipo e nome, separados por virgula quando houver mais de um;

### _Nota_
> As funções de procedimento tem o propósito apenas de otimizar a escrita do código permitindo que linhas repetidas possam ser centralizadas em um escopo externo para serem reutilizadas por um comando mais curto.

#### Como escrever o código:

```
public static void pausaInterativa(){

syso("ENTER para continuar");

Scanner.nextLine()

}

// Chamando a função no método main o conjunto de códigos será executado

pausaInterativa(); 

```
