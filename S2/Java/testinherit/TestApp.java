package testinherit;

import java.util.ArrayList;

public class TestApp {
    public static void main(String[] args) throws Exception {
      ArrayList<Component> array = new ArrayList<> ();
      array.add(new Button(10,20,"b1'"));
      array.add(new TextField("nom"));
        for (Component comp : array) {
            comp.draw();
            comp.print();
        }

    }
}
