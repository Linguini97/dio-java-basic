# Aula

## Operadores Lógicos 

### O que são

São simbolos especiais capazes de realizar comparações lógicas entre operadores lógicos ou expressões e retornar com um resultado.<br>
Obs. Não é possível realizar operações lógicas em cima de números, a não ser que eles estejam em expressões.  <br>
Se dividem em quatro tipos:<br>
    1. **Conjunção**: É o E, que somente terá retorno verdadeiro quando os ambos os termos envolvidos forem verdade, simbolizado por "&&";<br>
    2. **Disjunção**: Operação que somente retorna como falsa quando ambos os termos são falsos, é o OU, simbolizado por "||";<br>
    3. **Disjunção exclusiva**: Operação que somente retorna como verdadeira quando os valores são opostos, simbolizado por "^";<br>
    4. **Negação**: Operação que inverte o valor lógico de um operando ou expressão, simbolizado por "!". 

### Utilização

São muito utilizados em estruturas de controle de fluxo.<br>
É recomendado ainda criar variáveis auxiliadoras para guardar resultados intermediários de expressões, diminuindo assim o tamanho das linhas de código, isso facilita muito a legibilidade do código. 

## Controle de Fluxo

São estruturas que tem a capacidade de direcionar o fluxo de execução de código. Se eles não fossem usados o código seria executado sempre de cima para baixo e da esquerda para direita. Elas podem ser de três tipos, sendo:<br>
1. **Decisão**: if, switch e operador ternário;<br>
2. **Repetição**: for, while, do while;<br>
3. **Interrupção**:break, continue e return.<br>

### Estrutura de Decisão

Ela avalia uma condição booleana ou variável para direcionar o fluxo de execução, utilizando estruturas lógicas e relacionais.<br>
Quando utilizar a opção de ternário e não ter um valor para quando for false é possível colocar o valor null, isso indica para o código não fazer nada quando o if não for verdadeiro. E dependendo do tamanho da condição e dos valores pode ficar muita extensa a linha, por isso é recomendado evitar o seu uso. <br>
O Switch deve ser utilizado para valores exatos, já o if para expressões booleanas. Deve-se evitar utilizar o default do switch para casos genéricos, ele deve ser utilizado apenas para valores inválidos.

## Exercício 1: Nome do mês

Utiliza if para exibir o nome do mês do ano de acordo com seu número. Faça outro if que verifique se o mês é julho, dezembro ou janeiro para exibir o texto "Férias". 

## Exercício 2: Dia da semana

Utilizando Switch use string para a partir do dia da semana, seja exibido um número. 

## Exercício 3: Alternativas 

Utilizando Switch, faça a seguinte validação se uma variável tiver valor entre 1 e 3 exiba o texto "Certo", se for 4 "Errado" e se for 5 "Talvez".