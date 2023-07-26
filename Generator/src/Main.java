import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.FontData;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;


public class Main {

	public static void openWindow() {
        Display display = new Display();
        Shell shell = new Shell(display);

        GridLayout gridLayout = new GridLayout(2, false);
        
        shell.setMinimumSize(400, 150);
        shell.setMaximumSize(400, 151);
        shell.setLayout(gridLayout);
        shell.setText("Generator");
        
        Label label = new Label(shell, SWT.NONE);
        Font boldFont = new Font(label.getDisplay(), new FontData("Arial", 12, SWT.BOLD));
        label.setFont(boldFont);
        label.setText("Random generator: ");
        
        Text text = new Text(shell, SWT.PUSH);
        
        GridData data = new GridData(SWT.PUSH, SWT.LEFT, false, false);
        data.widthHint = 150;
        data.heightHint = 20;
        label.setLayoutData(data);
        text.setLayoutData(data);
        
        Button button1 = new Button(shell, SWT.PUSH);
        button1.setText("Name generator");
        button1.addListener(SWT.Selection, new Listener() {
			
			@Override
			public void handleEvent(Event e) {
				 switch (e.type) {
			        case SWT.Selection:
			        	NameGenerator nameGenerator = new NameGenerator();
			        	String genName = nameGenerator.generator();
			            text.setText(genName);
			          break;
				 }
				
			}
		});
        
        Button button2 = new Button(shell, SWT.PUSH);
        button2.setText("Password generator");
        button2.addListener(SWT.Selection, new Listener() {
			
			@Override
			public void handleEvent(Event e) {
				switch (e.type) {
		        case SWT.Selection:
		        	PasswordGenerator passwordGenerator = new PasswordGenerator();
		            String genPass = passwordGenerator.generator();
		            text.setText(genPass);
		          break;
		        }
				
			}
		});
        
        data = new GridData(SWT.PUSH, SWT.TOP, true, false, 1, 3);
        button1.setLayoutData(data);
        button2.setLayoutData(data);
        
        shell.pack();
        shell.open();
        while (!shell.isDisposed()) {
            if (!display.readAndDispatch()) {
                display.sleep();
            }
        }
        display.dispose();
	}

	public static void main(String[] args) {

		openWindow();

	}

}
