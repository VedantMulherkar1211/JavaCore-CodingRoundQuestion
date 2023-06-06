/*
Write a program to generate random numbers between[1,10] and print them to the output. Print when you get 5.
*/

import java.math.*;
public class RamdomGame
{
    public static void main(String[] args)
    {
        int num=0;
        while(num!=5)
        {
            num=(int)(Math.random()*10+1);
            System.out.println(num);
        }
    }
}