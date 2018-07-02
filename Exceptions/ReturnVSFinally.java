package com.dasharth.exceptions;

<!-- Even though return present in try or catch blocks first finally will be executed ,
and after that only return statement will be considered that is finally block dominates return statement. -->

class ReturnVSFinally
{
public static void main(String[] args)
{
try
{
System.out.println("try block executed");
return;
}
catch(ArithmeticException e)
{
System.out.println("catch block executed");
}
finally
{
System.out.println("finally block executed");
}}}
Output:
Try block executed
Finally block executed
