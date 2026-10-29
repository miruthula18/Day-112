import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a word: ");
        StringBuffer sb = new StringBuffer(sc.nextLine());

        System.out.print("Enter word to insert: ");
        String word = sc.nextLine();

        System.out.print("Enter index: ");
        int index = sc.nextInt();

        if (index >= 0 && index <= sb.length()) {
            sb.insert(index, word);
            System.out.println("Result: " + sb);
        } else {
            System.out.println("Invalid index");
        }

        sc.close();
    }
}
