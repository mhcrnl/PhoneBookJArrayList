/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phonebookjarraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author mhcrnl
 */
public class Controler {
    
    ArrayList <Contact> listaContacte = new ArrayList <>();
    String file = "contacte.txt";
    String nume, prenume, telefon, email, companie;
    Contact contact;
    Scanner in;
    
    public void adaugaContact(){
        in = new Scanner(System.in);
        System.out.println("Introduceti numele contactului: ");
        nume = in.next();
        System.out.println("Introduceti prenumele contactului: ");
        prenume = in.next();
        System.out.println("Introduceti numarul de telefon; ");
        telefon = in.next();
        System.out.println("Introduceti adresa de email: ");
        email = in.next();
        System.out.println("Introduceti numele companiei: ");
        companie = in.next();
        try{
            contact = new Contact(nume, prenume, telefon, email, companie);
            listaContacte.add(contact);
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        
    }
    
    public void afiseazaContact(){
        Iterator itr  = listaContacte.iterator();
        while(itr.hasNext()){
            Object con = itr.next();
            System.out.println(con.toString()+" ");
        }
    }
    
    public void meniu(){
        
        int select;
        //Controler controller = new Controler();
        in = new Scanner(System.in);
        do{
            // Meniul aplicatiei
            System.out.println("=============== <> MENIU <> =================");
            System.out.println("============<> 1 ADAUGA COMTACT  ============");
            System.out.println("============<> 2 AFISEAZA CONTACTE ==========");
            System.out.println("============<> 4 INCHIDE APLICATIA ==========");
            System.out.println("Selectati o optiune: ");
            select = in.nextInt();
            int number =1;
            switch(select){
                case 1:
                    adaugaContact();
                    
                    break;
                case 2:
                    afiseazaContact();
                    //Contact.test1();
                    break;
                case 4:
                        
            }
        } while (select !=4);
        
        
    }
}
