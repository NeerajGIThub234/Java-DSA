//                                  WEEK-8
//                                SESSION-39
// QUESTION SOLOVE BY COLLECTION FRAMEWORK
// IF A STRING CONTAINS SOME CHARACTER I/P=NEERAJ O/P=N=1,E=2,R=1,A=1,J=1
// import java.util.HashMap;
// import java.util.Map;
// class Test
// {
//     public static void main(String[] args) {
//         String s=args[0];
//         HashMap<Character,Integer> hm=new HashMap<Character,Integer>();
//         for(int i=0;i<s.length();i++){
//             char ch=s.charAt(i);
//             if (hm.containsKey(ch)==true) {
//                 hm.put(ch,hm.get(ch)+1);
//             } else {
//                 hm.put(ch, 1);
//             }
//         }
//         for(Map.Entry<Character,Integer> e:hm.entrySet())
//                System.out.println(e.getKey()+" "+e.getValue());
//     }
// }

/*Return maximum occurring character in an input string
Write an efficient function to return the maximum occurring character in the input string e.g., if the 
input string is "test" then the function should return 't'.
If there are multiple maximum occurring characters then return the first one. Input string only contains
a lowercase alphabet.
Ex:1
Input: "chandrapal"
Output: a
Ex:2
Input: "jaipur"
Output: j */
// class Test{
//     static char MaxChar(String s){
//         char[] ch=s.toCharArray();
//         int l=ch.length;
//         int max=0,t=0;
//         for(int i=0;i<l;i++){
//             int count=0;
//             for(int j=i+1;j<l;j++){
//                 if(ch[i]==ch[j]){
//                     count++;
//                 }
//             }
//             if (max<count) {
//                 max=count;
//                 t=i;
//             }
//         }
//         return ch[t];
//     }
//     public static void main(String[] args) {
//         String s="chandrapal";
//         String s1="jaipur";
//         String s2="neeraj";
//         System.out.println(MaxChar(s));
//         System.out.println(MaxChar(s1));
//         System.out.println(MaxChar(s2));
//     }
// }

// by hashmap
// import java.util.HashMap;
// class Test{
    
//     public static void main(String[] args) {
//         String s=args[0];
//         HashMap<Character,Integer> hm=new HashMap<Character,Integer>();
//         for(int i=0;i<s.length();i++){
//           char ch=s.charAt(i);
//           if (hm.containsKey(ch)==true) {
//                hm.put(ch,hm.get(ch)+1);
//            } else {
//              hm.put(ch, 1);
//             }
//         }
//         int max=0;
//         char result='A';
//         for(int i=0;i<s.length();i++){
//             char ch=s.charAt(i);
//             int value=hm.get(ch);
//             if (value>max) {
//                 max=value;
//                 result=ch;
//             }
//         }
//         System.out.println(result);
//     }
// }

//                                     SESSION-40
// java provide a inbulid class Arrays in java.util package and inside this provide a static method sort 
// which can sort array element
// import java.util.Arrays;
// class Test{
//     static void Print(int[] arr){
//         for (int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i]+" ");
//         }
//     }
//     static void Print1(char[] arr){
//         for (int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i]+" ");
//         }
//     }
//     public static void main(String[] args) {
//         int[] arr={10,8,9,2,28,89,9};
//         Print(arr);
//         System.out.println();
//         Arrays.sort(arr);
//         Print(arr);
//         System.out.println();
//         char[] ch={'a','b','s','z','c','A'};
//         Print1(ch);
//         System.out.println();
//          Arrays.sort(ch);
//         Print1(ch);
//     }
// }

