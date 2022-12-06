public class YanghuiTriangle {
        public static void main(String[] args) {
            int level=10;// 先确定要输出的行数
            int Yanghui[][] = new int[level][];
            for(int i=0; i < Yanghui.length; i++) {
                Yanghui[i] = new int[i+1];
                Yanghui[i][0] = 1;
                Yanghui[i][i] = 1;//每行第一和第i个元素均为1
            }
            for(int i=2; i < Yanghui.length; i++) {
                for(int j=1; j<i; j++) {
                    Yanghui[i][j] = Yanghui[i-1][j-1] + Yanghui[i-1][j];//每个数等于它上方两数之和
                    Yanghui[i][Yanghui[i].length-1] = 1;
                }
            }
            for(int i=0; i < Yanghui.length; i++) {
                for(int j=0; j<Yanghui[i].length; j++) {
                    System.out.print(Yanghui[i][j] + " ");
                }
                System.out.println();
            }// 逐行打印出结果
        }
}
