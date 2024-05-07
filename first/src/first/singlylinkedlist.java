package first;

public class singlylinkedlist {

	  private Listnode head;

	  public static class Listnode {

	    private int data;
	    private Listnode next;

	    public Listnode(int data) {
	      this.data = data;
	      this.next = null;
	    }

	  }

	  public int length() {
	    if (head == null) {
	      return 0;
	    } else {
	      int count = 0;
	      Listnode current = head;
	      while (current != null) {
	        count++;
	        current = current.next;
	      }

	      return count;
	    }
	  }

	  public void display() {
	    Listnode current = head;
	    while (current != null) {
	      System.out.print(current.data + "-->");
	      current = current.next;
	    }
	    System.out.println("null");
	  }

	  public void insertFirst(int value) {
	    Listnode Newnode = new Listnode(value);
	    Newnode.next = head;
	    head = Newnode;
	  }

	  public void insertlast(int value) {
	    Listnode Newnode = new Listnode(value);
	    if (head == null) {
	      head = Newnode;
	      return;
	    }
	    Listnode current = head;
	    while (current.next != null) {
	      current = current.next;
	    }
	    current.next = Newnode;

	  }

	  public static void main(String[] args) {
	    singlylinkedlist sll = new singlylinkedlist();

	    /*
	     * sll.head = new Listnode(1);
	     * Listnode second = new Listnode(2);
	     * Listnode third = new Listnode(3);
	     * Listnode fourth = new Listnode(4);
	     * Listnode fifth = new Listnode(89);
	     * sll.head.next = second;
	     * second.next = third;
	     * third.next = fourth;
	     * fourth.next = fifth;
	     */
	    sll.insertlast(67);
	    sll.insertlast(34);
	    sll.insertlast(78);
	    sll.insertlast(51);
	    sll.display();

	    int res = sll.length();
	    System.out.println(res);

	  }
	}
