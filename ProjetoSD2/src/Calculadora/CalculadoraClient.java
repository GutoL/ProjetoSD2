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
        
        Numeros n = new Numeros(2, 3);
        String op = "soma";
        md.client.sendMessage(n, op, new HandlerCliente(n, op) , Resultado.class);
        
        Numeros n2 = new Numeros(5, 8);
        String op2 = "soma";
        md.client.sendMessage(n2, op2, new HandlerCliente(n2, op2) , Resultado.class);
        
    
        md.client.stopClient();
    }
}
