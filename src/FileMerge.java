
import java.io.*;




public class FileMerge {
    public static void main(String[] args) {
        String[] files = {"C:\\Users\\komputer 24\\Documents\\New folder\\File1.txt", "C:\\Users\\komputer 24\\Documents\\New folder\\File2.txt"};
        String mergeFile = "C:\\Users\\komputer 24\\Documents\\New folder\\Merge.txt";
        
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(mergeFile))) {
            for (String file : files) {
                try (BufferedReader br = new BufferedReader(new FileReader(file))) {
                    String line;
                    while ((line = br.readLine()) !=null) {
                        bw.write(line);
                        bw.newLine();
                    } 
                } catch (IOException e){
                    e.printStackTrace();
                }
            }
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}