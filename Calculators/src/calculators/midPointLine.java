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
public class midPointLine {
    
   
    public static void main(String[] args) {
       // System.out.println(0);
       
       int x0=   - 30;    //start point
       int y0=  20;                   //OBOSSHOI ZONE O er DITE HOBE
       int x1=  90;      //end point
       int y1=   40;
       
       int dx=x1-x0;
       int dy=y1-y0;
       int d=2*dy-dx;
       int incrE=2*dy;
       int incrNE=2*(dy-dx);
       int x=x0, y=y0;
       
       System.out.println("dx= "+dx+"      dy= "+dy+"   E= "+incrE+"      NE= "+incrNE);
       
        System.out.println("ZONE 0");
       System.out.println("X  Y  D sts  D         '-Zone ?-  "  );
       while(x<x1){
           if(d<=0){
               System.out.print(x+" "+y+" "+ d+" "+"E"+" ");
               int xt=y, yt=-x;     //change it according to your ZONE
               d=d+incrE;
               x++;
               System.out.print(d+"        ");
                       System.out.print(xt+" "+ yt);
                         System.out.println();
               
           }
           else{
                System.out.print(x+" "+y+" "+ d+" "+"NE"+" ");
                   int xt=y, yt=-x;     //change it according to your ZONE
                d=d+incrNE;
                x++; y++;
                  System.out.print(d+"        ");
                        System.out.print(xt+" "+ yt);
                         System.out.println();
           }
       }
              
       
    }
    
}
