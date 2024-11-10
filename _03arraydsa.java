// to print all the elements 

import java.util.Scanner;

class Session12{
    public static void main(String[] args) {
        int [] arr={10,20,30,40};
        for(int i=0;i<arr.length;i++){
           System.out.println(arr[i]);
        }
    }
}

//to print sum of all the element(1st way for each loop in previous chapter)
class SumArray{
    public static void main(String[] args) {
        int [] arr={10,20,30,40,70};
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        System.out.println(sum);
    }
}

// if array is even no length then sum both half seprate
class SumArray1{
    public static void main(String[] args) {
        int [] arr={10,20,30,40,50,60};
        int sum1=0,sum2=0;
        int l=arr.length;
        for(int i=0;i<l/2;i++){
           sum1=sum1+arr[i];
        }
        System.out.println(sum1);
        for(int i=l/2;i<l;i++){
           sum2=sum2+arr[i];
        }
        System.out.println(sum2);
    }
}

// sum of positive and negative element and then multiply
class MulArray{
    public static void main(String[] args) {
        int [] arr={10,-20,-30,40};
        int possum=0,negsum=0;
        for(int i=0;i<arr.length;i++){
          if(arr[i]>0)
            possum=possum+arr[i];
            else
              negsum=negsum+arr[i];
        }
        System.out.println(possum*negsum*(-1));
    }
}

//sum of even and odd no and then multiply both sum
class MulArray1{
    public static void main(String[] args) {
        int [] arr={10,15,35,40};
        int evensum=0,oddsum=0;
        for(int i=0;i<arr.length;i++){
          if(arr[i]%2==0)
            evensum=evensum+arr[i];
            else
              oddsum=oddsum+arr[i];
        }
        System.out.println(evensum*oddsum);
    }
}

/*week-5
 * Q1 print max element of array
 */

 class MaxArray{
    public static void main(String[] args) {
        int[] arr={4,8,3,5,9,7};
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max)
               max=arr[i];
        }
        System.out.println(max);
    }
 }

 //Q2 print the sum of max no at even index element and odd index element
 class MaxArray1{
    public static void main(String[] args) {
        int[] arr={4,8,3,5,9,7};
        int evenmax=arr[0];
        int oddmax=arr[1];
        for(int i=2;i<arr.length;i++){
           if(i%2==0 && arr[i]>evenmax){
               evenmax=arr[i];
            }
            else{
                if(arr[i]>oddmax)
                  oddmax=arr[i];
            }
    }
    System.out.println(evenmax+oddmax);
 }
}

//Q3 print min element of array
class MinArray{
    public static void main(String[] args) {
        int[] arr={4,8,3,5,9,7};
        int min=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<min)
               min=arr[i];
        }
        System.out.println(min);
    }
 }

 //Q4 print the sum of min no at even index element and odd index element
 class MinArray1{
    public static void main(String[] args) {
        int[] arr={4,8,3,5,9,7};
        int evenmin=arr[0];
        int oddmin=arr[1];
        for(int i=2;i<arr.length;i++){
           if(i%2==0 && arr[i]<evenmin){
               evenmin=arr[i];
            }
            else{
                if(arr[i]<oddmin)
                  oddmin=arr[i];
            }
    }
    System.out.println(evenmin+oddmin);
 }
}

// session 15
//Q5 arr1{4,5,9,8,7} arr2{6,8,3,2,4} after arr2{10,13,12,10,11}
class Test{
    public static void main(String[] args) {
        int[] arr1={4,5,9,8,7};
        int[] arr2={6,8,3,2,4};
        for(int i=0;i<arr2.length;i++)
        {
            arr2[i]=arr1[i]+arr2[i];
            System.out.println(arr2[i]);
        }
    }
}

// Q6 arr1{4,5,9,8,7} arr2{2,6,7,5,9} after arr2{4,6,9,8,9}
class Test1{
    public static void main(String[] args) {
        int[] arr1={4,5,9,8,7};
        int[] arr2={2,6,7,5,9};
        for(int i=0;i<arr2.length;i++)
        {
           if(arr1[i]>arr2[i])
               arr2[i]=arr1[i];
         System.out.println(arr2[i]);
        }
    }
}

