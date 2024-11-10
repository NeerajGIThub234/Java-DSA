// session-1
// 1 pattern
class Test
{
    public static void main(String[] args) {
    int n=Integer.parseInt(args[0]);
    for(int i=1;i<=n;i++){
        System.out.print("neeraj");// don't move cursor to next line stay in same line
        System.out.print("*");
        System.out.println();// blank line  move cursor to next line
        System.out.print("bhatt");
    }
 }
}

//session-2
// 2 pattern 
class Test1
{
    public static void main(String[] args) {
    int n=Integer.parseInt(args[0]);
    for(int i=2;i<n-1;i++){
        System.out.println();
        System.out.print("*");
        System.out.println();
        System.out.print(i);
        System.out.println();
    }
 }
}

// 3 pattern *1*2*3 if n=3
class Test2
{
    public static void main(String[] args) {
    int n=Integer.parseInt(args[0]);
    for(int i=1;i<=n;i++){
        System.out.print("*");
        System.out.print(i);
    }
 }
}


// 4 pattern *3*4*5*6*7*8 if n=4
class Test3
{
    public static void main(String[] args) {
    int n=Integer.parseInt(args[0]);
    for(int i=n-1;i<=2*n;i++){
        System.out.print("*"+i);
    }
 }
}

//session-3
/* 5 pattern if n=6
**12
**24
**36
**48
**510
**612*/ 
class Test4
{
    public static void main(String[] args) {
    int n=Integer.parseInt(args[0]);
    for(int i=1;i<=n;i++){
        System.out.print("**");
        System.out.print(i);
        System.out.println(i*2);
    }
 }
}
/*print if n=4
 * 
 **
 ***
 **** 
 */
class Pattern1{
    public static void main(String[] args) {
       int n=Integer.parseInt(args[0]);
    for(int i=1;i<=n;i++) {
        for (int j=1;j<=i;j++)
        {
            System.out.print("*");
        }
        System.out.println();
    }
}
}

//session-4
/*pattern 
  *****
  *****
  *****
  *****
  *****
 */
class Pattern2{
    public static void main(String[] args) {
        int n=Integer.parseInt(args[0]);
    for(int i=1;i<=n;i++) {
        for (int j=1;j<=n;j++)
        {
            System.out.print("*");
        }
        System.out.println();
    }
    }
}

/*pattern n=5
 *****
 ****
 ***
 **
 *
 */
class Pattern3{
    public static void main(String[] args) {
        int n=Integer.parseInt(args[0]);
    for(int i=1;i<=n;i++) {
       // for (int j=i;j<=n;j++) //my way
       for(int j=1;j<=n-i+1;j++)
        {
            System.out.print("*");
        }
        System.out.println();
    }
    }
}
/*another way */
class Pattern31{
    public static void main(String[] args) {
        int n=Integer.parseInt(args[0]);
    for(int i=n;i>=1;i--) {
        for (int j=1;j<=i;j++)
        {
            System.out.print("*");
        }
        System.out.println();
    }
    }
}

/*pattern- n=4
 ***
 *****
 *******
 *********
 */
class Pattern4{
    public static void main(String[] args) {
        int n=Integer.parseInt(args[0]);
    for(int i=1;i<=n;i++) {
        for (int j=1;j<=i*2+1;j++)
        {
            System.out.print("*");
        }
        System.out.println();
    }
    }
}

/*session-5
 pattern if n=3
    *
   * *
  * * * 
 */
class Session5{
    public static void main(String[] args) {
        int n=Integer.parseInt(args[0]);
    for(int i=1;i<=n;i++) {
        for (int j=1;j<=n-i;j++)
        {
            System.out.print(" ");
        }
        for( int k=1;k<=i;k++){
            System.out.print("* ");
        }
        System.out.println();
    }
    }
}

/*pattern n=5
 *****
 ****
 ***
 **
 *
 */
class Session51 {
    public static void main(String[] args) {
        int n=Integer.parseInt(args[0]);
    for(int i=n;i>=1;i--) {
        for (int j=1;j<=i;j++)
        {
            System.out.print("*");
        }
        System.out.println();
    }
    }
}

/*pattern-n=4
   *
  **
 ***
****
 */
