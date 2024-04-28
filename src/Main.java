public class Main {

    public static void main(String[] args) {

        MyArrayList myArrayList = new MyArrayList<>();

        myArrayList.add(1);
        myArrayList.add("Cool");
        myArrayList.add(3);
        myArrayList.add(4);
        myArrayList.add("TRY");


        System.out.print("List contains: ");
        printArrayList(myArrayList);
        System.out.println();


        System.out.print(String.format("the 4 index was: %s .", myArrayList.get(4)));
        myArrayList.set(10, "CATCH");
        System.out.println(String.format("The 4 index now: %s", myArrayList.get(4)));
        printArrayList(myArrayList);
        System.out.println();


        System.out.print(String.format("the 1 index was: %s .", myArrayList.get(1)));
        myArrayList.set(1, 10);
        System.out.println(String.format("the 1 index now: %s", myArrayList.get(1)));
        printArrayList(myArrayList);
        System.out.println();


        System.out.print(String.format("the 3 index was: %s .", myArrayList.get(3)));
        myArrayList.add(3, 65);
        System.out.print(String.format("the 3 index now: %s .", myArrayList.get(3)));
        System.out.println(String.format("the 4 index now: %s", myArrayList.get(4)));
        printArrayList(myArrayList);
        System.out.println();


        System.out.print(String.format("the 0 index was: %s .", myArrayList.get(0)));
        myArrayList.addFirst(123);
        System.out.print(String.format("the 0 index now: %s .", myArrayList.get(0)));
        System.out.println(String.format("the 1 index now: %s", myArrayList.get(1)));
        printArrayList(myArrayList);
        System.out.println();


        System.out.println(String.format("4 index is ", myArrayList.get(4)));
        System.out.println(String.format("0 index is ", myArrayList.getFirst()));
        System.out.println(String.format("last index is ", myArrayList.getLast()));
        alter();


        myArrayList.remove(5);
        printArrayList(myArrayList);
        alter();


        myArrayList.removeFirst();
        myArrayList.removeLast();
        printArrayList(myArrayList);
        alter();


        myArrayList.indexOf(5);
        myArrayList.lastIndexOf(3);
        myArrayList.exists(1);
        alter();


        myArrayList.clear();
        printArrayList(myArrayList);
        alter();

        System.out.print("List contains: ");
        printArrayList((myArrayList));


        System.out.println("-------------------------------------------------------");
        System.out.println("-------------------------------------------------------");
        System.out.println("-------------------------------------------------------");


        MyLinkedList myLinkedList = new MyLinkedList();

        myLinkedList.add(1);
        myLinkedList.add(2);
        myLinkedList.add(3);
        myLinkedList.add(4);
        myLinkedList.add(5);


        System.out.print("Initial linked list: ");
        printLinkedList(myLinkedList);
        System.out.println();


        myLinkedList.set(2, 10);
        System.out.println();
        System.out.println("After setting element at index 2 to 10:");
        printLinkedList(myLinkedList);
        alter();


        myLinkedList.add(3, 20);
        System.out.println("After adding element 20 at index 3:");
        printLinkedList(myLinkedList);
        alter();


        myLinkedList.addFirst(0);
        System.out.println("After adding element 0 at the first position:");
        printLinkedList(myLinkedList);
        alter();


        myLinkedList.addLast(100);
        System.out.println("After adding element 100 at the last position:");
        printLinkedList(myLinkedList);
        alter();


        System.out.println("First element: " + myLinkedList.getFirst());
        System.out.println();


        System.out.println("Last element: " + myLinkedList.getLast());
        System.out.println();


        myLinkedList.remove(3);
        System.out.println("After removing the element at index 3:");
        printLinkedList(myLinkedList);
        alter();


        myLinkedList.removeFirst();
        System.out.println("After removing the first element:");
        printLinkedList(myLinkedList);
        alter();


        myLinkedList.removeLast();
        System.out.println("After removing the last element:");
        printLinkedList(myLinkedList);
        alter();


        myLinkedList.sort();
        System.out.println("After sorting the linked list:");
        printLinkedList(myLinkedList);
        alter();


        System.out.println("Index of element 10: " + myLinkedList.indexOf(10));
        System.out.println();


        System.out.println("Last index of element 20: " + myLinkedList.lastIndexOf(20));
        System.out.println();


        System.out.println("Element 5 exists in the list: " + myLinkedList.exists(5));
        System.out.println();


        Object[] array = myLinkedList.toArray();
        System.out.print("Linked list converted to array: ");
        for (Object element : array) {
            System.out.print(element + " | ");
        }
        alter();


        myLinkedList.clear();
        System.out.print("After clearing the linked list:");
        printLinkedList(myLinkedList);
        System.out.println();
    }


    private static void printArrayList(MyArrayList list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " | ");
        }
        System.out.println();
    }

    private static void printLinkedList(MyLinkedList list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " | ");
        }
        System.out.println();
    }

    public static void alter() {
        System.out.println();
        System.out.println();
    }
}