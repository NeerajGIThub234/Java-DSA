/*                                                  SORTING ALGORITHM            
                                                     1.BUBBLE SORT                                                           */ 
// class Test{
//     static void printArray(int[] arr,int l){
//         for(int i=0;i<l;i++){
//             System.out.print(arr[i]+" ");
//         }
//     }
//     static void BubbleSort(int[] arr,int l){
//         int temp;
//         for(int i=0;i<=l-2;i++){
//             for(int j=0;j<=l-2-i;j++){
//                 if (arr[j]>arr[j+1]) {
//                     temp=arr[j];
//                     arr[j]=arr[j+1];
//                     arr[j+1]=temp;
//                 }
//             }
//         }
//     }
//     public static void main(String[] args) {
//         int[] arr={8,5,7,4,3};
//         int l=arr.length;
//         printArray(arr, l);
//         System.out.println();
//         BubbleSort(arr, l);
//         printArray(arr, l);

//     }
// }


//                               SESSION-36
//         ADAPTIVE VERSION OF BUBBLE SORT
// class Test{
//     static void printArray(int[] arr,int l){
//         for(int i=0;i<l;i++){
//             System.out.print(arr[i]+" ");
//         }
//     }
//     static void BubbleSort(int[] arr,int l){
//         int temp,flag;
//         for(int i=0;i<=l-2;i++){
//             flag=0;
//             for(int j=0;j<=l-2-i;j++){
//                 if (arr[j]>arr[j+1]) {
//                     temp=arr[j];
//                     arr[j]=arr[j+1];
//                     arr[j+1]=temp;
//                     flag=1;
//                 }
//             }
//             if (flag==0) {
//                 break;
//             }
//         }
//     }
//     public static void main(String[] args) {
//         int[] arr={2,5,7,9,12,15};
//         int l=arr.length;
//         printArray(arr, l);
//         System.out.println();
//         BubbleSort(arr, l);
//         printArray(arr, l);

//     }
// }


//                                      2 INSERTION SORT
// class Test{
//     static  void printArray(int[] arr){
//         for (int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i]+" ");
//         }
//     }
    // static void InsertionSort(int[] arr){
    //     int l=arr.length;
    //     for(int i=1;i<=l-1;i++){
    //         int x=arr[i];
    //         int j=i-1;
    //          while (j>=0 && arr[j]>x) {
    //             arr[j+1]=arr[j];
    //             j--;
    //          }
    //          arr[j+1]=x;
    //     }
    // }
//     public static void main(String[] args) {
//         int[] arr={8,7,5,3,4};
//         printArray(arr);
//         System.out.println();
//         InsertionSort(arr);
//         printArray(arr);
//     }
// }

//                             3 SELECTION SORT
// class Test{
//     static  void printArray(int[] arr){
//         for (int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i]+" ");
//         }
//     }
//     static void selectionSort(int[] arr){
//         int l=arr.length;
//         for(int i=0;i<l-1;i++){
//             int k=i;
//             for(int j=i+1;j<l;j++){
//                 if (arr[j]<arr[k]) {
//                     k=j;
//                 }
//             }
//             int temp=arr[i];
//             arr[i]=arr[k];
//             arr[k]=temp;
//         }
//     }
//     public static void main(String[] args) {
//         int[] arr={9,8,7,3,5};
//         printArray(arr);
//         System.out.println();
//         selectionSort(arr);
//         printArray(arr);
//     }
// }