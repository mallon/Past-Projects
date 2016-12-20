package generation.views;

import javax.swing.table.DefaultTableModel;

public class MappingModel extends DefaultTableModel{

	private static final long serialVersionUID = 1L;
	
	public MappingModel(){
		setDataVector(null, new String[] {
				 "Target metamodel elements", "Source metamodel elements"
			});
	}

}
