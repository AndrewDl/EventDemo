/**
 * Created by Andrew on 05/29/17.
 */
public class Main {
    public static void main(String[] args)  {

        Kettle kettle = new Kettle();

        Listener myListener1 = new Listener("myListener1");
        Listener myListener2 = new Listener("myListener2");
        Listener myListener3 = new Listener("myListener3");

        kettle.addListener(myListener1);
        kettle.addListener(myListener2);
        kettle.addListener(myListener3);

        kettle.putOnFire();
    }


}
