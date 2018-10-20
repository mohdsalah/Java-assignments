/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package complex;
import java.io.IOException;
/**
 *
 * @author hamad
 */

public class Complex{
    
    private double real;
    private double imaginary;

  
    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public void setImaginary(double imaginary) {
        this.imaginary = imaginary;
    }
  public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }
public String toString(){
    String ComValue = new String();
    String i="i";
    if (real>=0 && imaginary>=0){
        ComValue= real+"+"+imaginary+i;
 //
        
    }
    if (real>=0 &&imaginary<=0){
        ComValue =real+""+imaginary+i;
      //  return ComValue;
        
    
}
    if (real<=0&&imaginary<=0){
        ComValue=real+""+imaginary+i;
    }
    if (real<=0&&imaginary>=0){
    ComValue = real+"+"+imaginary+i;}

    /**
     * @param args the command line arguments
     */
  

return ComValue;        
        
        // TODO code application logic here
    }
static Complex add(Complex c1,Complex c2){
    double realSum=c1.real+c2.real;
    double imaginarySum=c1.imaginary+c2.imaginary;
    
       Complex summation = new Complex(realSum,imaginarySum);
        return summation;
        

}
static Complex subtract(Complex c1,Complex c2){
    double realSubtract=c1.real-c2.real;
    double imaginarySubtract=c1.imaginary-c2.imaginary;
    Complex subtraction= new Complex(realSubtract,imaginarySubtract);
    return subtraction;

}
static Complex multiply(Complex c1 , Complex c2){
double realMultiplication=(c1.real*c2.real)-(c1.imaginary*c2.imaginary);
double imaginaryMultiplication=(c1.real*c2.imaginary)+(c1.imaginary*c2.real);
Complex Multiplication= new Complex(realMultiplication,imaginaryMultiplication);
return Multiplication;
}
static Complex divide(Complex c1,Complex c2){
        double realDivision=((c1.real*c2.real)+(c1.imaginary*c2.imaginary))/((c2.real*c2.real)+(c2.imaginary*c2.imaginary));
    double imaginaryDivision=((c1.imaginary*c2.real)-(c1.real*c2.imaginary))/((c2.real*c2.real)+(c2.imaginary*c2.imaginary));
    Complex Division=new Complex(realDivision,imaginaryDivision);
    if (c2.real!=0&&c2.imaginary!=0){

    return Division;
}
  return null;}

static double abs(Complex c1){
    return (Math.sqrt((c1.real*c1.real)+(c1.imaginary*c1.imaginary)));

}
static double angle(Complex c1){
    return Math.toDegrees(Math.atan(c1.imaginary/c1.real));}

 public static void main(String[] args) {
    Complex cA = new Complex(1,2);
    Complex cB= new Complex (3,4);
    Complex sum= Complex.add(cA,cB);
    Complex subtract=Complex.subtract(cA, cB);
    Complex multiplication=Complex.multiply(cA, cB);
    Complex dividor=Complex.divide(cA, cB);
    double absVal= Complex.abs(cA);
    Load res = new Load(new Complex(40, 0));
   Load cap = new Load(new Complex(0, -0.01));
    Load result = Load.series(res, cap);
    Load result2 = Load.parallel(res, cap);
 Resistor r1= new Resistor(2000);
    Resistor r2=new Resistor(1500);
    Capacitor c1= new Capacitor(0.01,50);
    Inductor i1= new Inductor(30,50);
    Load mediatorImpedence= Load.parallel(r1,i1);
    Load mediatorImpedence1=Load.series(mediatorImpedence,c1);
    Load ResultantImpedence=Load.series(mediatorImpedence1,r2);
    
    System.out.println(sum);
    System.out.println(subtract);
    System.out.println(multiplication);
    System.out.println(dividor);
    System.out.println(absVal);
    System.out.println(res);
   System.out.println(cap);
     System.out.println(sum);
   
   
   System.out.println(result);
   
   System.out.println(result2);   
     
           
    
      System.out.println(ResultantImpedence);
    }

   
    
}

