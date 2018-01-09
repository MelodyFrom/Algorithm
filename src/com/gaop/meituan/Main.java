package com.gaop.meituan;

import java.util.Scanner;

public class Main {

    public static void main(String[] arg) {
        Scanner in = new Scanner(System.in);
        int paramNumber = in.nextInt();
        System.out.println(getNum(paramNumber));
    }
    
    public static int getNum(int n)
    {
        int count = 0;
        if(n == 1)
        {
            return 1;
        } else if(n == 2) {
            return 2;
        } else {
            for(int i = 1; i < n; i++)
            {
            	 count += getNum(n-i);
            }
            count += 1;
        }
        return count;
    }
}
