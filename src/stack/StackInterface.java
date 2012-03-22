/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package stack;

/**
 *
 * @author VIVEK
 */
public interface StackInterface<T>

{
    public T pop();
    public void push(T item);
    public T peek();
    public void popAll();
    public boolean isEmpty();
}
