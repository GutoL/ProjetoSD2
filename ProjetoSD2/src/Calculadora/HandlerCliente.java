/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculadora;

import middleware.client.ClientHandler;

/**
 *
 * @author Renan
 */
public class HandlerCliente implements ClientHandler {
    
    Numeros n;
    String operation;

    public HandlerCliente(Numeros n, String operation) {
        this.n = n;
        this.operation = operation;
    }
    
    
    

    @Override
    public void handler(int id, Object o) {
        
        Resultado r = (Resultado) o;
        System.out.println("["+id+"]operacao: " + n.a + " " + operation + " " + n.b + " = " + r.res);
        
    }
   
    
    
}
