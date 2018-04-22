package model;

public class ProdutoModel {

    private int codigo;
    private String nome;
    private String descricao;
    private double valor;
    private int estoque;
    private int estoqueMinimo;
    
    public ProdutoModel(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }  
    
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
    
    public void setValor(int valor){
        this.valor = valor;
    }
    
    public void setEstoque(int estoque){
        this.estoque = estoque;
    }
    
    public void setEstoqueMinimo(int estoqueMinimo){
        this.estoqueMinimo = estoqueMinimo;
    }
    
    public int getCodigo(){
        return codigo;
    }
    
    public String getNome(){
        return nome;
    }
    
    public String getDescricao(){
        return this.descricao;
    }
    
    public double getValor(){
        return this.valor;
    }
    
    public int getEstoque(){
        return estoque;
    }
    
    public int getEstoqueMinimo(){
        return estoqueMinimo;
    }
}
