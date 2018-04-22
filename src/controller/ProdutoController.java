package controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import model.ProdutoModel;

public class ProdutoController {
   
    private List<ProdutoModel> listaProduto;
    
    public ProdutoController() {
        this.listaProduto = new ArrayList<ProdutoModel>();
    } 
    
    public void Cadastrar(ProdutoModel produto) throws Exception{
        try {
            this.listaProduto.add(produto);
        } 
        catch (Exception e) {
            throw new Exception(e); 
        }
    }
    
    public boolean ContemNaLista(int id){
        for(ProdutoModel produto: listaProduto){
            if (produto.getCodigo() == id) {
                return true;
            }
        }
        return false;
    }
    
    public ProdutoModel Buscar(int id){
        for(ProdutoModel produto: listaProduto){
            if (produto.getCodigo() == id) {
                return produto;
            }
        }
        return null;
    }
}
