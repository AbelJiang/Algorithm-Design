public class FracAddSub{
    public static void main(String[] args){
        String s="1/2+1/2+1/3";
        int a=0;
        int b=1;
        int c,d;
        for(String x:s.split("\\+")){
            String[] cd=x.split("/");
            c=Integer.parseInt(cd[0]);
            d=Integer.parseInt(cd[1]);
            a=a*d+b*c;
            b=b*d;     
        }
        
        int m=gcd(a,b);
        System.out.println((a/m)+"/"+(b/m));
    }

    public static int gcd(int x, int y){
        if(x<y){
            int temp=x;
            x=y;
            y=temp;
        }
        
        while(x%y!=0){
            int temp=y;
            y=x%y;
            x=temp;
        }
        return y;
    }
}