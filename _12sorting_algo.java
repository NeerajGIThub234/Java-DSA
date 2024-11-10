                                                /*SESSION-60 */
// normal quick sort
// class Test{
//    static int  Partition(int[] arr,int start,int end){
//     int pivot=arr[end],index=start;
//     for(int i=start;i<end;i++){
//         if (arr[i]<=pivot) {
//             int temp=arr[index];
//             arr[index]=arr[i];
//             arr[i]=temp;
//             index++;
//         }
//     }
//     arr[end]=arr[index];
//     arr[index]=pivot;
//     return index;
//    }
//    static void Quicksort(int[] arr,int start,int end){
//     if (end>start) {
//          int partition_index=Partition(arr, start, end);
//         Quicksort(arr, start,partition_index-1);
//         Quicksort(arr, partition_index+1, end);
//     }
//    }
//    static void Print(int []arr){
//     for (int i = 0; i < arr.length; i++) {
//         System.out.print(arr[i]+" ");
//     }
//    }
//     public static void main(String[] args) {
//     int[] arr={20,40,60,50,30,45,43};
//     Print(arr);
//     System.out.println();
//      int start=0,end=arr.length-1;
//     Quicksort(arr,start,end);
//     Print(arr);
//    } 
// }


//  random quick sort
// import java.util.Random;
// class Test1{
//     static Random  r=new Random();
//    static int  Partition(int[] arr,int start,int end){
//     int rand=r.nextInt(end-start+1)+start;
//     int pivot=arr[rand],index=start;
//     arr[rand]=arr[end];
//     arr[end]=pivot;
//     for(int i=start;i<end;i++){
//         if (arr[i]<=pivot) {
//             int temp=arr[index];
//             arr[index]=arr[i];
//             arr[i]=temp;
//             index++;
//         }
//     }
//     arr[end]=arr[index];
//     arr[index]=pivot;
//     return index;
//    }
//    static void Quicksort(int[] arr,int start,int end){
//     if (end>start) {
//          int partition_index=Partition(arr, start, end); // recursive statement
//         Quicksort(arr, start,partition_index-1); // recursive statement
//         Quicksort(arr, partition_index+1, end); // recursive statement
//     }
//    }
//    static void Print(int []arr){
//     for (int i = 0; i < arr.length; i++) {
//         System.out.print(arr[i]+" ");
//     }
//    }
//     public static void main(String[] args) {
//     int[] arr={20,40,60,50,30,45,43};
//     Print(arr);
//     System.out.println();
//      int start=0,end=arr.length-1;
//     Quicksort(arr,start,end);
//     Print(arr);
//    } 
// }

                                              // SESSION-62
                                            // MERGE SHORT
// class Test{
//    static void Merge(int[] arr,int start,int mid,int end){
//     int result[]=new int[end+1];
//     int i=start,j=mid+1,k=start;
//     while (i<=mid && j<=end) {
//         if (arr[i]<arr[j]) {
//             result[k]=arr[i];
//             i++;
//             k++;
//         } else  {
//             result[k]=arr[j];
//             j++;
//             k++;
//         }
//     }
//     while (i<=mid) {
//         result[k]=arr[i];
//         k++;
//         i++;       
//     }
//     while (j<=end) {
//         result[k]=arr[j];
//         j++;
//         k++;
//     }
//     for (int k2=start; k2<=end;k2++) {
//         arr[k2]=result[k2];
//     }
//    }
//     static void MergeShort(int []arr,int start,int end){
//     if (end>start) {
//         int mid=(start+end)/2;
//         MergeShort(arr, start, mid);
//         MergeShort(arr, mid+1, end);
//         Merge(arr,start,mid,end);
//     }
//    }
//     static void Print(int[] arr){
//         for (int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i]+" ");
//         }
//     }
//     public static void main(String[] args) {
//         int[] arr={40,30,50,70,10,45,35};
//         int start=0,end=arr.length-1;
//         Print(arr);
//         System.out.println();
//         MergeShort(arr,start,end);
//         Print(arr);
//     }
// }