/*Given two strings s1 and s2, check if both the strings are anagrams of each other.
Examples:
Input:
s1 ="listen"
s2 ="silent"
Output: The strings are anagrams
Input:
s1="dad"
s2 = "bad"
Output : The strings aren't anagrams */
// import java.util.Arrays;
// class Test{
//     static String anagrams(String s1,String s2){
//          if (s1.length()!=s2.length()) {
//             return "The strings aren't anagrams";
//         }
//         char[] ch1=s1.toCharArray();
//         char []ch2=s2.toCharArray();
//         Arrays.sort(ch1);
//         Arrays.sort(ch2);
//         for(int i=0;i<ch1.length;i++){
//             if (ch1[i]!=ch2[i]) {
//                 return "The strings aren't anagrams";
//             }
//         }
//         return  "The strings are anagrams";
//     }
//     public static void main(String[] args) {
//         String s1=args[0];
//         String s2=args[1];
//         System.out.println(anagrams(s1, s2));
//     }   
// }

//           by hashmap
// import java.util.Collection;
// import java.util.HashMap;
// class Test1{
//     static String anagrams(String s1,String s2){
//          if (s1.length()!=s2.length()) {
//             return "The strings aren't anagrams";
//         }
//         HashMap<Character,Integer> hm=new HashMap<Character,Integer>();
//         for(int i=0;i<s1.length();i++){
//             char ch=s1.charAt(i);
//             if (hm.containsKey(ch)==true) {
//                 hm.put(ch,hm.get(ch)+1);
//             } else {
//                 hm.put(ch, 1);
//             }
//         }
//         for(int i=0;i<s2.length();i++){
//             char ch=s2.charAt(i);
//             if(hm.containsKey(ch)==true)
//                   hm.put(ch,hm.get(ch)-1);
//             else
//                 return "The strings aren't anagrams";
//         }
//         Collection<Integer> l=hm.values();
//         for ( int ele : l) {
//             if (ele!=0) {
//                 return "The strings aren't anagrams";
//             }
//         }
//         return  "The strings are anagrams";
//     }
//     public static void main(String[] args) {
//         String s1=args[0];
//         String s2=args[1];
//         System.out.println(anagrams(s1, s2));
//     }   
// }

//                                     SESSION-41
/*Check if two strings are k-anagrams or not
Given two strings of towercase alphabets and a value K your task is to complete the given function which 
tells if two strings are K-anagrams of each other or not
Two strings are called Kanagrams both of the below conditions are true
1. Both have same number of character
2 Two strings can become snagram by changing at most Kcharacters in a string.
Example:
Input:
str = "fodr“, strz=""gork" k=2
Output:
The strings are anagrams
Explanation: Car Change fd to gk */
// import java.util.Collection;
// import java.util.HashMap;
// class Test{
//     static String Kanagrams(String s1,String s2,int k){
//          if (s1.length()!=s2.length()) {
//             return "The strings aren't kanagrams";
//         }
//         HashMap<Character,Integer> hm=new HashMap<Character,Integer>();
//         for(int i=0;i<s1.length();i++){
//             char ch=s1.charAt(i);
//             if (hm.containsKey(ch)==true) {
//                 hm.put(ch,hm.get(ch)+1);
//             } else {
//                 hm.put(ch, 1);
//             }
//         }
//         for(int i=0;i<s2.length();i++){
//             char ch=s2.charAt(i);
//             if(hm.containsKey(ch)==true)
//                   hm.put(ch,hm.get(ch)-1);
//         }
//         Collection<Integer> l=hm.values();
//         int sum=0;
//         for ( int ele : l) {
//              sum=sum+ele;
//         }
//         if (sum<=k) {
//             return "The strings are kanagrams";
//         }
//         else
//           return "The strings aren't kanagrams";
//     }
//     public static void main(String[] args) {
//         String s1=args[0];
//         String s2=args[1];
//         int k=Integer.parseInt(args[2]);
//         System.out.println(Kanagrams(s1, s2,k));
//     }   
// }

