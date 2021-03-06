import java.awt.*;
import java.awt.event.*;
 
class AssociationOutside implements ActionListener extends Frame
	{
		Label l1=new Label("First Number");
		Label l2=new Label("Second Number");
		Label l3=new Label("Result");
		TextField t1=new TextField();
		TextField t2=new TextField();
		TextField t3=new TextField();
		Button b1=new Button("Add");
		Button b2=new Button("Sub");
		Button b3=new Button("Mul");
		Button b4=new Button("Div");
	
	AssociationOutside()
	{
		l1.setBounds(50,100,100,20);
		l2.setBounds(50,140,100,20);
		l3.setBounds(50,180,100,20);
		t1.setBounds(200,100,100,20);
		t2.setBounds(200,140,100,20);
		t3.setBounds(200,180,100,20);
		b1.setBounds(50,250,50,20);
		b2.setBounds(110,250,50,20);
		b3.setBounds(170,250,50,20);
		b4.setBounds(230,250,50,20);
		

		add(l1);
		add(l2);
		add(l3);
		add(t1);
		add(t2);
		add(t3);
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		
		
		
		setLayout(null);
		setVisible(true);
		setSize(400,350);

		b1.addActionListener(OutsideClass(this));
		b2.addActionListener(OutsideClass(this));
		b3.addActionListener(OutsideClass(this));
		b4.addActionListener(OutsideClass(this));
	}
	public static void main(String[] args)
	{
		new AssociationWithin();
	}

	class OutsideClass implements ActionListener{
		AssociationOutside obj;
		public OutsideClass(AssociationOutside obj){
			this.obj = obj;
		}
	}
	public void actionPerformed(ActionEvent event)
	{
		int n1=Integer.parseInt(t1.getText());
		int n2=Integer.parseInt(t2.getText());
		try{

		if(event.getSource()==b1)
		{
			t3.setText(String.valueOf(n1+n2));
		}
		if(event.getSource()==b2)
		{
			t3.setText(String.valueOf(n1-n2));
		}
		if(event.getSource()==b3)
		{
			t3.setText(String.valueOf(n1*n2));
		}
			if(event.getSource()==b4)
		{
			t3.setText(String.valueOf(n1/n2));
		}
		 } catch (Exception e) {
            t3.setText("Invalid"+" "+e.getMessage());
        }
	}
		
}
