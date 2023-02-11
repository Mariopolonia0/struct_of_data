package EjercicioJava.programacion3.ejercicioHechoEnClase.PRACTICA;

import java.awt.*;

class FrameWControlsDemo extends Frame {
    public static void main(String args[]) {

        FrameWControlsDemo fwc = new FrameWControlsDemo();
        fwc.setLayout(new FlowLayout());
        fwc.setSize(600, 200);

        fwc.add(new Button("Pruebame!"));
        fwc.add(new Label("Label"));
        fwc.add(new TextField());

        CheckboxGroup cbg = new CheckboxGroup();

        fwc.add(new Checkbox("chk1", cbg, true));
        fwc.add(new Checkbox("chk1", cbg, true));
        fwc.add(new Checkbox("chk2", cbg, false));
        fwc.add(new Checkbox("chk3", cbg, false));

        List list = new List(3, false);
        list.add("MTV");
        list.add("V");
        fwc.add(list);

        Choice chooser = new Choice();
        chooser.add("Lady Gaga");
        chooser.add("Monica");
        chooser.add("Britney");

        fwc.add(chooser);
        fwc.add(new Scrollbar());
        fwc.setVisible(true);
    }
}