package com.ifpb.ads.pod.client;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 *
 * @author Joseph Sousa
 * @mail Jsantos.te@gmail.com
 * @since 11/08/2017 , 08:57:48
 */
public class ClientMain {

    public static void main(String[] args) throws IOException {
        Pessoa pessoa = new Pessoa(10,"José");
        Produto produto = new Produto(1, "uva");
        Vendedor vendedor = new Vendedor(10,"8888-8888");
        Venda venda = new Venda(1, 10, 1, 2);
        //opening connection in tport 10999, localhost para node 1
        Socket socket1 = new Socket("localhost", 10999);
        //start comunication
        InputStream inpt1 = socket1.getInputStream();
        OutputStream out1 = socket1.getOutputStream();

        out1.write(pessoa.toString().getBytes());
        byte[] b = new byte[4096];
        inpt1.read(b);
        System.out.println("ok");
        socket1.close();
        
        out1.write(produto.toString().getBytes());
        byte[] b2 = new byte[4096];
        inpt1.read(b2);
        System.out.println("ok");
        socket1.close();
        
        out1.write(vendedor.toString().getBytes());
        byte[] b3 = new byte[4096];
        inpt1.read(b3);
        System.out.println("ok");
        socket1.close();
        
        //fim do node 1
        
        //inicio do node 3
        
         Socket socket3 = new Socket("localhost", 10998);
        //start comunication
        InputStream inpt3 = socket3.getInputStream();
        OutputStream out3 = socket3.getOutputStream();

        out3.write(venda.toString().getBytes());
        byte[] b4 = new byte[4096];
        inpt3.read(b4);
        System.out.println("ok");
        socket1.close();
        
        
    }
}