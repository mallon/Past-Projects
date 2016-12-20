package generation.views;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;

public class MappingFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel mappingPanel;
	private JTable mappingTable;

	public MappingFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 799, 699);
		mappingPanel = new JPanel();
		mappingPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(mappingPanel);
		mappingPanel.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 0, 679, 262);
		mappingPanel.add(scrollPane);
		
		mappingTable = new JTable();
		mappingTable.setModel(new MappingModel());
		mappingTable.getColumnModel().getColumn(1).setPreferredWidth(150);
		scrollPane.setViewportView(mappingTable);
		
		setVisible(true);
	}
}
