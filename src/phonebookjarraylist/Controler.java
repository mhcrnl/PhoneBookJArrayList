/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phonebookjarraylist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

/**
 *
 * @author mhcrnl
 */
public class Controler implements List{
    
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

    @Override
    public int size() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isEmpty() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean contains(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Iterator iterator() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object[] toArray() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object[] toArray(Object[] ts) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean add(Object e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean remove(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean containsAll(Collection clctn) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean addAll(Collection clctn) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean addAll(int i, Collection clctn) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean removeAll(Collection clctn) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean retainAll(Collection clctn) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object get(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object set(int i, Object e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void add(int i, Object e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object remove(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int indexOf(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int lastIndexOf(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ListIterator listIterator() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ListIterator listIterator(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List subList(int i, int i1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
