   /*Objective of this assignment is to Practice recursive programming.
Problem: In this assignment you will be writing recursive methods with the given signatures. You should not 
change the method paraments or the method return type. Non-recursive solutions will get zero points. 
Name: Kanan Shah
Date: December 12,2021 
Assignment: Recursive Programming
Professor: Gita Faroughi*/

/*
Grading rubic
 1. Proper naming = 5/5pts
 2. Indentation program has proper indentation throughout = 5/5pts
 3. comments = 5/5pts
 4. Program complies = 25/25pts
 5. program runs and the output matches the provided output = 30/30pts
 6. reuirnments = 30/30pts
 Total points = 100/100 pts
 
*/
import java.util.*;
 public class RecursiveHomeworkShah
 {
 }
 //Driver Class
 class Driver
{
   public static void main(String[] args)
   {
     System.out.println("testing the palindrom method");
      int[] a = {5,6,4,5,8,5,4,6,5,12};
      System.out.print(Arrays.toString(a) + " is palindrome?  ");
      System.out.println(palindrome(a,0));
      
      int[] b = {1,2,3,4,3,2,1};
      System.out.print(Arrays.toString(b) + " is palindrome?  ");
      System.out.println(palindrome(b,0));
      
      System.out.println("\ntesting sum of the digits");
      int num = 12345; 
      System.out.println("The sum of the digits in " + num + " is "+ sum(12345));
      
      System.out.println("\ntesting longest string in an array of string");
      String[] s = {"Hello","Bye","Said","song","Building"};
      System.out.println("The longest string is the array " + Arrays.toString(s) + 
" is " + longest(s,1,s[0]));
      
      System.out.println("\ntesing the equals method on the strings");
      String s1 = "hello";
      String s2 = "helloo";
      System.out.println("are the strings " + s1 + " and " + s2 +" equal? "  
+equals(s1,s2,0));
      
      s1 = "tomorrow";
      s2 = "tomorrow";
      System.out.println("are the strings " + s1 + " and " + s2 +" equal? "  
+equals(s1,s2,0));
      
      System.out.println("\ntesting the sum of the integers in a link list");
      LinkedList<Integer> list = new LinkedList<Integer>();
      list.add(5);
      list.add(7);
      list.add(8);
      list.add(12);
      System.out.println("The sum of the numbers in the linklist " + list + " is " 
+ listSum(list,0));
   }
// write a method that accepts an array of String and returns 
//true if the array is palindrom and returns false otherwise
//method Palindrome
   public static boolean palindrome(int[] a, int first )
   {
         if (a[first] != a[a.length - 1 - first])
            return false; 
        else if (first == a.length - 1 - first)
            return true;
        else
            return palindrome(a, first + 1);

   }
//write a recursive method that accepts an integer as its parameter and returns the
//sum of the digits in teh given number
//for example sumDigit(1234) should return 1 + 2 + 3 + 4 = 10
// method Sum
public static int sum(int num)
{ 
      if (num == 0)
            return 0;
        else
            return num % 10 + sum(num / 10);  
    
}
//write a method that accepts an array of String and returns the string with the longest length.
//Method Longest
public static String longest(String[] s, int index, String longest)
{
     if (s[index].length() > longest.length())
            longest = s[index];
        if (index != s.length - 1)
            return longest(s, index + 1, longest);
        else
            return longest;
  
}
//write a recursive method that accepts two string paramters, returns tru if the strings are the same, false otherwise
//Method Equals
public static boolean equals(String s1, String s2, int index)
{
     if (s1.length() != s2.length())
            return false;
        if (index != s1.length() - 1) {
            if (s1.charAt(index) != s2.charAt(index))
                return false;
            return equals(s1, s2, index + 1);
        }
        return true;
        
}
//write a method that accepts a linklist of integers and finds the sum of all the numbers in the list
//Method listSum
public static int listSum(LinkedList<Integer> list,int  index)
  { 
    if (index == list.size())
            return 0;
        else
            return list.get(index) + listSum(list, index + 1);
  }
}