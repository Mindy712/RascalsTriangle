import java.io.File;
import java.util.Scanner;

public class RascalTriangleMain {
    public static void main(String[] args) {
        RascalTriangle rascalTriangle = new RascalTriangle();
        try (Scanner inputFile = new Scanner(new File("sample_rascal_input.txt"))) {
            int numDataSets = inputFile.nextInt();
            for (int i = 1; i <= numDataSets; i++) {
                inputFile.nextInt();
                int triangleEntry = rascalTriangle.getTriangleEntry(inputFile.nextInt(), inputFile.nextInt());
                System.out.println(i + " " + triangleEntry);
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
