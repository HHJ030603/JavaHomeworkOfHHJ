import java.util.Scanner;

    public class StringSearching {

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.println("输入一个字符");
            char ch1 = (in.nextLine()).charAt(0);

            Scanner sc = new Scanner(System.in);
            System.out.println("输入一个字符串");
            String str =sc.nextLine();

            int lastposition = 0;
            for(int i = 0;i < str.length();i++){
                if(ch1 == str.charAt(i) ){
                    lastposition = i+1;
                }
            }
            if(lastposition == 0) {
                System.out.println("Not Found");
            }
            else {
                System.out.println("字符" + ch1 + "在字符串" + str + "中最后出现的位置是第" + lastposition + "位");
            }
        }
    }

