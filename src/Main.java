import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File myObj = new File("src/calories.txt");
        Scanner myReader = new Scanner(myObj);

        List<Integer> somList = new ArrayList<>();
        int som = 0;
        while (myReader.hasNextLine()) {
            String data = myReader.nextLine();
            if (!data.equals("")) {
                som += Integer.parseInt(data);
            } else {
                somList.add(som);
                som = 0;
            }
        }
        myReader.close();
        somList.sort(Collections.reverseOrder());

        //Day 1: part 1

        System.out.println(somList.get(0));

        //Day 1: part 2

        System.out.println(
                somList.get(0)
                        + somList.get(1)
                        + somList.get(2));
    }
}

