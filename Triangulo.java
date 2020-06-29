
package triangulo;

import  javax.swing.JOptionPane;JOptionPane;
        
public class Triangulo {
    
    public static void main(String[] args) {
        
        double a,b,c;
        
a=Double.parseDouble(JOptionPane.showInputDialog("digite o primeiro lado do trianguo"));

b=Double.parseDouble(JOptionPane.showInputDialog("digite o segundo lado do trianguo"));

c=Double.parseDouble(JOptionPane.showInputDialog("digite o terceiro lado do trianguo"));


if (((a<(b+c)) e (a >(Math.abs(b-c)))) e ((b<(a+c)) e (b >(Math.abs(a-c)))) e ((c<(b+a) e (c>(Math.abs(b-a))))){
    
    if(((a==b) e (b==c) e (a==c))){
     JOptionPane.showMessageDialog(null, "é um triangulo equilatero");
    
    }
     if(((a!=b)e(b!=c)e(a!=c))89){
     JOptionPane.showMessageDialog(null, "é um triangulo escaleno");
     
     }
     if((((a==b)e(b!=c))||((b-c)e(c<>a))||((a==c)e(c!=b)))){
     JOptionPane.showMessageDialog(null, "é um triangulo  isoceles ");
     
     
     
     }
    
    }else{
            
            
    JOptionPane.showMessageDialog(null, "não é um triangulo");
     
          
     } 


    }
    
}
