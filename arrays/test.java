import java.util.Scanner;

public class test {

    public static void func(String str)
    {
        if(str.length()<=1)
        {
            System.out.println(str);
            return;
        }
        String n=new String();
        int count=0;
        for(int i=0;i<str.length();i++)
        {
            while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1))
            {
                if(i<str.length()-2 &&str.charAt(i)!=str.charAt(i+2))
                    i+=2;
                else
                    i++;
                count++;
            }
            if(i!=str.length()-1)
                n=n+str.charAt(i);
            else
            {if(i==str.length()-1 && str.charAt(i)!=str.charAt(i-1))
                n=n+str.charAt(i);
            }
        }
        if(count>0)
            func(n);
        else
            System.out.println(n);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String abc ;
        System.out.println("Enter string ");
        abc = sc.next();
        func(abc);
    }
}