// PRINT PRIME FACTOR OF A NO
// I/P 120 O/P= 2,2,2,3,5
// I/P 121 O/P 11,11
// class Test{
//     static void primeFactor(int n){
//         while (n%2==0) {
//             System.out.println(2);
//             n=n/2;
//         }
//         for(int i=3;i*i<=n;i=i+2){
//             while (n%i==0) {
//                 System.out.println(i);
//                 n=n/i;
//             }
//         }
//         if (n>1) {
//             System.out.println(n);
//         }
//     }
//     public static void main(String[] args) {
//         int n=Integer.parseInt(args[0]);
//         primeFactor(n);
//     }
// }

// HCF(HIGHEST COMMON FACTOR) OR GCD(GREATEST COMMON DIVISOR)
// class Test{
//     static void HCF(int a,int b){
//         int x=a>b?a:b;
//         while (a%x!=0 || b%x!=0) {
//             x=x-1;
//         }
//         System.out.println(x);
//     }
//     public static void main(String[] args) {
//         int a=Integer.parseInt(args[0]);
//          int b=Integer.parseInt(args[1]);
//         HCF(a,b);
//     }
// }

//                                 SESSION-42
//HCF OPTIMIZE WAY
// class Test1{
//     static void HCF(int a,int b){
//         while (a>0 && b>0) {
//             if (a>b) {
//                 a=a%b;
//             } else {
//                 b=b%a;
//             }
//         }
//         if (a>0) {
//             System.out.println(a);
//         } else {
//             System.out.println(b);
//         }
//     }
//     public static void main(String[] args) {
//         int a=Integer.parseInt(args[0]);
//         int b=Integer.parseInt(args[1]);
//         HCF(a,b);
//     }
// }

// find LCM (LEAST COMMON MULTIPLE)
// class Test{
//     static void LCM(int a, int b)
//     {
//         int max=a>b?a:b;
//         int min=a>b?b:a;
//         int c=2,x=max;
//         // while (max%min!=0) {
//         //     max=x*c;
//         //     c++;
//         // }
//         for(int i=2;max%min!=0;i++)
//               max=x*i;
//         System.out.println(max);
//     }
//     public static void main(String[] args) {
//         int a=Integer.parseInt(args[0]);
//         int b=Integer.parseInt(args[1]);
//         LCM(a,b);
//     }
// }

// optimize way of lcm
// class Test{
//     static int HCF(int a,int b){
//         int hcf=0;
//         while (a>0 && b>0) {
//             if (a>b) {
//                 a=a%b;
//             } else {
//                 b=b%a;
//             }
//         }
//         if (a>0) {
//            return hcf=a;
//         } else {
//            return hcf=b;
//         }  
//     }
//     static void LCM(int a,int b){
//         int hc=HCF(a, b);
//         int lcm=(a*b)/hc;
//         System.out.println(lcm);
//     }
//     public static void main(String[] args) {
//         int a=Integer.parseInt(args[0]);
//         int b=Integer.parseInt(args[1]);
//         LCM(a,b);
//     }
// }

// print unique character of name
// i/p=neeraj o/pn,r,a,j
// import java.util.HashMap;
// import java.util.Map;
// class Test
// {
//     public static void main(String[] args) {
//         String s=args[0];
//         HashMap<Character,Integer> hm=new HashMap<Character,Integer>();
//         for(int i=0;i<s.length();i++){
//             char ch=s.charAt(i);
//             if (hm.containsKey(ch)==true) {
//                 hm.put(ch,hm.get(ch)+1);
//             } else {
//                 hm.put(ch, 1);
//             }
//         }
//         for(Map.Entry<Character,Integer> e:hm.entrySet()){
//             if (e.getValue()==1) {
//                 System.out.print(e.getKey()+" ");
//             }
//         }
//     }
// }

//                                  SESSION-43
// print binary of any number
// class Test{
//     static String decimalBinary(int n){
//        StringBuffer result=new StringBuffer();
//        while (n!=1) {
//         result.append(n%2);
//         n=n/2;
//        }
//        result.append(1);
//        result.reverse();
//        return new String(result);
//     }
//     public static void main(String[] args) {
//         int n=Integer.parseInt(args[0]);
//        System.out.println(decimalBinary(n));
//     }
// }

