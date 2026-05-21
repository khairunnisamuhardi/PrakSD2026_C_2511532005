package pekan7_2511532005;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import java.util.ArrayList;

public class SortingGUI_2511532005 extends JFrame {

    private static final long serialVersionUID = 1L;

    // Komponen GUI
    private JTextField tfNama, tfNim, tfProdi;
    private JLabel[] labelArray_2005;
    private JButton btnTambah_2005, btnMulai_2005, btnReset_2005;
    private JComboBox<String> cbAlgoritma;
    private JPanel panelArray_2005;
    private JTextArea stepArea_2005;

    // Data mahasiswa
    private ArrayList<Mahasiswa_2511532005> listMahasiswa;
    private ArrayList<Mahasiswa_2511532005> dataSort;

    // Variabel sorting
    private int i_2005 = 1, j_2005;
    private boolean sorting_2005 = false;
    private int stepCount_2005 = 1;
    private String algoritma_2005;

    public SortingGUI_2511532005() {
        setTitle("Sorting Nama Mahasiswa - 2511532005");
        setSize(950, 550);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        listMahasiswa = new ArrayList<>();
        dataSort = new ArrayList<>();

        inisialisasiKomponen();
        eventListeners();
    }

    private void inisialisasiKomponen() {
        // Panel Input (atas - dengan GridLayout agar lebih jelas)
        JPanel inputPanel = new JPanel(new GridLayout(2, 4, 5, 5));
        inputPanel.setBorder(BorderFactory.createTitledBorder("Input Data Mahasiswa"));
        inputPanel.setPreferredSize(new Dimension(0, 80));

        // Label dan TextField
        tfNama = new JTextField(15);
        tfNim = new JTextField(10);
        tfProdi = new JTextField(10);
        btnTambah_2005 = new JButton("+ Tambah Data");

        // PASTIKAN EDITABLE
        tfNama.setEditable(true);
        tfNim.setEditable(true);
        tfProdi.setEditable(true);
        
        // Set font agar lebih jelas
        tfNama.setFont(new Font("Arial", Font.PLAIN, 14));
        tfNim.setFont(new Font("Arial", Font.PLAIN, 14));
        tfProdi.setFont(new Font("Arial", Font.PLAIN, 14));

        inputPanel.add(new JLabel("Nama:"));
        inputPanel.add(tfNama);
        inputPanel.add(new JLabel("NIM:"));
        inputPanel.add(tfNim);
        inputPanel.add(new JLabel("Prodi:"));
        inputPanel.add(tfProdi);
        inputPanel.add(btnTambah_2005);

        // Panel Sorting (bagian tengah atas)
        JPanel sortingPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        sortingPanel.setBorder(BorderFactory.createTitledBorder("Pilihan Algoritma"));
        sortingPanel.setPreferredSize(new Dimension(0, 70));

        cbAlgoritma = new JComboBox<>(new String[]{"Insertion Sort", "Selection Sort", "Bubble Sort"});
        btnMulai_2005 = new JButton("Mulai Sorting");
        btnReset_2005 = new JButton("Reset");
        btnMulai_2005.setEnabled(false);

        sortingPanel.add(new JLabel("Algoritma:"));
        sortingPanel.add(cbAlgoritma);
        sortingPanel.add(btnMulai_2005);
        sortingPanel.add(btnReset_2005);

        // Panel Visual Array (tengah)
        panelArray_2005 = new JPanel(new FlowLayout());
        panelArray_2005.setBorder(BorderFactory.createTitledBorder("Visualisasi Data"));

        // Panel Langkah (kanan)
        stepArea_2005 = new JTextArea(15, 45);
        stepArea_2005.setEditable(false);
        stepArea_2005.setFont(new Font("Monospace", Font.PLAIN, 13));
        JScrollPane scrollPane = new JScrollPane(stepArea_2005);
        scrollPane.setBorder(BorderFactory.createTitledBorder("Proses Sorting"));

        // Panel中心和 Utara
        JPanel centerPanel = new JPanel(new BorderLayout());
        centerPanel.add(sortingPanel, BorderLayout.NORTH);
        centerPanel.add(panelArray_2005, BorderLayout.CENTER);

        // Tambahkan ke frame
        add(inputPanel, BorderLayout.NORTH);
        add(centerPanel, BorderLayout.CENTER);
        add(scrollPane, BorderLayout.EAST);
    }

    private void eventListeners() {
        btnTambah_2005.addActionListener(e -> tambahData());
        btnMulai_2005.addActionListener(e -> mulaiSorting());
        btnReset_2005.addActionListener(e -> reset());
    }

