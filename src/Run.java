import module1.Main1;
import module2.Main2;
import module3.Main3;
import module4.Main4;

import java.io.IOException;
import java.util.Scanner;

public class Run {
    public static void main(String[] args) throws IOException {
        System.out.println("********欢迎使用经典软件体系结构教学软件********");
        System.out.print("1、主程序-子程序\n2、面向对象\n"
                + "3、事件系统\n4、管道-过滤器\n");
        System.out.println("请选择处理文件的程序风格：");
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        Run main = new Run();
        if (input.equals("1")) {
            System.out.println("主程序-子程序风格:结构化程序设计的一种典型风格，" +
                    "从功能的观点设计系统，通过逐步分解和细化，形成整个系统的体系结构。");
            Main1 main1 = new Main1();
            main1.main1();
            Result re1 = new Result();
            System.out.println("文件处理结果如下:");
            re1.print();
        } else if (input.equals("2")) {
            System.out.println("面向对象风格:构件变成对象,连接的方式也发生了相应的变化, " +
                    "系统被看作是对象的集合，每个对象都有一个它自己的功能集合。");
            Main2 main2 = new Main2();
            main2.main2();
            Result re2 = new Result();
            System.out.println("文件处理结果如下:");
            re2.print();
        } else if (input.equals("3")) {
            System.out.println("事件系统风格：系统中的其他构件中的过程在一个或多个事件中注册，" +
                    "当一个事件被触发，系统自动调用在这个事件中注册的所有过程。");
            Main3 main3 = new Main3();
            main3.main3();
            Result re3 = new Result();
            System.out.println("文件处理结果如下:");
            re3.print();
        } else{
            System.out.println("管道-过滤器风格：每个过滤器有一组输入端和输出端。一个过滤器从输入端读取数据流," +
                    "通过本地转换和渐增计算,向输出端输出数据流。管道充当数据流的通道," +
                    "将一个过滤器的输出端连接到另一个过滤器的输入端。");
            Main4 main4 = new Main4();
            main4.main4();
            Result re4 = new Result();
            System.out.println("文件处理结果如下:");
            re4.print();
        sc.close();
    }

}
}

