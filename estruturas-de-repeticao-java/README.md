# Aula 

## Estruturas de Repetição

Cada repetição é chamada de loop e permite que uma sequência de comandos seja executada repetidamente, caso determinadas condições sejam atendidas, ou seja, até que o retorno da condição seja false ela não para de executar o código. <br>
Elas podem ser classificadas em: <br>
    1. **Repetição com teste no início "while"**;<br>
    2. **Repetição com teste no final "do-while"**;<br>
    3. **Repetição contada "for"**.<br>
O comando *break* é utilizado para terminar de forma abrupta uma repetição. E quando o comando *continue* é executado, os comandos restantes da repetição são ignorados e o programa volta a testar novamente ou não.<br>
Uma diferença importante entre esses dois comandos é que o break pode ser executado fora da estrutura de repetição, enquanto o continue não. Outro fator a ser mencionado é que o continue é muito pouco utilizado. <br>

### While

Quando começa o programa e ele vai para a expressão, quando é verificado o resultado como true ele executa a sentença e volta para a expressão até que o resultado seja false. Quando ele tem o retorno como false ele não executa mais a sentença. <br>
O papel do break ocorre dentro da sentença, e quando dentro dela há um break não é feita novamente a validação da expressão ele já sai direto da sentença, interrompendo a tarefa. <br>

### Do-while

Nesse caso ocorre uma inversão, pois o programa executa primeiro a sentença para depois fazer a validação da expressão, aí caso ela seja verdadeira ele executa novamente a sentença caso não ele somente encerra a tarefa. Nesse tipo pelo menos uma vez a sentença será executada. <br>

### For

O for logo no começo já possuí um teste, se ele for satisfeito será executada a setença havendo uma atualização obrigatória e volta novamente para o teste. O que muda dele para o while é que essa atualização é obrigatória.

### Operadores de Incremento e Decremento

Sâo os sinais de "++" ou "--", podendo ser préfixado e pósfixado dependendo da localização que eles estão da variável. 

### Operações Aritméticas

São utilizadas para realizar operações de um valor k ao valor da variável, para utilizar fica o nome da variável o operador da operação desejada o simbolo de igual e o valor k desejado, conforme exemplo: *numero += k;*<br>

## Exercícios

### Exercício 1 : Nome e Idade

Faça um programa que leia conjuntos de dois valores, o primeiro representando o nome do aluno e o segundo representando a sua idade. Ele só deve parar quando for inserido o valor 0 no campo nome.

### Exercício 2 : [Nota](C:\Aulas-Java-Basic\dio-java-basic\estruturas-de-repeticao-java\src\Nota.java)

Faça um programa que peça uma nota, entre 0 a 10. Mostre uma mensagem caso o valor seja inválido e continue pedindo até que o usuário informe um valor válido.

### Exercício 3: Maior e Média

Faça um programa que leia 5 números e informe o meior e a média desses números. 

### Exercício 4: Par e Impar

Faça um programa que peça N números inteiros, calcule e mostre a quantidade de números pares e a quantidade de números impares. 

### Exercício 5: Tabuada

Desenvolva um gerador de tabuada, capaz de gerar qualquer número inteiro. O usuário deve informar de qual número ele deseja ver a tabuada. 

### Exercício 6: Fatorial

Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário