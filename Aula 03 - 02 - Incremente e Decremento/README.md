## _Incremente e Decremento_

- (++) usado para somar 1 ao n�mero.

- (+=2) usado para somar 2 ao n�mero.

- (*=2) usado para multiplicar por 2 o n�mero.

- (/=2) usado para dividir por 2 o n�mero.

- (--) usado para diminuir 1 do n�mero.

- (-=2) usado para diminuir 2 do n�mero.

### _Instru��es_

>Quando declaramos esse operador antes da vari�vel, o incremento � realizado antes do valor da vari�vel ser lido.
>
>Quando declarado depois, ocorre o contr�rio: l�-se o valor da vari�vel para processamento e s� ent�o o valor da vari�vel � incrementado.


#### _Como escrever o c�digo:_

```
int numeroA=10

System.out.println("Realizando Opera��es " + (numeroA ++ ) );
System.out.println("Realizando Opera��es " + (numeroA +=2) );
System.out.println("Realizando Opera��es " + (numeroA *=2) );
System.out.println("Realizando Opera��es " + (numeroA /=2) );
System.out.println("Realizando Opera��es " + (numeroA -- ) );
System.out.println("Realizando Opera��es " + (numeroA -=2) );

System.out.println("Realizando Opera��es " + (++ numeroA ) );
```
[VEJA FUNCIONANDO](https://replit.com/@ArthurEstevan/Incremente-e-Decremento#Main.java).
