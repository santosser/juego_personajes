import java.awt.EventQueue;
import javax.swing.JFrame;

public class mueveimagen extends JFrame {

    public mueveimagen() {
        super("unajmasantos");
        initUI();
    }
    
    private void initUI() {
        
        add(new tablero());
        
        setSize(400, 300);
        setResizable(false);
        
        setTitle("unajmasantos");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                
                mueveimagen ex = new mueveimagen();
                ex.setVisible(true);
            }
        });
    }
}