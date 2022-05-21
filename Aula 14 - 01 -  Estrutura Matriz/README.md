## _Estrtura de Matrizes_ 

### _Declaração de Matrizes_

> As matrizes são vetores que agrupam vetores.
>
> Exemplo:
>
> Armazenar 3 notas para cada um dos 23 alunos.
>
> Apenas com vetores seria necessário criar 23 vetores de tamanho 3 para armazenar as notas.
>
>> float notas1[]= new float[3]; 
>>
>> float notas2[]= new float[3];
>> float notas3[]= new float[3];
>>
>> Few moment later...
>>
>> float notas11[]= new float[3];
>>
>> float notas22[]= new float[3];
>> float notas23[]= new float[3];
>
> Esse é o mesmo problema de criar uma variavel para cada situação repetida no código
>
> Para resolver isso podemos criar um vetor de vetores ou MATRIZ
>
>> float todasAsNotas[][]= new float[23][3];

#### Como escrever o código:

```
		System.out.println("Learn Simple Matriz");
		System.out.println("Armazenar as 3 notas de todos os 10 alunos");

		float nota[][]; // Olhe no Debug []vetores linhas []index colunas

		nota = new float[10][3];
```
