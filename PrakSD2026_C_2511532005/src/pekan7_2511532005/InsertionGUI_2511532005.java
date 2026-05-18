package pekan7_2511532005;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class InsertionGUI_2511532005 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private int[] array_2005;
	private JLabel[] labelArray_2005;
	private JButton stepButton_2005, resetButton_2005, setButton_2005;
	private JTextField inputField_2005;
	private JPanel panelArray_2005;
	private JTextArea stepArea_2005;
	
	private int i_2005 = 1, j_2005;
	private boolean sorting_2005 = false;
	private int stepCount_2005 = 1;


	/**
	 * Create the frame.
	 */
	public InsertionGUI_2511532005() {
		setTitle ("Insertion Sort Langkah per Langkah");
		setSize (750, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo (null);
		setLayout (new BorderLayout());
		
		//Panel Input
		JPanel inputPanel = new JPanel (new FlowLayout());
		inputField_2005 = new JTextField (30);
		setButton_2005 = new JButton ("Set Array");
		inputPanel.add(new JLabel ("Masukkan angka (pisahkan dengan koma): "));
		inputPanel.add(inputField_2005);
		inputPanel.add(setButton_2005);
		
		//Panel array visual
		panelArray_2005 = new JPanel ();
		panelArray_2005.setLayout (new FlowLayout());
		
		//panel kontrol
		JPanel controlPanel = new JPanel();
		setButton_2005 = new JButton ("Langkah selanjutnya");
		resetButton_2005 = new JButton ("Reset");
		stepButton_2005 = new JButton ("Reset");
		controlPanel.add(stepButton_2005);
		controlPanel.add(resetButton_2005);
		
		//area teks untuk log langkah-langkah
		stepArea_2005 = new JTextArea (8, 60);
		stepArea_2005.setEditable (false);
		stepArea_2005.setFont (new Font ("Monospace", Font.PLAIN, 14));
		JScrollPane scrollPane = new JScrollPane (stepArea_2005);
		
		//Tambahkan panel ke frame
		add(inputPanel, BorderLayout.NORTH);
		add(panelArray_2005, BorderLayout.CENTER);
		add(controlPanel, BorderLayout.SOUTH);
		add(scrollPane, BorderLayout.EAST);
		
		// Event Set Array 
		setButton_2005.addActionListener(e -> setArrayFromInput_2511532005());
		
		// Event Langkah Selanjutnya
		stepButton_2005.addActionListener(e -> performStep());
		
		// Event Reset 
		resetButton_2005.addActionListener(e -> reset());
	}
	private void setArrayFromInput_2511532005() {
		String text = inputField_2005.getText().trim();
		if (text.isEmpty()) return;
		String[] parts = text.split(",");
		array_2005 = new int[parts.length];
		try {
			for (int k = 0; k < parts.length; k++) {
				array_2005[k] = Integer.parseInt(parts[k].trim()); }
		} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(this, "Masukkan hanya angka yang dipisahkan" + "dengan koma!", "Error", JOptionPane.ERROR_MESSAGE);
				return; }
			i_2005 = 1;
			stepCount_2005 = 1;
			sorting_2005 = true;
			stepButton_2005.setEnabled(true);
			stepArea_2005.setText(" ");
			panelArray_2005.removeAll();
			labelArray_2005 = new JLabel[array_2005.length];
			for (int k = 0; k < array_2005.length; k++) {
		        labelArray_2005[k] = new JLabel(String.valueOf(array_2005[k]));
		        labelArray_2005[k].setFont(new Font("Arial", Font.BOLD, 20));
		        labelArray_2005[k].setBorder(BorderFactory.createLineBorder(Color.BLACK));
		        labelArray_2005[k].setPreferredSize(new Dimension(50, 50));
		        labelArray_2005[k].setHorizontalAlignment(SwingConstants.CENTER);

		        panelArray_2005.add(labelArray_2005[k]);
		    }
			 panelArray_2005.revalidate();
			    panelArray_2005.repaint();	
			}
	private void performStep() {

	    if (i_2005 < array_2005.length && sorting_2005) {

	        int key = array_2005[i_2005];
	        j_2005 = i_2005 - 1;

	        StringBuilder stepLog = new StringBuilder();

	        stepLog.append("Langkah ")
	               .append(stepCount_2005)
	               .append(": Memasukkan ")
	               .append(key)
	               .append("\n");

	        while (j_2005 >= 0 && array_2005[j_2005] > key) {

	            array_2005[j_2005 + 1] = array_2005[j_2005];
	            j_2005--;
	        }

	        array_2005[j_2005 + 1] = key;

	        updateLabels();

	        stepLog.append("Hasil: ")
	               .append(arrayToString(array_2005))
	               .append("\n\n");

	        stepArea_2005.append(stepLog.toString());

	        i_2005++;
	        stepCount_2005++;

	        if (i_2005 == array_2005.length) {

	            sorting_2005 = false;
	            stepButton_2005.setEnabled(false);

	            JOptionPane.showMessageDialog(
	                this,
	                "Sorting selesai!"
	            );
	        }
	    }
	}
	private void updateLabels() {

	    for (int k = 0; k < array_2005.length; k++) {

	        labelArray_2005[k].setText(
	            String.valueOf(array_2005[k])
	        );
	    }
	}

	private void reset() {

	    inputField_2005.setText("");

	    panelArray_2005.removeAll();
	    panelArray_2005.revalidate();
	    panelArray_2005.repaint();

	    stepArea_2005.setText("");

	    stepButton_2005.setEnabled(false);

	    sorting_2005 = false;

	    i_2005 = 1;
	    stepCount_2005 = 1;
	}

	private String arrayToString(int[] arr) {

	    StringBuilder sb = new StringBuilder();

	    for (int k = 0; k < arr.length; k++) {

	        sb.append(arr[k]);

	        if (k < arr.length - 1) {
	            sb.append(", ");
	        }
	    }

	    return sb.toString();
	}
	}

