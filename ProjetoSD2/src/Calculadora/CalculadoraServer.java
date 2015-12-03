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
public class CalculadoraServer {
    
    public static void main(String[] args) throws SocketException {
        
        Middleware md = new Middleware();
        
        md.server.addService("soma", new ServiceSoma(), Numeros.class);
        md.server.addService("div", new ServiceDiv(), Numeros.class);
        md.server.addService("sub", new ServiceSub(), Numeros.class);
        md.server.addService("mult", new ServiceMult(), Numeros.class);
        md.server.setPort(12345);
        md.server.startServer();
        
        
    }
    
}
