/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.boot.whats.app;

import static com.java.boot.whats.app.ListaContatos.listContatos;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *
 * @author pablo
 */
public class ComJavaBootWhatsApp {

    
    
    public static void main(String[] args) throws InterruptedException {
        
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\pablo\\Downloads\\bot\\chromedriver.exe"); // Busca qual tipo de Driver esta sendo usado e onde esta localizado
                                                                                                        //Substituir C:\\Users\\pablo\\Downloads\\bot\\chromedriver.exe pelo seu diretorio
        SorteiaMensagem mens = new SorteiaMensagem(); //Instancia a Classe onde estão as mensagens a serem sorteadas                                                       
        
        WebDriver driver = new ChromeDriver(); //Instancia um Driver chamado driver
        
        driver.get("https://web.whatsapp.com/"); //Loga no Whatsapp
        Thread.sleep(1000*20); // Todas as Thread tem intenção de dar tempo as respostas do boot... conta feita 1000 = 1 segundo logo isto * 30 são 30s
        
        for(String contato: listContatos()){ //For necessario para cada contato existence na nossa lista de contatos.
            WebElement selectCont; // Instancia um WebElement para selecionar o contato
            selectCont = driver.findElement(By.xpath("//span[@title='" + contato.toString() + "']")); // Buscamos o elemento span que é unico onde o boot sabera qual escolher, 
            selectCont.click();// clicka na seleção                                                      contato.toString() pega um contato de cada vez   
            Thread.sleep(1000 * 2);
            
            WebElement chatBox;
            chatBox = driver.findElement(By.className("_13mgZ"));
            chatBox.click();
            chatBox.sendKeys(mens.sortMens()); // Aqui mens.sortMens é o metodo que sorteia as mensagens
            Thread.sleep(1000 * 2);
            
            WebElement sendButton;
            sendButton = driver.findElement(By.xpath("//span[@data-icon='send']")); // Envia finalmente a mensagem
            sendButton.click();
        }
        
    }
    
}
