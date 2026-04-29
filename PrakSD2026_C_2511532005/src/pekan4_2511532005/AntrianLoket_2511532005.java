package pekan4_2511532005;

public class AntrianLoket_2511532005 {
	int front_2005, rear_2005, size_2005;
	int capacity_2005;
	String antrian_2005[];
	
	public AntrianLoket_2511532005(int capacity_2005) {
		this.capacity_2005 = capacity_2005;
		front_2005 = this.size_2005 = 0;
		rear_2005 = capacity_2005 - 1;
		antrian_2005 = new String[this.capacity_2005];
	}
	
	boolean isFull_2005(AntrianLoket_2511532005 antrian) {
		return (antrian.size_2005 == antrian.capacity_2005);
	}
	
	boolean isEmpty_2005(AntrianLoket_2511532005 antrian) {
		return (antrian.size_2005 == 0);
	}
	
	void enqueue_2005(String namaPelanggan_2005) {
		if (isFull_2005(this))
			return;
		this.rear_2005 = (this.rear_2005 + 1 ) % this.capacity_2005;
		this.antrian_2005[this.rear_2005] = namaPelanggan_2005;
		this.size_2005 = this.size_2005 + 1;
	}
	
	String dequeue_2005() {
		if (isEmpty_2005(this))
			return null;
		String namaPelanggan_2005 = this.antrian_2005[this.front_2005];
		this.front_2005 = (this.front_2005 + 1) % this.capacity_2005;
		this.size_2005 = this.size_2005 - 1;
		return namaPelanggan_2005;
	}
	
	void display_2005() {
		if (front_2005 == rear_2005 && size_2005 == 0) {
			System.out.println("Antrian kosong");
			return;
		}
		System.out.println("Isi antrian:");
		int i_2005 = front_2005;
		for (int nomor_2005 = 1; nomor_2005 <= size_2005; nomor_2005++) {
			System.out.println(nomor_2005 + ". " + antrian_2005[i_2005]);
			i_2005 = (i_2005 + 1) % capacity_2005;
		}
	}
	
	void reverse_2005() {
		if (size_2005 <= 1) return;
		
		String[] temp_2005 = new String[capacity_2005];
		int j_2005 = 0;
		int index_2005 = front_2005;
		for (int i_2005 = 0; i_2005 < size_2005; i_2005++) {
			temp_2005[j_2005++] = antrian_2005[index_2005];
			index_2005 = (index_2005 + 1) % capacity_2005;
		}
		
		front_2005 = 0;
		rear_2005 = size_2005 - 1;
		for (int i_2005 = 0; i_2005 < size_2005; i_2005++) {
			antrian_2005[i_2005] = temp_2005[size_2005 - 1 - i_2005];
		}
	}
}
