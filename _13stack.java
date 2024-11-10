                                        /* SESSION-63 */
                                        /*  STACK     */
import java.util.Scanner;
class Test{
    static boolean isEmpty(int[] stack,int top){
     if (top==-1) {
         return true;
     } else {
         return false;
     }
    }
    static int push(int [] stack,int top){
    if (top==(stack.length-1)) {
        System.out.println("stack is full");
        return top;
    }
    else{
     Scanner s=new Scanner(System.in);
     System.out.println("enter stack element: ");
     int item=s.nextInt();
     stack[++top]=item;
     System.out.println("item pushed");
     return top;
     }
    }
    static String peek(int[] stack,int top){
        return "peek element is: "+stack[top];
    }
    static int  pop(int[] stack,int top){
        int x=stack[top];
        System.out.println(x);
       return --top;
    }
    static void traverse(int[] stack,int top){
            for (int i = 0; i <=top; i++) {
                System.out.print(stack[i]+" ");
            }
    }
     public static void main(String[] args) {
         int[] stack=new int[5];
         int top=-1;
         System.out.println(isEmpty(stack,top));
        push(stack,top);
         System.out.println(top);
         System.out.println(isEmpty(stack,top));
        //  top=push(stack,top);
        //  top=push(stack,top);
        //  System.out.println(peek(stack, top));
        // top= pop(stack,top);
        // System.out.println(top);
        // top=push(stack,top);
       // System.out.println(top);
         System.out.println(isEmpty(stack,top));
         traverse(stack,top);
     }
 }                                        