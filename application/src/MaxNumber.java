import java.io.BufferedReader;
import java.io.FileReader;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MaxNumber {

    public static void main(String[] args){

        File file = new File("C:\\OneDriveTemp\\in.txt");

        List<Product> list = new ArrayList<>();
        try(BufferedReader br = new BufferedReader(new FileReader(file))) {

            String line = br.readLine();
            while(line != null){
                String[] fields = line.split(",");
                list.add(new Product(fields[0], Double.parseDouble(fields[1])));
                line = br.readLine();
            }

            Product maxi = CalculationService.max(list);
            System.out.println("Max " + maxi);


        } catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }

    }

}
