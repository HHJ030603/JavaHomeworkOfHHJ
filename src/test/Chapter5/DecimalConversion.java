import java.util.Scanner;

public class DecimalConversion {
    public static int  HexToDecimal(String hex){
        int outcome = 0;
        for(int i = 0; i < hex.length(); i++){
            char hexChar = hex.charAt(i);
            outcome = outcome * 16 + CharToDecimal(hexChar);
        }
        return outcome;
    }


    public static int CharToDecimal(char c){
        if(c >= 'A' && c <= 'F')
            return 10 + c - 'A';
        else if(c >= 'a' && c <= 'f')
            return 10 + c - 'a';
        else
            return c - '0';
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String content = input.nextLine();
        if(!content.matches("[0-9a-fA-F]*")){
            System.out.println("输入有误");
            System.exit(-1);
        }
        System.out.println(HexToDecimal(content));
    }
}
