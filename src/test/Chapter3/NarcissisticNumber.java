public class NarcissisticNumber {
    public static void Print(){
        for(int i = 100;i < 999_999;i++){
            int j = i,ret = 0,n = i,sum = 0;
            while(j != 0){                   //判断当前数是几位数
                ret++;
                j /= 10;
            }
            while(n != 0){                   //计算每一位数幂的和
                sum += Math.pow(n % 10,ret);
                n /= 10;
            }
            if(sum == i){
                System.out.print(i+" ");
            }
        }
    }
    public static void main(String[] args){
        Print();
    }
}