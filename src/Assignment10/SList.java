package Assignment10;

public class SList<T>
{
    Link<T> head;
    SList()
    {
        head=null;
    }

    public SListIterator iterator()
    {
        return new SListIterator(this);
    }

    public Link<T> getHead()
    {
        return head;
    }

    public void setHead(Link<T> head)
    {
        this.head=head;
    }

    public String toString()
    {
        StringBuilder out= new StringBuilder();
        out.append("[");
        Link<T> temp=head;
        while(temp!=null)
        {
            out.append(temp.data).append(",");
            temp=temp.next;
        }
        out.append("]");

        return out.toString();
    }
}