// java also provide a static method present inside Integer class it is toBinaryString()
// class Test{
//     public static void main(String[] args) {
//         int n=Integer.parseInt(args[0]);
//         String result=Integer.toBinaryString(n);
//         System.out.println(result);
//     }
// }

// binary to decimal
// class Test{
//     static int binaryDecimal(String s){
//         int sum=0,k=1;
//         for(int i=s.length()-1;i>=0;i--){
//             char ch=s.charAt(i);
//             int x=ch-'0';
//             sum=sum+x*k;
//             k=k*2;
//         }
//         return sum;
//     }
//     public static void main(String[] args) {
//         String s=args[0];
//         System.out.println(binaryDecimal(s));
//     }
// }

//                                  SESSAION-44
// print 2d array element by row and cloun wise
// class Test{
//     static void printRow(int[][] arr,int m,int n){
//         for(int i=0;i<m;i++){
//             for(int j=0;j<n;j++){
//                 System.out.print(arr[i][j]+" ");
//             }
//             System.out.println();
//         }
//     }
//     static void printColumn(int[][] arr,int m,int n){
//         for(int i=0;i<n;i++){
//             for(int j=0;j<m;j++){
//                 System.out.print(arr[j][i]+" ");
//             }
//             System.out.println();
//         }
//     }
//     public static void main(String[] args) {
//         int[][] arr={{10,20,30},{40,50,60},{70,80,90},{100,110,120}};
//         int m=4,n=3;
//         printRow(arr,m,n);
//         printColumn(arr, m, n);
//     }
// }

// by taking input from user print 2d array element
// import java.util.Scanner;
// class Test1{
//     static void printRow(int[][] arr,int m,int n){
//         for(int i=0;i<m;i++){
//             for(int j=0;j<n;j++){
//                 System.out.print(arr[i][j]+" ");
                
//             }
//             System.out.println();
//         }
//     }
//     public static void main(String[] args) {
//         int m=4,n=3;
//         int[][] arr=new int[m][n];
//         Scanner s=new Scanner(System.in);
//         for(int i=0;i<m;i++){
//             for(int j=0;j<n;j++){
//                 System.out.print("enter number: ");
//                 arr[i][j]=s.nextInt();
//             }
//         }
//         printRow(arr,m,n);
//     }
// }

// print diogonal element
// class Test{
//     static void printDiogonal(int[][] arr,int m,int n){
//         for(int i=0;i<m;i++){
//             for(int j=0;j<n;j++){
//                 if (i==j) {
//                     System.out.print(arr[i][j]+" ");
//                 }
//             }
//         }
//     }
//     public static void main(String[] args) {
//         int[][] arr={{10,20,30},{40,50,60},{70,80,90}};
//         int m=3,n=3;
//         printDiogonal(arr, m, n);
//     }
// }

// 2way
// class Test1{
//     static void printDiogonal(int[][] arr,int m,int n){
//         for(int i=0;i<n;i++){
//                 System.out.print(arr[i][i]+" ");
//         }
//     }
//     public static void main(String[] args) {
//         int[][] arr={{10,20,30},{40,50,60},{70,80,90}};
//         int m=3,n=3;
//         printDiogonal(arr, m, n);
//     }
// }

// reverse diogonal
// class Test{
//     static void printRevDiogonal(int[][] arr,int m,int n){
//         int j=n-1;
//         for(int i=0;i<m;i++){
//             System.out.println(arr[i][j]);
//             j--;
//         }
//     }
//     public static void main(String[] args) {
//         int[][] arr={{10,20,30},{40,50,60},{70,80,90}};
//         int m=3,n=3;
//         printRevDiogonal(arr, m, n);
//     }
// }

