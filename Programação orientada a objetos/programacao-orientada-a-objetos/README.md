# Aula

## Programação Orientada a Objetos

### Por que usar ?

Antes da orientação a objetos utilizava-se o paradigma estruturado da linguagem C, que foi a base do linux, porém ela tem uma representação mais simplista enquanto que objeto tem uma mais realista, representando mais mecanismos e mais complexos. A orientação a objetos foca na modelagem de entidades e nas suas interações enquando que a estruturada foca em funções e em dados. <br>
As principais vantagens da orientação a objetos são:<br>
    <ul>
    <li> *Melhor coesão*;</li>
    <li> *Melhor Acoplamento*;</li>
    <li> *Diminuição de Gap semântico*;</li>
    <li> *Coletor de Lixo*.</li>
### Fundamentos

A orientação a objetos é um paradigma de análise, projeto e programação de sistemas de software baseada na composição e interação entre diversas unidades de softwares chamadas de objetos. Ela possui três fundamentos sendo: <br>
<ol>
    <li>Abstração: Processo pelo qual se isolam características de um objeto, considerando os que tenham em comum certos grupos de objetos, basicamente se preocupa com o essencial, ou seja, aquilo que mais pode ser reutilizado;</li> 
    <li> Reuso: Capacidade de criar novas unidades de código a partir de outras já existentes, na Orientação a Objetos temos mais mecanismos de Reuso e sendo de mais alto nível;</li>
    <li>Encapsulamento: É a capacidade de esconder complexidades e proteger os dados; </li>

### Estrutura Básica

#### Classes

É uma estrutura que abstrai um conjunto de objetos com caracteristicas similares. Uma classe define o comportamento de seus objetos através de métodos e os estados possíveis desses objetos através de atributos. Em outros termos, uma classe descreve os serviços providos por seus objetos e quais informações eles podem armazenar.<br>
Tem como finalidade servir de molde do mundo real podendo ser conceitos concretos ou abstratos, adquirindo caracteristicas essenciais, pois a partir dessas serão criados objetos.<br>
Para identificar elas serão substantivos com nomes significativos, tendo que se considerar o contexto onde essa classe irá estar.  

#### Atributo

É o elemento responsável por definir sua estrutura de dados. O conjunto destes será responsável por representar suas caracteristicas e fará parte dos objetos criados a partir da classe. Através dele serão caracterizados as classes e os futuros objetos. 

#### Método

É uma porção de código, ou seja, uma sub-rotina, que é disponibilizada pela classe. Somente sendo executado quando é feita uma requisição a ele. Um método serve para identificar quais serviços, ações, que a classe oferece, sendo responsáveis por definir e realizar um determinado comportamento. <br>
Existem dois métodos especiais que são o *construtor* e o *destrutor*, o primeiro constrói objetos a partir das nossas classes devendo ser definido o construtor da classe sendo o mesmo nome da classe e não precisa ter um retorno ele provém valores iniciais para as classes e os atributos. Já o segundo ele auxilia a destruição de um objeto quando o objeto não é mais utilizado no Java ele tem que ter o *void finalize* e entre parenteses o que você precisa fazer, ele é utilizado quando é necessário liberar recursos de memória, tipo quando se utilizam portas seriais.<br>
A sobrecarga é a mudança de assinatura quando se faz necessário, lembrando que a assinatura é o nome e os parâmetros. <br>
Uma boa prática é colocar o construtor logo abaixo dos atributos, depois os gets e sets e se tiver métodos mais complexos eles ficam por último. 

#### Objeto
É uma representação conceitual do mundo real e possui um significado bem definido para um determinado software. Para ele deve ser definido inicialmente uma classe a qual posteriormente serão instanciados objetos distintos. <br>
Para criar um objeto criamos uma variável e colocamos o operador **new** + o construtor.

#### Mensagem

É o processo de ativação de um método de um objeto. Isto ocorre quando uma requisição/chamada a esse método é realizada, assim disparando a execução de seu comportamento descrito por sua classe. Pode também ser direcionada diretamente à classe, caso a requisição seja um método estático. Para chamar usa-se o nome da variável criada para o objeto ponto e o nome do método.

#### Exercício 1

Crie uma classe chamada Carro. Defina 03 atributos para a sua classe: Cor, modelo e capacidade do tanque.<br>
Defina um método para calcular o valor total para encher o tanque, ele deve receber o valor do combustível.<br>
Use os métodos set/get quando aplicáveis para definir os valores dos atributos e exibir esses valores get. Passe também uma mensagem para o cálculo do total para encher o tanque.  

