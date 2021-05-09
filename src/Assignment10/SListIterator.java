package Assignment10;

public class SListIterator<T>
{
    SList<T> linkedList;
    Link<T> head;
    Link<T> curr;
    Link<T> pre;


    public SListIterator(SList<T> slist)
    {
        linkedList=slist;
        head= linkedList.getHead();
    }

    public void add(T ele)
    {
        add(ele,1);
    }

    public void add(T ele,int index)
    {
        Link<T> temp=new Link(ele);
        curr=head;
        pre=null;

        if(head==null)
            head=temp;

        else if(index==1)
        {
            temp.next = head;
            head=temp;
        }

        else
        {
            for (int i = 0; i < index - 1; i++) {
                pre = curr;
                curr = curr.next;
            }
            temp.next = curr;
            pre.next = temp;
        }

        linkedList.setHead(head);

    }

    public void remove()
    {
        remove(1);
    }

    public void remove(int index)
    {
        curr=head;
        pre=null;

        if(index==1)
            head=head.next;

        else
        {
            for (int i = 0; i < index - 1; i++)
            {
                pre = curr;
                curr = curr.next;
            }

            pre.next = curr.next;
        }

        linkedList.setHead(head);

    }

}
