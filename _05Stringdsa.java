// session27
// reverse the string
// way 1
// class Test{
//     static char[] copy(char[] arr){
//     int l=arr.length;
//         char[] arr1= new char[l];
//         for(int i=0;i<l;i++){
//             arr1[i]=arr[l-i-1];
//         }
//         return arr1;
//   }    
//     public static void main(String[] args) {
//         String s="chandrapal";
//         System.out.println(s);
//         char arr[]=s.toCharArray();
//         String s1=new String(copy(arr));
//         System.out.println(s1);
//         String s2="neeraj";
//         System.out.println(s2);
//         char arr2[]=s2.toCharArray();
//         String s3=new String(copy(arr2));
//         System.out.println(s3);
//     }
// }

// way2 
// class Test1{
//     public static void main(String[] args) {
//         String s="shubham";
//         System.out.println(s);
//         char arr[]=s.toCharArray();
//         int l=arr.length;
//         int mid=l/2-1;
//         for(int i=0;i<=mid;i++){
//             char z=arr[i];
//             arr[i]=arr[l-i-1];
//             arr[l-i-1]=z;
//         }
//         String s1=new String(arr);
//         System.out.println(s1);

//     }
// }

//SESSIO0N 28
// TO SPLIT AND MERGE STRING
// class Test{
//     public static void main(String[] args) {
//         String s="NEERAJ Madan Lal Bhatt";
//         String[] arr=s.split(" ");
//         for (int i = 0; i < arr.length; i++) {
//             System.out.println(arr[i]);
//         }
//         String[] arr1={"Madanlalbhatt","Rajeshwaribhatt","shubhambhatt","neerajbhatt"};
//         String s1=String.join(" ",arr1);
//         System.out.println(s1);
//         String s2="22-09-2001";
//         String[] arr2=s2.split("-");
//         for (int i = 0; i < arr2.length; i++) {
//             System.out.println(arr2[i]);
//         }

//     }
// }

// class Test{
//     public static void main(String[] args) {
//         String s="neerajbhatt";
//         char[] ch=s.toCharArray();
//         for (int i = 0; i < ch.length; i++) {
//             System.out.println(ch[i]);
//         }
//         char[] arr={'b','h','a','t','t'};
//         String s1=new String(arr);
//         System.out.println(s1);
//     }
// }

// input- java is very childish language
//output- language  childish  very is java
// class Test{
//     public static void main(String[] args) {
//         String s="java is very childish language";
//         String[] arr=s.split(" ");
//         int l=arr.length;
//         int mid=l/2-1;
//         for(int i=0;i<=mid;i++){
//             String z=arr[i];
//             arr[i]=arr[l-i-1];
//             arr[l-i-1]=z;
//         }
//         String s2=String.join(" ",arr);
//         System.out.println(s2);
//     }
// }

//i/p chandrapal then o/p hcnardpala
// i/p codex then o/p ocedx
// class Test{
//     public static void main(String[] args) {
//         String s="chandrapal";
//         System.out.println(s);
//         System.out.println(spilit(s));
//         String s1="codex";
//         System.out.println(s1);
//         System.out.println(spilit(s1));
//     }
//     static String spilit(String s){
//         char []arr=s.toCharArray();
//         int l=arr.length;
//         for (int i = 0; i <l-1; i++) {
//             char c=arr[i];
//             arr[i]=arr[i+1];
//             arr[i+1]=c;
//             i++;
//         }
//         String s1=new String(arr);
//         return s1;
//     }
// }

//            SESSION-29
/*Given an array of words, find the most occurring word in it. In case of a tie return the word which is
appearing first in the array.
Input:
arr[] = {"csd", "code", "planet", "csd", "code", "code"}
Output:code
Input:arr[] = {"csd", "code", "planet", "csd", "code"} 
Output:csd
 */
// class Test{
//     static String maxAppear(String[] arr){
//         String result=" ";
//         int max=0;
//         for (int i = 0; i < arr.length; i++) {
//           int  count=1;
//             for(int j=i+1;j<arr.length;j++){
//                 if (arr[i].equals(arr[j])==true) {
//                     count++;
//                 }
//             }
//             if (count>max) {
//                 max=count;
//                 result=arr[i];
//             }
//         }
//         return result;
//     }
//     public static void main(String[] args) {
//         String arr[] = {"csd", "code", "planet", "csd", "code", "code"};
//         System.out.println(maxAppear(arr));
//         String[] arr1={"csd", "code", "planet", "csd", "code"};
//         System.out.println(maxAppear(arr1));
//     }
// }

// {"csd", "code", "planet", "csd", "csd"}
// csd come 3 time planet come 1 code come 1
// so o/p is 3+1+1+3+3=11
// class Test{
//     static int sumAppear(String[] arr){
//         int sum=0;
//         for (int i = 0; i < arr.length; i++) {
//             for (int j = 0; j < arr.length; j++) {
//                 if(arr[i].equals(arr[j])==true)
//                       sum++;
//             }
//         }
//         return sum;
//     }
//     public static void main(String[] args) {
//         String[] arr={"csd", "code", "planet", "csd", "csd"};
//         System.out.println(sumAppear(arr));
//     }
// }

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

