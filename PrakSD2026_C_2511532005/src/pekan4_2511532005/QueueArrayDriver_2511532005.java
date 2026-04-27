package pekan4_2511532005;

public class QueueArrayDriver_2511532005 {
	public static void main (String[] args) {
		QueueArray_2511532005 queue = new QueueArray_2511532005(1000);
		queue.enqueue_2005(10);
		queue.enqueue_2005(20);
		queue.enqueue_2005(30);
		queue.enqueue_2005(40);
		System.out.println("Item di depan" + queue.front_2005());
		System.out.println("Item paling belakang " + queue.rear_2005());
		System.out.println("Tampilan queue");
		queue.display_2005();
		System.out.println();
		System.out.println(queue.dequeue_2005() + "dihapus dari queue");
		System.out.println("Item di depan :" + queue.front_2005());
		System.out.println("Item paling belakang :" + queue.rear_2005());
		System.out.println("Tampilan queue setelah satu data dihapus");
		queue.display_2005();
	}
}
