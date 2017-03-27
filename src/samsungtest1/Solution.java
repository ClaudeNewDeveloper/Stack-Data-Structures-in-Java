/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package samsungtest1;

import java.util.Stack;

/**
 *
 * @author Claude Boulingui
 * Test1
 */
public class Solution {

   static Stack<Integer> stackOfNumberA = new Stack <Integer>();
   static Stack<Integer> stackOfNumberB = new Stack <Integer>();
  
    /**
     * @param args the command line arguments
     */
    
    
    public static int solution(int A, int B) {
        // write your code in Java SE 8
        
        String theDecimalZip = null;
        int finalDecimalZip = 0;
        
        long sizeOfA = 0 ;
        long sizeOfB = 0;
        
        StringBuilder sb =  new StringBuilder();
        
         int digit = -1;
        
        //Stack A
        while( A >= 10)
        {
           digit = A  % 10;
           stackOfNumberA.push(digit);
           A =  A / 10;  
        }
        //pushing the very first digit of A on top of stack
         stackOfNumberA.push(A);
        
        
        //Stack B
        while( B >= 10)
        {
           digit = B  % 10;
           stackOfNumberB.push(digit);
           B =  B / 10;  
        }
        //pushing the very first digit of B on top of stack
        stackOfNumberB.push(B);
        
       long max = 0;
       
       if(stackOfNumberA.size() > stackOfNumberB.size())
       { 
           max = stackOfNumberA.size();
           
       }
       else 
       {  
           max = stackOfNumberB.size();
           
       }
        
        sizeOfA = stackOfNumberA.size();
        sizeOfB = stackOfNumberB.size();
        
       for( int j = 0; j < max; j++)
       {   
           if(sizeOfA > 0 )
           {    
                theDecimalZip =  stackOfNumberA.pop().toString();
                sb = sb.append(theDecimalZip);
                sizeOfA--;
           }
           
           if(sizeOfB > 0 ) 
           {   
                theDecimalZip =  stackOfNumberB.pop().toString();
                sb = sb.append(theDecimalZip);
                sizeOfB--;
           }
        }
       
        finalDecimalZip  = Integer.parseInt(sb.toString());
        
        if(finalDecimalZip > 100000000)
            finalDecimalZip = -1;
       
        return finalDecimalZip;
    }
    
    public static void main(String[] args) 
    {
        int A = 12345;
        int B = 6789; 
        
       long zipDecimalFinal = solution( A, B);
       
       System.out.println("The Final zip Decimal is " + zipDecimalFinal);
    }
    
}
