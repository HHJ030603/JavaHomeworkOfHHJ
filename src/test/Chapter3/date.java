import java.util.Scanner;

public class date {
    public static void main(String args[]) {
        Scanner date = new Scanner(System.in);
        System.out.println("请输入月份：");
        int month = date.nextInt();
        System.out.println("请输入日期：");
        int day = date.nextInt();

        int dates = 0;
        switch(month){
            case 12:
                dates = dates+31;
            case 11:
                dates = dates+30;
            case 10:
                dates = dates+31;
            case 9:
                dates = dates+30;
            case 8:
                dates = dates+31;
            case 7:
                dates = dates+31;
            case 6:
                dates = dates+30;
            case 5:
                dates = dates+31;
            case 4:
                dates = dates+30;
            case 3:
                dates = dates+31;
            case 2:
                dates = dates+28;
            case 1:
                dates = day;
            default:
                System.out.println("你输入的是错误内容");
        }
        System.out.println("2014年"+month+"月"+day+"日是2014年的第"+dates+"天");
    }
}