//                                   SESSION-45
/*WAP to print the below pattern using for/while loop.
Suppose a user enter a value 9586, then your pattern should be look like as below.
*   
* *
* *
* **
****
****
****
****
****
Note: Do not use Array, String or any Collections*/
// class Test
// {
//    static void drawPattern(int n){
//     int rev=0,l=0,md=0,ld;
//     while (n>0) {
//         ld=n%10;
//         if (ld>md) 
//             md=ld;
//         n=n/10;
//         l++;
//         rev=rev*10+ld;
        
//     }
//     for(int i=md;i>=1;i--){
//         int temp=rev;
//         for(int j=1;j<=l;j++){
//             ld=temp%10;
//             temp=temp/10;
//             if (ld>=i) {
//                 System.out.print("*");
//             }
//             else{
//                 System.out.print(" ");
//             }
//         }
//         System.out.println();
//     }
//    }
//     public static void main(String[] args) {
//         int n=Integer.parseInt(args[0]);
//         drawPattern(n);
//     }
// }

//                                           SESSION-46
// union of 2 sorted array
// by array
// class Test{
//   static int[] unionSubArray(int[] arr1,int []arr2,int m,int n){
//     int result[]=new int[m+n];
//     int i=0,j=0,k=0;
//     while (i<m && j<n) {
//         if (arr1[i]<arr2[j]) {
//             result[k]=arr1[i];
//             i++;
//             k++;
//         } else if(arr2[j]<arr1[i]) {
//             result[k]=arr2[j];
//             j++;
//             k++;
//         }
//         else{
//             result[k]=arr1[i];
//             i++;
//             j++;
//             k++;
//         }
//     }
//     while (i<m) {
//         result[k]=arr1[i];
//         k++;
//         i++;       
//     }
//     while (j<n) {
//         result[k]=arr2[j];
//         j++;
//         k++;
//     }
//     return result;
//   }
//     public static void main(String[] args) {
//         int[] arr1={1,3,8,11,13,15};
//         int[] arr2={2,4,6,8,9,10};
//         int m=arr1.length;
//         int n=arr2.length;
//         int[] result=unionSubArray(arr1,arr2,m,n);
//         for(int i=0;i<result.length;i++)
//             System.out.print(result[i]+" ");
//     }
// }

// by ArrayList
// import java.util.ArrayList;
// class Test{
//   static ArrayList<Integer> unionSubArray(int[] arr1,int []arr2,int m,int n){
//     ArrayList<Integer> l=new ArrayList<Integer>();
//     int i=0,j=0;
//     while (i<m && j<n) {
//         if (arr1[i]<arr2[j]) {
//             l.add(arr1[i]);
//             i++;
//         } else if(arr2[j]<arr1[i]) {
//             l.add(arr2[j]);
//             j++;
//         }
//         else{
//             l.add(arr1[i]);
//             i++;
//             j++;
//         }
//     }
//     while (i<m) {
//         l.add(arr1[i]);
//         i++;       
//     }
//     while (j<n) {
//         l.add(arr2[j]);
//         j++;
//     }
//     return l;
//   }
//     public static void main(String[] args) {
//         int[] arr1={1,3,8,11,13,15};
//         int[] arr2={2,4,6,8,9,10};
//         int m=arr1.length;
//         int n=arr2.length;
//         ArrayList<Integer> result=unionSubArray(arr1,arr2,m,n);
//         System.out.println(result);
//     }
// }

//give an array of N integers. Find the contigous subarray with maximum sum
//i/p arr[]={1,2,3,-2,5} o/p=9
//i/p arr1[]={-1,-2,-3,-4} o/p=-1
//i/p arr2[]={-1,5,2,-1} o/p=7
// class Test{
//     static int maxSubArray(int[] arr){
//         int max_sum=Integer.MIN_VALUE;
//         int sum=0,n=arr.length;
//         for(int i=0;i<n;i++){
//             sum=sum+arr[i];
//             if (sum>max_sum) {
//                 max_sum=sum;
//             }
//             if(sum<0){
//                 sum=0;
//             }
//         }
//         return max_sum;
//     }
//     public static void main(String[] args) {
//         int arr[]={1,2,3,-2,5};
//         int arr1[]={-1,-2,-3,-4};
//         int arr2[]={-1,5,2,-1};
//         System.out.println(maxSubArray(arr));
//         System.out.println(maxSubArray(arr1));
//         System.out.println(maxSubArray(arr2));
//     }
// }

