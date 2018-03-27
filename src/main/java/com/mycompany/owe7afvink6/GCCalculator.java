/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.owe7afvink6;

import org.biojava.nbio.core.exceptions.CompoundNotFoundException;
import org.biojava.nbio.core.sequence.DNASequence;

/**
 *
 * @author Jonathan
 */
public class GCCalculator {
    
    /**
     * Berekent GC-percentage
     * 
     * @param seq
     * @return GC-percentage
     * @throws CompoundNotFoundException 
     */
    public static float calculateGC(String seq) throws CompoundNotFoundException {
        int GCcount = new DNASequence(seq).getGCCount();
        
        int seqLengte = seq.length();
        float percentage;
        percentage = (GCcount / (float) seqLengte);

        return percentage;
        //return new DNASequence(seq).getGCCount() / seq.length();
    }
    
}
