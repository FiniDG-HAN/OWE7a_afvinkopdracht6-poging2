/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.owe7afvink6;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;




/**
 *
 * @author fini
 */
public class BestandLezen {
    
    static ArrayList<String> seqBestandsnaam = new ArrayList<>();
    
    public static void main(String[] args) {
        fileChooser();
        
        }
    
    public static void fileChooser(){
        JFileChooser fileChooser = new JFileChooser();
            int reply = fileChooser.showOpenDialog(this);
            if (reply == JFileChooser.APPROVE_OPTION) {
                File selectedFile1 = fileChooser.getSelectedFile();
                String bestandsnaam = selectedFile1.getAbsolutePath();
                fileLoc1 = textfieldBestand.getText();
            }
    }
    
    public static void bestandLezen(String Path) {
        try {
            BufferedReader inFile;
            inFile = new BufferedReader(new FileReader(Path));
            String line;
            inFile.readLine();
            int teller = 0;
            //while ((line = inFile.readLine()) != null) { /// gebruik deze als je het hele bestand wilt inladen
            while ((line = inFile.readLine()) != null) { // gebruik deze als je wilt testen (eerste 600 entries)
                String sequentie = line;
                seqBestandsnaam.add(sequentie);
                seqBestandsnaam.add(bestandsnaam);
            }
            inFile.close();

        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Bestand kan niet gelezen worden, ga naar:ftp://ftp.genome.jp/pub/db/virushostdb/ en download het tsv bestand");
        } catch (ArrayIndexOutOfBoundsException a) {
            JOptionPane.showMessageDialog(null, "Bestand kan niet gelezen worden, ga naar:ftp://ftp.genome.jp/pub/db/virushostdb/ en download het tsv bestand");
        } catch (Exception e) {
            System.out.println("Onbekende fout: raadpleeg uw systeembeheerder");
        }
    }

}



    