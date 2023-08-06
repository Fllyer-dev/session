/* ============================================
code by relyaf
===============================================
*/
import java.util.ArrayList;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello! Welcome to the \"session\" where we will record everything you say!");
        System.out.println("l [list] - check all data.\nr [run] - Record the data.\nrm [remove] - remove data.");

        System.out.println("There are data types: int && string && boolean && float");
        System.out.print("\nWhat type of data do you choose?: ");
        String state = sc.nextLine();

        ArrayList<Object> data = new ArrayList<>();

        if (state.equals("int")) {
            do {
                System.out.print("\nWhat value will we record?: ");
                try {
                    int input = sc.nextInt();
                    sc.nextLine();
                    data.add(input);
                    System.out.print("To continue, write 'done' or 'list' if you want to check the data in the array: ");
                } catch (Exception e) {
                    sc.nextLine(); // Clear input buffer
                    System.out.println("Invalid input. Please enter a valid integer.");
                }
            } while (!sc.nextLine().equals("done"));
        } else if (state.equals("string")) {
            do {
                System.out.print("\nWhat value will we record?: ");
                String input = sc.nextLine();
                data.add(input);
                System.out.print("To continue, write 'done' or 'list' if you want to check the data in the array: ");
            } while (!sc.nextLine().equals("done"));
        } else if (state.equals("boolean")) {
            do {
                System.out.print("\nWhat value will we record? (true/false): ");
                try {
                    boolean input = sc.nextBoolean();
                    sc.nextLine();
                    data.add(input);
                    System.out.print("To continue, write 'done' or 'list' if you want to check the data in the array: ");
                } catch (Exception e) {
                    sc.nextLine(); // Clear input buffer
                    System.out.println("Invalid input. Please enter 'true' or 'false'.");
                }
            } while (!sc.nextLine().equals("done"));
        } else if (state.equals("float")) {
            do {
                System.out.print("\nWhat value will we record?: ");
                try {
                    float input = sc.nextFloat();
                    sc.nextLine();
                    data.add(input);
                    System.out.print("To continue, write 'done' or 'list' if you want to check the data in the array: ");
                } catch (Exception e) {
                    sc.nextLine(); // Clear input buffer
                    System.out.println("Invalid input. Please enter a valid floating-point number.");
                }
            } while (!sc.nextLine().equals("done"));
        }

        if (data.size() > 0) {
            System.out.println("Now you will see all the data in the array!");
            for (Object value : data) {
                System.out.println("Element: " + value);
            }
        } else {
            System.out.println("No data recorded.");
        }
    }
}
/* ============================================
code by relyaf
===============================================
*/
