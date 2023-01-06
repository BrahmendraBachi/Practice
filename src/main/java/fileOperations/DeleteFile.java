package fileOperations;

import java.io.File;

public class DeleteFile {


    public static void main(String[] args) {

        File originalFile = new File("C:\\Users\\haor1122\\NC Advanced\\cdc_common\\scm\\com\\" +
                "netcracker\\solutions\\cdc\\nc_general\\haor1122\\objects\\obj_9165467401813586476.xml");
        originalFile.delete();

        System.out.println(originalFile.delete());


    }
}
