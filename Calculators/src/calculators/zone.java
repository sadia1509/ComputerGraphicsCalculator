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
public class zone {
    
    public static void main(String[] args) { 
        int x1=  -66;
        int y1=  246;
        int x2=  -301;
        int y2=   439;
        
    int dx= x2 - x1 , dy = y2 - y1 ;         //   10,10,60,50
    
   System.out.println("dx= "+dx+"      dy= "+dy);
    
    int zone=0;
    
    if(Math.abs(dx) > Math.abs(dy)){
        if(dx>0 && dy>0) zone = 0;
        else if(dx<0 && dy>0) zone =3;
        else if (dx<0 && dy<0) zone = 4 ;
        else if (dx>0 && dy<0) zone = 7;
    }
       else{
        if(dx>0 && dy>0) zone = 1;
        else if(dx<0 && dy>0) zone =2;
        else if (dx<0 && dy<0) zone = 5 ;
        else if (dx>0 && dy<0) zone = 6;
    }
 System.out.println(zone);
    }
}
