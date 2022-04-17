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
			T lastEntry = getEntry(numberOfEntries);
			String aString = "[";
			int counter = 0;
			while (currentNode != null) {
				if (counter!=numberOfEntries-1) {
					aString += currentNode.getData() + ", ";
				}
				else{
					aString += currentNode.getData();
					tail = currentNode;
				}
				counter+=1;
				currentNode = currentNode.next;
			}

			aString += "]";
			return aString +" size="+size()+" capacity="+capacity+" head="+ head.data+ " tail=" + tail.data;
		}
		else {
			return "[]";
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

	@Override
	public T getEntry(int givenPosition) {
		Node currentNode = head;
		if (givenPosition==0)
		{return currentNode.data;}
		else if (givenPosition >= 1 && givenPosition <= numberOfEntries)
		{
		for (int counter = 0; counter < givenPosition; counter++)
		{
			currentNode = currentNode.next;
		}
		if (currentNode !=null)
		{
		return currentNode.data;}
		else{
			return null;
		}
		}
		else {return null;}
	}

  

	public void clear() {
		T[] tempList = (T[]) new Comparable[capacity+1];
		head = null;
		tail = null;
		numberOfEntries = 0;
	}

	public boolean addFront(T anItem) {
		Node new_node = new Node(anItem);
		if (isEmpty()) {
		head =new_node;
		numberOfEntries++;
		return true;
		}
		else if(numberOfEntries!=capacity) {
			new_node.next = head;
			head = new_node;
			numberOfEntries++;
			return true;
		}
		return false;
	}
  
	public boolean addBack(T anItem) {
		if (isEmpty())
		{
			Node new_node = new Node(anItem);
			head=new_node;
		numberOfEntries++;
		return true;
		}
		else if (numberOfEntries!=capacity){
			Node temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}

			temp.next = new Node(anItem,null);
			numberOfEntries++;
			return true;
		}
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

	@Override
	public boolean contains(T anEntry) {
		boolean found = false;
		Node currentNode = head;

		while (!found && (currentNode != null)) {
			if (anEntry.equals(currentNode.data)) {
				found = true;
			} else {
				currentNode = currentNode.next;
			}
		}
		return found;
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
