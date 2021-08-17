/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculators;

/**
 *
 * @author User
 */
//import java.util.Scanner;
public class midPointCircle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       // Scanner sc=new Scanner (System.in);
       
        int x1=153;     //if new center is given
        int y1=-162;
         
        int radius=48;   //put R
        
	int d = 1 - radius; 
	int x = 0; 
	int y = radius;  
        System.out.println("Center 0");
         System.out.println("X  Y  D sts  D'     --Center ?--");
	while (x < y) {
		if (d < 0) { 
			//choose E 
                        System.out.print(x+" "+y+" "+ d+" "+"E"+" ");
                        int xt=x+x1, yt=y+y1; 
			d = d + 2*x + 3; 
			x = x + 1;
                        System.out.print(d+"       ");
                        System.out.print(xt+" "+ yt);
                         System.out.println();
                        
		}
		else {
			//choose SE 
                        System.out.print(x+" "+y+" "+ d+" "+"SE"+" ");
                        int xt=x+x1, yt=y+y1; 
                        d = d + 2*x - 2*y + 5;
			x = x + 1; 
			y = y - 1;
                          System.out.print(d+"       ");
                        System.out.print(xt+" "+ yt);
                         System.out.println();
		} 
	}

    
        
    }
    
}
