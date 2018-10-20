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
public class Load {
    
    private  Complex impedence;

    public Load(Complex impedence) {
        this.impedence = impedence;
    }

   /* public static void setImpedence(Complex impedence) {
        Load.impedence = impedence;
    }*/

    public  Complex getImpedence() {
        return impedence;
    }

    @Override
       public String toString(){
           return impedence.toString();
       }
  



/* public String toString(){
    String ComValue = null;
    String i="i";
    if (impedence.getReal()>0 && impedence.>0){
        ComValue= real+"+"+imaginary+i;
 //
        
    }
    if (real>0 &&imaginary<0){
        ComValue =real+""+imaginary+i;
      //  return ComValue;
        
    
}
    if (real<0&&imaginary<0){
        ComValue=real+""+imaginary+i;
    }
    if (real<0&&imaginary>0){
    ComValue = real+"+"+imaginary+i;}

    /**
     * @param args the command line arguments
     
  

return ComValue;    }*/    
        
        // TODO code application logic here
    

        
    
    static Load series(Load l1,Load l2){
        Load equivelantImpedence = new Load (Complex.add(l1.impedence, l2.impedence));
                
        return equivelantImpedence;
    }
    static Load parallel(Load l1, Load l2){
        Load equivelantImpedence=new Load (Complex.divide(Complex.multiply(l1.impedence,l2.impedence), Complex.add(l1.impedence, l2.impedence)));
        return equivelantImpedence;
    }

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
class Inductor extends Load {

    public Inductor(double L, double frequency) {
        super(new Complex(0,2*Math.PI*frequency*L));
    }
   /* private double L;
    private double frequency=50;
    private double w=2*Math.PI*frequency;*/
    
}
class Capacitor extends Load{
    public Capacitor(double C, double frequency){
        super(new Complex(0,-1/(2*Math.PI*frequency*C)));
    }

    /*private double C;
    private double frequency=50;
    private double w=2*Math.PI*frequency;*/
    
    
    
}
}
