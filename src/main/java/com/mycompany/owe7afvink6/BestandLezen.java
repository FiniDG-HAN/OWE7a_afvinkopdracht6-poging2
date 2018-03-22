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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import org.biojava.nbio.core.exceptions.CompoundNotFoundException;

/**
 *
 * @author fini
 */
public class BestandLezen {
    
    static String dna, filename;

    public static void main(String[] args) {
        filename = fileChooser();
        dna = bestandLezen(filename);
        try {
            HTMLGenerator.writeHTMLReport(GCCalculator.calculateGC(dna), dna, filename);
        } catch (CompoundNotFoundException | IOException ex) {
            Logger.getLogger(BestandLezen.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static String fileChooser() {
        JFileChooser fileChooser = new JFileChooser();
        int reply = fileChooser.showOpenDialog(null);
        if (reply == JFileChooser.APPROVE_OPTION) {
            File selectedFile1 = fileChooser.getSelectedFile();
            return selectedFile1.getAbsolutePath();
        }
        return null;
    }

    public static String bestandLezen(String Path) {
        try {
            BufferedReader inFile;
            inFile = new BufferedReader(new FileReader(Path));
            String line, sequentie = "";
            inFile.readLine();
            while ((line = inFile.readLine()) != null) {
                sequentie += line;
            }
            inFile.close();
            return sequentie;
        } catch (IOException | ArrayIndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(null, "Bestand kan niet gelezen worden, ga naar:ftp://ftp.genome.jp/pub/db/virushostdb/ en download het tsv bestand");
        }
        return null;
    }

}
