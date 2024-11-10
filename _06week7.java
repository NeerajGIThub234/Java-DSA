//                                          WEEK-6
// check wheteher a no is prime no or not
// class Test{
//     static String primeNo(int n){
//         for(int i=2;i<n;i++){
//             if (n%i==0) {
//              return "it is not a prime no";   
//             }
//         }
//         return "it is a prime no";
//     }
//     public static void main(String[] args) {
//         int n=Integer.parseInt(args[0]);
//         String result = primeNo(n);
//         System.out.println(result);
//     }
// }

// class Test1{
//     static String primeNo(int n){
//         for(int i=2;i*i<=n;i++){
//             if (n%i==0) {
//              return "it is not a prime no";   
//             }
//         }
//         return "it is a prime no";
//     }
//     public static void main(String[] args) {
//         int n=Integer.parseInt(args[0]);
//         String result = primeNo(n);
//         System.out.println(result);
//     }
// }

//                                      WEEK-7
//                 SESSION-30
// check prime no between 10 to 29
// class Test{
//     static boolean checkPrime(int n){
//         for(int i=2;i*i<=n;i++){
//             if (n%i==0) {
//              return false;   
//             }
//         }
//         return true;
//     }
//     static void generatePrime(int a,int b){
//           for( int i=a;i<=b;i++){
//             if (checkPrime(i)==true) {
//                 System.out.println(i);
//             }
//         }
//     }
//     public static void main(String[] args) {
//         int a=Integer.parseInt(args[0]);
//         int b=Integer.parseInt(args[1]);
//         generatePrime(a, b);
//     }
// }

// CHECK PRIME NO ON AN ARRAY
// class Test{
//     static boolean checkPrime(int n){
//         for(int i=2;i*i<=n;i++){
//             if (n%i==0) {
//              return false;   
//             }
//         }
//         return true;
//     }
//     static void generatePrime(int[] arr){
//           for( int i=0;i<arr.length;i++){
//             if (checkPrime(arr[i])==true) {
//                 System.out.println(arr[i]);
//             }
//         }
//     }
//     public static void main(String[] args) {
//         int[] arr={10,17,23,85,19};
//         generatePrime(arr);
//     }
// }

// give maximum differnce between two array element
// class Test{
//     static int maxDiffernce(int[] arr){
//         int l=arr.length;
//         int max=Integer.MIN_VALUE;
//         for (int i=0;i<l;i++) {
//             for (int j=0;j<l;j++) {
//                 if (i!=j&&arr[i]-arr[j]>max) {
//                     max=arr[i]-arr[j];
//                 }
//             }
//         }
//         return max;
//     }
//     public static void main(String[] args) {
//         int[] arr={5,29,40,25,39,15};
//         System.out.println(maxDiffernce(arr));
//     }

// }

// optimize way
// class Test1{
//     static int maxDiffernce(int[] arr){
//         int l=arr.length;
//         int max=Integer.MIN_VALUE;
//         for (int i=0;i<l;i++) {
//             for (int j=i+1;j<l;j++) {
//                 if (Math.abs(arr[i]-arr[j])>max) {
//                     max=Math.abs(arr[i]-arr[j]);
//                 }
//             }
//         }
//         return max;
//     }
//     public static void main(String[] args) {
//         int[] arr={5,29,40,25,39,15};
//         System.out.println(maxDiffernce(arr));
//     }
// }

// to reduce complexity
// class Test2{
//     static int maxDiffernce(int[] arr){
//         int l=arr.length;
//         int max=arr[0],min=arr[0];
//         for (int i=0;i<l;i++) {
//             if (arr[i]>max) {
//                 max=arr[i];
//             }
//             else if(arr[i]<min){
//                 min=arr[i];
//             }
//         }
//         return max-min;
//     }
//     public static void main(String[] args) {
//         int[] arr={5,29,40,25,39,15};
//         System.out.println(maxDiffernce(arr));
//     }
// }

