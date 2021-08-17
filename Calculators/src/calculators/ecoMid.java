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
public class ecoMid {
    public static void main (String[]args){
         float oldPrice=28386;
        float newPrice=48925;
        
        float oldQuantity=23;
        float newQuantity=38;
       
        
        float result=0;
        
        float r1= (newQuantity-oldQuantity)/ ((newQuantity+oldQuantity)/2);
          float r2= (newPrice-oldPrice)/ ((newPrice+oldPrice)/2); 
          
          result=r1/r2;
          
          System.out.println(result);
        
    }
    
}
