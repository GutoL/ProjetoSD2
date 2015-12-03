/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculadora;

import java.net.SocketException;
import middleware.Middleware;

/**
 *
 * @author Renan
 */
public class CalculadoraClient {
    public static void main(String[] args) throws SocketException {
        Middleware md = new Middleware();
        
        
        md.client.startClient();
        
        Numeros n = new Numeros(10, 3);
        String op = "div";
        md.client.sendMessage(n, op, new HandlerCliente(n, op) , Resultado.class);
        
        Numeros n2 = new Numeros(55, 800);
        String op2 = "mult";
        md.client.sendMessage(n2, op2, new HandlerCliente(n2, op2) , Resultado.class);
        
    
        md.client.stopClient();
    }
}