//                                    SESSION 31
//in a range  find element which is not present in array
// class Test{
//     static int missingNO(int[] arr,int a,int b){
//         int l=arr.length,j;
//         for(int i=a;i<=b;i++){
//             for(j=0;j<l;j++){
//                 if (arr[j]==i) {
//                     break;
//                 } 
//             }
//             if (j==l) {
//                 return i;
//             }
//         }
//         return -1;
//     }
//     public static void main(String[] args) {
//         int[] arr={13,11,12,10,15};
//         int a=10,b=15;
//         System.out.println(missingNO(arr,a,b));
//         int[] arr1={9,8,10,7,5};
//         int a1=5,b1=10;
//         System.out.println(missingNO(arr1, a1, b1));
//         int[] arr2={9,8,7,11,6,10,15,13,14};
//         int a2=6,b2=15;
//         System.out.println(missingNO(arr2, a2, b2));
//     }
// }

// to reduce time complexity
// class Test{
//     static int missingNO(int[] arr,int a,int b){
//         int l=arr.length;
//         int n=b-a+1,d=1,sum=0;
//         int sum1=(n/2)*(2*a+(n-1)*d);
//             for(int j=0;j<l;j++){
//                sum=sum+arr[j];
//             }
//          return sum1-sum;
//         }
//     public static void main(String[] args) {
//         int[] arr={13,11,12,10,15};
//         int a=10,b=15;
//         System.out.println(missingNO(arr,a,b));
//         int[] arr1={9,8,10,7,5};
//         int a1=5,b1=10;
//         System.out.println(missingNO(arr1, a1, b1));
//         int[] arr2={9,8,7,11,6,10,15,13,14};
//         int a2=6,b2=15;
//         System.out.println(missingNO(arr2, a2, b2));
//     }
// }

/*Find an element in array such that sum of left array is equal to sum of right array
Given, an array of size n. Find an element that divides the array into two sub-arrays with equal sums.
Examples:
Input: 1 4 2 5
Output: 2
Explanation: If 2 is the partition, subarrays are: (1, 4) and (5)
Input: 2 3 4 1 4 5
Output: 1
Explanation: If 1 is the partition, Subarrays are (2, 3, 4) and (4, 5)
Expected Time Complexity: O(n)
Expected Auxiliary Space: O(n)
 */
// class Test{
//     static int checkSum(int[] arr){
//         int l=arr.length;
//         for(int i=0;i<l;i++){
//            int lsum=0,rsum=0;
//            for(int j=0;j<=i-1;j++){
//             lsum=lsum+arr[j];
//            }
//            for(int k=i+1;k<=l-1;k++){
//             rsum=rsum+arr[k];
//            }
//            if (lsum==rsum) {
//                return arr[i];
//            }
//         }
//         return 0;
//     }
//     public static void main(String[] args) {
//         int[] arr={1,4,2,5};
//         System.out.println(checkSum(arr));
//         int[] arr1={2,3,4,1,4,5};
//         System.out.println(checkSum(arr1));
//     }
// }

//                             SESSION-32
// REDUCE TIME COMPLEXITY
// class Test{
//     static int checkSum(int[] arr){
//         int l=arr.length;
//         int lsum=0,rsum=0;
//         for(int i=0;i<l;i++){
//            rsum=rsum+arr[i];
//         }
//         for(int j=0;j<l;j++){
//             rsum=rsum-arr[j];
//             if(lsum==rsum)
//                  return arr[j];
//             lsum=lsum+arr[j];
//         }
//         return 0;
//     }
//     public static void main(String[] args) {
//         int[] arr={1,4,2,5};
//         System.out.println(checkSum(arr));
//         int[] arr1={2,3,4,1,4,5};
//         System.out.println(checkSum(arr1));
//     }
// }

// pattern
/*
s#########
ss#######
sss#####
ssss###
sssss#
 */
// class Test{
//     public static void main(String[] args) {
//         int n=Integer.parseInt(args[0]);
//         for(int i=n;i>0;i--){
//             for(int j=0;j<n-i+1;j++){
//                 System.out.print("s");
//             }
//             for(int k=0;k<2*i-1;k++){
//                 System.out.print("#");
//             }
//             System.out.println();
//         }
//     }
// }

