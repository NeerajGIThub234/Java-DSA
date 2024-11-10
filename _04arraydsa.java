// WEEK 6
// session 22
//print duolicate element
// class Test {
//     static void findDuplicate(int[] arr){
//         int l=arr.length;
//         for(int i=0;i<l-1;i++){
//             for(int j=i+1;j<l;j++) {
//                 if(arr[i]==arr[j])
//                 {
//                     System.out.println(arr[i]);
//                     break;
//                 }
//             }
//         }
//     }
//     public static void main(String[] args) {
//         int[] arr={5,3,2,5,3,4,2};
//         findDuplicate(arr);
//     }
// }

// sum all the right side element of a array
// class Test {
//     static void rightSum(int[] arr){
//         int l=arr.length;
//         for(int i=0;i<l;i++){
//             int x=0;
//             for(int j=i+1;j<l;j++) {
//                      x=arr[j]+x;
//                 }
//             System.out.println(x);
//             }
//         }
//     public static void main(String[] args) {
//         int[] arr={5,9,8,7,4,11};
//         rightSum(arr);
//     }
// }

// SESSION 23
//print sum of all the left side element
// class Test {
//     static void leftSum(int[] arr){
//         int l=arr.length;
//         for(int i=0;i<l;i++){
//             int x=0;
//             for(int j=i-1;j>=0;j--) {
//                      x=arr[j]+x;
//                 }
//             System.out.println(x);
//             }
//         }
//     public static void main(String[] args) {
//         int[] arr={10,8,15,4,3,9};
//         leftSum(arr);
//     }
// }

// same question with one loop
// class Test1{
//     static void leftSum(int[] arr){
//         int l=arr.length;
//         int sum=0;
//         for(int i=0;i<l;i++){
//             System.out.println(sum);
//             sum=sum+arr[i];
//         }
//     }
//     public static void main(String[] args) {
//         int[] arr={10,8,15,4,3,9};
//         leftSum(arr);
//     }
// }
 
//print the pair in array which sum is 18
// class Test{
//     static void pair18(int[] arr){
//         int l=arr.length;
//         for(int i=0;i<l-1;i++){
//             for(int j=i+1;j<l;j++){
//             if (arr[i]+arr[j]==18) {
//                 System.out.println(arr[i]+" "+arr[j]);
//             }
//             }
//         }
//     }
//     public static void main(String[] args) {
//         int[] arr={10,8,15,4,3,9};
//         pair18(arr);
//     }
// }

// SESSION 24
// print sum of even no of element present at left side
// class Test{
//     static void leftEvenSum(int[] arr){
//         int l=arr.length;
//         int sum=0;
//         for(int i=0;i<l-1;i++){
//             System.out.println(sum);
//             if (arr[i]%2==0) {
//                 sum=sum+arr[i];
//             }
//         }
//         System.out.println(sum);
//     }
//     public static void main(String[] args) {
//         int[] arr={10,3,6,9,8,16};
//         leftEvenSum(arr);
//     }
// }

// class Test1 {
//     static void leftEvenSum(int[] arr){
//         int l=arr.length;
//         for(int i=0;i<l;i++){
//             int x=0;
//             for(int j=i-1;j>=0;j--) {
//                      if (arr[j]%2==0) {
//                         x=arr[j]+x;
//                      }
//                 }
//             System.out.println(x);
//             }
//         }
//     public static void main(String[] args) {
//         int[] arr={10,3,6,9,8,16};
//         leftEvenSum(arr);
//     }
// }

// print sum of all the element except on which element we present
// class Test{
//     static void sum(int[] arr){
//         int l=arr.length;
//         for(int i=0;i<l;i++){
//             int sum=0;
//             for(int j=0;j<l;j++){
//                 if(i!=j){
//                     sum=sum+arr[j];
//                 }
//             }
//             System.out.println(sum);
//         }
//     }
//     public static void main(String[] args) {
//         int[] arr={10,3,6,9,8,16};
//         sum(arr);
//     }
// }

