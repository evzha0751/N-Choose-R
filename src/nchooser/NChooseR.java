/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package nchooser;

import java.util.*;
public class NChooseR {

    static public int fact (int n){
        if(n == 0 || n == 1){
            return 1;
        }else{
            return(n*fact(n-1));
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter the number of objects to choose:");
        int r = input.nextInt();
        System.out.println("Enter the number of objects there are to choose:");
        int n = input.nextInt();
        int x=n-r;
        
        int C,n1,r1,x1;
        
        n1=fact(n);
        r1=fact(r);
        x1=fact(x);
        
        C=n1/r1/x1;
        System.out.println("There are "+C+ " ways");
    }
    
}
