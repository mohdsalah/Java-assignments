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

class Inductor extends Load {

    public Inductor(double L, double frequency) {
        super(new Complex(0,2*Math.PI*frequency*L));
    }
   /* private double L;
    private double frequency=50;
    private double w=2*Math.PI*frequency;*/
    
}
