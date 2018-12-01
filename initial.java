package Assignment_5;

import java.util.Scanner;

public class initial {
    public static void main(String[] args) {
        MapTest mt = new MapTest();

        mt.inputST();

        mt.totalST();

        System.out.println("有无要删除的学生？(输入‘yes’进行操作)");
        Scanner input = new Scanner(System.in);
        String remove = input.next();
        if (remove == "yes" || remove == "Yes") {
            mt.removeST();
        }else {
            System.out.println("没有就算了.\n");
        }

        System.out.println("有无要修改的学生？(输入‘yes’进行操作)");
        String modify = input.next();
        if (modify == "yes" || remove == "Yes") {
            mt.modifyST();
        }else {
            System.out.println("没有就算了.\n");
        }
    }
}

