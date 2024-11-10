//                                    SESSION-34
//                                    SEARCHING ALGORITHM
//                                     LINEAR SEARCH
// take input and check wether a no present inside array or not by linear search
// class Test
// {
//     static int  linearSearch(int[] arr,int n){
//         int l=arr.length;
//         for(int i=0;i<l;i++){
//             if(arr[i]==n){
//                 return i;
//             }
//         }
//         return -1;
//     }
//     public static void main(String[] args) {
//         int n=Integer.parseInt(args[0]);
//         int[] arr={10,2,8,5,4,13};
//         System.out.println(linearSearch(arr,n));
//     }
// }

//                                     BINARY SEARCH
// import java.util.Scanner;
// class Test{
//     static int binarySearch(int[] arr,int n){
//         int l=arr.length;
//         int s=0,e=l-1;
//         while(e>=s){
//             int mid=(s+e)/2;
//             if(n==arr[mid]){
//                 return mid;
//             }
//             else if(n>arr[mid]){
//                 s=mid+1;
//             }
//             else{
//                 e=mid-1;
//             }
//         }
//         return -1;
//     }
 
//     public static void main(String[] args) {
//         int[] arr={4,8,10,15,25,30};
//         Scanner s=new Scanner(System.in);
//         System.out.print("enter number: ");
//         int n=s.nextInt();
//         System.out.println(binarySearch(arr,n));
//         // int[] arr1={9,8,7,15,2,30};
//         // System.out.println(binarySearch(arr1,n));
//     }
// }