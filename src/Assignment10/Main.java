package Assignment10;

public class Main
{
    public static void main(String[] args)
    {
        SList<Integer> linkedlist=new SList<Integer>();
        SListIterator<Integer> list=linkedlist.iterator();
        list.add(1);  //insert at index 0
        list.add(3,2);
        list.add(2,2);
        list.add(4,4);
        System.out.println("after inserting elements\n"+linkedlist);
        list.remove(3);
        list.remove();   //remove from index 0
        System.out.println("After removing elements\n"+linkedlist);
    }
}
