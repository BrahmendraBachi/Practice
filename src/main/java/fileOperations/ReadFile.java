package fileOperations;

import java.io.File;

public class ReadFile {

    public static void main(String[] args) {

        File file = new File(
                "C:\\Users\\haor1122\\Desktop\\index.xml");

        System.out.println(file.isFile());
    }

}
