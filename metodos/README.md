# Aula 

## Métodos 

É uma sub-rotina que é disponibilizada por uma classe. Sendo executado quando for feita uma requisição a ele, e definem e realizam um determinado comportamento.<br>
Logo, todo método deve ser criado dentro de uma classe e funciona através de chamadas fazendo com que os softwares funcionem.
### Criação 

O padrão de definição para a criação de um método é o seguinte:<br>

*visibilidade tipo modificador retorno nome parâmetros exceções corpo*<br>
Sendo opcional a visibilidade, tipo , modificador, parâmetros e exceções são opcionais.<br>
Para chamar um método coloca-se o nome da classe ponto o nome do método e parênteses com os parâmetros dentro que são opcionais. 

#### Particularidades

**Particularidades:** É a forma de identificar unicamente o método, sendo o nome mais ou parâmetros;<br>
**Constutor e Destutor:** São métodos especiais usados na programação orientada a objeto;<br> 
**Mensagem:** É o ato de solicitar a execução dos métodos, sendo direcionado a um objeto ou uma classe;<br>
**Passagem de Parêmetros:** Podendo ter ou não, quando não é vazio ela pode ocorrer por valor ou cópia ou por referência ou por endereço;

#### Boas Práticas
**Nomes:** Eles devem ser descritivos e curtos sempre verbo e ou substântivo, e para nomenclatura deve ser utilizado sempre camelCase;<br>
**Tamanho:**Eles devem possuir entre 80 e 120 linhas, para facilitar a manutenção e leitura do código. Para reduzir o número de linhas aconselha a utilizar métodos auxiliares.<br>
**Lista de Parâmetros:**Deve ser o mais curtos possíveis apesar de não existir uma quantidade padronizada.  

#### Exercício 1
Crie uma aplicação que resolva as seguintes situações:<br>
    - Calcule as 4 operações básicas sempre através de dois valores passados;<br>
    - A partir da hora do dia, informe a saudação adequada: Bom dia, boa tarde e boa noite;<br>
    - Calcule o valor final de um empréstimo, a partir do valor solicitado, onde taxas e parcelas influenciam.

### Sobrecarga
É a capacidade de definir métodos para diferentes contextos, porém preservando seu nome. Para que isso ocorra mantemos o nome e alteramos a lista de parâmetros, ou seja, alteramos a assinatura de um método. Se alterar a sequência dos parâmetros já é uma sobrecarga. <br>

#### Exercício 2 
Crie utilizando sobrecarga uma aplicação que calcula a área dos 3 quadriláteros notáveis: Quadrado, retângulo e trapézio.

### Retornos 
É uma estrutura de interrupção só que atrelado a um método, para utilizar usa-se a palavra *return*. <br>
O método pode executar um retorno quando completa todas suas instruções internas. chega a uma declaração explicita de retorno ou quando lança uma exceção. <br>
O tipo de dado do return deve ser compatível com o do método, e se o método for *void* o retorno passa a ser opcional. 