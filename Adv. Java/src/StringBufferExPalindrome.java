/*public class StringBufferExPalindrome {
    public static void main(String []args){
        StringBuffer sb=new StringBuffer("Madam");
        sb.reverse();
        System.out.println(sb);
    }
}*/


import java.util.Scanner;

public class StringBufferExPalindrome {
    public static void main(String []args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the String : ");
        String str=scan.next();
        StringBuffer sb=new StringBuffer(str);
        sb.reverse();
        System.out.println(sb);
    }
}