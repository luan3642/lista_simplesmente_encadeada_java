package br.com.alldrect;


class Node<T>{
	T value;
	Node<T> next;
	
	public Node(T value) {
		this.value = value;
		this.next = null;
	}
	
}

class MyQueue<T>{
	Node<T> head;
	Node<T> tail;
	
	public MyQueue() {
		this.head = null;
		this.tail = null;
	}
	
	public void enqueueFirst(T value) {
		Node<T> newNode = new Node<T>(value);
		if(head == null) {
			head = newNode;
			tail = newNode;
		} else {
			newNode.next = head;
		}
		head = newNode;
		
	}
	
	public void enqueueFinal(T value) {
		Node<T> newNode = new Node<T>(value);
		
		if(tail != null) {
			tail.next = newNode;
		}else {
			head = newNode;
		}
		tail = newNode;
	}
	
	public void showAll() {
		Node<T> current = head;
		
		while(current != null) {
			System.out.println(current.value);
			current = current.next;
		}
	}
}


public class Executa{
	
}