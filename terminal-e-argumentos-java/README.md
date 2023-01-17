# Aula 

## Execução via Prompt
Demonstração de como executar um programa Java no terminal através do arquivo chamado minhaClasse.java . <br>
Após criar a classe, observe a pasta chamada **bin**. Nessa pasta ficarão os arquivos **.class**, o nosso bytecode/nossos programas disponíveis para execução.<br>
Após isso, é necessário identificar o caminho onde o arquivo se encontra, após isso vá para a pasta onde se encontra o bin, em seguida o comando *java nomeDoArquivo*. Isso fará o comando ser executado pelo terminal. <br>
*Obs: Não esqueça de executar ou salvar primeiro na IDE para compilar e gerar o arquivo .bin*<br>

## Argumentos 

Quando executamos uma classe que contém o método **main** é permitido passar entre colchetes uma array de argumentos do tipo string, para que seja possível passar parâmetros de execução do nosso projeto. Esses argumentos começam com o índice 0. No terminal você coloca cada parâmetro referente a sua posição separado por espaço. <br>

## Scanner

Ele visa deixar as entradas de dados mais seguras e com menos margem de erro. A classe **scanner** garante uma melhor interação no que se refere aos inputs de usuários em nossos programas.<br>
Para isso é necessário realizar a importação através dos comandos:<br>
    - *import java.util.Locale;*<br>
    - *import java.util.Scanner;*<br>
O exemplo de utilização está no arquivo minhaClasseScanner.java . 