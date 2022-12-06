package mirea.ru.lazarev_pavel.kvbo0121.pr29;

import java.util.*;


public class Main
{
    public static void main(String[] args)

    {
        Scanner con = new Scanner(System.in);
        int n = con.nextInt();
        int res = 0;

        for(int i = 0; i < n; i++)
            for(int j = 0; j < n; j++)
                res += con.nextInt();
        res /= 2;
        System.out.println(res);
    }

}
