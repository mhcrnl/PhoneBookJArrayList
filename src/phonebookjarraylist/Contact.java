/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phonebookjarraylist;

import java.io.Serializable;
import java.util.ArrayList;
/**
 * @fila Contact.java
 * @author mhcrnl
 */
public class Contact implements Serializable {
    //VARIABILE
    private static int nrCrt;
    private String nume;
    private String prenume;
    private String companie;
    private ArrayList<String> nrTelefon = new ArrayList();
    private ArrayList<String> emailuri = new ArrayList();
    /**
     * CONSTRUCTOR
     * @param nume
     * @param prenume
     * @param companie
     * @param telefon
     * @param email
     * @throws Exception 
     */
    public Contact(String nume, String prenume, String companie, String telefon, 
            String email) throws Exception{
        //if(!contactOk(nume, prenume, companie, telefon, email))
            //throw new Exception("Valorile introduse sunt gresite!");
        this.nume = nume;
        this.prenume = prenume;
        this.companie = companie;
        this.nrTelefon.add(telefon);
        this.emailuri.add(email);
        this.nrCrt++;
    } 
    public Contact(String nume, String prenume){
        this.nume = nume;
        this.prenume = prenume;
    }
    @Override
    public String toString(){
        String contact = nrCrt+" "+nume+" "+prenume+" "+companie+" "
                +nrTelefon+" "+emailuri;
        return contact;
    }
    /**
     * @return the nrCrt
     */
    public int getNrCrt() {
        return nrCrt;
    }
    /**
     * @param nrCrt the nrCrt to set
     */
    public void setNrCrt(int nrCrt) {
        this.nrCrt = nrCrt;
    }
    /**
     * @return the nume
     */
    public String getNume() {
        return nume;
    }

    /**
     * @param nume the nume to set
     */
    public void setNume(String nume) throws Exception {
        if(nume==null || nume.length()==0) throw new Exception("Nume nevalid!");
        this.nume = nume;
    }
    /**
     * @return the prenume
     */
    public String getPrenume() {
        return prenume;
    }
    /**
     * @param prenume the prenume to set
     */
    public void setPrenume(String prenume) throws Exception {
        if(prenume==null || nume.length()==0) 
            throw new Exception("Prenume nevalid");
        this.prenume = prenume;
    }
    /**
     * @return the telefon
     */
    public ArrayList<String> getTelefon() {
        return nrTelefon;
    }
    /**
     * @param telefon the telefon to set
     */
    public void setTelefon(String telefon) throws Exception {
        if(telefon==null || telefon.length()==0) 
            throw new Exception("Numar de telefon nevalid!");
        this.nrTelefon.add(telefon);
    }
    /**
     * @return the email
     */
    public ArrayList<String> getEmail() {
        return emailuri;
    }
    /**
     * @param email the email to set
     */
    public void setEmail(String email) throws Exception {
        if(email==null || email.length()<6)throw new Exception("Email nevalid");
        this.emailuri.add(email);
    }
    /**
     * @return the companie
     */
    public String getCompanie() {
        return companie;
    }
    /**
     * @param companie the companie to set
     */
    public void setCompanie(String companie) throws Exception {
        if(companie==null || companie.length()==0) 
            throw new Exception("Nume companie nevalid!");
        this.companie = companie;
    }
    /**
     * Verifica valorile
     * @param nume
     * @param prenume
     * @param companie
     * @param telefon
     * @param email
     * @return 
     */
    private static boolean contactOk(String nume, String prenume,String companie,
            String telefon, String email){
        return nume!=null && nume.length()>0 && prenume!=null && prenume.length()>0
                && companie!=null && companie.length()>0 && telefon!=null &&
                telefon.length()>0 && email!=null && email.length()>0;
                
    }
    
    public static void test1(){
        try{
            Contact cont = new Contact("mihai", "cornel");
            cont.setCompanie("Sygler.srl");
            cont.setTelefon("0722270796");
            cont.setEmail("qwerti@gmail.com");
            System.out.println(cont);
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }
}