// Q7 arr1{4,5,9,8,7} arr2{2,6,7,5,9} after arr2{9,13,17,14,9}
class Test2{
    public static void main(String[] args) {
        int[] arr1={4,5,9,8,7};
        int[] arr2={2,6,7,5,9};
        for(int i=0;i<arr2.length-1;i++)
        {
           if(i%2==0)
             arr2[i]=arr1[i]+arr1[i+1];
           else
            arr2[i]=arr2[i]+arr2[i+1];
        }
        for(int i=0;i<arr2.length;i++){
            System.out.println(arr2[i]);
        }
    }
}

// session16
//Q8 arr={2,5,7,8,9} after arr={9,2,5,7,8}
class Session16{
    public static void main(String[] args) {
        int[] arr={2,5,7,8,9};
        int l=arr.length;
        int last=arr[l-1];
        for(int i=l-1;i>=1;i--){
            arr[i]=arr[i-1];
    }
    arr[0]=last;
    for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}

//Q8 arr={9,7,6,2,5} after arr={7,6,2,5,9}
class Session16_2{
    public static void main(String[] args) {
        int[] arr={9,7,6,2,5};
        int l=arr.length;
        int first=arr[0];
        for(int i=0;i<l-1;i++){
            arr[i]=arr[i+1];
    }
    arr[l-1]=first;
    for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}

//Q9 arr={9,7,6,2,5} after arr={6,2,5,9,7}
//my way
// class Session16_3{
//     static void left(int[] arr,int l){
//        int first=arr[0];
//        int second=arr[1];
//        for(int i=0;i<l-2;i++){
//         arr[i]=arr[i+2];
//        }
//        arr[l-1]=second;
//        arr[l-2]=first;
//     }

//     public static void main(String[] args) {
//         int[] arr={9,7,6,2,5};
//         int l=arr.length;
//         left(arr,l);
//         for(int i=0;i<arr.length;i++){
//             System.out.println(arr[i]);
//         }
//     }
// }
//sir way
class Session16_3{
    static void left(int[] arr,int l){
       int first=arr[0];
       for(int i=0;i<l-1;i++){
        arr[i]=arr[i+1];
       }
       arr[l-1]=first;
    }

    public static void main(String[] args) {
        int[] arr={9,7,6,2,5};
        int l=arr.length;
        Scanner s=new Scanner(System.in);
        System.out.println("enter number: ");
        int n=Integer.parseInt(s.nextLine());
        for(int i=1;i<=n;i++)
           left(arr,l);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}

//Q10 put the value of one array into another array
class Session17_1
{
  static int[] copy(int[] arr){
    int l=arr.length;
        int[] arr1= new int[l];
        for(int i=0;i<l;i++){
            arr1[i]=arr[i];
        }
        return arr1;
  }
  static void print(int[] arr){
       for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
  }
    public static void main(String[] args) {
        int[] arr={2,4,5,9,10,6};
        int[] arr1=copy(arr);
        print(arr);
        System.out.println();
        print(arr1);  
    }
}

//Q11 arr={-8,5,4,-7,,6} covert it into arr={5,4,9,6,-8,-7}
class Session17_2
{
    static void arrange(int[] arr){
        int  l=arr.length;
        int j=0;
         int[] extra= new int[l];
         for(int i=0;i<l;i++){
            if (arr[i]>0) {
                extra[j]=arr[i];
                j++;
            }
         }
         for(int i=0;i<l;i++){
            if (arr[i]<0) {
                extra[j]=arr[i];
                j++;
            }
         }
        for(int i=0;i<l;i++){
            arr[i]=extra[i];
        }
    }
    static void print(int[] arr){
       for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
  }
  public static void main(String[] args) {
    int[] arr={-8,5,4,-7,9,6};
    print(arr);
    arrange(arr);
    System.out.println();
    print(arr);
  }
}

//session-18
// sum the digit of a no. eg 136 1+3+6=10
class Session18_1
{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter number: ");
        int n=Integer.parseInt(s.nextLine());
        int sum=0;
        while (n>0) {
            int num=n%10;
            sum=sum+num;
            n=n/10;
        }
    System.out.println(sum);
    }
}

// replace the array element with the sum of digit of the index element
class Session18_2{
    static int sum(int n){
        int sum=0;
       while (n>0) {
            int num=n%10;
            sum=sum+num;
            n=n/10;
        }
        return sum;
    }
    static void replace(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sum(arr[i]);
        }
    }
     static void print(int[] arr){
       for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
     }
        public static void main(String[] args) {
            int[] arr={145,138,1457,658};
            print(arr);
            System.out.println();
            replace(arr);
            print(arr);
        }
    }

