package com.ifpb.ads.pod.client;

/**
 *
 * @author Joseph Sousa
 * @mail Jsantos.te@gmail.com
 * @since 11/08/2017 , 08:38:06
 */
public class Venda {

    private int id;
    private int idVendedor;
    private int idProduto;
    private int qtde;

    public Venda(int id, int idVendedor, int idProduto, int qtde) {
        this.id = id;
        this.idVendedor = idVendedor;
        this.idProduto = idProduto;
        this.qtde = qtde;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdVendedor() {
        return idVendedor;
    }

    public void setIdVendedor(int idVendedor) {
        this.idVendedor = idVendedor;
    }

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public int getQtde() {
        return qtde;
    }

    public void setQtde(int qtde) {
        this.qtde = qtde;
    }

    @Override
    public String toString() {
        return "Venda{" + "id=" + id + ", idVendedor=" + idVendedor + ", idProduto=" + idProduto + ", qtde=" + qtde + '}';
    }
    
}
