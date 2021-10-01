import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import javax.sound.midi.Soundbank;
import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class thuc_hanh_su_dung_toan_tu {
    public static void main(String[] args) {
        float width;
        float height;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        width = sc.nextFloat();
        System.out.println("enter a number");
        height = sc.nextFloat();
        float area = width * height;
        System.out.println("area is :" + area);
    }

}
