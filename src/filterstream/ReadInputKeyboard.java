package filterstream;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class ReadInputKeyboard {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
            System.out.println("Masukkan karakter apapun, [tekan keluar tekan `q`]: ");
            String input = "";
            do {
                input = sc.nextLine();
                System.out.println("" + input);
            } while (!input.equals('q'));
    }
}
