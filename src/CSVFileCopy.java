
/**
 *
 * @author komputer 24
 */

    
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CSVFileCopy {
    public static void main(String[] args) {
        String sourceFile = "C:\\Users\\komputer 24\\Documents\\New folder\\Asal.csv";
        String destinationFile = "C:\\Users\\komputer 24\\Documents\\New folder\\Tujuan.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(sourceFile));
             BufferedWriter bw = new BufferedWriter(new FileWriter(destinationFile))) {

            String line;
            while ((line = br.readLine()) != null) {
                bw.write(line);
                bw.newLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

    

