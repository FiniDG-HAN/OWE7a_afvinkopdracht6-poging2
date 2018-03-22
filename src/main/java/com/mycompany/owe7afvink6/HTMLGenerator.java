/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.owe7afvink6;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Jonathan
 */
public class HTMLGenerator {
    
    FileWriter htmlWriter;
    BufferedWriter writer;
    
    /**
     * Schrijft HTML rapport met dna-sequentie en GC-percentage
     * 
     * @param gc
     * @param dnaSeq
     * @param name
     * @throws IOException 
     */
    public void writeHTMLReport(int gc, String dnaSeq, String name) throws IOException {
        htmlWriter = new FileWriter(name + ".html");
        writer = new BufferedWriter(htmlWriter);
        writer.write(dnaSeq + "\nGC%: " + Integer.toString(gc));
        writer.close();
    }
}
