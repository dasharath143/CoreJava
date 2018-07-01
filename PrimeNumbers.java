package com.dasharath.java;

public class PrimeNumbers {

    public static void main(String[] args) {
        int n=7,count=0;
        for(int i=1;i<=n;i++)
        {


               if(n%i==0){
                   System.out.println(n%i);
                 /*  System.out.println(count);*/
                   count++;
                   if(count>2)
                   {
                       System.out.println("Given number is not a Prime number");
                       System.out.println(n);
                       break;

                   }
                   else{
                       System.out.println("The given number is prime number");
                   }

           }
        }
    }
}
