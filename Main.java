package ge.edu.btu;
import org.apache.log4j.Logger;
import java.io.File;
import java.io.FilenameFilter;
import java.util.Scanner;
public class Main {
    final static Logger logger = Logger.getLogger(Main.class);
    public static void main(String[] args) {
        System.out.print("გთხოვთ შეიყვანოთ რაიმე სიტყვა : ");
        Scanner sc = new Scanner(System.in);
        String searchName = sc.nextLine();
        logger.info("შემოტანილია სიტყვა : " + searchName);
        File file = new File("/Users/saba/");
        listOfFiles(file, searchName);
    }
    public static void listOfFiles(File dirPath, String searchVal) {
        File[] filesList = dirPath.listFiles();
        for (File file : filesList) {
            if (file.getName().toLowerCase().startsWith(searchVal.toLowerCase()))
                logger.info("ნაპოვნი იქნა : " + file.getName());
            if (file.isDirectory())
                listOfFiles(file, searchVal);
        }
    }
}