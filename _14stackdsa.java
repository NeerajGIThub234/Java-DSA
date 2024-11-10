                                         /*SESSION-63 */
/*Check for Balanced Brackets in an expression
Given an expression string exp, write a program to examine whether the pairs and the orders of "(",")",
 "{", "}", "[", "]" are correct in exp.
Example:
Input: exp-"[()]{}{[(){}]}
Output: Balanced
Input: exp="((])"
Output: Not Balanced */

// import java.util.Stack;
// class Test{
//     static boolean bracketBalance(String exp){
//         Stack<Character> s=new Stack<Character>();
//         for(int i=0;i<exp.length();i++){
//             char ch=exp.charAt(i);
//             if (ch=='(' || ch=='{'|| ch=='[') {
//                 s.push(ch);
//             } else {
//                 if (s.isEmpty()==true) {
//                     return false;
//                 }
//                 char top=s.pop();
//                 if (ch==')') {
//                     if (top!='(') {
//                         return false;
//                     }
//                 }
//                 else if (ch=='}') {
//                     if (top!='{') {
//                         return false;
//                     }
//                 }
//                 else if (ch==']') {
//                     if (top!='[') {
//                         return false;
//                     }
//                 }
//             }
//         }
//         return s.isEmpty();
//     }
//     public static void main(String[] args) {
//         String exp="[()]{}{[(){}]}";
//         System.out.println(bracketBalance(exp));
//     }
// }

                                             /*SESSION-64 */
/*Stock span problem
(Already asked question in Amazon, Samsung. Accolite Interview)
The stock span problem is a financial problem where we have a series of n daily price quotes for a stock 
and we need to calculate the span of stock's price for all n days.
The span Si of the stock's price on a given day I is defined as the maximum number of consecutive days 
just before the given day, for which the price of the stock on the current day is less than or equal to
 its price on the given day. For example, if an array of 7 days prices is given as 
 (100, 80, 60, 70, 60, 75, 85). then the span values for corresponding 7 days are (1, 1, 1, 2, 1, 4, 6).
Example 1:
Input:
N7, price[] = [100 80 60 70 60 75 85]
Output:
1 1 1 2 1 4 6
Explanation:
Traversing the given input span for 100 will be 1, 80 maller than 100 so the span is 1, 60 is aller than
 30 so the span is 1, 70 is greater than 60 so the span 1s 2 and so on.
Hence the output will be 1 1 1 2 14 6.
Example 2:
Input:
N6, price[] = [10 45 90 120 80]
Output:
1 1 2 4 5 1
Explanation.
Traversing the given input span for 10 will be 1, 4 is smaller
than 10 so the span will be 1, 5 is greater than 4 so the span
will be 2 and so on
Bence, the output will be 112451 */

// import java.util.Stack;
// class Test{
//    public static int[] stockSpam(int[] price){
//         int n=price.length;
//         int []result=new int[n];
//         Stack<Integer> st=new Stack<Integer>();
//         result[0]=1;
//         st.push(0);
//         for(int i=0;i<n;i++){
//             while (st.isEmpty()==false && price[st.peek()]<=price[i]) {
//                 st.pop();
//             }
//             if (st.isEmpty()==true) {
//                 result[i]=i+1;
//             } else {
//                 result[i]=i-(st.peek());
//             }
//             st.push(i);
//         }
//         return result;
//     }
//     public static void main(String[] args) {
//         int price[] = {100,80,60,70,60,75,85};
//         int[] result=Test.stockSpam(price);
//         for (int i : result) {
//             System.out.print(i+" ");
//         }
//         System.out.println();
//         int price1[] = {10,4,5,90,120,80};
//         int []result1=Test.stockSpam(price1);
//         for (int i : result1) {
//             System.out.print(i+" ");
//         }
//     }
// }

                                    //SESSION-65 && 66
// INFIX TO POSTFIX 
// import java.util.Stack;
// class Test{
//     public static int priority(char ch){
//         if (ch=='+' || ch=='-') {
//             return 1;
//         } else if (ch=='/' || ch=='*') {
//             return 2;
//         }else{
//             return -1;
//         }
//     }
//     public static String infixToPostfix(String infix, int n){
//         String result="";
//         Stack<Character> stack=new Stack<Character>();
//         for(int i=0;i<n;i++){
//             char ch=infix.charAt(i);
//             if (Character.isLetterOrDigit(ch)==true) {
//                 result=result+ch;
//             } else if (ch=='(') {
//                 stack.push(ch);
//             }else if (ch==')') {
//                 while (stack.peek()!='(') {
//                     result=result+stack.pop();
//                 }
//                 stack.pop();
//             }else{
//                 if (stack.isEmpty()==true) {
//                     stack.push(ch);
//                 } else {
//                     while (stack.isEmpty()==false && priority(stack.peek())>=priority(ch)) {
//                         result=result+stack.pop();
//                     }
//                     stack.push(ch);
//                 }
//             }
//         }
//         while (!stack.isEmpty()) {
//             result=result+stack.pop();
//         }
//         return result;
//     }
//     public static void main(String[] args) {
//         String infix="(a+b)*(c/d)";
//         String postfix=Test.infixToPostfix(infix,infix.length());
//         System.out.println(infix);
//         System.out.println(postfix);
//     }
// }                                    

// INFIX TO PREFIX
import java.util.Stack;
class Test{
    public static int priority(char ch){
        if (ch=='+' || ch=='-') {
            return 1;
        } else if (ch=='/' || ch=='*') {
            return 2;
        }else{
            return -1;
        }
    }
    public static String infixToPostfix(String infix, int n){
        String result="";
        Stack<Character> stack=new Stack<Character>();
        for(int i=0;i<n;i++){
            char ch=infix.charAt(i);
            if (Character.isLetterOrDigit(ch)==true) {
                result=result+ch;
            } else if (ch==')') {
                stack.push(ch);
            }else if (ch=='(') {
                while (stack.peek()!=')') {
                    result=result+stack.pop();
                }
                stack.pop();
            }else{
                if (stack.isEmpty()==true) {
                    stack.push(ch);
                } else {
                    while (stack.isEmpty()==false && priority(stack.peek())>priority(ch)) {
                        result=result+stack.pop();
                    }
                    stack.push(ch);
                }
            }
        }
        while (!stack.isEmpty()) {
            result=result+stack.pop();
        }
        return result;
    }
    public static  String reverseString(String s){
        StringBuffer temp=new StringBuffer(s);
        temp.reverse();
        return new String(temp);
    }
    public static void main(String[] args) {
        String infix="(a+b)*(c/d)";
        String revinfix =Test.reverseString(infix);
        String postfix=Test.infixToPostfix(revinfix,revinfix.length());
        System.out.println(infix);
        String prefix=reverseString(postfix);
        System.out.println(prefix);
    }
}                                    