class Session52{
    public static void main(String[] args) {
        int n=Integer.parseInt(args[0]);
    for(int i=1;i<=n;i++) {
        for (int j=1;j<=n-i;j++)
        {
            System.out.print(" ");
        }
        for( int k=1;k<=i;k++){
            System.out.print("*");
        }
        System.out.println();
    }
    }
}

/*pattern- n=4
 * * * *
  * * *
   * *
    *
 */
class Session53{
    public static void main(String[] args) {
        int n=Integer.parseInt(args[0]);
    for(int i=n;i>=1;i--) {
        for (int j=1;j<=n-i;j++)
        {
            System.out.print(" ");
        }
        for( int k=1;k<=i;k++){
            System.out.print("* ");
        }
        System.out.println();
    }
    }
}

/*pattern n=4
   *
  ***
 *****
*******
 */
class Session54{
    public static void main(String[] args) {
        int n=Integer.parseInt(args[0]);
    for(int i=1;i<=n;i++) {
        for (int j=1;j<=n-i;j++)
        {
            System.out.print(" ");
        }
        for( int k=1;k<=2*i-1;k++){
            System.out.print("*");
        }
        System.out.println();
    }
    }
}

/*pattern 
 *******
  *****
   ***
    *
 */
class Session55{
    public static void main(String[] args) {
        int n=Integer.parseInt(args[0]);
    for(int i=n-1;i>=1;i--) {
        for (int j=1;j<=n-i;j++)
        {
            System.out.print(" ");
        }
        for( int k=1;k<=2*i-1;k++){
            System.out.print("*");
        }
        System.out.println();
    }
    }
}

/*pattern if n=5 combine session 54 and 55
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
class Session56{
    public static void main(String[] args) {
        int n=Integer.parseInt(args[0]);
    for(int i=1;i<=n;i++) {
        for (int j=1;j<=n-i;j++)
        {
            System.out.print(" ");
        }
        for( int k=1;k<=2*i-1;k++){
            System.out.print("*");
        }
        System.out.println();
    }
        for(int i=n-1;i>=1;i--) {
        for (int j=1;j<=n-i;j++)
        {
            System.out.print(" ");
        }
        for( int k=1;k<=2*i-1;k++){
            System.out.print("*");
        }
         System.out.println();
    } 
    }
}

/* pattern
 *
* *
* * *
* * * *
* * * * *
* * * *
* * *
* *
*
 */
class Session61{
    public static void main(String[] args) {
        int n=Integer.parseInt(args[0]);
    for(int i=1;i<=n;i++) {
        for (int j=1;j<=i;j++)
        {
            System.out.print("* ");
        }
         System.out.println();
    }
        for(int i=n-1;i>=1;i--) {
        for (int j=1;j<=i;j++)
        {
            System.out.print("* ");
        } 
         System.out.println();
    } 
    }
}
/* pattern
    *
   **
  ***
 ****
*****
 ****
  ***
   **
    *
*/
class Session62{
    public static void main(String[] args) {
        int n=Integer.parseInt(args[0]);
    for(int i=1;i<=n;i++) {
        for (int j=1;j<=n-i;j++)
        {
            System.out.print(" ");
        }
        for( int k=1;k<=i;k++){
            System.out.print("*");
        }
        System.out.println();
    }
    for(int i=n-1;i>=1;i--) {
        for (int j=1;j<=n-i;j++)
        {
            System.out.print(" ");
        }
        for( int k=1;k<=i;k++){
            System.out.print("*");
        }
        System.out.println();
    }
    }
}
/*pattern 
* * * * *
 * * * *
  * * *
   * *
    *
    *
   * *
  * * *
 * * * *
* * * * *

*/
class Session63{
    public static void main(String[] args) {
        int n=Integer.parseInt(args[0]);
    for(int i=n;i>=1;i--) {
        for (int j=1;j<=n-i;j++)
        {
            System.out.print(" ");
        }
        for( int k=1;k<=i;k++){
            System.out.print("* ");
        }
        System.out.println();
    }
    for(int i=1;i<=n;i++) {
        for (int j=1;j<=n-i;j++)
        {
            System.out.print(" ");
        }
        for( int k=1;k<=i;k++){
            System.out.print("* ");
        }
        System.out.println();
    }
    }
}
/* 
    *
   * *
  *   *
 *     *
*********
 */
