public class HanoiTower {
    public static void main(String[] args) {
        Tower tower = new Tower();
        tower.move(3,'A', 'B', 'C');
    }
}

class Tower {
    public void move(int num, char a, char b, char c){
        if (num == 1) {
            System.out.println(a + "=>" + c);
        }else {
            //把上面 num - 1 个盘借助 c， 移动到b上
            move(num - 1, a, c, b);
            //把最下面的盘移动到 c
            System.out.println(a + "=>" + c);
            //再把b 上的盘借助a，移动到 c
            move(num - 1, b, a, c);
        }
    }
}
