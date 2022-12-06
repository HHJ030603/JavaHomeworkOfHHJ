public class SumOfOddNumber {
    public static void main(String[] args){
        int sum = 0;
        for(int i = 0;i <= 100;i++){
            if(i % 2 != 0){
                sum +=i;
            }
        }
        System.out.print("一到一百的奇数和等于"+sum);
    }
}