class Session64{
    public static void main(String[] args) {
         int n=Integer.parseInt(args[0]);
        for(int i=1;i<=n;i++) 
           {
            for (int j=1;j<=n-i;j++)
              {
            System.out.print(" ");
              }
            for( int k=1;k<=2*i-1;k++){
               if (k==1||k==2*i-1||i==n) {
                 System.out.print("*");
               } else {
                System.out.print(" ");
               }
            }
          System.out.println();
        }
    }
}

/* 
*********
 *     *
  *   *
   * *
    *
*/
class Session65{
    public static void main(String[] args) {
        int n=Integer.parseInt(args[0]);
        for(int i=n;i>=1;i--) 
           {
            for (int j=1;j<=n-i;j++)
              {
            System.out.print(" ");
              }
            for( int k=1;k<=2*i-1;k++){
               if (k==1||k==2*i-1||i==n) {
                 System.out.print("*");
               } else {
                System.out.print(" ");
               }
            }
          System.out.println();
        }
    }
}

//session-7
/* 
1 
2 3
4 5 6
7 8 9 10       
11 12 13 14 15 
*/
class Session71{
    public static void main(String[] args) {
        int n=Integer.parseInt(args[0]);
        int num=1;
        for(int i=1;i<=n;i++) 
           {
            for (int j=1;j<=i;j++)
              {
            System.out.print(num+" ");
            num++;
              }
            System.out.println();
        }
    }
}

/*pattern
1 
2 2       
3 3 3     
4 4 4 4   
5 5 5 5 5 
 */
class Session72{
    public static void main(String[] args) {
        int n=Integer.parseInt(args[0]);
        int num=1;
        for(int i=1;i<=n;i++) 
           {
            for (int j=1;j<=i;j++)
              {
            System.out.print(num+" ");
              }
            num++;
            System.out.println();
        }
    }
}
//another way for above pattern
/* 
1 
2 2
3 3 3
4 4 4 4
5 5 5 5 5
*/
class Session72_{
    public static void main(String[] args) {
        int n=Integer.parseInt(args[0]);
        for(int i=1;i<=n;i++) 
           {
            for (int j=1;j<=i;j++)
              {
            System.out.print(i+" ");
              }
            System.out.println();
        }
    }
}

/*pattern
5 
5 4 
5 4 3
5 4 3 2
5 4 3 2 1 
 */
class Session73{
    public static void main(String[] args) {
        int n=Integer.parseInt(args[0]);
        for(int i=1;i<=n;i++) 
           {
            int num=5;
            for (int j=1;j<=i;j++)
              {
            System.out.print(num+" ");
            num--;
              }
            System.out.println();
        }
    }
}

