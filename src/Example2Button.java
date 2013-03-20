import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class Example2Button {
    public static void main(String[] args) {
        JButton button = new JButton("Click");

        //jdk7
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("The button was clicked using old fashion code!");
            }
        });

        //jdk8
        button.addActionListener( e -> System.out.println("The button was clicked!") );

    }

}
