## _Estrutura de Repetição While / Do While_ 

### _Declaração While / Do While_

#### Sintaxe While:
>
>> Scanner entrada = new Scanner(System.in);
>>
>>String resposta= "sim";
>>
>>while (resposta.equal( "sim" ) ) {
>>
>>System.out.println("Gostaria de repetir mais uma vez? (sim ou não)")
>>
>>resposta=entrada.next();
>>
>>}
>
> Para entrar no while é necessário atender a condição de permanência, que será testada novamente ao termino de cada loop


#### Sintaxe Do While;
>
>> Scanner entrada = new Scanner(System.in);
>>
>>String resposta= "sim";
>>
>>do{
>>
>>System.out.println(" Já entramos no laço, mas você gostaria de repetir mais uma vez? (sim ou não)")
>>
>>  resposta=entrada.next();
>>
>>} while (resposta.equal( "sim" ) );
>
> Para entrar na repetição nada foi solicitado, ou seja . é permitido executar o bloco de comando e somente no final testar a condição de permanência, que será testada novamente ao termino de cada loop

#### Como escrever o código:

```

//-----------------While--------------//
        
		System.out.println();
		Scanner inPut = new Scanner(System.in);

		System.out.println("What do you do?");
		String resposta = inPut.next().toUpperCase();

		System.out.println();
		while (resposta.equalsIgnoreCase("continuar") || resposta.equals("SIM")) {
		
			System.out.println("Your answer is this here " + resposta);
			System.out.println("Do you want to repeat answer?");
			resposta = inPut.next().toUpperCase();
			
		}
		
//-----------------Do while--------------//
		
		Scanner inPut = new Scanner(System.in);
		String reposta;

		do { 
		
			System.out.println("Quer repetir?");
			reposta = inPut.next();
			
		} while (reposta.equalsIgnoreCase ( "repetir" ) ); 
```
