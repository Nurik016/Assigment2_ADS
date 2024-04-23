public class Main {
    public static void main(String[] args)  {
        MyArrayList myArrayList = new MyArrayList<>();


        myArrayList.add(1);
        myArrayList.add("Cool");
        myArrayList.add(3);
        myArrayList.add(4);
        myArrayList.add("TRY");

        System.out.println("List contains: ");
        System.out.println(myArrayList.get(0));
        System.out.println(myArrayList.get(1));
        System.out.println(myArrayList.get(2));
        System.out.println(myArrayList.get(3));
        System.out.println(myArrayList.get(4));

        System.out.println("-------------------------------------------------------");

        System.out.println(String.format("the 4 index was: %s", myArrayList.get(4)));
        myArrayList.set(4, "CATCH");
        System.out.println(String.format("the 4 index now: %s", myArrayList.get(4)));

        System.out.println("-------------------------------------------------------");

        System.out.println(String.format("the 1 index was: %s", myArrayList.get(1)));
        myArrayList.set(1, 10);
        System.out.println(String.format("the 1 index now: %s", myArrayList.get(1)));

        System.out.println("-------------------------------------------------------");

        System.out.println(String.format("the 3 index was: %s", myArrayList.get(3)));
        myArrayList.add(3, 65);
        System.out.println(String.format("the 3 index now: %s", myArrayList.get(3)));
        System.out.println(String.format("the 4 index now: %s", myArrayList.get(4)));

        System.out.println("-------------------------------------------------------");

        System.out.println(String.format("the 0 index was: %s", myArrayList.get(0)));
        myArrayList.addFirst(123);
        System.out.println(String.format("the 0 index now: %s", myArrayList.get(0)));
        System.out.println(String.format("the 1 index now: %s", myArrayList.get(1)));

        System.out.println("-------------------------------------------------------");

        System.out.println(String.format("4 index is ", myArrayList.get(4)));
        System.out.println(String.format("0 index is ", myArrayList.getFirst()));
        System.out.println(String.format("last index is ", myArrayList.getLast()));

        System.out.println("-------------------------------------------------------");

        System.out.println(myArrayList.get(0));
        System.out.println(myArrayList.get(1));
        System.out.println(myArrayList.get(2));
        System.out.println(myArrayList.get(3));
        System.out.println(myArrayList.get(4));
        System.out.println(myArrayList.get(5));
        System.out.println(myArrayList.get(6));




    }
}