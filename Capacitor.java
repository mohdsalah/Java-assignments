/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package complex;

/**
 *
 * @author hamad
 */
class Capacitor extends Load{
    public Capacitor(double C, double frequency){
        super(new Complex(0,-1/(2*Math.PI*frequency*C)));
    }}