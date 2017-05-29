import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.EventListener;
import java.util.List;

/**
 * Created by Andrew on 05/29/17.
 */
public class Kettle {

    List<ActionListener> listeners = new ArrayList<ActionListener>();

    public void addListener(ActionListener listener){
        listeners.add(listener);
    }

    private void fireEvent(){
        for (ActionListener listener : listeners){
            listener.actionPerformed(new ActionEvent(this,0,"Command"));
        }
    }

    public void putOnFire(){
        for (int i = 0; i < 100; i++) {

            System.out.println(i);




            if (i == 50) {
                i = 0;
                System.out.println("BOILED!");
                fireEvent();
            }



            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


    }

}
