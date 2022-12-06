import java.util.Scanner;//导入Scanner类

public class Convertcase {
    public static void main(String args[]){
        Scanner caseScanner = new Scanner(System.in);
        System.out.println("请输入要转换的字母：");
        char c1 = caseScanner.next().charAt(0);//输入字符串，截取其第一个字符
        switch (c1){
            case'a':
                System.out.println("A");
                break;
            case'b':
                System.out.println("B");
                break;
            case'c':
                System.out.println("C");
                break;
            case'd':
                System.out.println("D");
                break;
            case'e':
                System.out.println("E");
                break;
            default:
                System.out.println("other and 2021302111402-黄浩军");
        }
    }
}
