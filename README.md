Sistema de Almoxarifado em Java.

Foi desenvolvido um sistema de almoxarifado que permite o cadastro de itens com nome e código.

Nesse projeto foi aplicado a Orientação a Objetos do Java, usando os pilares:

- Herança: Permite que uma Subclasse herde propriedades e métodos da Superclasse, promovendo a reutilização de código.
- Encapsulamento: Habilidade de encapsular as nossas variáveis para evitar vazamento de dados, privando as classes e deixando públicas apenas a entrada e saída de dados.

A classe Banco De Dados é responsável por pegar os itens que foram cadastrados e salvar no Banco de Dados.

A classe Item é onde está lógica para cadastrar os itens que tem no almoxarifado usando o encpsulamento, get e set. 
Onde o Get permite que outras classes leiam os valores desses atributos de forma segura através dos getters.
E o Set permite que outras classes modifiquem os valores desses atributos de forma controlada através dos setters, possibilitando a adição de lógica de validação ou outras operações antes da atribuição.