//                                        SESSION-47
/*Generate string by incrementing character of given string by number present at corresponding index of
second string
Given two strings S[] and N[] of the same size, the task is to update string S[] by adding the digit of 
string N[] of respective indices.
Examples:
Input: S="sun", N="966"
Output: bat
Input: S="apple", N="12580"
Output: brute */
// class Test{
//   static String addString(String S,String N){
//     StringBuffer sb=new StringBuffer();
//     for(int i=0;i<S.length();i++){
//         int a=S.charAt(i);
//         int b=N.charAt(i)-'0';
//         int c=a+b;
//         if (c>122) {
//             c=c-26;
//         }
//         sb.append((char)c);
//     }
//     String result=new String(sb);
//     return result;
//   }
//     public static void main(String[] args) {
//         String S=args[0];
//         String N=args[1];
//         System.out.println(addString(S,N));
//     }
// }

// Q2

//Q3


//                                           SESSION-48
/*Given a int N representing a positive number. The task is to round N to the nearest multiple of 10. 
Note: If you are having two multiple equally apart from N then we will choose the smallest element among
them.
Example 1:
Input: N = 15
Output: 10
Explanation:
Here N is 15. So, the number which is multiple of 10 are 20, 20, 30. We can see 10 and 20 are equally
distant from 20. So, we will choose the smallest element among them Le., 10.
Example 2:
Input N= 29
Output: 30 */
// class Test{
//     static int nearMultiple10(int n){
//         int i=n%10;
//         int k;
//         if (i<=5) {
//             k=n-i;
//             return k;
//         } else {
//             k=10-i;
//             n=n+k;
//             return n;
//         }

//     }
//     public static void main(String[] args) {
//         int n=Integer.parseInt(args[0]);
//         System.out.println(nearMultiple10(n));
//     }
// } 

/* Given an array arr[] containing positive elements. 'A' and 'B' are two numbers defining a range. 
The task is to check if the array contains all elements in the given range.
Example 1:

Input: N = 7, A = 2, B = 5
Output: Yes
arr[] = (1, 4, 5, 2, 7, 8, 3}) Explanation: It has elements between range 2-5 1.e 2,3,4,5
Example 2:
Input: N = 7, A = 2, B = 6 arril (1, 4, 5, 2, 7, 8, 3)
Output: No
Explanation: Array does not contain 6.*/
// class Test {
//    static String checkRange(int []arr,int a,int b){
//     int flag;
//     for(int i=a;i<=b;i++){
//         flag=0;
//         for (int j = 0; j < arr.length; j++) {
//             if (arr[j]==i) {
//                 flag=1;
//                 break;
//             }
//         }
//         if (flag==0) {
//             return "no";
//         }
//     }
//     return "yes";
// }
//     public static void main(String[] args) {
//         int[] arr={1,4,5,2,7,8,3};
//         int a=2,b=5;
//         System.out.println(checkRange(arr,a,b));
//         int[] arr1={1,4,5,2,7,8,3};
//         int a1=2,b1=6;
//         System.out.println(checkRange(arr1,a1,b1));
//     }
// }

// by hashset
// import java.util.HashSet;
// class Test1 {
//    static String checkRange(int []arr,int a,int b){
//    HashSet<Integer> hs=new HashSet<Integer>();
//    for (int ele : arr) {
//     hs.add(ele);
//     }
//     for(int i=a;i<=b;i++){
//         if (hs.contains(i)==false) {
//             return "no";
//         }
//     }    
//    return "yes";
// }
//     public static void main(String[] args) {
//         int[] arr={1,4,5,2,7,8,3};
//         int a=2,b=5;
//         System.out.println(checkRange(arr,a,b));
//         int[] arr1={1,4,5,2,7,8,3};
//         int a1=2,b1=6;
//         System.out.println(checkRange(arr1,a1,b1));
//     }
// }

