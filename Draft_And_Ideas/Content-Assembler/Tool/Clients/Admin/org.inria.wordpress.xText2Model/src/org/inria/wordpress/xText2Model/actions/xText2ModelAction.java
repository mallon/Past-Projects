package org.inria.wordpress.xText2Model.actions;

import org.eclipse.core.resources.IFile;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;

public class xText2ModelAction implements IObjectActionDelegate {

	private ISelection selection;
	
	public xText2ModelAction() {
		super();
	}

	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
	}

	public void run(IAction action) {
		IFile file = (IFile) ((IStructuredSelection)selection).getFirstElement();
		new WdpGrammar2XMI(file);
	}

	public void selectionChanged(IAction action, ISelection selection) {
		this.selection = selection;
	}

}
