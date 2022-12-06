import java.util.Scanner;

public class month {
    public static void main(String args[]){
        Scanner season = new Scanner(System.in);
        System.out.println("请输入月份：");
        int month = season.nextInt();

        switch(month/3) {
            case 1:
                System.out.println("春季");
                break;
            case 2:
                System.out.println("夏季");
                break;
            case 3:
                System.out.println("秋季");
                break;
            case 4:
                System.out.println("冬季");
                break;
        }
    }
}