/*Given an array of positive integers. Find the length of the longest subsequence such that elements in 
the subsequence are consecutive integers, the consecutive numbers can be in any order.
Example 1:
Input:
N=7
arr ={2,6,1,9,4,5,3}
Output:
6
Explanation:
The consecutive numbers here are 1, 2, 3, 4, 5, 6. These 6 numbers form the longest consecutive 
subsequence.
Example 2:
Input:
N 7
arr1[]= {1,9,3,10,4,20,2}
O utput:
4 */
// import java.util.HashSet;
// class Test{
//     static int longestSubSequence(int[] arr){
//         HashSet<Integer> hs=new HashSet<Integer>();
//         for ( int ele : arr) {
//             hs.add(ele);
//         }
//         int max=0,ele;
//         for (int i = 0; i < arr.length; i++) {
//             if (hs.contains(arr[i]-1)==false) {
//                 ele=arr[i];
//                 while (hs.contains(ele)==true) {
//                     ele++;
//                 }
//             if (ele-arr[i]>max) {
//                 max=ele-arr[i];
//                 }
//             }
//         }
//         return max;
//     }
//     public static void main(String[] args) {
//         int[] arr ={2,6,1,9,4,5,3};
//         System.out.println(longestSubSequence(arr));
//         int arr1[]= {1,9,3,10,4,20,2};
//         System.out.println(longestSubSequence(arr1));
//         int[] arr2={10,8,9,11,2,3,4};
//         System.out.println(longestSubSequence(arr2));
//     }
// }

//                                              SESSION-49
/*Find if there is a subarray with 0 sum
Given an array of positive and negative numbers, find if there is a subarray (of size at-least one) with 
0 sum.
Input: (4, 2, -3, 1, 6)
Output: true
Explanation:
There is a subarray with zero sum from index 1 to 3.
Input: (4, 2, 0, 1, 6)
Output: true
Explanation:
The third element is zero. A single element is also a sub-array.
Input: (-3, 2, 3, 1, 6)
Output: false */
// import java.util.HashSet;
// class Test{
//     static boolean zeroSumSubArray(int[] arr){
//         int sum=0;
//         HashSet<Integer> hs=new HashSet<Integer>();
//         for (int i = 0; i < arr.length; i++) {
//             sum=sum+arr[i];
//             if (sum==0 || hs.contains(sum)==true || arr[i]==0) {
//             return true;
//            }
//            hs.add(sum);
//         }
//         return false;
//     }
//     public static void main(String[] args) {
//         int arr[]={4, 2, -3, 1, 6};
//         int arr1[]={4, 2, 0, 1, 6};
//         int arr2[]={-3, 2, 3, 1, 6};
//         System.out.println(zeroSumSubArray(arr));
//         System.out.println(zeroSumSubArray(arr1));
//         System.out.println(zeroSumSubArray(arr2));
        
//     }
// }

/*You are given a string which contains lowercase alphabets only. You need to find the first non repeating
character from the string
Input: chandrapalch Output: n
Input: jaijai Output: */
// import java.util.HashMap;
// class Test{
//     static char nonRepeatchar(String s){
//         HashMap<Character,Integer> hm=new HashMap<Character,Integer>();
//         for(int i=0;i<s.length();i++){
//             char ch=s.charAt(i);
//             if (hm.containsKey(ch)==true) {
//                 hm.put(ch, hm.get(ch)+1);
//             } else {
//                 hm.put(ch, 1);
//             }
//         }
//         for(int i=0;i<s.length();i++){
//             char ch=s.charAt(i);
//             if (hm.get(ch)==1) {
//                 return ch;
//             }
//         }
//     return ' ';
//     }
//     public static void main(String[] args) {
//         String s=args[0];
//         System.out.println(nonRepeatchar(s));
//     }
// }