// SESSION 25
// print min element present from left side of a element
// class Test{
//     static void minLeft(int[] arr){
//         int l=arr.length;
//         for(int i=1;i<l;i++){
//             int min=arr[0];
//             for(int j=0;j<i;j++){
//                 if (arr[j]<min) {
//                     min=arr[j];
//             }
//            }
//            System.out.println(min);
//         }
//     }
//     public static void main(String[] args) {
//         int[] arr={8,5,9,6,3,7};
//         minLeft(arr);
//     }
// }
//  class Test1{
//     static void minLeft(int[] arr){
//         int l=arr.length;
//         int min=arr[0];
//         for (int i=1; i<l;i++) {
//             System.out.println(min);
//             if (arr[i]<min) {
//                 min=arr[i];
//             }
//         }
//     }
    // public static void main(String[] args) {
    //     int[] arr={8,5,9,6,3,7};
    //     minLeft(arr);
    // }
// }

//print right side max element from a element
// class Test{
//     static void maxRight(int[] arr){
//         int l=arr.length;
//         for(int i=0;i<l-1;i++){
//             int max=0;
//             for(int j=i+1;j<l;j++){
//                 if(arr[j]>max){
//                     max=arr[j];
//                 }
//             }
//             System.out.println(max);
//         }
//     }
//     public static void main(String[] args) {
//         int[] arr={8,5,9,6,3,7};
//         maxRight(arr);
//     }
// }

// replace current element with right side max element
// class Test{
//     static int[] replaceRight(int[] arr){
//         int l=arr.length;
//         for(int i=0;i<l-1;i++){
//             int max=0;
//             for(int j=i+1;j<l;j++){
//                 if(arr[j]>max){
//                     max=arr[j];
//                     arr[i]=arr[j];
//                 }
//             }
//         }
//         return arr;
//     }
//     static void printArray(int[] arr){
//         for(int i=0;i<arr.length;i++){
//             System.out.print(arr[i]+" ");
//         }
//     }
//     public static void main(String[] args) {
//         int[] arr={8,5,9,6,3,7};
//         printArray(arr);
//         System.out.println();
//         replaceRight(arr);
//         printArray(arr);
//     }
// }

//SESSION 26
/*Leaders in an array
Given an array A of positive integers. Your task is to find the leaders in the array. An element of an
array is leader if it is greater than or equal to all the elements to its right side. The rightmost 
element is always a leader.
Example 1
Input:6
A[] = (16,17,4,3,5,2)
Output: 17 5 2
Explanation: The first leader is 17 as it is greater than all the elements to its right. Similarly, the  
next leader is 5. The right most element is always a leader so it is also included.
Example 2:
Input:5
A[]=(1.2,3,4,0)
Output: 4 0
 */
// class Test{
//     static void leader(int[] arr){
//         int l=arr.length;
//         int j;
//         for(int i=0;i<l-1;i++){
//             for(j=i+1;j<l;j++){
//                 if(arr[i]<arr[j]){
//                     break;
//                 }
//             }
//             if (j==l) {
//                 System.out.print(arr[i]+" ");
//             }
//         }
//         System.out.println(arr[l-1]);
//     }
    // public static void main(String[] args) {
    //     int[] arr={16,17,4,3,5,2};
    //     leader(arr);
    //     int[] arr1={1,2,3,4,0};
    //     leader(arr1);

//     }
// }

//SESSION27
//PRINT LEADER IF ORDER IS NOT NECCESARY THEN PRINT LEADER BY LEAST TIME COMPLEXITY
// class Test{
//     static void leader(int[] arr){
//         int l=arr.length;
//         System.out.print(arr[l-1]+" ");
//         int max=arr[l-1];
//         for(int i=l-2;i>=0;i--){
//             if(max<=arr[i]){
//                 System.out.print(arr[i]+" ");
//                  max=arr[i]; 
//             }     
//         }
//     }
//      public static void main(String[] args) {
//         int[] arr={16,17,4,3,5,2};
//         leader(arr);
//         System.out.println();
//         int[] arr1={1,2,3,4,0};
//         leader(arr1);
//     }
// }

// if order matter and least time complexity
// import java.util.ArrayList;
// import java.util.Collections;
// class Test1{
//     static void leader(int[] arr){
//         int l=arr.length;
//         ArrayList t=new ArrayList();
//         t.add(arr[l-1]);
//         int max=arr[l-1];
//         for(int i=l-2;i>=0;i--){
//             if(max<=arr[i]){
//                 t.add(arr[i]);
//                  max=arr[i]; 
//             }     
//         }
//         Collections.reverse(t);
//         System.out.println(t);
//     }
//      public static void main(String[] args) {
//         int[] arr={16,17,4,3,5,2};
//         leader(arr);
//         System.out.println();
//         int[] arr1={1,2,3,4,0};
//         leader(arr1);
//     }
// }
