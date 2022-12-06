import java.util.Random;
import java.util.Scanner;

    public class  ArrayOperation{
        int capacity = 10;//数组容量
        int  length = 0;//数组所存放的数据长度
        public int[] adddate(int arr[], int add, int length){
            boolean addsuccess = false;
            if (length >= arr.length){
                int newarr[] = new int[2*arr.length];
                for (int i=0; i<arr.length; i++){
                    newarr[i] = arr[i];
                }
                arr = newarr;
            }
            for (int i=0; i < length; i++){
                if (add <= arr[i]){
                    for (int j=length; j>i; j--){
                        arr[j] = arr[j-1];
                    }
                    arr[i] = add;
                    addsuccess = true;
                    break;
                }
            }
            if (!addsuccess) arr[length] = add;
            System.out.println("插入成功");
            return arr;
        }
        public void sortArrary(int arr[]){
            for (int i = 0;i < arr.length;i++){
                for (int j = i; j < arr.length;j++){
                    if (arr[i] >= arr[j]){
                        int tmp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = tmp;
                    }
                }
            }
        }

        public static void main(String[] args) {
            ArrayOperation arr2 = new ArrayOperation();
            int randarray[] = new int[arr2.capacity];
            Random r = new Random();
            for (int i=0; i < arr2.capacity; i++){
                randarray[i] = r.nextInt(100);
                arr2.length++;
            }

            arr2.sortArrary(randarray);
            //使用Arrays类自带的的静态方法sort（），直接排序
            //Arrays.sort(randarray);
            for (int i=0; i<arr2.length; i++) {
                System.out.print("[" + randarray[i] + "]");
            }

            System.out.println('\n'+"请输入要插入的数字：");
            Scanner cin=new Scanner(System.in);
            int addnumber=cin.nextInt();//输入一个整数
                while (addnumber<10||addnumber>99){
                    System.out.println("请输入二位正整数：");
                    addnumber = cin.nextInt();
            }

            randarray = arr2.adddate(randarray,addnumber,arr2.length);
            arr2.length++;
            for (int i=0; i<arr2.length; i++) {
                System.out.print("[" + randarray[i] + "]");
            }
        }
    }