    private void tambahData() {
        String nama = tfNama.getText().trim();
        String nim = tfNim.getText().trim();
        String prodi = tfProdi.getText().trim();

        if (nama.isEmpty() || nim.isEmpty() || prodi.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Mohon isi semua data!\nNama, NIM, dan Prodi wajib diisi",
                "Peringatan", JOptionPane.WARNING_MESSAGE);
            return;
        }

        // Debug: cek nilai
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Prodi: " + prodi);

        Mahasiswa_2511532005 mhs = new Mahasiswa_2511532005(nama, nim, prodi);
        listMahasiswa.add(mhs);

        System.out.println("Jumlah data: " + listMahasiswa.size());

        // Update visual array
        updateVisualArray();

        // Clear input
        tfNama.setText("");
        tfNim.setText("");
        tfProdi.setText("");
        tfNama.requestFocus();

        btnMulai_2005.setEnabled(true);
        
        JOptionPane.showMessageDialog(this, "Data berhasil ditambahkan!\nTotal: " + listMahasiswa.size() + " mahasiswa");
    }

    private void updateVisualArray() {
        panelArray_2005.removeAll();
        labelArray_2005 = new JLabel[listMahasiswa.size()];

        for (int k = 0; k < listMahasiswa.size(); k++) {
            String display = listMahasiswa.get(k).getNama() + "\n" + listMahasiswa.get(k).getNim();
            labelArray_2005[k] = new JLabel("<html><center>" + display.replace("\n", "<br>") + "</center></html>");
            labelArray_2005[k].setFont(new Font("Arial", Font.BOLD, 12));
            labelArray_2005[k].setBorder(BorderFactory.createLineBorder(Color.BLACK));
            labelArray_2005[k].setPreferredSize(new Dimension(90, 55));
            labelArray_2005[k].setHorizontalAlignment(SwingConstants.CENTER);
            labelArray_2005[k].setOpaque(true);
            labelArray_2005[k].setBackground(Color.WHITE);

            panelArray_2005.add(labelArray_2005[k]);
        }

        panelArray_2005.revalidate();
        panelArray_2005.repaint();
    }

    private void mulaiSorting() {
        if (listMahasiswa.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Data mahasiswa kosong!\nSilakan tambah data terlebih dahulu",
                "Peringatan", JOptionPane.WARNING_MESSAGE);
            return;
        }

        // Buat salinan data
        dataSort.clear();
        for (Mahasiswa_2511532005 mhs : listMahasiswa) {
            dataSort.add(new Mahasiswa_2511532005(mhs.getNama(), mhs.getNim(), mhs.getProdi()));
        }

        algoritma_2005 = (String) cbAlgoritma.getSelectedItem();
        stepArea_2005.setText("");
        
        i_2005 = 1;
        j_2005 = 0;
        sorting_2005 = true;
        stepCount_2005 = 1;

        if (algoritma_2005.equals("Insertion Sort")) {
            insertionSortStep();
        } else if (algoritma_2005.equals("Selection Sort")) {
            selectionSortStep();
        } else if (algoritma_2005.equals("Bubble Sort")) {
            bubbleSortStep();
        }
    }

    private void insertionSortStep() {
        StringBuilder stepLog = new StringBuilder();
        stepLog.append("=== INSERTION SORT ===\n\n");
        stepLog.append("Data awal: ").append(arrayToString(dataSort)).append("\n\n");

        for (int i = 1; i < dataSort.size(); i++) {
            Mahasiswa_2511532005 key = dataSort.get(i);
            int j = i - 1;

            stepLog.append("Langkah ").append(i).append(": ");
            stepLog.append(arrayToString(dataSort));

            while (j >= 0 && dataSort.get(j).getNama().compareToIgnoreCase(key.getNama()) > 0) {
                dataSort.set(j + 1, dataSort.get(j));
                j--;
            }

            dataSort.set(j + 1, key);
            stepLog.append(" -> ").append(arrayToString(dataSort)).append("\n\n");
        }

        stepLog.append("=== HASIL AKHIR ===\n");
        stepLog.append(arrayToString(dataSort)).append("\n");
        
        stepArea_2005.setText(stepLog.toString());
        updateVisualArrayFinal();
        
        sorting_2005 = false;
        JOptionPane.showMessageDialog(this, "Sorting selesai!");
    }

    private void selectionSortStep() {
        StringBuilder stepLog = new StringBuilder();
        stepLog.append("=== SELECTION SORT ===\n\n");
        stepLog.append("Data awal: ").append(arrayToString(dataSort)).append("\n\n");

        for (int i = 0; i < dataSort.size() - 1; i++) {
            int minIdx = i;

            for (int j = i + 1; j < dataSort.size(); j++) {
                if (dataSort.get(j).getNama().compareToIgnoreCase(dataSort.get(minIdx).getNama()) < 0) {
                    minIdx = j;
                }
            }

            if (minIdx != i) {
                stepLog.append("Pass ").append(i + 1).append(": ");
                stepLog.append(arrayToString(dataSort));

                Mahasiswa_2511532005 temp = dataSort.get(i);
                dataSort.set(i, dataSort.get(minIdx));
                dataSort.set(minIdx, temp);

                stepLog.append(" -> ").append(arrayToString(dataSort)).append("\n");
            } else {
                stepLog.append("Pass ").append(i + 1).append(": ");
                stepLog.append(arrayToString(dataSort)).append(" (tidak perlu ditukar)\n");
            }
        }

        stepLog.append("\n=== HASIL AKHIR ===\n");
        stepLog.append(arrayToString(dataSort)).append("\n");

        stepArea_2005.setText(stepLog.toString());
        updateVisualArrayFinal();

        sorting_2005 = false;
        JOptionPane.showMessageDialog(this, "Sorting selesai!");
    }

    private void bubbleSortStep() {
        StringBuilder stepLog = new StringBuilder();
        stepLog.append("=== BUBBLE SORT ===\n\n");
        stepLog.append("Data awal: ").append(arrayToString(dataSort)).append("\n\n");

        int n = dataSort.size();
        boolean adaPenukaran;

        for (int pass = 1; pass < n; pass++) {
            adaPenukaran = false;
            stepLog.append("Pass ").append(pass).append(": ");

            for (int j = 0; j < n - pass; j++) {
                if (dataSort.get(j).getNama().compareToIgnoreCase(dataSort.get(j + 1).getNama()) > 0) {
                    Mahasiswa_2511532005 temp = dataSort.get(j);
                    dataSort.set(j, dataSort.get(j + 1));
                    dataSort.set(j + 1, temp);
                    adaPenukaran = true;
                }
            }

            stepLog.append(arrayToString(dataSort));

            if (!adaPenukaran) {
                stepLog.append(" (tidak ada penukaran)\n");
                break;
            }
            stepLog.append("\n");
        }

        stepLog.append("\n=== HASIL AKHIR ===\n");
        stepLog.append(arrayToString(dataSort)).append("\n");

        stepArea_2005.setText(stepLog.toString());
        updateVisualArrayFinal();

        sorting_2005 = false;
        JOptionPane.showMessageDialog(this, "Sorting selesai!");
    }

    private void updateVisualArrayFinal() {
        panelArray_2005.removeAll();
        labelArray_2005 = new JLabel[dataSort.size()];

        for (int k = 0; k < dataSort.size(); k++) {
            String display = dataSort.get(k).getNama() + "\n" + dataSort.get(k).getNim();
            labelArray_2005[k] = new JLabel("<html><center>" + display.replace("\n", "<br>") + "</center></html>");
            labelArray_2005[k].setFont(new Font("Arial", Font.BOLD, 12));
            labelArray_2005[k].setBorder(BorderFactory.createLineBorder(Color.BLACK));
            labelArray_2005[k].setPreferredSize(new Dimension(90, 55));
            labelArray_2005[k].setHorizontalAlignment(SwingConstants.CENTER);
            labelArray_2005[k].setOpaque(true);
            labelArray_2005[k].setBackground(new Color(200, 255, 200));

            panelArray_2005.add(labelArray_2005[k]);
        }

        panelArray_2005.revalidate();
        panelArray_2005.repaint();
    }

    private void reset() {
        int confirm = JOptionPane.showConfirmDialog(this,
            "Yakin ingin mereset semua data?", "Konfirmasi",
            JOptionPane.YES_NO_OPTION);

        if (confirm == JOptionPane.YES_OPTION) {
            tfNama.setText("");
            tfNim.setText("");
            tfProdi.setText("");

            panelArray_2005.removeAll();
            panelArray_2005.revalidate();
            panelArray_2005.repaint();

            stepArea_2005.setText("");
            listMahasiswa.clear();
            dataSort.clear();

            btnMulai_2005.setEnabled(false);
            sorting_2005 = false;
            i_2005 = 1;
            stepCount_2005 = 1;
        }
    }

    private String arrayToString(ArrayList<Mahasiswa_2511532005> arr) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int k = 0; k < arr.size(); k++) {
            sb.append(arr.get(k).getNama());
            if (k < arr.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            SortingGUI_2511532005 gui = new SortingGUI_2511532005();
            gui.setVisible(true);
        });
    }
}