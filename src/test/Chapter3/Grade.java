import java.util.Scanner;//导入Scanner类

public class Grade {
    public static void main(String args[]){
        Scanner grade = new Scanner(System.in);
        System.out.println("学生的成绩为：");
        int score = grade.nextInt();
        if(0 <= score && score < 60){
            System.out.println("不合格");
        } else if(score >= 60 && score <= 100){
            System.out.println("合格");
        }else{
            System.out.println("输入错误");
        }
    }
}
