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
	
	public void deQueueFirst() {
		if(head == null) {
			System.out.println("nao temos nenhum elemento para remover");
			return;
		}
		if(head == tail) {
			head = null;
			tail = null;
		}else {
			head = head.next;
		}
		
	}
	
	public void deQueueFinal() {
		if(head == null) {
			System.out.println("a lista já está vazia!");
			return;
		}
		
		if(head == tail) {
			head = null;
			tail = null;
		}else {
			Node<T> current = head;
			
			while(current.next != tail) {
				current = current.next;
			}
			
			current.next = null;
			tail = current;
		}
	}
}


public class Executa{
	public static void main(String[] args) {
		
		MyQueue<Integer> queue = new MyQueue<Integer>();
		
		queue.enqueueFirst(10);
		queue.enqueueFinal(20);
		queue.enqueueFirst(14);
		queue.deQueueFirst();
		queue.deQueueFinal();
		
		queue.showAll();
	}
	
}