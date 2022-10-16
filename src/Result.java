import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Result {
    public static void print() {
        FileReader fileReader = null;
        BufferedReader br = null;
        String line = null;
        try {
            File testFile = new File("D:\\output.txt");
            if(!testFile.exists()) {
                System.out.println(testFile.getName() + " 文件不存在");
            }
            // 读取文件
            fileReader = new FileReader(testFile);
            br = new BufferedReader(fileReader);
            line = br.readLine();
            while(line != null) {
                System.out.println(line);
                line = br.readLine();
            }
        }catch(Exception e) {
            e.toString();
        }
        finally {
            if(br != null) {
                try {
                    br.close();
                }catch(Exception e) {
                    e.toString();
                    br = null;
                }
            }
            if(fileReader != null) {
                try {
                    fileReader.close();
                }catch(Exception e) {
                    e.toString();
                }
            }
        }
    }

}
