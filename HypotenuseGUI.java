import javax.swing.JOptionPane;
 


public class HypotenuseGUI{
	public static void main(String[] args) {
		 

		 JOptionPane.showMessageDialog(null,"Hello we can calculate hypotenuse of a triangle for you !!");
		 double firstSide = Double.parseDouble(JOptionPane.showInputDialog("Type frst side of a triangle"));
		 double secondSide = Double.parseDouble(JOptionPane.showInputDialog("Ok now type for second side"));

		double answer = Math.sqrt((firstSide*firstSide)+(secondSide*secondSide));

		JOptionPane.showMessageDialog(null,"Hypotenuse of your triangle answer is " + answer);
	}
}