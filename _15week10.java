                                       // SESSION-71
/*Given an array arr] of N non-negative Integers representing the height of blocks. If the width of each 
block is 1, compute how much water can be trapped between the blocks during the rainy season.
Example 1:
Input: arr[]= (3,0,0,2,0,4)
Output:
10
Explanation:
Example 2:
Input:N-4 arr[]= (7,4,0,9)
Output:10
Explanation:
Water trapped by above block of height 4 is 3 units and above block of height is 7 units. So,The total
unit of water trapped is 10 units. */
// class Test{
//        public static int max(int[] arr,int start, int end){
//             int max=arr[start];
//             for(int i=start;i<=end;i++){
//                 if(arr[i]>max){
//                     max=arr[i];
//                 }
//             }
//             return max;
//        }  
//        public static int waterQuantity(int[] arr, int n){
//         int lmax,rmax,sum=0;
//         for(int i=0;i<n;i++){
//             lmax=max(arr, 0, i);
//             rmax=max(arr, i, n-1);
//             sum=sum+Math.min(rmax, lmax)-arr[i];
//         }
//         return sum;
//        }
//        public static void main(String[] args) {
//         int arr[]= {3,0,0,2,0,4};
//         int n=arr.length;
//         System.out.println(waterQuantity(arr, n));
//         int arr1[]={7,4,0,9};
//         int n1=arr1.length;
//         System.out.println(waterQuantity(arr1, n1));
//        }
// }

// 2nd way for less time complexity
// class Test1{
//        public static int waterQuantity(int[] arr, int n){
//         int lmax=arr[0],sum=0;
//         int []rmax=new int[n];
//         rmax[n-1]=arr[n-1];
//         for(int i=n-2;i>=0;i--)
//              rmax[i]=(rmax[i+1]>arr[i])?rmax[i+1]:arr[i];
//         for(int i=0;i<n;i++){
//             if (arr[i]>lmax) {
//                 lmax=arr[i];
//             }
//             sum=sum+Math.min(rmax[i], lmax)-arr[i];
//         }
//         return sum;
//        }
//        public static void main(String[] args) {
//         int arr[]= {3,0,0,2,0,4};
//         int n=arr.length;
//         System.out.println(waterQuantity(arr, n));
//         int arr1[]={7,4,0,9};
//         int n1=arr1.length;
//         System.out.println(waterQuantity(arr1, n1));
//        }
//}

                                          //SESSION-72
/*Facing The Sun
Given an array H representing heights of buildings. You have to count the buildings which will see the
sunrise (Assume: Sunrise on the side of the array starting point).
Example 1:
Input:
N=5
H[] {7,4,8,2,9}
Output: 3
Explanation: As 7 is the first element
can see the sunrise 4 can't see the  as 7 is hiding it. 8 can see. 2 can't see the sunrise. 9 also can see
the sunrise
Example 2:
Input:
N = 4
81 (2, 3, 4, 5)
Output: 4
explnation: As 2 is the first element, it Can see the sunrise. 3 dan see the sunrise as 2 is not hiding it
. Same for 4 and 5, they also can see, the sunrise.
Expected Time Complexity: O(N) Expected Auxiliary Space O(1) */
// class Test{
//     public static int sunRise(int[] arr){
//         int l=arr.length;
//         int max=arr[0],count=1;
//         for(int i=0;i<l;i++){
//             if (max<arr[i]) {
//                 count=count+1;
//                 max=arr[i];
//             }
//         }
//         return count;
//     }
//     public static void main(String[] args) {
//         int H[]= {7,4,8,2,9};
//         System.out.println(sunRise(H));
//         int[] arr={2, 3, 4, 5};
//         System.out.println(sunRise(arr));
//     }
// }

//pattern pyramid
/* 
    * 
   * *
  * * *
 * * * *
* * * * *
*/
// class Test{
//     public static void pyramid(int n){
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=n-i;j++){
//                 System.out.print(" ");
//             }
//             for(int k=1;k<=i;k++){
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }
//     public static void main(String[] args) {
//         int n=Integer.parseInt(args[0]);
//         pyramid(n);
//     }
// }
/*
    *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *
 */
