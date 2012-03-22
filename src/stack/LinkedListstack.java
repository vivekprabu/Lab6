/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package stack;

/**
 *
 * @author VIVEK
 */
public class LinkedListstack<Object> implements StackInterface<Object>

{
    head = new Node();
    int listCount = 0;

    @Override
    public Object pop()
    {
        if(isEmpty())
        {
            throw new Exception();
        }
        
        Object temp = null;
        temp = head.getNextItem().getPayload();
        
    }

    @Override
    public void push(Object item)
    {
        if(item == null)
        {
            throw new NullPointerException();
        }
        Node temp = new node();
        temp.setPayload(head.getNextItem());
        head.setNextItem(temp);
    }

    @Override
    public Object peek()
    {
        return head.nextItem.getPayload();
    }
    else
    {
        
    }

    @Override
    public  void popAll()
    {
        Object head = null;
        listCount = 0;
    }

    @Override
    public boolean isEmpty()
    {
        
        if (listCount ==0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }




private class Node
{
    private Object payload;
    private Node nextItem;

        public Node getNextItem()
        {
            return nextItem;
        }

        public void setNextItem(Node nextItem)
        {
            this.nextItem = nextItem;
        }

        public Object getPayload()
        {
            return payload;
        }

        public void setPayload(Object payload)
        {
            this.payload = payload;
        }
    
    
    
}


}