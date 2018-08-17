
public class spying 
{
	class SimpleButtonFrame extends Frame implements ActionListener{
		  Button myButton;
		  TextField name,greeting;
		  public SimpleButtonFrame(){
		         addWindowListener(new MyWindowListener());
		         setSize(200, 100);
		         setTitle("This is My Frame");
		         setLayout(new FlowLayout());
		         setBackground(Color.lightGray);
		         myButton=new Button("Press Me");
		         name=new TextField(10);
		         greeting=new TextField(15);
		         add(name);
		         add(myButton);
		         add(greeting);
		         myButton.addActionListener(this);
		  }
		  private class MyWindowListener extends WindowAdapter{
		public void windowClosing(WindowEvent e){
		      	System.exit(0);
		      }
		  }
		  public void actionPerformed(ActionEvent e){
		         String n;
		         n="Hello "+name.getText();
		         greeting.setText(n);
		  }
		}


}
