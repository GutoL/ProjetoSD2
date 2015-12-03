/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculadora;

import Calculadora.Numeros;
import Calculadora.Resultado;
import middleware.server.ServerHandler;

/**
 *
 * @author Renan
 */
public class ServiceSub implements ServerHandler {

    @Override
    public Object handler(Object o) {
        Numeros n = (Numeros) o;
        Resultado s = new Resultado(n.a-n.b);
        return s;
    }

}
