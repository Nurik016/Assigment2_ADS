public class Methods {
    public static void printLinkedList(MyLinkedList list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " | ");
        }
    }

    public static void printArrayList(MyArrayList list){
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " | ");
        }
        System.out.println();
    }

    public static void alter(){
        System.out.println();
        System.out.println();
    }
}
