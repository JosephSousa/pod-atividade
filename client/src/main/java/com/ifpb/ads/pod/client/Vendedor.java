package com.ifpb.ads.pod.client;

/**
 *
 * @author Joseph Sousa
 * @mail Jsantos.te@gmail.com
 * @since 11/08/2017 , 08:35:29
 */
public class Vendedor {

    private int idPessoa;
    private String telefone;

    public Vendedor(int idPessoa, String telefone) {
        this.idPessoa = idPessoa;
        this.telefone = telefone;
    }

    public int getIdPessoa() {
        return idPessoa;
    }

    public void setIdPessoa(int idPessoa) {
        this.idPessoa = idPessoa;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Vendedor{" + "idPessoa=" + idPessoa + ", telefone=" + telefone + '}';
    }
    
}
