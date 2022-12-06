public class DataSorting {
        public void sumArray(int arrc[][],int arrd[][]){
            int A[][];
            A = new int[3][3];
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    A[i][j] = arrc[i][j] + arrd[i][j];
                }
            }
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(" [" + A[i][j] + "] ");
                }
                System.out.println();
            }
        }//执行矩阵相加运算
        public void proArray(int arrc[][],int arrd[][]){
            int B[][];
            B = new int[3][3];
            for (int i=0; i<3; i++){
                for (int j=0; j<3; j++){
                    for (int m=0; m<3; m++){
                        B[i][j]+=arrc[i][m]*arrd[m][j];
                    }
                }
            }
            for (int i=0; i<3; i++){
                for (int j=0; j<3; j++){
                    System.out.print(" ["+B[i][j]+"] ");
                }System.out.println();
            }
        }//执行矩阵相乘运算

    public static void main(String[] args) {
        int arrc[][] = {{1,2,3},{4,5,6},{7,8,9}};
        int arrd[][] = {{2,2,2},{1,1,1},{3,3,3}};

            System.out.println("矩阵c为");
        for (int i=0; i<3; i++){
        for (int j=0; j<3; j++){
            System.out.print("["+arrc[i][j]+"]");
        }System.out.println();
    }
            System.out.println("矩阵d为");
        for (int i=0; i<3; i++){
        for (int j=0; j<3; j++){
            System.out.print("["+arrd[i][j]+"] ");
        }System.out.println();
    }

    DataSorting DS = new DataSorting();
            System.out.println("矩阵相加的结果是：");
        DS.sumArray(arrc,arrd);
            System.out.println("矩阵相乘的结果是：");
        DS.proArray(arrc,arrd);
    }
}