/*pattern 
1
2 1
3 2 1
4 3 2 1
5 4 3 2 1 */
class Session74{
    public static void main(String[] args) {
        int n=Integer.parseInt(args[0]);
        for(int i=1;i<=n;i++) 
           {
            for (int j=i;j>=1;j--)
              {
               System.out.print(j+" ");  
              }
            System.out.println();

        } 
    }
}

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
class Session75
{
    public static void main(String[] args) {
        int n=Integer.parseInt(args[0]);
        for(int i=n;i>=1;i--)
        {
           int num=n-i+1;
            for (int j=1;j<=n-i;j++) {
                System.out.print(" ");
            }
            for( int k=1;k<=i;k++){
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
        for(int i=n-1;i>=1;i--)
        {
          int num1=i;
            for (int j=1;j<=i-1;j++) {
                System.out.print(" ");
            }
            for( int k=1;k<=n-i+1;k++){
                System.out.print(num1+" ");
                num1++;
            }
            System.out.println();
        }
    }
}

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
class Session76{
    public static void main(String[] args) {
         int n=Integer.parseInt(args[0]);
        for(int i=1;i<=n;i++) 
           {
            for (int j=1;j<=n-i;j++)
              {
            System.out.print(" ");
              }
            for( int k=1;k<=2*i-1;k++){
               if (k==1||k==2*i-1) {
                 System.out.print("*");
               } else {
                System.out.print(" ");
               }
            }
          System.out.println();
        }
        for(int i=n-1;i>=1;i--) 
           {
            for (int j=1;j<=n-i;j++)
              {
            System.out.print(" ");
              }
            for( int k=1;k<=2*i-1;k++){
               if (k==1||k==2*i-1) {
                 System.out.print("*");
               } else {
                System.out.print(" ");
               }
            }
          System.out.println();
        }
    }
}

//session8//
/* 
    *
   ---
  *****
 -------
*********
 -------
  *****
   ---
    *
*/
class Session81
{
    public static void main(String[] args) {
        int n=Integer.parseInt(args[0]);
        for(int i=1;i<=n;i++){
            for( int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=2*i-1;k++){
                if(i%2!=0){
                    System.out.print("*");
                }
                else{
                    System.out.print("-");
                }
            }
            System.out.println();
        }
        for(int i=n-1;i>=1;i--){
            for( int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=2*i-1;k++){
                if(i%2!=0){
                    System.out.print("*");
                }
                else{
                    System.out.print("-");
                }
            }
            System.out.println();
        }
    }
}

//patern-2
/* 
#
# #
#   #
#     #
#       #
#     #
#   #
# #
# 
*/
class Session82{
    public static void main(String[] args) {
         int n=Integer.parseInt(args[0]);
        for(int i=1;i<=n;i++) 
           {
            for( int k=1;k<=2*i-1;k++){
               if (k==1||k==2*i-1) {
                 System.out.print("#");
               } else {
                System.out.print(" ");
               }
            }
          System.out.println();
        }
        for(int i=n-1;i>=1;i--) 
           {
            for( int k=1;k<=2*i-1;k++){
               if (k==1||k==2*i-1) {
                 System.out.print("#");
               } else {
                System.out.print(" ");
               }
            }
          System.out.println();
        }
    }
}

//patern-3
/*
  1
  212
 32123
4321234
 32123
  212
   1
 */
class Session83
{
    public static void main(String[] args) {
        int n=Integer.parseInt(args[0]);
        for(int i=1;i<=n;i++){
            for( int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int k=i;k>=1;k--){
               System.out.print(k);
            }
             for(int k=2;k<=i;k++){
               System.out.print(k);
            }
            System.out.println();
        }
        for(int i=n-1;i>=1;i--){
            for( int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int k=i;k>=1;k--){
               System.out.print(k);
            }
             for(int k=2;k<=i;k++){
               System.out.print(k);
            }
            System.out.println();
        }
    }
}    
//sir way
class Session82_{
    public static void main(String[] args) {
         int n=Integer.parseInt(args[0]);
        for(int i=1;i<=n;i++) 
           {
            int num=i;
            int flag=0;
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for( int k=1;k<=2*i-1;k++){
                System.out.print(num);
               if (flag==0) {
                 num--;
               } else {
                num++;
               }
               if (num==1)
                 flag=1;
            }
          System.out.println();
        }
        for(int i=n-1;i>=1;i--){
             int num=i;
            int flag=0;
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for( int k=1;k<=2*i-1;k++){
                System.out.print(num);
               if (flag==0) {
                 num--;
               } else {
                num++;
               }
               if (num==1)
                 flag=1;
            }
          System.out.println();
        }
    }
}
/*pattern-4
A 
A B     
A B C   
A B C D 
A B C D E
A B C D E F 
 */
class Session84
{
    public static void main(String[] args) {
        int n=Integer.parseInt(args[0]);
        for(int i=1;i<=n;i++){
            char ch='A';
            for(int j=1;j<=i;j++)
            {
                System.out.print(ch+" ");
                ch++;
            }
            System.out.println();
        }
    }
}
// another way
class Session84_
{
    public static void main(String[] args) {
        int n=Integer.parseInt(args[0]);
        for(int i=1;i<=n;i++){
            int num=65;
            for(int j=1;j<=i;j++)
            {
                System.out.print((char)num+" ");
                num++;
            }
            System.out.println();
        }
    }
}

//pattern -5
/* 
A 
B B
C C C
D D D D
E E E E E
F F F F F F
*/
class Session85
{
    public static void main(String[] args) {
        char ch='A';
        int n=Integer.parseInt(args[0]);
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++)
            {
                System.out.print(ch+" ");
            }
            ch++;
            System.out.println();
        }
    }
}
//another way-1
class Session85_1
{
    public static void main(String[] args) {
        int n=Integer.parseInt(args[0]);
         int num=65;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++)
            {
                System.out.print((char)num+" ");
            }
            num++;
            System.out.println();
        }
    }
}

