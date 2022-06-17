import java.io.File;
import java.io.IOException;

//测试类
public class delete {

    public static void main(String[] args) {
        delete test = new delete();
        try {
            test.del("E:\\Documents\\学习笔记\\SiYuan");
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public void del(String filepath) throws IOException {
        File f = new File(filepath);// 定义文件路径
        if (f.exists() && f.isDirectory()) {// 判断是文件还是目录
            if (f.listFiles().length == 0) {// 若目录下没有文件则直接删除
                f.delete();
            } else {// 若有则把文件放进数组，并判断是否有下级目录
                File delFile[] = f.listFiles();
                int i = f.listFiles().length;
                for (int j = 0; j < i; j++) {
                    if (delFile[j].isDirectory()) {
                        del(delFile[j].getAbsolutePath());// 递归调用del方法并取得子目录路径
                    }
                    delFile[j].delete();// 删除文件
                    System.out.println(delFile[j]);
                }
            }
        }
    }
}