public class LinkedFrontBackCappedList<T> implements FrontBackCappedListInterface<T> {

	private boolean initialized = false;
	private Node head, tail;
  private int capacity;
	private int numberOfEntries;
   
  //OUR METHODS HERE BELOW...

	public LinkedFrontBackCappedList(int capacity) {
		if (!initialized) {
			numberOfEntries = 0;
			this.capacity = capacity;
			initialized = true;
		}
	}

	@Override
	public String toString() {
		if (head != null) {
		Node currentNode = head;
		String aString = "[";

		while (currentNode.next != null) {
			currentNode = currentNode.next;
			aString += " " + currentNode.getData();
			}

		aString += "]";
		return "Size: " + numberOfEntries + "; " +
			"capacity = " + capacity + "; " + aString;
		}
		else {
			return "[] " + "size = " + numberOfEntries + " capacity = " + capacity;
		}
	}
  
	@Override
	public boolean isEmpty() {
		return numberOfEntries == 0;
	}

	@Override
	public boolean isFull() {
		return numberOfEntries >= capacity;
	}

	@Override
	public int size() {
		return numberOfEntries;
	}

	public T getEntry(int someIntHere) {
		return null;
	}

	public void clear() {
		T[] tempList = (T[]) new Comparable[capacity+1];
		head = null;
		tail = null;
		numberOfEntries = 0;
	}

	public boolean addFront(T anItem) {
		return false;
	}
	public boolean addBack(T anItem) {
		return false;
	}

	public T removeFront() {
		String strg = "placeholder hehe";
		return (T) strg;
	}

	public T removeBack() {
		String strg = "placeholder XD";
		return (T) strg;
	}

	public boolean contains(T someObjectHere) {
		return false;
	}

	public int indexOf(T someObjectHere) {
		return 0;
	}

	public int lastIndexOf(T someObjectHere) {
		return 0;
	}

  
  //NODE CLASS DEFINITION
	public class Node {
		public T data; 
		public Node next; 

		private Node(T dataValue) {
			data = dataValue;
			next = null;
		}

		private Node(T dataValue, Node nextNode) {
			data = dataValue;
			next = nextNode;
		}

		private T getData() {
			return data;
		}

		private void setData(T newData) {
			data = newData;
		}

		private Node getNextNode() {
			return next;
		}

		private void setNextNode(Node nextNode) {
			next = nextNode;
		} 
	} 
}
