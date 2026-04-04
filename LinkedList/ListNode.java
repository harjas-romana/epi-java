package LinkedList;

public class ListNode<T> {
    
    public ListNode(T data) {
		this.data = data;
		this.next = null;
	}
	public T data;
    public ListNode<T> next;

}
