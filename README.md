## Cadastro de produtos

1) Implementa em Java uma classe que representa um Fornecedor:
   a)Cada fornecedor possui como atributos, seu CNPJ (uma String), seu telefone (uma String) e o seu nome (uma String).

2) Implementa em Java uma classe que representa um Produto:
   a)Um produto tem como atributos um código (um inteiro), um nome (uma String), um valor (um float) e um fornecedor (do tipo Fornecedor implementado na questão anterior)
   b)Implementa um método atualizarPreco na classe produto que recebe como parâmetro um valor (um float) que representa um percentual. O valor passado deve aumenta o valor do produto. 
       Por exemplo, se for passado o valor 10.0, o valor do produto e aumentado em 10.0%.

3) Cria uma classe TesteProduto com um método main. No método main desta classe, instancia três produtos e dois fornecedores, de acordo com o esquema em anexo (Figura 01).

4) Implementa em Java uma classe chamada ConjuntoProdutos que ccontém um ArrayList que guarda produtos (classe implementada na questão anterior) e fornece métodos que permitem inserir, remover, atualizar, mostrar produtos e atualizar o preço dos produtos por porcentagem. 
   Obs.: O sistema não deve permiti que produtos com o mesmo código sejam cadastrados no conjunto.


