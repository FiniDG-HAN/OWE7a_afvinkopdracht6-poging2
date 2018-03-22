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
    public int calculateGC(String seq) throws CompoundNotFoundException {
        return new DNASequence(seq).getGCCount() / seq.length();
    }
    
}
