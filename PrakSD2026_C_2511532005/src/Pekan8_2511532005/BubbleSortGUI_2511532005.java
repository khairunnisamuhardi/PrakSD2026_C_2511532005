package Pekan8_2511532005;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.*;

public class BubbleSortGUI_2511532005 extends JFrame {
    private static final long serialVersionUID = 1L;
    private int[] array_2005;
    private JLabel[] labelArray_2005;
    private JButton stepButton_2005, resetButton_2005, setButton_2005;
    private JTextField inputField_2005;
    private JPanel panelArray_2005;
    private JTextArea stepArea_2005;
    private int i_2005 = 0, j_2005; // i_2005 diinisialisasi 0 agar sinkron dengan setArrayFromInput
    private boolean sorting_2005 = false;
    private int stepCount_2005 = 1;
    
    /**
     * Create the frame.
     */
    public BubbleSortGUI_2511532005() {
        setTitle("Bubble Sort Langkah per Langkah"); // Disesuaikan dengan logika Bubble Sort di bawah
        setSize(750, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        // Panel input
        JPanel inputPanel_2005 = new JPanel(new FlowLayout());
        inputField_2005 = new JTextField(30);
        setButton_2005 = new JButton("Set Array");
        inputPanel_2005.add(new JLabel("Masukkan angka (pisahkan dengan koma):"));
        inputPanel_2005.add(inputField_2005);
        inputPanel_2005.add(setButton_2005);

        // Panel array visual
        panelArray_2005 = new JPanel();
        panelArray_2005.setLayout(new FlowLayout());

        // Panel kontrol
        JPanel controlPanel_2005 = new JPanel();
        stepButton_2005 = new JButton("Langkah Selanjutnya");
        resetButton_2005 = new JButton("Reset");
        stepButton_2005.setEnabled(false);
        controlPanel_2005.add(stepButton_2005);
        controlPanel_2005.add(resetButton_2005);
        
        // Area teks untuk log langkah-langkah
        stepArea_2005 = new JTextArea(8, 60);
        stepArea_2005.setEditable(false);
        stepArea_2005.setFont(new Font("Monospaced", Font.PLAIN, 14));
        JScrollPane scrollPane_2005 = new JScrollPane(stepArea_2005);

        // Tambahkan panel ke frame
        add(inputPanel_2005, BorderLayout.NORTH);
        add(panelArray_2005, BorderLayout.CENTER);
        add(controlPanel_2005, BorderLayout.SOUTH);
        add(scrollPane_2005, BorderLayout.EAST);
        
        // Event Set Array
        setButton_2005.addActionListener(e -> setArrayFromInput_2005());
        
        // Event Langkah Selanjutnya
        stepButton_2005.addActionListener(e -> performStep_2005());
        
        // Event reset
        resetButton_2005.addActionListener(e -> reset_2005());
    }

    private void setArrayFromInput_2005() {
        String text = inputField_2005.getText().trim();
        if (text.isEmpty()) return;
        String[] parts = text.split(",");
        array_2005 = new int[parts.length];
        try {
            for (int k = 0; k < parts.length; k++) {
                array_2005[k] = Integer.parseInt(parts[k].trim());
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Masukkan hanya angka "
                    + "yang dipisahkan koma!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        i_2005 = 0;
        j_2005 = 0;
        stepCount_2005 = 1;
        sorting_2005 = true;
        stepButton_2005.setEnabled(true);
        stepArea_2005.setText("");
        panelArray_2005.removeAll();
        labelArray_2005 = new JLabel[array_2005.length];
        for (int k = 0; k < array_2005.length; k++) {
            labelArray_2005[k] = new JLabel(String.valueOf(array_2005[k]));
            labelArray_2005[k].setFont(new Font("Arial", Font.BOLD, 24));
            labelArray_2005[k].setOpaque(true);
            labelArray_2005[k].setBackground(Color.WHITE);
            labelArray_2005[k].setBorder(BorderFactory.createLineBorder(Color.BLACK));
            labelArray_2005[k].setPreferredSize(new Dimension(50, 50));
            labelArray_2005[k].setHorizontalAlignment(SwingConstants.CENTER);
            panelArray_2005.add(labelArray_2005[k]);
        }
        panelArray_2005.revalidate();
        panelArray_2005.repaint();
    }

    private void performStep_2005() {
        if (!sorting_2005 || i_2005 >= array_2005.length - 1) {
            sorting_2005 = false;
            stepButton_2005.setEnabled(false);
            JOptionPane.showMessageDialog(this, "Sorting selesai!");
            return;
        }
        
        resetHighlights_2005(); // Perbaikan: Memanggil method pembantu dengan benar
        
        StringBuilder stepLog = new StringBuilder();
        labelArray_2005[j_2005].setBackground(Color.CYAN);
        labelArray_2005[j_2005 + 1].setBackground(Color.CYAN);
        
        if (array_2005[j_2005] > array_2005[j_2005 + 1]) {
            // Swap
            int temp = array_2005[j_2005];
            array_2005[j_2005] = array_2005[j_2005 + 1];
            array_2005[j_2005 + 1] = temp;
            labelArray_2005[j_2005].setBackground(Color.RED);
            labelArray_2005[j_2005 + 1].setBackground(Color.RED);
            stepLog.append("Langkah ").append(stepCount_2005).append(": Menukar elemen ke-")
                    .append(j_2005).append(" (").append(array_2005[j_2005 + 1]).append(") dengan ke-")
                    .append(j_2005 + 1).append(" (").append(array_2005[j_2005]).append(")\n");
        } else {
            stepLog.append("Langkah ").append(stepCount_2005).append(": Tidak ada pertukaran antara ke-")
                    .append(j_2005).append(" (").append(array_2005[j_2005]).append(") dan ke-").append(j_2005 + 1).append("\n");
        }
        
        stepLog.append("Hasil: ").append(arrayToString_2005(array_2005)).append("\n\n");
        stepArea_2005.append(stepLog.toString());
        updateLabels_2005();
        
        j_2005++;
        if (j_2005 >= array_2005.length - i_2005 - 1) {
            j_2005 = 0;
            i_2005++;
        }
        stepCount_2005++;
        
        if (i_2005 >= array_2005.length - 1) {
            sorting_2005 = false;
            stepButton_2005.setEnabled(false);
            JOptionPane.showMessageDialog(this, "Sorting selesai!");
        }
    }

    private void updateLabels_2005() {
        for (int k = 0; k < array_2005.length; k++) {
            labelArray_2005[k].setText(String.valueOf(array_2005[k]));
        }
    }

    private void resetHighlights_2005() { // Perbaikan: Nama method disinkronkan
        for (JLabel label : labelArray_2005) {
            label.setBackground(Color.WHITE);
        }
    }

    private void reset_2005() { // Perbaikan: Nama method disinkronkan
        inputField_2005.setText("");
        panelArray_2005.removeAll();
        panelArray_2005.revalidate();
        panelArray_2005.repaint();
        stepArea_2005.setText("");
        stepButton_2005.setEnabled(false);
        sorting_2005 = false;
        i_2005 = 0;
        j_2005 = 0;
        stepCount_2005 = 1;
    }

    private String arrayToString_2005(int[] arr) { // Perbaikan: Nama method disinkronkan
        StringBuilder sb = new StringBuilder();
        for (int k = 0; k < arr.length; k++) {
            sb.append(arr[k]);
            if (k < arr.length - 1) sb.append(", ");
        }
        return sb.toString();
    } 

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> { 
            BubbleSortGUI_2511532005 gui = new BubbleSortGUI_2511532005();
            gui.setVisible(true);
        });
    }
}