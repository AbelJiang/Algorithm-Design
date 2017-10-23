public class NumberHoles{
    public static void main(String[] args){
        System.out.println("Holes in this string: "+ countHoles(args[0]));
    }

    public static int countHoles(String input){
        boolean[] oneHole=new boolean[10];
        oneHole[0]=true;
        oneHole[4]=true;
        oneHole[6]=true;
        oneHole[8]=true;
        oneHole[9]=true;
        int count=0;
        for(int i=0;i<input.length();i++){
            boolean x=oneHole[input.charAt(i)-'0'];
            if(x==true){
                count++;
                if(input.charAt(i)=='8'){
                    count++;
                }
            }
        }
        return count;
    }
}