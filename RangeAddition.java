public class RangeAddition{
    public static void main(String[] args){
        int m=3;
        int n=4;
        int[][] ops=new int[5][2];

        System.out.println("Maximum count of elements: "+maxCount(m, n, ops));
    }

    public static int maxCount(int m, int n, int[][] ops) {
        int minRow=m;
        int minCol=n;
        for(int i=0;i<ops.length;i++){
            if(ops[i][0]<minRow)
                minRow=ops[i][0];
            if(ops[i][1]<minCol)
                minCol=ops[i][1];
        }
        return minRow*minCol;
    }
}

