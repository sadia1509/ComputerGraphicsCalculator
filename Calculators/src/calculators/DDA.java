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
public class DDA {
    
      public static void main(String[] args)
{   
    float x, y,dx,dy,steps;  
    //int x0, x1, y0, y1;   
   int x0 = -14 ;        //start point
   int y0 = 0;                            //ZONE 0
   int x1 = 0;        //end point
   int y1 = 190; 
   
   
    dx = (float)(x1 - x0);  
    dy = (float)(y1 - y0); 
    
    if(dx>=dy)  
           {  
        steps = dx;  
    }  
    else  
           {  
        steps = dy;  
    }  
    dx = dx/steps;  
    dy = dy/steps;  
    x = x0;  
    y = y0;  
  //   System.out.println(dy);
   // double roundOff = Math.round(a * 100.0) / 100.0;
    int i = 1;  
      System.out.println("P    X    Y");
    while(i<= steps)  
    {  
         //System.out.println(i+" "+x+" "+y);
         System.out.print(i+"  "); System.out.printf("%.2f  ", x); System.out.printf("%.2f", y);
         System.out.println();
        //putpixel(x, y, RED); 
        if(dx>0 && dy>0){ x += dx;   y += dy;  }
        else if (dx<0 && dy>0){ x -= dx;   y += dy;  }
        else if (dx>0 && dy<0){ x += dx;   y -= dy;  }
        else {x -= dx;   y -= dy;}
       i++;
     //  System.out.println(i+" "+x+" "+y);
    }   
}  
    
}
