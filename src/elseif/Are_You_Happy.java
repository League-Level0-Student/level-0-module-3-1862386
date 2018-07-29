package elseif;

import javax.swing.JOptionPane;

public class Are_You_Happy {
	public static void main(String[] args) {
		String happy = JOptionPane.showInputDialog("Are you Happy?");
		if (happy.equalsIgnoreCase("Yes")) {
			JOptionPane.showMessageDialog(null, "Keep Doing Whatever You're Doing");
		}
		if (happy.equalsIgnoreCase("No")) {
			String wantHappy = JOptionPane.showInputDialog("Do You Want To Be Happy?");

			if (wantHappy.equalsIgnoreCase("Yes")) {
				JOptionPane.showMessageDialog(null, "Change Something");
			}
			if (wantHappy.equalsIgnoreCase("No")) {
				JOptionPane.showMessageDialog(null, "Keep Doing Whatever You're Doing");
			}
		}
	}

}