//another way-2
class Session85_2
{
    public static void main(String[] args) {
        int n=Integer.parseInt(args[0]);
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++)
            {
                System.out.print((char)(64+i)+" ");
            }
            System.out.println();
        }
    }
}

//session-9
/* 
A A A A 
B B B   
C C     
D
*/
class Session91
{
    public static void main(String[] args) {
        char ch='A';
        int n=Integer.parseInt(args[0]);
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++)
            {
                System.out.print(ch+" ");
            }
            ch++;
            System.out.println();
        }
    }
}

//PATERN
/*
    A 
   A B
  A B C
 A B C D
A B C D E
 */
class Session92
{
    public static void main(String[] args) {
        int n=Integer.parseInt(args[0]);
        for(int i=1;i<=n;i++){
            char ch='A';
            for(int j=1;j<=n-i;j++){
              System.out.print(" ");
            } 
            for(int k=1;k<=i;k++)
            {
                System.out.print(ch+" ");
                ch++;
            } 
            System.out.println();
        }
    }
}

/*pattern 
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
*/
class Session93
{
    public static void main(String[] args) {
        int n=Integer.parseInt(args[0]);
        for(int i=n;i>=1;i--){
            char ch='A';
            for(int j=1;j<=i;j++)
            {
                System.out.print(ch+" ");
                ch++;
            }
            System.out.println();
        }
    
     for(int i=1;i<=n;i++){
            char ch='A';
            for(int j=1;j<=i;j++)
            {
                System.out.print(ch+" ");
                ch++;
            }
            System.out.println();
        }
    }
}

/*
1
10
101
1010
10101
 */
class Session94
{
    public static void main(String[] args) {
        int n=Integer.parseInt(args[0]);
        for(int i=1;i<=n;i++){
            int num=1; 
            for(int k=1;k<=i;k++)
            {
                System.out.print(num);
                if (num==0) {
                    num=1;
                } else {
                    num=0;
                }
            } 
            System.out.println();
        }
    }
}

/*
10101
01010
10101
01010
10101
 */
class Session95
{
    public static void main(String[] args) {
        int n=Integer.parseInt(args[0]);
        for(int i=1;i<=n;i++){
            int num=i%2; 
            for(int k=1;k<=n;k++)
            {
                System.out.print(num);
                if (num==0) {
                    num=1;
                } else {
                    num=0;
                }
            } 
            System.out.println();
        }
    }
}

/*
*                 * 
* *             * *
* * *         * * *
* * * *     * * * *
* * * * * * * * * *
* * * * * * * * * *
* * * *     * * * *
* * *         * * *
* *             * *
*                 *
 */
 class Session96
{
    public static void main(String[] args) {
        int n=Integer.parseInt(args[0]);
        for(int i=1;i<=n;i++){
            for(int j=1;j<=2*n;j++)
            {
                if (j<=i||j>=2*n-i+1) 
                    System.out.print("* ");
                 else 
                    System.out.print("  ");
            }
            System.out.println();
        }
        for(int i=n;i>=1;i--){
            for(int j=1;j<=2*n;j++)
            {
                if (j<=i||j>=2*n-i+1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            } 
            System.out.println();
        }
    }
}

/*
* * * * * * * * * *
* * * *     * * * *
* * *         * * *
* *             * *
*                 *
*                 *
* *             * *
* * *         * * *
* * * *     * * * *
* * * * * * * * * *
 */
class Session97
{
    public static void main(String[] args) {
        int n=Integer.parseInt(args[0]);
        for(int i=n;i>=1;i--){
            for(int j=1;j<=2*n;j++)
            {
                if (j<=i||j>=2*n-i+1) 
                    System.out.print("* ");
                 else 
                    System.out.print("  ");
            }
            System.out.println();
        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=2*n;j++)
            {
                if (j<=i||j>=2*n-i+1) 
                    System.out.print("* ");
                 else 
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}