// class Test{
//     public static void pyramid(int n){
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=n-i;j++){
//                 System.out.print(" ");
//             }
//             for(int k=1;k<=2*i-1;k++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//         for(int i=n-1;i>=1;i--){
//             for(int j=1;j<=n-i;j++){
//                 System.out.print(" ");
//             }
//             for(int k=1;k<=2*i-1;k++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
//     public static void main(String[] args) {
//         int n=Integer.parseInt(args[0]);
//         pyramid(n);
//     }
// }

/* 
    *
   * *
  *   *
 *     *
*********
*/
// class Test{
//     public static void pyramid(int n){
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=n-i;j++){
//                 System.out.print(" ");
//             }
//             for(int k=1;k<=2*i-1;k++){
//                 if (k==1||k==2*i-1||i==n) {
//                     System.out.print("*");
//                 } else {
//                    System.out.print(" "); 
//                 }
//             }
//             System.out.println();
//         }
//     }
//     public static void main(String[] args) {
//         int n=Integer.parseInt(args[0]);
//         pyramid(n);
//     }
// }

/*
    *
   * *
  *   *
 *     *
*       *
 *     *
  *   *
   * *
    *
 */
// class Test{
//     public static void pyramid(int n){
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=n-i;j++){
//                 System.out.print(" ");
//             }
//             for(int k=1;k<=2*i-1;k++){
//                 if (k==1||k==2*i-1) {
//                     System.out.print("*");
//                 } else {
//                    System.out.print(" "); 
//                 }
//             }
//             System.out.println();
//         }
//         for(int i=n-1;i>=1;i--){
//             for(int j=1;j<=n-i;j++){
//                 System.out.print(" ");
//             }
//             for(int k=1;k<=2*i-1;k++){
//                 if (k==1||k==2*i-1) {
//                     System.out.print("*");
//                 } else {
//                    System.out.print(" "); 
//                 }
//             }
//             System.out.println();
//         }
//     }
//     public static void main(String[] args) {
//         int n=Integer.parseInt(args[0]);
//         pyramid(n);
//     }
// }

                                //SESSION-72
/*
A B C D E F 
A B C D E
A B C D
A B C
A B
A
A
A B
A B C
A B C D
A B C D E
A B C D E F
*/
// class Test{
//      public static void patternChar(int n){
//         for(int i=n;i>=1;i--){
//             char ch='A';
//             for(int j=1;j<=i;j++){
//             System.out.print(ch+" ");
//             ch++;
//             }
//         System.out.println();
//         }
//         for(int i=1;i<=n;i++){
//             char ch='A';
//             for(int j=1;j<=i;j++){
//             System.out.print(ch+" ");
//             ch++;
//             }
//         System.out.println();
//         }
//     }
//      public static void main(String[] args) {
//         int n=Integer.parseInt(args[0]);
//         patternChar(n);
//      }
// }                                

/*
1 2 3 4 5 
 2 3 4 5
  3 4 5
   4 5
    5
   4 5
  3 4 5
 2 3 4 5
1 2 3 4 5
 */
// class Test{
//     static void patternNum(int n){
//         for(int i=1;i<=n;i++){
//             int num=i;
//             for(int j=1;j<=i-1;j++){
//                 System.out.print(" ");
//             }
//             for(int k=1;k<=n-i+1;k++){
//                 System.out.print(num+" ");
//                 num++;
//             }
//             System.out.println();
//         }
//         for(int i=n-1;i>=1;i--){
//             int num=i;
//             for(int j=1;j<=i-1;j++){
//                 System.out.print(" ");
//             }
//             for(int k=1;k<=n-i+1;k++){
//                 System.out.print(num+" ");
//                 num++;
//             }
//             System.out.println();
//         }
//     }
//     public static void main(String[] args) {
//         int n=Integer.parseInt(args[0]);
//         patternNum(n);
//     }
// }

/*
1
10
101
1010
10101
 */
// 
// class Test{
//     public static void patternNum(int n){
//         for(int i=1;i<=n;i++){
//             int num=1;
//             for(int j=1;j<=i;j++){
//                 System.out.print(num);
//                 if (num==1) {
//                     num=0;
//                 }
//                 else{
//                     num=1;
//                 }
//             }
//             System.out.println();
//         }
//     }
//     public static void main(String[] args) {
//         int n=Integer.parseInt(args[0]);
//         patternNum(n);
//     }
// }

/*
10101
01010
10101
01010
10101
 */
// class Test{
//     public static void patternNum(int n){
//         int num=1;
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=n;j++){
//                 System.out.print(num);
//                 if (num==1) {
//                     num=0;
//                 }
//                 else{
//                     num=1;
//                 }
//             }
//             System.out.println();
//         }
//     }
//     public static void main(String[] args) {
//         int n=Integer.parseInt(args[0]);
//         patternNum(n);
//     }
// }

/*
    1
   212
  32123
 4321234
543212345
 4321234
  32123
   212
    1
 */
// class Test{
//     public static void patternNum(int n){
//         for(int i=1;i<=n;i++){
//             int num=i,flag=0;
//             for(int k=1;k<=n-i;k++){
//                 System.out.print(" ");
//             }
//             for(int j=1;j<=2*i-1;j++){
//                 System.out.print(num);
//                 if (flag==0) {
//                     num--;
//                 }
//                 else{
//                     num++;
//                 }
//                 if (num==1) {
//                     flag=1;
//                 }
//             }
//             System.out.println();
//         }
//         for(int i=n-1;i>=1;i--){
//             int num=i,flag=0;
//             for(int k=1;k<=n-i;k++){
//                 System.out.print(" ");
//             }
//             for(int j=1;j<=2*i-1;j++){
//                 System.out.print(num);
//                 if (flag==0) {
//                     num--;
//                 }
//                 else{
//                     num++;
//                 }
//                 if (num==1) {
//                     flag=1;
//                 }
//             }
//             System.out.println();
//         }
//     }
//     public static void main(String[] args) {
//         int n=Integer.parseInt(args[0]);
//         patternNum(n);
//     }
// }

/*Separate Prime and Non-Prime Numbers
Given an array arr[] of size N, the task is to rearrange the array elements such that all the Prime
numbers are placed before the Non-prime numbers.
Examples:
Input: arr[]=(1, 8, 2, 3, 4, 5, 7, 20)
Output: 7 5 2 3 4 8 1 20
Explanation:
The output consists of all the prime numbers 7523, followed by Non-Prime numbers 4 8 1.20.
Input: arr1[]= (2 3, 4, 5, 6, 7, 8, 9, 10) Output: 2 3 7 5 6 4 8 9 10
Expected Time Complexity: ON'sqrt(N)) Expected Auxiliary Space: O(1) */
class Test{
    static boolean checkPrime(int n){
        if (n==1) {
            return  false;
        }
        for(int i=2;i*i<=n;i++){
            if (n%i==0) {
             return false;   
            }
        }
        return true;
    }
    static int[] SepratePrime(int[] arr){
        int n=arr.length;
        int i=0;
        for(int j=n-1;j>=n/2;j--){
                if (checkPrime(arr[j])==true && checkPrime(arr[i])==false ) {
                    int temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                    i++;
                }
                if (checkPrime(arr[i])==true) {
                    i++;
                }
            }
        return arr;
    }
    static void Print(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int []arr={1,8,2,3,4,5,7,20};
        Print(arr);
        System.out.println();
        int[] result=SepratePrime(arr);
        Print(result);
        System.out.println();
        int arr1[]= {2, 3, 4, 5, 6, 7, 8, 9, 10};
        Print(arr1);
        System.out.println();
        SepratePrime(arr1);
        Print(arr1);
    }
}