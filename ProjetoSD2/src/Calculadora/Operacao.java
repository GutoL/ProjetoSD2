/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculadora;

/**
 *
 * @author Renan
 */
public class Operacao {
    
    Numeros n;
    Resultado r;
    String op;

    public Operacao(Numeros n, String op) {
        this.n = n;
        this.r = new Resultado(0);
        this.op = op;
    }
    
    
}
