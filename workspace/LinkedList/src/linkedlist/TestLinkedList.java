package linkedlist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

class linkedList {
	Node head;
		
//	linkedList(){
//		head=null;
//	}
	
//	public void setHead(Node head2){
//		this.head=head2;
//	}
//	
//	public Node getHead(){
//		return head;
//	}
	public void enterAtBeg(int n) {
		// TODO Auto-generated method stub
		Node tempNode = new Node(n);
		if(head == null) {
			head = tempNode;
			tempNode.next = null;
		}
		else {
			tempNode.next = head;
			head = tempNode;
		}
	}

	public void display() {
		// TODO Auto-generated method stub
		if(head == null) {
			System.out.println("The list is empty");
		}
		else {
			Node currentNode = head;
			while(currentNode.next != null) {
				System.out.print(currentNode.value + " ");
				currentNode = currentNode.next;
			}
			System.out.print(currentNode.value);
		}
	}

	public void enterAtMid(int n,int pos){
		if(pos==1){
			enterAtBeg(n);
			return;
		}
		if(head==null){
			System.out.println("Sorry linklist is empty");
		}
		else{
			int length=calculateLength();
			if(pos>length){
				System.out.println("Sorry..Enter a valid position");
			}
			else{
				Node currentNode=head;
				for(int i=1;i<pos-1;i++){
					currentNode=currentNode.next;
				}
				System.out.println("here");
				Node newNode=new Node(n);
				newNode.next=currentNode.next;
				currentNode.next=newNode;
			}
		}
	}
	public int calculateLength() {
		if(head == null) {
			return 0;
		}
		else {
			int count = 0;
			Node currentNode = head;
			while(currentNode.next != null) {
				count++;
				currentNode = currentNode.next;
			}
			count ++; //for the last node
			return count;
		}
	}

	public void enterAtEnd(int n) {
		// TODO Auto-generated method stub
		Node newNode = new Node(n);
		if(head == null) {
			newNode.next = null;
			head = newNode;
		}
		else {
			Node currentNode = head;
			while(currentNode.next != null) {
				currentNode = currentNode.next;
			}
			currentNode.next = newNode;
			newNode.next = null;
		}
	}

	public void delFromBeg() {
		// TODO Auto-generated method stub
		if(head == null) {
			System.out.println("List is empty");
		}
		else if(head.next==null){
			System.out.println("Element deleted: "+head.value);
			head=null;
		}
		else {
			Node delNode = head;
			head = head.next;
			System.out.println("The deleted node is "+delNode.value);
		}
	}

	public void delAtMid(int pos) {
		// TODO Auto-generated method stub
		if(head == null) {
			System.out.println("List is empty");
		}
		else if(pos == 1) {
			delFromBeg();
		}
		else{
			int length=calculateLength();
			if(pos>length){
				System.out.println("Sorry...Enter a valid position");
			}
			else {
				Node currentNode = head;
				for(int i=1;i<pos-1;i++) {
					currentNode = currentNode.next;
				}
				System.out.println("Deleted node is.."+currentNode.next.value);
				currentNode.next = currentNode.next.next;
			}
		}
	}

	public void delEnd() {
		// TODO Auto-generated method stub
		if(head == null) {
			System.out.println("List is empty");
		}
		else if(head.next==null){
			System.out.println("Element deleted: "+head.value);
			head=null;
		}
		else {
			Node currentNode = head;
			while(currentNode.next.next != null){
				currentNode = currentNode.next;
			}
			System.out.println("Deleted node is.."+currentNode.next.value);
			currentNode.next = null;
		}
	}
	public void deleteMNodesAfterN(int count,int index){
		Node currentNode=head;
		if(index>=calculateLength()){
			System.out.println("Enter valid position");
			return;
		}
		for(int i=1;i<index;i++){
			currentNode=currentNode.next;
		}
		Node tempNode=currentNode.next;
		for(int i=1;i<count;i++){
			if(tempNode.next==null){
				
				/*If you do not want to allow deletion
				System.out.println("Enter valid number of nodes"); 
				return;*/
				
				/*If you want to allow*/
				System.out.println("Only "+i+" nodes deleted because "+count+" nodes not available");
				break;
			}
			tempNode=tempNode.next;
		}
		currentNode.next=tempNode.next;
	}

	public void removeDuplicate() {
		// TODO Auto-generated method stub
		HashSet<Integer> set = new HashSet<Integer>();
		Node current = head;
		Node prev = null;
		while(current!=null){
			int val = current.value;	
			if(set.contains(val)) {
				prev.next = current.next;
			}
			else {
				set.add(val);
				prev = current;
			}
			current = current.next;
		}
	}

	public boolean isEmpty() {
		// TODO Auto-generated method stub
		if(head == null) {
			return true;
		}
		return false;
	}

	public void findMidElement() {
		// TODO Auto-generated method stub
		Node fastPointer = head;
		Node slowPointer = head;
		while(fastPointer != null && fastPointer.next != null) {
			fastPointer = fastPointer.next.next;
			slowPointer = slowPointer.next;
		}
		System.out.println("The mid element is "+slowPointer.value);
	}

	public void findNthFromLast(int pos) {
		// TODO Auto-generated method stub
		if(head == null) {
			System.out.println("List is empty");
		}
		else {
			int length =calculateLength();
			if(pos > length) {
				System.out.println("Please enter a valid position");
			}
			Node refPointer = head;
			Node mainPointer = head;
			for(int i=0;i<pos-1;i++) {
				refPointer = refPointer.next;
			}
			while(refPointer.next!=null) {
				refPointer = refPointer.next;
				mainPointer = mainPointer.next;
			}
			System.out.println("The element from " +pos +" position is" +mainPointer.value);
		}
		
	}

