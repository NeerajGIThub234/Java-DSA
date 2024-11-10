                                        /*SESSION-56 */
// RECURSION- a function or method calling itself 
// class Test{
//     static void m1(int n){
//         if (n>0) {
//             m1(n-1);
//         }
//         System.out.println(n);  
//     }
//     public static void main(String[] args) {
//         Test.m1(3);
//     }
// }

// class Test{
//     static void m1(int n){
//       System.out.println(n);  
//       if (n>0) {
//             m1(n-1);
//         }
//     }
//     public static void main(String[] args) {
//         Test.m1(3);
//     }
// }

// class Test{
//     static void m1(int n){
//       System.out.println(n);  
//       if (n<3) {
//             m1(n+1);
//         }
//     System.out.println(n+5);
//     }
//     public static void main(String[] args) {
//         Test.m1(1);
//     }
// }
                                                     /*SESSION-57 */
// class Test{
//     static void m1(int n){
//       System.out.println(n);  
//       if (n>5) {
//             m1(n-3);
//             System.out.println("HELLO");
//         }
//     System.out.println(n+2);
//     }
//     public static void main(String[] args) {
//         Test.m1(10);
//     }
// }

// class Test{
//     static int m1(int n){
//      if (n>0) {
//         return m1(n-1)+n;
//      } else {
//         return 0;
//      }
//     }
//     public static void main(String[] args) {
//        int result= Test.m1(4);
//        System.out.println(result);
//     }
// }

// class Test{
//     static int m1(int n,int x){
//      if (n>1) {
//         x++;
//         return m1(n-1,8)+n+x;
//      } else {
//         return 20;
//      }
//     }
//     public static void main(String[] args) {
//        int result= Test.m1(4,7);
//        System.out.println(result);
//     }
// }

                                             /*SESSION-58 */
// class Test{
//     static void m1(int n){
//      if (n>0) {
//        System.out.println("HEY");
//        m1(n-1);
//        System.out.println(n);
//      }
//     }
//     public static void main(String[] args) {
//       Test.m1(3);
//     }
// }

// class Test{
//     static int m1(int n){
//      int x=0;
//       if (n>0) {
//         x=n+3;
//         return m1(n-1)+n+x;
//      } else {
//         return 5;
//      }
//     }
//     public static void main(String[] args) {
//        int result= Test.m1(3);
//        System.out.println(result);
//     }
// }

// class Test{
//    static int x=0; 
//    static int m1(int n){
//       if (n>0) {
//         x=n+3;
//         return m1(n-1)+n+x;
//      } else {
//         return x+5;
//      }
//     }
//     public static void main(String[] args) {
//        int result= Test.m1(3);
//        System.out.println(result);
//     }
// }

                                          /*SESSION-59 */
// two recursive statement
// class Test{
//    static void m1(int n){
//       if (n>0) {
//          m1(n-1);
//          System.out.println("hello");
//          m1(n-1);
//          System.out.println(n);
//       }
//    }
//    public static void main(String[] args) {
//       m1(2);
//    }
// }

// sum of natural no if user i/p=10 then o/p=1+2+3+.....+10
// 1st way by loop
// class Test{
//    static int Sum(int n){
//      int sum=0;
//      for(int i=0;i<=n;i++)
//          sum=sum+i;
//       return sum;   
//    }
//    public static void main(String[] args) {
//       int n=Integer.parseInt(args[0]);
//       int result=Sum(n);
//       System.out.println(result);
//    }
// }

// 2nd way by maths formula n*(n+1)/2
// class Test{
//    static int Sum(int n){
//       return n*(n+1)/2;
//    }
//    public static void main(String[] args) {
//       int n=Integer.parseInt(args[0]);
//       int result=Sum(n);
//       System.out.println(result);
//    }
// }

// 3rd by recursion
// class Test{
//    static int Sum(int n){
//       if(n>0){
//           return Sum(n-1)+n;
//       }
//       else{
//          return 0;
//       }    
//    }
//    public static void main(String[] args) {
//       int n=Integer.parseInt(args[0]);
//       int result=Sum(n);
//       System.out.println(result);
//    }
// }