    // replace the array element with the no. of digit of the index element                                                                                               
class Session18_3{
    static int count(int n){
        int count=0;
       while (n>0) {
            count++;
            n=n/10;
        }
        return count;
    }
    static void replace(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            arr[i]=count(arr[i]);
        }
    }
     static void print(int[] arr){
       for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
     }
        public static void main(String[] args) {
            int[] arr={145,138,1457,658};
            print(arr);
            System.out.println();
            replace(arr);
            print(arr);
        }
    }
    //session 19 
    //Q reverse the no n=1234 then n=4321
    class Session19_1{
        static int reverse(int n){
            int result=0;
            while (n>0) {
                int num=n%10;
                result=result*10+num;
                n=n/10;
            }
            return result;
        }
        public static void main(String[] args) {
            Scanner s=new Scanner(System.in);
            System.out.println("enter number: ");
            int n=Integer.parseInt(s.nextLine());
            System.out.println(reverse(n));
        }
    }

    // replace array element with the reverse no of array element at index
    // arr{123,345,567} after arr{321,543,765}
    class Session19_2{
    static int reverse(int n){
            int result=0;
            while (n>0) {
                int num=n%10;
                result=result*10+num;
                n=n/10;
            }
            return result;
        }
    static void replace(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            arr[i]=reverse(arr[i]);
        }
    }
     static void print(int[] arr){
       for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
     }
        public static void main(String[] args) {
            int[] arr={543,25,689,4356,7};
            print(arr);
            System.out.println();
            replace(arr);
            print(arr);
        }
    }
    
// count zero in a no.
    class Session19_3{
        static int countZero(int n){
           int count=0;
           while (n>0) {
            int num=n%10;
            if (num==0) 
                count++;
            n=n/10;
           }
           return count;
        }
        public static void main(String[] args) {
            Scanner s=new Scanner(System.in);
            System.out.println("enter number: ");
            int n=Integer.parseInt(s.nextLine());
            System.out.println(countZero(n));       
        }
    }
//count the max no of zero in a array                                                         
class Session19_4{
    static int countZero(int n){
           int count=0;
           while (n>0) {
            int num=n%10;
            if (num==0) 
                count++;
            n=n/10;
           }
           return count;
        }
    static int MaxZero(int[] arr){
        int zero=0,max=0;
        for (int i = 0; i < arr.length; i++) {
            zero=countZero(arr[i]);
            if (zero>max) {
                max=zero;
            }
        }
        return max;
    }
    static void print(int[] arr){
       for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
     }
    public static void main(String[] args) {
        int[] arr={102,1040,1200,10200,7};
        print(arr);
        System.out.println();
        System.out.println(MaxZero(arr));
    }
}

//sum the max no of zero present  in a array                                                         
class Session19_5{
    static int countZero(int n){
           int count=0;
           while (n>0) {
            int num=n%10;
            if (num==0) 
                count++;
            n=n/10;
           }
           return count;
        }
    static int MaxZero(int[] arr){
        int zero=0,max=0;
        for (int i = 0; i < arr.length; i++) {
            zero=countZero(arr[i]);
           max=max+zero;
        }
        return max;
    }
    static void print(int[] arr){
       for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
     }
    public static void main(String[] args) {
        int[] arr={102,1040,1200,10200,7};
        print(arr);
        System.out.println();
        System.out.println(MaxZero(arr));
    }
}

