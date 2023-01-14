# Aula sobre métodos

## Métodos 

### Conceitos

São todas as ações da aplicação, uma classe se define por atributos, em sua maioria variáveis e métodos, esse último corresponde a funções ou sub-rotinas disponíveis dentro das classes. 

**Nomeação**

Recomendado pelas convenções, não são obrigatórios. As regras são:
    * Deve ser nomeado como verbo; 
    * Deve seguir o padrão camelCase;
    * Nome claro para definir a única finalidade do método. 

**Critério de definição de métodos** 

A convenção preza para definir os métodos das nossas classes através da proposta principal do método e o  tipo de retorno esperado após executar o método. 
Obs. Caso o método não retorne nenhum valor, ele deve ser representado pela palavra-chave *void*. 
Os métodos as vezes precisarão de parâmetros para a sua execução, eles vem dentro de chaves. 
E eles podem ser visíveis de 04 modos, sendo:
    1. Toda aplicação;
    2. Somente em pacotes;
    3. Através de herança;
    4. Somente a nível da própria classe. 
Quando um método estiver como *private* ele será privado, logo não será visto por todo mundo. 
