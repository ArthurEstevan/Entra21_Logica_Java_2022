## _Incremente e Decremento_

- (++) usado para somar 1 ao número.

- (+=2) usado para somar 2 ao número.

- (*=2) usado para multiplicar por 2 o número.

- (/=2) usado para dividir por 2 o número.

- (--) usado para diminuir 1 do número.

- (-=2) usado para diminuir 2 do número.

### _Instruções_

>Quando declaramos esse operador antes da variável, o incremento é realizado antes do valor da variável ser lido.
>
>Quando declarado depois, ocorre o contrário: lê-se o valor da variável para processamento e só então o valor da variável é incrementado.


#### _Como escrever o código:_

```
int numeroA=10

System.out.println("Realizando Operações " + (numeroA  ++) );
System.out.println("Realizando Operações " + (numeroA +=2) );
System.out.println("Realizando Operações " + (numeroA *=2) );
System.out.println("Realizando Operações " + (numeroA /=2) );
System.out.println("Realizando Operações " + (numeroA  --) );
System.out.println("Realizando Operações " + (numeroA -=2) );

System.out.println("Realizando Operações " + (++ numeroA ) );
```
[VEJA FUNCIONANDO](https://replit.com/@ArthurEstevan/Incremente-e-Decremento#Main.java).
