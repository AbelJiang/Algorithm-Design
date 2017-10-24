public class Anagram{
    public static void main(String[] args){
        String a=args[0];
        String b=args[1];
        if(a.length()!=b.length()){
            System.out.println("Impossible!");
        }else{
            int[] stat=new int[26];
            int diff=a.length();
            for(int i=0;i<a.length();i++){
                stat[a.charAt(i)-'a']++;
            }
            for(int j=0;j<b.length();j++){
                stat[b.charAt(j)-'a']--;
                if(stat[b.charAt(j)-'a']>=0){
                    diff--;
                }
            }
            System.out.println("Diffrent characters: "+diff);
        }
    }
}