package pekan4_2511532005;

public class QueueArray_2511532005 {
	int front_2005, rear_2005, size_2005;
	int capacity_2005;
	int array_2005[];
	
	public QueueArray_2511532005(int capacity_2005) {
		this.capacity_2005 = capacity_2005;
		front_2005 = this.size_2005 = 0;
		rear_2005 = capacity_2005 - 1;
		array_2005 = new int [this.capacity_2005];
	}
	
	boolean isFull(QueueArray_2511532005 queue) {
		return (queue.size_2005 == queue.capacity_2005);
	}
	
	boolean isEmpty(QueueArray_2511532005 queue) {
		return (queue.size_2005 == 0);
	}
	
	void enqueue_2005 (int item_2005) {
		if (isFull(this))
			return;
		this.rear_2005 = (this.rear_2005 + 1 ) % this.capacity_2005;
		this.array_2005[this.rear_2005] = item_2005;
		this.size_2005 = this.size_2005 + 1;
		System.out.println(item_2005 + " enqueued to queue");
	}
	
	int dequeue_2005() {
		if (isEmpty(this))
			return Integer.MIN_VALUE;
		int item_2005 = this.array_2005[this.front_2005];
		this.front_2005 = (this.front_2005 + 1) % this.capacity_2005;
		this.size_2005 = this.size_2005 - 1;
		return item_2005;
	}
	int front_2005() {
		if (isEmpty(this))
			return Integer.MIN_VALUE;
		
		return this.array_2005[this.front_2005];
	}
	int rear_2005() {
		if (isEmpty(this))
			return Integer.MIN_VALUE;
		return this.array_2005[this.rear_2005];
	}
	// mencetak elemen antrian
	void display_2005() {
		int i_2005;
		if (front_2005 == rear_2005) {
			System.out.printf("\nAntrian Kosong\n");
			return;
		}
		// kunjungi dari belakang dan cetak
		for (i_2005 = front_2005; i_2005< rear_2005; i_2005++) {
			System.out.printf(" %d <-- ", array_2005[i_2005]);
		}
		return;
	}

}
