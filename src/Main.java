public class Main {
    public static void main(String[] args) {
   LinkedList <String> linkedList = new LinkedList<>();


        linkedList.addLast ("B");
        linkedList.addLast ("C");
        linkedList.addLast ("D");
        linkedList.addLast ("E");
        System.out.println("LL: " + linkedList);
        linkedList.addFirst("A");
        System.out.println("LL: " + linkedList);

        System.out.println("индекс элемента со значением E: " + linkedList.get("E"));
        System.out.println("индекс элемента со значением 121212: " + linkedList.get("121212"));

   linkedList.remove("C");
        System.out.println("LL:" + linkedList);
    }
}