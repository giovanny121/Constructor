import java.util.ArrayList;

public class Arraylist {

    public static void main(String[] args) {
        // Example input arrays
        int[] ages = new int[]{13, 25, 34};
        String[] names = new String[]{"Shazli", "Melissa", "Hana"};

        // Call the concatNameAndAges function and store the result
        ArrayList<String> result = concatNameAndAges(ages, names);

        // Print the result
        System.out.println("Concatenated names and ages: " + result);
    }


    public static ArrayList<String> concatNameAndAges(int[] ages, String[] names) {
        // Create an ArrayList to hold the concatenated result
        ArrayList<String> resultList = new ArrayList<>();


        if (ages.length == names.length) {

            for (int i = 0; i < ages.length; i++) {
                resultList.add(names[i] + "-" + ages[i]);
            }
        } else {
            System.out.println("The lengths of the names and ages arrays do not match.");
        }

        // Return the result list
        return resultList;
    }
}


