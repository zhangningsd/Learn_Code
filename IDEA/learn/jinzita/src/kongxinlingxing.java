import java.util.Scanner;

public class kongxinlingxing {
    public static void main(String [] args) {
        draw(5);
    }
    //打印给定行数的空心菱形
    public static void draw(int size){
        if (size % 2 == 0) //如果是偶数行变为奇数
        {
            size++;
        }
        //中心点:2*size -1 ,实现的关键在于找准中心点,下面以打印7行的空心菱形为例进行分析
        for (int i = 0; i < size/2+1; i++)//打印菱形上面的4行
        {
            for (int j = 0; j < 2*size - 1; j++)//每一行的总长度是2*size -1
            {
                if (j == (size -1-2*i) || j ==(size -1 + 2*i))//中心点左右两边对称的位置打印 * 号
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for (int i = size/2-1; i >= 0; i--)//打印菱形下面的3行
        {
            for (int j = 0; j < 2*size - 1; j++)
            {
                if (j == (size -1-2*i) || j ==(size -1 + 2*i))//中心点左右两边对称的位置打印 * 号
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
