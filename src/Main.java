public class Main {
//    public class Solution {
        public boolean Find(int target, int [][] array) {
            boolean isFind=false;
            if(array.length== 0)
            {
                isFind=false;
            }else{
                int n =array[0].length-1;
                int m=0;
                //int m = array.length/array[0].length;
                while(m<=array.length/array[0].length-1&&n>=0){

                    if(target== array[m][n]){
                        isFind=true;
                        break;
                    }else if(target<array[m][n]){
                        n--;
                    }else{
                        m++;
                    }
                }
            }
            return isFind;
        }
//    }
    public static void main(String[] args) {
        System.out.println("Hello World!");
        a=7;
        b=[[1,2,8,9],[2,4,9,12],[4,7,10,13],[6,8,11,15]];
        boolean f=Find(a,b);
        System.out.println(f);
    }
}
