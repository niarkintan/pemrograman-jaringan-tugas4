package Tugas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Asus
 */
public class TugasController {
    public TampilTugas view;
    
    public TugasController(TampilTugas view) {
        this.view = view;
        
        this.view.getHitungButton().addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                hitung();
            }
        });
        
        this.view.getBersihkanButton().addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                view.getPanjangText().setText("");
                view.getLebarText().setText("");
                view.getLuasText().setText("");
                view.getKelilingText().setText("");
            }
        });
        
    }
    
    public void hitung(){
        if(this.view.getPanjangText().getText().isEmpty() || this.view.getLebarText().getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "FIELD MASIH KOSONG!", "ERROR", JOptionPane.ERROR_MESSAGE);
        } else {
            int pjg = Integer.valueOf(view.getPanjangText().getText());
            int lbr = Integer.valueOf(view.getLebarText().getText());

            int luas    = pjg * lbr;
            int keliling     = (pjg+lbr)*2;

            view.getLuasText().setText(String.valueOf(luas));
            view.getKelilingText().setText(String.valueOf(keliling));
        }
    }
}

   
