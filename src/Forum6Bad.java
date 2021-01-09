import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class Forum6Bad {
    public static void main(String[] args) {
        //membuat file baru
        File file = new File("/Users/iqbalfauzan/mywork/kuliah/bad/forum_bad.txt");
        try {
            if (file.createNewFile()){
                System.out.println("Creating new file success");
            } else {
                System.out.println("Failed Create new file");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        long lastModified = file.lastModified();
        Date date = new Date(lastModified);
        System.out.println(date);

        //Membuat file dalam directory
        File file1 = null;
        File dir = new File("/Users/iqbalfauzan/mywork/kuliah/bad/");
        try {
            file1 = File.createTempFile("JavaTemp", ".javatemp", dir);
        } catch (IOException e) {
            e.printStackTrace();
        }
        assert file1 != null;
        System.out.println(file1.getPath());

        //memeriksa keberadaan file
        System.out.println(file.exists());

        //membuat file read-only
        System.out.println(file.setReadOnly());
        System.out.println(file.canWrite());

        //mengganti nama file
        File newFile = new File("/Users/iqbalfauzan/mywork/kuliah/bad/forum_bad_new.txt");
        if (file.renameTo(newFile)){
            System.out.println("success rename file");
        } else {
            System.out.println("failed to rename file");
        }

        //menambah string ke file
        try {
            BufferedWriter out = new
                    BufferedWriter(new FileWriter("outfilename"));
            out.write("aString");
            out.close();
            System.out.println
                    ("File created successfully");
        }
        catch (IOException e) {
        }
    }
}