	public void swapNodes() {
		// TODO Auto-generated method stub
		Node tempNode = head;
		while(tempNode != null && tempNode.next != null) {
			int k = tempNode.value;
			tempNode.value = tempNode.next.value;
			tempNode.next.value = k;
			tempNode = tempNode.next.next;
		}
	}

	public void sort() {
		// TODO Auto-generated method stub
		ArrayList<Integer> al = new ArrayList<Integer>();
		Node currentNode = head;
		while(currentNode!=null) {
			al.add(currentNode.value);
			currentNode = currentNode.next;
		}
		Collections.sort(al);
		head = null;
		for(int i: al) {
			enterAtEnd(i);
		}
	}

	public void moveEndToFront() {
		// TODO Auto-generated method stub
		Node currentNode = head;
		while(currentNode.next.next != null) {
			currentNode = currentNode.next;
		}
		currentNode.next.next = head;
		head = currentNode.next;
		currentNode.next = null;
	}

	public void formLoop(int pos) {
		// TODO Auto-generated method stub // 1 -- 2 -- 3
		//                                         |    |
		//										   5 -- 4
		Node currentNode = head;
		Node tempNode = head;
		int count = 1;
		while(currentNode.next != null) {
			if(count < pos) {
				tempNode = tempNode.next;
				count ++;
			}
			currentNode = currentNode.next;
		}
		currentNode.next = tempNode;
	}

	public void hasLoop() {
		// TODO Auto-generated method stub
		Node fastPointer = head;
		Node slowPoinetr = head;
		int count = 0;
		while(fastPointer.next != null && fastPointer.next.next != null) {
			fastPointer = fastPointer.next.next;
			slowPoinetr = slowPoinetr.next;
			count ++;
			if(slowPoinetr == fastPointer) {
				System.out.println("Loop is there with length "+count);
			}
		}
	}

	public void reverseIterate() {
		// TODO Auto-generated method stub
		Node current = head;
		Node prev = null;
		Node next = null;
		while(current!=null){
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		head = prev;
	}
	public void reverseRecursive(Node current, Node prev) {
		// TODO Auto-generated method stub
		if(current.next == null) {
			head = current;
			current.next = prev;
			return;

		}
		Node next = current.next;
		current.next = prev;
		reverseRecursive(next, current);
	}
	
}
/*Node class*/
class Node{
	Node next;
	int value;
	Node(int value){
		this.value=value;
	}
}
public class TestLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		linkedList obj = new linkedList();
		int ch;
		do {
			System.out.println("\nEnter your choice..");
			System.out.println("1.Enter at Beginning\t2.Enter at Any position\t3.Enter At End"
					+ "\n4.Delete from Beginning\t5.Delete From Any Position\t6.Delete from End"
					+ "\n7.Delete  N nodes after Any Node\t8.Remove Duplicates"
					+ "\n9.Find if List is Empty\t10.Find Middle Element\t11.Find Element from at position From End"
					+ "\n12.Swap consecutive nodes\t.13Sort list\t14.Move last Node to First Node"
					+ "\n15.Form loop from Any Position\t16.Check if list has loop\t17.Find Start Point of Loop\t18.Remove loop"
					+ "\n19.Reverse Linklist With Iteration\t20.Reverse using recursion\t21.Display list"
					+ "\n22.Enter elements for 2nd list\t.23.Display 2nd list\t24.Concate 2 lists\t25.Intersection of Nodes."
					+ "\n26.Exit");
			Scanner sc=new Scanner(System.in);
			ch=sc.nextInt();
			switch (ch) {
			case 1:
				System.out.println("Enter element");
				obj.enterAtBeg(sc.nextInt());
				break;
			case 2:
				System.out.println("Enter element");
				int val=sc.nextInt();
				System.out.println("Enter position");
				int pos=sc.nextInt();
				obj.enterAtMid(val,pos);
				break;
			case 3:
				System.out.println("Enter element..");
				obj.enterAtEnd(sc.nextInt());
				break;
			case 4: 
				obj.delFromBeg();
				break;
			case 5:
				System.out.println("Enter the position to delete..");
				obj.delAtMid(sc.nextInt());
				break;
			case 6:
				obj.delEnd();
				break;
			case 7: 
				System.out.println("Enter number of nodes to be deleted");
				int count=sc.nextInt();
				System.out.println("Enter position from where to delete");
				int index=sc.nextInt();
				obj.deleteMNodesAfterN(count, index);
				break;
			case 8:
				obj.removeDuplicate();
				break;
			case 9: 
				obj.isEmpty();
				break;
			case 10:
				obj.findMidElement();
				break;
			case 11:
				System.out.println("Please enter the position from last");
				obj.findNthFromLast(sc.nextInt());
				break;
			case 12:
				obj.swapNodes();
				break;
			case 13:
				obj.sort();
				break;
			case 14:
				obj.moveEndToFront();
				break;
			case 15:
				System.out.println("Enter the position to start loop");
				obj.formLoop(sc.nextInt());
				break;
			case 16:
				obj.hasLoop();
				break;
			case 19:
				obj.reverseIterate();
				break;
			case 21: 
				System.out.println("The list is...");
				obj.display();
				break;
			
			default:
				break;
			}
		}
		while(ch!=26);
	}

}
