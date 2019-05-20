import java.awt.List;

public class ReverseSinglyLinkedList {
	
	private static class ListNode{
	 int data;
	 ListNode next;
		
		public ListNode(int data)
		{
			this.data=data;
			this.next= null;
		}
	}
	
	public void display(ListNode head)
	{
		 ListNode current= head;
		 
		 while(current!= null)
		 {
			 System.out.println(current.data+"---->");
			 current = current.next;
			 
		 }
		 System.out.println(current);
	}
	
	public static void main(String args[])
	{
		ListNode head = new ListNode(10);
		ListNode second = new ListNode(8);
		ListNode third = new ListNode(1);
		ListNode fourth = new ListNode(11);
		
		head.next= second;
		second.next= third;
		third.next= fourth;
		
		ReverseSinglyLinkedList a = new ReverseSinglyLinkedList();
		a.display(head);
		ListNode pre=a.reverse(head);
		
		System.out.println("Reverse :");
		a.display(pre);
		
		
		System.out.println("Contains loop : ");
		ListNode first1 = new ListNode(10);
		ListNode second1 = new ListNode(8);
		ListNode third1 = new ListNode(1);
		ListNode fourth1 = new ListNode(11);
		
		ListNode head1;
		head1 = first1;
		first1.next=second1;
		second1.next=third1;
		third1.next=fourth1;
	//	fourth1.next=second1;
		
		
		Boolean result=a.containsLoop(head1);
		
		System.out.println(result);
	}
	
	public ListNode reverse(ListNode head)
	
	{
		if(head ==null)
		return head;
		
		ListNode current= head;
		ListNode previous = null;
		ListNode next = null;
		
		while(current!= null)
		{
			next = current.next;
			current.next= previous;
			previous= current;
			current = next; 
		}
		
		return previous;
	}
	
public boolean   containsLoop(ListNode head1 )
	
	{
	ListNode fstptr= head1;
	ListNode slowptr= head1;
	
	while(fstptr!=null && fstptr.next!=null)
	{
		fstptr=fstptr.next.next;
		slowptr=slowptr.next;
		
		if(slowptr==fstptr)
		{
			return true;
		
		}
		
	}
	
	return false;
		
	}
	
	

}
