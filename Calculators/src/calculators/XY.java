package calculators;

/**
 *
 * @author User
 */
public class XY {
    
    
    public static void main (String[]args){
        
        int x1= -205;
        int y1=  24;
        int x2=  -219;
        int y2=  -158;
        int x0=  -207;    //x0=x
        int y0=  -0;    //yo=y
        
      //  float xex=(float)(y0-y1)/(y2-y1);   System.out.println(xex);
        float x= x1+((float)(y0-y1)/(y2-y1))*(x2-x1);    System.out.println(x);
        
        float y= y1+((float)(x0-x1)/(x2-x1))*(y2-y1);    System.out.println(y);
    }
    
}