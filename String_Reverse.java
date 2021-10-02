//  Write a java program to reverse the string by using inbuilt function reverse() by taking input from user.

import java.util.Scanner;
public class String_Reverse {
  public static void main(String[] args){
    StringBuffer sb=new StringBuffer(" ");
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the string:");
     
    sb.append(sc.nextLine());
    sb=sb.reverse();
    System.out.println(sb);
  }
}