//print element which have 2 zero
class Session19_6{
    static int countZero(int n){
           int count=0;
           while (n>0) {
            int num=n%10;
            if (num==0) 
                count++;
            n=n/10;
           }
           return count;
        }
    static void MaxZero(int[] arr){
        int zero=0;
        for (int i = 0; i < arr.length; i++) {
            zero=countZero(arr[i]);
            if (zero==2) {
                System.out.println(arr[i]);
            }
        }
        
    }
    static void print(int[] arr){
       for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
     }
    public static void main(String[] args) {
        int[] arr={102,1040,1200,10200,7};
        print(arr);
        System.out.println();
        MaxZero(arr);
    }
}


/* ASSIGMENT-1
A guy has to reach his home and does not want to be late. He takes train to reach home. He has a mental 
illness, so he always switches train at every station For eg Il he starts with train A then at station 2 
he will switch his train to train B and so on Similarly, if he starts with train B then he will switch to
 train A at station 2 and so on. Please help him to find the minimum total time he would take to reach
 his home.
Example 1:
Input:
N=3
A[]={2,1,2}
B[]={3, 2, 1}
Output:5
Explanation:
If he chose train A initially, then time to
reach home will be 2+2+2=6 reach home will be : 3+1+1=5
If he Chose train B initially, then time to
5 is minimum hence the answer */
class Session20_1
{
    static int minimumtime(int[] A,int[] B){
        int Sa=0,Sb=0;
        for (int i = 0; i < B.length; i++) {
            if (i%2==0) {
                Sa=Sa+A[i];
                Sb=Sb+B[i];
            } else {
                Sa=Sa+B[i];
                Sb=Sb+A[i];
            }
        }
        if (Sa<Sb) {
            return Sa;
        } else {
            return Sb;
        }
    }
    public static void main(String[] args) {
        int[] A={2,1,2};
        int[] B={3,2,1};
        System.out.println(minimumtime(A, B));
    }
}

/* ASSIGNMENT 2
An element is called a peak element if its value is not smaller than the value
of its adjacent elements (if they exists). Given an array arr[] of size N, find the index of any one of 
its peak elements.
Note: The generated output will always be 1 if the index that you return is correct. Otherwise output will
 be 0
Example 1:
Input:
N=3
arr[]= (1,2,3)
Output: 2
Explanations index 2 is 3. It is the peak element as it is greater than its neighbour 2.
Example 2:
Input:
N=2
arr[]={3,4}
Output:
1 Explanation: andex 1) is the peak elements greater than
it's only eighbour elerent 3. */
class Session20_2{
    static int peak(int[] arr){
        int l=arr.length;
        if (arr[0]>arr[1]) {
            return 0;
        }
        for (int i=1; i<l-1;i++) {
            if (arr[i]>arr[i-1]&& arr[i]>arr[i+1]) {
               return i;    
            }
        }
        if (arr[l-1]>arr[l-2]) {
            return l-1;
        }
        return 0;
    }
    public static void main(String[] args) {
        int [] arr={1,8,6,7,5};
        System.out.println(peak(arr));
    }
}

// session-21
//print all the peak element
class Session21_1{
    static void peak(int[] arr){
        int l=arr.length;
        if (arr[0]>arr[1]) {
            System.out.println(arr[0]);
        }
        for (int i=1; i<l-1;i++) {
            if (arr[i]>arr[i-1]&& arr[i]>arr[i+1]) {
               System.out.println(arr[i]);    
            }
        }
        if (arr[l-1]>arr[l-2]) {
            System.out.println(arr[l-1]);
        }
    }
    public static void main(String[] args) {
        int [] arr={2,1,4,6,5};
        peak(arr);
    }
}

// print all the element which is bigger then all the left side element
class Session21_2{
    static void leftMax(int[] arr){
        System.out.println(arr[0]);
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if (arr[i]>max) {
                System.out.println(arr[i]);
                max=arr[i];
            }
        }
    }
    public static void main(String[] args) {
        int[] arr={2,4,3,7,5,6};
        leftMax(arr);
    }
}