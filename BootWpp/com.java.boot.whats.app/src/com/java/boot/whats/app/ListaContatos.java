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
public class ListaContatos {
    
    public static List<String> listContatos(){ //Esta classe escolhe os contatos que desejar mandar as mensagens
        List<String> mensagem = new ArrayList<String>();
        mensagem.add("AGENDA");
        mensagem.add("Juan");
        mensagem.add("Francis");    // usar mensagem.add("Nome contato"); 
        return mensagem;
    }
}
