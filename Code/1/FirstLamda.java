import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JButton;

public class FirstLamda {
    public static void main(String[] args) {
        JFrame frame = new JFrame("My Frame");
        JButton button = new JButton("OK");
        // using anonymous inner class as an argument of button’s function
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button clicked");
            }
        });
        frame.add(button);
        frame.setSize(200, 200);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

// wtf เขียนเซี่ยไรเนี่ย ไม่รู้เรื่อง ไม่เคยทำ Desktop ด้วย Java ซะด้วยสิ
// ลองไปต่อกันที่โปรแกรม 2 (Console Output ดีกว่า อันนี้มัน ...... งงแดก 5555)