import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class LookWhoWins {
    public void WhoWins(String[] Values, JFrame jf) {
        if (Values[0] == Values[1] && Values[1] == Values[2] && Values[0] != "") {
            JOptionPane.showMessageDialog(null, Values[0] + "wins");
        } else if (Values[3] == Values[4] && Values[4] == Values[5] && Values[3] != "") {
            JOptionPane.showMessageDialog(null, Values[3] + "wins");
        } else if (Values[6] == Values[7] && Values[7] == Values[8] && Values[6] != "") {
            JOptionPane.showMessageDialog(null, Values[6] + "wins");

        } else if (Values[0] == Values[3] && Values[3] == Values[6] && Values[0] != "") {
            JOptionPane.showMessageDialog(null, Values[0] + "wins");
        } else if (Values[1] == Values[4] && Values[4] == Values[7] && Values[1] != "") {
            JOptionPane.showMessageDialog(null, Values[1] + "wins");

        } else if (Values[2] == Values[5] && Values[5] == Values[8] && Values[2] != "") {
            JOptionPane.showMessageDialog(null, Values[2] + "wins");
        } else if (Values[0] == Values[4] && Values[4] == Values[8] && Values[0] != "") {
            JOptionPane.showMessageDialog(null, Values[0] + "wins");
        } else if (Values[2] == Values[4] && Values[4] == Values[6] && Values[2] != "") {
            JOptionPane.showMessageDialog(null, Values[2] + "wins");
        } else if (Values[0] == Values[1] && Values[1] == Values[2] && Values[2] == Values[3] && Values[3] == Values[4]
                && Values[4] == Values[5] && Values[5] == Values[6] && Values[6] == Values[7] && Values[7] == Values[8]
                && Values[8] == Values[0]) {
            JOptionPane.showMessageDialog(null, Values[2] + "Tie");
        }
    }

    public void Restart(JFrame JF) {
        JF.dispose();
        new MainFrame();
    }
}
