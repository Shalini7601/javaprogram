package com;
import java.util.Scanner;
public class CustomExampleException{
public void checkAge(int age) throws InvalidAgeException{
if(age<=18||age>=25){
throw new InvalidAgeException("invalid age for enrolling into java course");
}
else
System.out.println("proper age for enrolling in java course");
}
public static void main(String[]args) throws InvalidAgeException{
CustomExampleException c=new CustomExampleException();
Scanner s= new Scanner(System.in);
System.out.println("Enter your age");
int age =s.nextInt();
c.checkAge(age);
}
} 



