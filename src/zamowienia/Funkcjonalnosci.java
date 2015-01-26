/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zamowienia;

public class Funkcjonalnosci {
   public Klient addClient(){
     
       String imie = "";
       String nazwisko = "";
       String telefon = "";
       
       return new Klient(imie , nazwisko, telefon);
   } 
}
