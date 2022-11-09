package Entidades;

import java.util.ArrayList;

public class ConjuntoProdutos {
    
    

    ArrayList listaProdutos = new ArrayList<>();

    Produto produtoLista = new Produto();

    //ADICIONA PRODUTO
    public void adicionarProdutos(Produto produtoNovo){

        for(int i = 0; i<this.listaProdutos.size(); i++){
            Produto produtos = (Produto)this.listaProdutos.get(i);

            if(produtos.getCodigo() == produtoNovo.getCodigo()){
                
                
                System.out.println("Codigo já existente");

                this.listaProdutos.remove(produtos);
            }
            
        }

        this.listaProdutos.add(produtoNovo);
    }

    //REMOVE PRODUTO
    public void removerProdutos(int i){
        this.listaProdutos.remove(i);

        for(int j = 0; j<this.listaProdutos.size(); j++){
            System.out.println("Produtos:" + this.listaProdutos.get(j));
        }
    }

    //ATUALIZA NOME DO PRODUTO
    public void atualizarNome(int indice, String novoNome){
      
        Produto produtoSelec = (Produto) listaProdutos.get(indice);
      
        produtoSelec.setNome(novoNome);

        for(int i = 0; i<this.listaProdutos.size(); i++){
            System.out.println("Produtos:" + this.listaProdutos.get(i));
        }
       
    }
    
    //ATUALIZA O PREÇO DO PRODUTO
    public void atualizarPreco(int indice, Float novoPreco){
      
        Produto produtoSelec = (Produto) listaProdutos.get(indice);
      
        produtoSelec.setValor(novoPreco);
       
        for(int i = 0; i<this.listaProdutos.size(); i++){
            System.out.println("Produtos:" + this.listaProdutos.get(i));
        }
    }

    //ATUALIZA O VALOR DO PRODUTO DE ACORDO COM UMA PORCENTAGEM
    public void atualizarPrecoPorcentagem(int indice, Float valorPorcentagem){
      
        Produto produtoSelec = (Produto) listaProdutos.get(indice);
      
        produtoSelec.atualizaPreco(valorPorcentagem);
       
        for(int i = 0; i<this.listaProdutos.size(); i++){
            System.out.println("Produtos:" + this.listaProdutos.get(i));
        }
    }

    //MOSTRAR PRODUTOS
    public void mostrarProdutos(){
        
        for(int i = 0; i<this.listaProdutos.size(); i++){
            System.out.println("Produtos:" + this.listaProdutos.get(i));
        }
    
    }
}
