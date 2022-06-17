public class MiGong {
    public static void main(String[] args) {
        int[][] map = new int[8][7];

        //将最上和最下两行置为 1
        for (int i = 0; i < 7; i++) {
            map[0][i] = 1;
            map[7][i] = 1;
        }

        //将最左和最右两列置为 1
        for (int i = 0; i < 7; i++) {
            map[i][0] = 1;
            map[i][6] = 1;
        }

        map[3][1] = 1;
        map[3][2] = 1;
        map[2][2] = 1;

        System.out.println("输出当前迷宫：");
        display(map);

        Tools tools = new Tools();
        tools.findWay(map, 1, 1);
        System.out.println("输出路线：");
        display(map);
    }

    public static void display(int[][] x) {
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                System.out.print(x[i][j] + "  ");
            }
            System.out.println();
        }
    }
}

class Tools {

    //1.findway方法就是专内来找出迷宫的路径
    //2．如果找到,就返回true ,否则返回false:
    //3. map就是二维数组,即表示迷宫
    //4. i,j就是老鼠的位置，初始化的位置为(1,1)
    //5．因为我们是递归的找路，所以我先规定map数组的各个值的含义
    //0表示可以走1表示障碍物2表示可以走3表示走过，但是走不通是死路
    //6．当map[6][5] =2就说明找到通路，就可以结束，否则就继续找.
    //7．先确定老鼠找路策略下->右->上-→>左

    public boolean findWay(int[][] map, int i, int j) {
        if (map[6][5] == 2) {
            return true;
        } else {
            if (map[i][j] == 0) {
                map[i][j] = 2;
                if (findWay(map, i + 1, j)) {
                    return true;
                }else if (findWay(map, i, j + 1)) {
                    return true;
                }else if (findWay(map, i - 1, j)) {
                    return true;
                }else if (findWay(map, i, j - 1)) {
                    return true;
                } else {
                    map[i][j] = 3;
                    return false;
                }
            }else {
                return false;
            }
        }
    }
}
