import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Andrew on 05/29/17.
 */
public class Listener implements ActionListener {

    String name = "";

    Listener(String name){
        this.name = name;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(name + " responds to event!");
    }
}
