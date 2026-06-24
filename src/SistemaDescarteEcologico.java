import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.FlowLayout;

public class SistemaDescarteEcologico extends JFrame {

    public SistemaDescarteEcologico() {
        setTitle("EcoPonto Senac");
        setSize(380,140);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout());

        JLabel lblMensagem = new JLabel("Selecione para descartar resíduos eletrônicos: ");
        JButton bntAcao = new JButton("Lixeira de Baterias e Pilhas");

        add(lblMensagem);
        add(bntAcao);

        bntAcao.addActionListener(e -> {
            // Exibir uma caixa de dialogo flutuante de informação
            JOptionPane.showMessageDialog(this, "Deposite os materiais nos coletores laranjas do saguão principal.","Descarte Correto",JOptionPane.INFORMATION_MESSAGE);
        });
    }
    
    public static void main(String[] args) {
        SistemaDescarteEcologico sistema = new SistemaDescarteEcologico();
        sistema.setVisible(true);
    }
}
