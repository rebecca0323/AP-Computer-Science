package chaptertwo;

import org.eclipse.swt.widgets.*;
import org.eclipse.swt.*;

public class FirstGUI {

	protected Shell shell;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try { //try catch statement to run the application
			FirstGUI window = new FirstGUI();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault(); //display is object that contains all GUI components; not actually visible, but components are visible
		createContents();
		shell.open(); //opens the shell which allows it to be seen as pop out.
		shell.layout();
		while (!shell.isDisposed()) { //event loop shows the widgets used
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shell = new Shell(); //instantiates new shell object that holds all the SWT widgets
		shell.setSize(450, 300); //set size of pop out
		shell.setText("SWT Application");
		
		Label label1 = new Label(shell, SWT.BORDER); //instantiates label object which is like text that is in the GUI application
		label1.setText("Hello World"); //the text in the label
		label1.setSize(100, 20); //size of box
		label1.setLocation(30, 30); //location of box
		
		Text text1 = new Text(shell, SWT.BORDER); //instantiates new text box that user can interact with
		text1.setTextLimit(30); //sets amount of characters a person can type
		text1.setText("Type something here"); //text that is already in the box
		text1.setBounds(10,60,200,20); //bounds of the box the text is in
		
		Text text2 = new Text(shell, SWT.BORDER); //instantiates new text box that user can interact with
		text2.setEchoChar('*'); //makes it so whenever user types anything it becomes and asterisk like a password
		text2.setBounds(10,100,200,20); //bounds of the box that the text is in
		text2.setText("Password"); //text that is already in the box, which when runs, looks like ******** because of echo char
	}

}
