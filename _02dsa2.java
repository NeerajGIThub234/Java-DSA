//factorial of any no.  
class Factorial{
    public static void main(String[] args) {
        int n=Integer.parseInt(args[0]);
        int num=1;
        for (int i=n;i>=1;i--) {
           num=num*i;
        }
        System.out.println(num);
    }
}

class Fact
{
    static int fact(int n){
        int result=1;
        for(int i=2;i<=n;i++){
            result=result*i;
        }
        return result;
    }
    static int comb(int n, int r)
    {
        return (fact (n))/(fact(r)*fact(n-r));
    }
    public static void main(String[] args) {
        int n=Integer.parseInt(args[0]);
        int r=Integer.parseInt(args[1]);
        System.out.println(Fact.comb(n, r));
    }
}

/*
    1 
   1 1
  1 2 1
 1 3 3 1
1 4 6 4 1
 */
class Session11
{
    static int fact(int n){
        int result=1;
        for(int i=2;i<=n;i++){
            result=result*i;
        }
        return result;
    }
    static int comb(int n, int r)
    {
        return (fact (n))/(fact(r)*fact(n-r));
    }
    static void pattern(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print(comb(i-1,k-1)+" ");
            }
        System.out.println();
        }
    }
    static void pattern1(int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=1;j<=n-i+1;j++)
            {
                System.out.print(" ");
            }
            for(int k=0;k<=i;k++){
                System.out.print(comb(i,k)+" ");
            }
        System.out.println();
        }
    }
    public static void main(String[] args) {
        int n=Integer.parseInt(args[0]);
        //pattern(n);
        pattern1(n);
    }
}
