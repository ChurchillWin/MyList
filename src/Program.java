public class Program {
    public static void main(String[] args) {
        MyList<Integer> list1 = new MyList<>();
        list1.insertStart(1);
        list1.insertStart(2);
        list1.insertStart(3);
        list1.insertStart(4);
        list1.insertStart(5);
        list1.insertStart(6);
        list1.insertStart(7);
        list1.insertStart(8);

        MyList<Integer> list2 = new MyList<>();
        list2.insertStart(10);
        list2.insertStart(20);
        list2.insertStart(30);
        list2.insertStart(40);
        list2.insertStart(50);
        list2.insertStart(60);
        list2.insertStart(70);
        list2.insertStart(80);


        MyList<MyList<Integer>> listOfLists = new MyList<>();
        listOfLists.insertStart(list2);
        listOfLists.insertStart(list1);

        System.out.println(listOfLists.toString());
    }
}
