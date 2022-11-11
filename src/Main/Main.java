package Main;
import br.unicap.edi.dlld.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int capacity;
        System.out.println("Insert the list capacity:");
        capacity = Integer.parseInt(s.nextLine());
        DoublyLinkedList<Integer> list = new DoublyLinkedList<>(capacity);
        int op;
        Integer number;

        do {
            options();
            op = Integer.parseInt(s.nextLine());
            switch (op) {

                case 1:
                    if (!list.isFull()) {
                        System.out.println("Insert a number: ");
                        number = Integer.parseInt(s.nextLine());
                        list.insertionDescendingSort(number);
                    } else {
                        System.out.println("List is full!");
                    }
                    break;
                case 2:
                    System.out.println("Insert a number: ");
                    number = Integer.parseInt(s.nextLine());
                    list.removeNode(number);
                    break;
                case 3:
                    System.out.println("Insert a number: ");
                    number = Integer.parseInt(s.nextLine());
                    DoublyLinkedNode<Integer> search = list.search(number);
                    if (search == null) {
                        System.out.println("Number not found!");
                    } else {
                        System.out.println("Number is on the list. Result: " + search.getContent());
                    }
                    break;
                case 4:
                    list.showAll();
                    break;
                case 0:
                    System.out.println("End of the program!");
                    break;
                default:
                    System.out.println("Not an option!");
                    break;
            }

        } while (op != 0);
    }

    public static void options() {
        System.out.println("1 - Add a number to the list\n" + "2 - Remove a number from the list\n"
                + "3 - Search for a number on the list\n" + "4 - Show all numbers on the list");
    }
}

