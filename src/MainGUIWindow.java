import javax.swing.*;

public class MainGUIWindow extends JFrame{
    private JPanel mainPanel;
    private JLabel mainLabel;
    private JTextField topField;
    private JButton askButton;
    private JTextField mainField;

    public MainGUIWindow () {
        createUIComponents();

    }

    private void createUIComponents() {
        setContentPane(mainPanel);
        setTitle("Welcome to my gui brah");
        setSize(500,500);
        setLocation(300,300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
