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

## Prime Number

### the number who divisible by 1 & the number itself

```java
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
String s = sc.nextLine();
String ans="";

for (int i = s.length()-1;i>=0; i--) {
    ans+=s.charAt(i);
}
```
## Palindrome a String
```java
if(s.equals(ans)){
    System.out.println("palidrome")
}else{
    System.out.println("not palidrome")
}
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
```
