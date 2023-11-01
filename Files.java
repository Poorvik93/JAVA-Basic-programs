import java.io.File;

class Files {
    public static void main(String args[]) {
        // File == An abstract Representation of file and directory pathnames
        File file = new File("D:/Coding/java/Collections/ArrayList_Hetero.java");

        if (file.exists()) {
            System.out.println("The file exists!");
            System.out.println(file.getPath());
            System.out.println(file.getAbsolutePath());
            System.out.println(file.isFile());
            // file.delete();  // use this the file will be deleted automatically.
        } else {
            System.out.println("The file does not exist!! :(");
        }
    }
}
