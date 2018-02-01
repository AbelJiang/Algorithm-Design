public class Fib{
    public static void main(String[] args){
        int a=0,b=1,c=0;
        while(a<20){
            a=b+c;
            c=b;
            b=a;
            System.out.println(a);
        }
    }
}