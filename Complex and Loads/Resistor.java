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
    class Resistor extends Load{

    public Resistor(double R) {
        super(new Complex(R,0));
               
    }
       /* private double R;

    public Resistor(double R, Complex impedence) {
        super(impedence);
        this.R = R;
    }*/
    
    }
