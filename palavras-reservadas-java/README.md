# Aula 

## Palavras Reservadas 

São palavras identificadas pela linguagem que já possuem uma finalidade específica, Java possui 52 palavras reservadas. Todas essas palavras são classificadas em grupos e escritas com letras minúsculas.  <br>
Elas podem ser divididas em sub-categorias, sendo: 
1. **Controle de Pacotes**:
        - **import** : Importa pacotes ou classes para dentro do código; 
        - **package**: Especifica a que pacotes todas as classes de um arquivo pertencem; 
2. **Modificadores de acesso**:
        - **public**: Acesso de qualquer classe; 
        - **private**: Acesso apenas dentro da classe;
        -**protected**: Acesso por classes no mesmo pacote e subclases. 
3. **Primitivos**: 
        - **Tipod de variáveis**;
        - **void**: Indica que o método não tem retorno de valor. 
4. **Modificadores de classes, variáveis ou métodos**: 
        -**abstract**: Classe que não pode ser instanciada ou método que precisa ser implementado por uma subclasse não abstrata;
        -**class**: Especifica uma classe;
        -**extends**: Indica a superclasse que a subclasse está entendendo;
        -**final**: Impossibilita que a classe seja extendida, que um método seja sobrescrito ou que uma variável seja reinicializada;
        -**implements**:Indica as interfaces que uma classe irá implementar;
        -**interface**: Indica uma interface; 
        -**native**: Indica que um método está escrito em uma linguagem dependente de plataforma, como C;
        -**new**: Instancia um novo objeto; 
        -**static**: Faz um método ou variável pertencer à classe ao invés de às instâncias;
        -**synchronized**: Indica que um método só pode ser acessado por uma thread de cada vez;
        -**transient**: Impede a serialização de campos; 
        -**volatile**: Indica que uma variável pode ser alterada durante o uso de threads.
5. **Controle de fluxo dentro de um bloco de código**: 
        -**break**: Sai do bloco de código que ele está;
        -**case**: Executa um bloco de código dependendo do switch;
        -**continue**: Pula a exceção de um código que viria após essa linha e vai para a próxima passagem do loop; 

### Palavras Opostas
    
São palavras que não podem ser utilizadas em conjunto, como o próprio nome já diz elas são opostas entre /si, sendo:
1. **package --> import**: A primeira define o pacote da classe atual, enquanto import são as classes dependentes que precisam ser importadas; 
2. **extends --> implements**: Ambas utilizam a herança, a extends é utilizada para classes já a outra determina que uma classe implementa uma interface nunca outra classe;
3. **final --> abstract**: Final determina a última lógica da aplicação/método ou o último valor da aplicação. Já abstract é utilizado para heranças em métodos. 

## Documentação

Uma das maiores caracteriscas da linguagem Java é a sua documentação rica e detalhada da documentação da linguagem e dos frameworks. A documentação se encontra [aqui](https://docs.oracle.com/en/java/). <br>

### Tags

A documentação de Java é composta por tags que representam dados relevantes para a compreensão da proposta de uma classe e os conjuntos de seus métodos e atributos. Elas são marcadas pelo símbolo "@" na frente da palavra. <br>
No código de "Calculadora" há um exemplo de uma documentação destacando a utilização de tags.<br>

### Tipos de Comentários

1. **OneLine**: Marcado por "//", sendo um comentário de apenas uma linha, ela não é compilada pela linguagem, logo serve apenas a níuvel de usuário;
2. **MultiLine**:Marcado por "/*", sendo um comentário de várias linhas sendo mais abrangente;
3. **Documentation**: Marcado por "/**", serve para nível de documentação

### JavaDoc 

    É um gerador de documentação para documentar a API dos programas Java, a partir do código fonte. Tem o resultado expresso em HTML, por meio de marcações simples. É feito por meio de comando no prompt do próprio VScode.   