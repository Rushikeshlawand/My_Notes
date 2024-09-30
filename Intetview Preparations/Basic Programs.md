## Even or odd

```java
if(num%2==0){
    System.out.println("Even");
}else{
    System.out.println("odd");
}
```

## Even or odd without %

```java
if((num&1)==0){
    System.out.println("Even");
}else{
    System.out.println("odd");
}
```

```java
String numstr=Integer.toString(num);
char lastchar=numstr.charAt(numstr.length()-1);

if(lastchar=='0' || lastchar=='2' ||lastchar=='4' ||lastchar=='6' ||lastchar=='8'  ){
    System.out.println("Even");
}else{
    System.out.println("odd");
}
```

## Factorial

```java
int num=5,fact=1;
for(int i=1;i<=num;i++){
fact*=i;
}
```

## Fibonacci

```java
int n=10;int num1=0;int num2=1;
System.out.print(num1+" "+num2);

for(int i=2;i<n;i++){
int num3=num1+num2;
System.out.print(","+num3);
num1=num2;
num2=num3;
}
```

## Prime Number

### the number who divisible by 1 & the number itself

```java
int num=25;
boolean flag=true;

    for(int i=2;i<=num;i++){
        if (num%i==0){
            flag=false;
            break;
        }
    }

-OR-

if (num <= 1) {
    return false;
}
for (int i = 2; i <= Math.sqrt(num); i++) {
    if (num % i == 0) {
        return false;
    }
}
return true;
```

## Reverse a String

```java
String s = "Rushikesh";
String ans="";

for (int i = s.length()-1;i>=0; i--) {
    ans+=s.charAt(i);
}
-OR-
String str="Rushikesh";
StringBuilder reversed=new StringBuilder(str).reverse();
```

## Palindrome a String

```java
if(s.equals(ans)){
    System.out.println("palidrome")
}else{
    System.out.println("not palidrome")
}
- OR-

String str = "madam";
String reversed = new StringBuilder(str).reverse().toString();
System.out.println(str.equals(reversed));
```

## Factorial of a Number

```java
int num = sc.nextInt();
int factorial=1;
for (int i =1;i<=num; i++) {
    factorial*=i;
}
```

## Fibonacci Series up to N Terms

```java
int num = sc.nextInt();
int first=0,second=1;
System.out.print(first+" "+second);
for (int i =3;i<=num; i++) {
    int next=first+second;
    System.out.print(", "+next);
    first=second;
    second=next;
}
```

## Max Element in array

```java
int[] arr = {2, 5, 7, 9, 3, 6};
int max = arr[0];
for (int i = 1; i < arr.length; i++) {
    if (arr[i] > max) {
        max = arr[i];
    }
}
```

## Sum of Digits of a Number

```java
 int num = sc.nextInt();
int sum=0;
while(num>0){
    sum+=num%10;
    num/=10;
}
```

## Swap Two Numbers Without Using a Temporary Variable

```java
int a = 5;
int b = 3;
a = a + b;
b = a - b;
a = a - b;
```

## Find the GCD (Greatest Common Divisor) of Two Numbers

```java
int a=54;
int b=24;
int gcd=1;

for(int i=1;i<=a && i<=b;i++){
    if (a%i==0 && b%i==0) {
        gcd=i;
    }
}
int a = 60, b = 48;
while (b != 0) {
int temp = b;
b = a % b;
a = temp;
}
```

## fibonacci

```java
int v=0;
int c=0;

    for(int i=0;i<s.length();i++){
        char ch=s.charAt(i);
            if(ch=='a' ||ch=='e' ||ch=='i' ||ch=='o' ||ch=='u'){
                v++;
            }else if (Character.isLetter(ch)) {
                c++;
            }
    }

```

## Armstrong

```java
class Solution {
    static String armstrongNumber(int n) {
        int temp=n;int sum=0;
        while(temp!=0){
            int digit=temp%10;
            sum+=Math.pow(digit,3);
            temp/=10;
        }
        if(n==sum){
            return "true";
        }else{
            return "false";
        }
    }
}
```

## Reversed a number

```java
int n=134;int reversed=0;
    while(n!=0){
        reversed=reversed*10+n%10;
        n/=10;
    }
System.out.println(reversed);
```
