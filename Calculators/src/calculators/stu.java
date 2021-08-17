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
public class stu {
    
     public static void main (String[]args){
      int num= countPrimes(10);
       System.out.println(num);
     }
  
    public static int countPrimes(int n) {
         if(n==0 || n==1)
        {
            return 0;
        }
        int mainCounter = 0;
        for (int i = 1; i < n; i++) {
            int count = 0;
            for (int j = i; j >= 1; j--) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 2) {
                mainCounter++;
            }
        }
      
        return mainCounter;

    
}
   
}
