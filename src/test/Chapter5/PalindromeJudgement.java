import java.util.Scanner;

public class PalindromeJudgement {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("输入一个字符串");
            String a =sc.nextLine();

            int len = a.length(); //获取所输入字符串的长度
            char[] ch = a.toCharArray();//将字符串转化为一个字符数组
            for (int i = 0,j=len-1; i <= j ; i++,j--) {
                if (ch[i] == ch[j]){
                    if ( j==len/2 || i==j){//判断比较的是不是最后一组  当长度为偶数时：j==len/2；当长度为奇数时：i==j
                        System.out.println("该字符串是回文数");
                    }
                }
                    else {
                        System.out.println("该字符串不是回文数");
                    break;
                }
            }
        }
}


