import javax.swing.JOptionPane;

/*
 * 
 * Manager to Class to split teams initially
 * 
 */
public class TeamManager {

	JOptionPane optionPane = new JOptionPane("Are You in Graphics Team?",
			JOptionPane.QUESTION_MESSAGE, JOptionPane.YES_NO_OPTION);

	TeamManager() {
	}

	int execute() {
		return optionPane.showConfirmDialog(null,
				"Are You in the Graphics Team?");
	}

}