### Relações

#### Herança

É o relacionamento entre classes em que uma classe chamada de sub-classe é uma extensão, um subtipo, de outras classe chamada de superclasse. Devido a isto, a superclasse consegue reaproveitar os atributos e métodos dela. Além dos que venham ser herdados, a subclasse pode definir seus próprios membros. <br>
Para definir coloca-se a classe depois **extends** e a segunda classe, onde a primeira recebe a herança da segunda. <br>
*Obs: Nem tudo que está na classe mãe é visto nas filhas.*

##### Tipos
Ela se divide em dois tipos, *simples* ou *múltipla*. A primeira é onde uma classe filha tem somente uma classe mãe, já a segunda é aquela ao qual a classe filha tem mais de uma classes mães. Contudo, a linguagem Java não possuí classe múltipla. 

##### Upcast e Downcast

Upcast é subir os tipos na sua hieranquia de classe, já o downcast é o oposto. Em Java para fazer o upcast coloca uma variável A do tipo a e iguala ela a new B, contudo ele é sempre implícito. Já o downcast você transforma a mãe na filha sendo explícito, via de regra eles dão erro na compilação. 

##### Polimorfismo e Sobrescrita

O Poliformismo é a mesma ação se comportando de forma diferente, é a possibilidade de um mesmo método se comportar de forma diferente de acordo com o objeto em questão.<br>
Já a sobrescrita é a mesma ação podendo se comportar diferente, logo aqui há a possibilidade de não ser diferente.<br>

##### Exercício 2
Crie a classe Veículo, Carro, Moto e Caminhão fazendo a relação de herança que julgue adequada. 

##### Exercício 3 
Crie as classes Funcionário, Gerente, Vendedor e Faxineiro. Realize upcasts e downcasts. 

#### Associação

Possibilita um relacionamento entre classes e objetos, no qual estes possam solicitar ajuda a outras classes e objetos e representar de forma completa o conceito ao qual se destinam. Neste tipo de relacionamento, as classes e os objetos interagem entre si para atingir seus objetivos. <br>
Eles podem ser por meio *estrutural* ou *comportamental*.

##### Estrutural
Pode ser de dois tipos composição e agregação.<br>
**Composição** tem um comportamento com parte todo, onde uma parte só pode existir com o todo, onde o dependente só existe caso o todo exista.<br>  
**Agregação** ela é o oposto, sendo sem parte todo, logo uma parte pode existir sem o todo. <br>
No código ambos são iguais, porém geram um comportamento diferente durante a execução de um software. 

##### Associação

Somente tem um tipo que seria o comportamental. 
**Comportamental** ele tem uma relação do tipo depende de, onde existe um método dentro de uma classe que utiliza outro objeto. 

#### Interface

Define um contrato que deve ser seguido pela classe que a implementa. Quando uma classe implementa uma interface, ela se compromete a realizar todos os comportamentos que a interface disponibiliza. Para utilizar usa-se a palavra *interface* e depois uma classe implementa essa interface. 

##### Exercício 4

Crie uma interface chamada OperacaoMatematica. Crie 4 métodos das operações das operações e implemente. 

### Organização 

#### Pacotes 
São uma organização lógica criada para separar classes com responsabilidades distintas. Com isso, espera-se que a aplicação fique mais organizada e seja possível separar classes de finalidades e representatividades diferentes. Quando criamos pacotes estamos criando pastas e subpastas dentro do sistema operacional. <br>
Em Java para criar utilizamos a palavra *package* e o nome do pacote, para dentro de uma classe solicitar outra que está em outro pacote utilizamos o *import*.

#### Visibilidades

Também são chamadas de modificadores de acesso, uma vez que, elas tem a finalidade de determinar até que ponto uma classe, atributo ou método pode ser usado. A utilização de modificadores de acesso é fundamental para o uso efetivo da Orientação a Objetos.  Elas se dividem em *Private* , *Protected* e *Public*.<br>

#### Privated
Ela permite a visualização somente dentro daquela classe, aquele ao qual ele foi definido.

#### Protected

Permite a visualização dentro da classe, mesmo pacote e subclasse. 

#### Public

Permite a visualização em qualquer lugar da aplicação. Ela é usada em quase todos os casos. 