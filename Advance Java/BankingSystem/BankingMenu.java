import javax.swing.*;
import java.awt.event.*;
import java.awt.event.*;
public class BankingMenu extends JFrame{
    JMenuBar menubar;
    JMenu New;
    BankingMenu() {
        menubar=new JMenuBar();
        New=new JMenu("New");

        setLayout(null);
        setSize(400,400);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setJMenuBar(menubar);
        menubar.add(New);
    }

    public static void main(String []args){
        BankingMenu bs=new BankingMenu();
    }
}
