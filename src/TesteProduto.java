

import Entidades.ConjuntoProdutos;
import Entidades.Fornecedor;
import Entidades.Produto;

public class TesteProduto {
    public static void main(String[] args) throws Exception {
        System.out.println("Sistema ok!");


       Fornecedor forn1 = new Fornecedor("1234321", null, "Zé Maria");
       Fornecedor forn2 = new Fornecedor("543212345", null, "Cláudio");

       Produto produto1 = new Produto(1, "TV LCD", (float) 3500.00, forn1);
       Produto produto2 = new Produto(2, "notebook", (float) 2000.00, forn2);
       Produto produto3 = new Produto(3, "impressora", (float) 232.00, forn2);
       Produto produto4 = new Produto(4, "geladeira", (float) 200.00, forn1);

        //PRODUTO COM O MESMO CODIGO 
        //Produto produto5 = new Produto(3, "Monitor", (float) 3000.00, forn2);

       ConjuntoProdutos conjuntoProdutos = new ConjuntoProdutos();  

       //ADICIONAR PRODUTOS
        conjuntoProdutos.adicionarProdutos(produto1);
        conjuntoProdutos.adicionarProdutos(produto2);
        conjuntoProdutos.adicionarProdutos(produto3);
        conjuntoProdutos.adicionarProdutos(produto4);

        
        //REMOVER PRODUTO
        //conjuntoProdutos.removerProdutos(1);

        //ATUALIZA NOME
        //conjuntoProdutos.atualizarNome(2, "Teclado");

        //ATUALIZA VALOR 
        //conjuntoProdutos.atualizarPreco(1, (float) 230.00);

        //ATUALIZA VALOR DO PRODUTO DE ACORDO COM UMA PORCENTAGEM
        //conjuntoProdutos.atualizarPrecoPorcentagem(1, (float)10.0);

        //MOSTRAR PRODUTOS
        conjuntoProdutos.mostrarProdutos();
       


        
    }
}