// class Test1{
//     public static void main(String[] args) {
//         int n=Integer.parseInt(args[0]);
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=2*n-i+1;j++){
//                 if (j<=i) {
//                     System.out.print("s");
//                 } else {
//                     System.out.print("#");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }

//find the element who is smallest in his left side and biggest in right side
// class Test{
//     static int leftRight(int[] arr){
//         int l=arr.length;
//         for(int i=1;i<l-1;i++){
//             int min=arr[0];
//             int max=arr[i+1];
//             for(int j=1;j<i-1;j++){
//                 if(arr[j]<min)
//                     min=arr[j];
//             }
//             for(int k=i+2;k<l;k++){
//                 if (arr[k]>max) {
//                      max=arr[k];
//                 }
//             }
//             if (arr[i]<min && arr[i]>max) {
//                 return arr[i];
//             }
//         }
//         return 0;
//     }
//     public static void main(String[] args) {
//         int[] arr={10,9,12,7,2,4};
//         System.out.println(leftRight(arr));
//     }
// }

//                                  SESSION 32
// create an array with the help of an array and this new array have element right max element of old array
// old array={5,9,7,12,11,10}   new array={12,12,12,11,10}
// class Test{
//     static void rightMax(int[] arr){
//         int l=arr.length;
//         int[] extra=new int[l];
//         extra[l-1]=arr[l-1];
//         for(int i=l-2;i>=0;i--){
//             extra[i]=arr[i]>extra[i+1]?arr[i]:extra[i+1];
//         }
//         for (int i = 0; i < extra.length; i++) {
//             System.out.println(extra[i]);
//         }
//     }
//     public static void main(String[] args) {
//         int[] arr={5,9,7,12,11,10};
//         rightMax(arr);
//     }
// }

/*Find a pair with maximum product in array of Integers
Given an array with both +ive and -ive integers, return a pair with the highest product.
Input: arr[] = (1, 4, 3, 6, 7, 0}
Output: (6,7}
Input: arr[]=(-1, -3, -4, 2, 0, -5}
Output: (-4,-5) */
// class Test{
//     static void maxProduct(int[] arr){
//         int l=arr.length;
//         int max=1,a=0,b=0;
//         for(int i=0;i<l-1;i++){
//             for (int j=i+1;j<l;j++) {
//                 if (arr[i]*arr[j]>max) {
//                     max=arr[i]*arr[j];
//                     a=arr[i];
//                     b=arr[j];
//                 }
//             }
//         }
//         System.out.println(a);
//         System.out.println(b);
//     }
//     public static void main(String[] args) {
//         int arr[] = {1, 4, 3, 6, 7, 0};
//         maxProduct(arr);
//         int arr1[]={-1, -3, -4, 2, 0, -5};
//         maxProduct(arr1);
//     }
// }

/*Conversion Of Array

Given an array Arr (distinct elements) of size N. Rearrange the elements of array in zig-zag fashion.
The converted array should be in form a <b> c<d>e<f. The relative order of elements is the same In the 
output i.e you have to iterate on the original array only.
Example 1:
Input:
N=7
Arz[] = (4, 3, 8, 6, 2, 1)
Output: 3 7 4 8 2 6 1 Explanation: 3<7>4<8>2<6>1
Example 2:
Input
N=4
Arr[] = (1, 4, 3,
Output:1 4 2 3
Explanation: 1<4>2<3
Your Task:
Your task is to write the function zigzag) which takes the array of integers arr and n as parameters and
returns void. You need to modify the array itself.
Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1) */
// class Test{
//     static void zigzag(int[] arr){
//         boolean flag=true;
//         int l=arr.length;
//         for(int i=0;i<l-1;i++){
//             if (flag==true) {
//                 if (arr[i+1]<arr[i]) {
//                     int temp=arr[i];
//                     arr[i]=arr[i+1];
//                     arr[i+1]=temp;
//                 }
//             }
//             else{
//                 if (arr[i+1]>arr[i]) {
//                     int temp=arr[i];
//                     arr[i]=arr[i+1];
//                     arr[i+1]=temp;
//                 }
//             }
//             flag=!flag;
//         }
//         for (int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i]+" ");
//         }
//     }
//     public static void main(String[] args) {
//         int Arz[] = {4, 3, 7,8, 6, 2, 1};
//         zigzag(Arz);
//         System.out.println();
//         int Arr[] = {1, 4, 3,2};
//         zigzag(Arr);
//     }
// }