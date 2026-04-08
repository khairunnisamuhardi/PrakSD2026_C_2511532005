package pekan3_2511532005;
import java.util.ArrayList;

class Siswa_2005 {
	String nama_2005;
	int nim_2005;
	
	public Siswa_2005 (String nama_2005, int nim_2005) {
		this.nama_2005 = nama_2005;
		this.nim_2005 = nim_2005;
	}
	
	@Override
	public String toString() {
		return " NIM : " + nim_2005 + "NAMA : " + nama_2005;
	}
}
public class SiswaStack_2511532005 {
	private ArrayList<Siswa_2005> stack;
	
	public SiswaStack_2511532005() {
		stack = new ArrayList<>();
	}
	
	public void push_2005 (Siswa_2005 mhs) {
		stack.add(mhs);
	}
	public Siswa_2005 pop_2005() {
		if (!isEmpty_2005()) {
			return stack.remove(stack.size() - 1);
		}
		return null;
	}
	
	public Siswa_2005 peek_2005() {
		if (!isEmpty_2005()) {
			return stack.get(stack.size() - 1);
		}
		return null;
	}
	
	public boolean isEmpty_2005() {
		return stack.isEmpty();
	}
	
	public void tampilkanSiswa_2005() {
		for (int i_2005 = stack.size() - 1 ; i_2005>= 0; i_2005--) {
			System.out.println(stack.get(i_2005));
		}
	}
	public static void main(String[] args) {
		SiswaStack_2511532005 studentStack= new SiswaStack_2511532005();
		
		Siswa_2005 mhs1 = new Siswa_2005 ("Ali", 1);
		Siswa_2005 mhs2 = new Siswa_2005 ("Bobby", 2);
		Siswa_2005 mhs3 = new Siswa_2005 ("Charles", 3);
		studentStack.push_2005(mhs1);
		studentStack.push_2005(mhs2);
		studentStack.push_2005(mhs3);
		
		System.out.println ("Siswa di dalam stack:");
		studentStack.tampilkanSiswa_2005();
		
		System.out.println("Siswa teratas " + studentStack.peek_2005());
		System.out.println(" mengeluarkan siswa teratas dari stack :" + studentStack.pop_2005());
		System.out.println(" daftar siswa setelah di pop :");
		studentStack.tampilkanSiswa_2005();
	}
}
