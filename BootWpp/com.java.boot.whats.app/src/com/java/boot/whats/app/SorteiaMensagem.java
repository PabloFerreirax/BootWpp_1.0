/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.boot.whats.app;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author pablo
 */
public class SorteiaMensagem {
    
    public String sortMens(){ //Sorteia mensagem dentre as descritas aqui...
        List<String> mensagem = new ArrayList<String>();
        mensagem.add("ATAQUE DO BOOT LOKOOOO XD XD");
        mensagem.add("ATAQUE");
        mensagem.add("DO BOOT");
        mensagem.add("LOKOOOO XD XD");
        return mensagem.get((int) (Math.random() * mensagem.size())); //Faz o random para ser aleatorias as mensagens.
    }
    
}
