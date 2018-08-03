package elseif;

import javax.swing.JOptionPane;

public class Horoscope {
	public static void main(String[] args) {
		String star = JOptionPane.showInputDialog("What is your star sign");
		if (star.equalsIgnoreCase("Aries")) {
JOptionPane.showMessageDialog(null, "Courageous, energetic, willful, commanding, leading. Often leads when following would be best course of action");
		}
		else if (star.equalsIgnoreCase("Taurus")) {
			JOptionPane.showMessageDialog(null, "Pleasure seeking, loves control, dependable, grounded, provokes slowly, and highly sensual in nature");
		}
		else if (star.equalsIgnoreCase("Gemini")) {
			JOptionPane.showMessageDialog(null, "Cerebral, chatty, loves learning and education, charming, and adventurous");
		}
		else if (star.equalsIgnoreCase("Cancer")) {
			JOptionPane.showMessageDialog(null, "Emotional, group oriented, seeks security, family");
		}
		else if (star.equalsIgnoreCase("Leo")) {
			JOptionPane.showMessageDialog(null, "Generous, organized, protective, beautiful");
		}
		else if (star.equalsIgnoreCase("Virgo")) {
			JOptionPane.showMessageDialog(null, "Particular, logical, practical, sense of duty, critical");
		}
		else if (star.equalsIgnoreCase("Libra")) {
			JOptionPane.showMessageDialog(null, "Balanced, seeks beauty, sense of justice");
		}
		else if (star.equalsIgnoreCase("Scorpio")) {
			JOptionPane.showMessageDialog(null, "Passionate, exacting, loves extremes, combative, reflective");
		}
		else if (star.equalsIgnoreCase("Sagittarius")) {
			JOptionPane.showMessageDialog(null, "Happy, absent minded, creative, adventurous");
		}
		else if (star.equalsIgnoreCase("Capricorn")) {
			JOptionPane.showMessageDialog(null, "Timeless, driven, calculating, ambitious");
		}
		else if (star.equalsIgnoreCase("Aquarius")) {
			JOptionPane.showMessageDialog(null, "Forward thinking, communicative, people oriented, stubborn, generous, and dedicated");
		}
		else if (star.equalsIgnoreCase("Pisces")) {
			JOptionPane.showMessageDialog(null, "Likeable, energetic, passionate, sensitive");
		}
		else {
			JOptionPane.showMessageDialog(null, "That's not a star sign");
		}
		
	}
}
