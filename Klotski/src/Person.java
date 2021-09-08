import javax.swing.*;
import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class Person extends JButton implements FocusListener {
    int number;
    Color color = new Color(255, 245, 170);
    Font font = new Font("微软雅黑", Font.BOLD, 12);

    public Person(int number, String s) {
        super(s);
        this.number = number;
        setBackground(color);
        setFont(font);
        addFocusListener(this);
    }

    @Override
    public void focusGained(FocusEvent e) {
        setBackground(Color.RED);
    }

    @Override
    public void focusLost(FocusEvent e) {
        setBackground(color);
    }
}