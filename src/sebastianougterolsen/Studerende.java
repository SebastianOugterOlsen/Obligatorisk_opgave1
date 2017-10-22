//Denne klasse fungerer som skabelon (template) for de objekter, der bliver oprettet som studerende i "DatHoldet.java"


package sebastianougterolsen;

public class Studerende {

    /*Denne klasse skal indeholde nogle klasse-variabler,
    constructors og klasse-metoder,
    som kan beskrive datamatikerstuderende på dit hold.
     */

// DATA FIELDS - Klassens data fields

    // Instans variabler
    private String fnavn = "";
    private String enavn = "";
    private int alder = 0;
    private String adresse = "# NOADRESS #";
    private int postnummer = 9999;
    private String by = "# NOCITY #";


    /* KONSTRUKTOR
     * Constructoren kaldes hver gang, der laves et nyt objekt.
     * Jeg har bestemt, at alle studerende SKAL have et fornavn
     * Derfor er der ingen Studerende() konstruktor uden et fornavn som argument */


    public Studerende() { //Default constructor
    }

    public Studerende(String studerendesNavn) { //Constructor der tager to parametre ind
        this.fnavn = studerendesNavn;
        System.out.print("Navn:"+ "\n" + "\t\t" + fnavn + " ");
    }

    public Studerende(String studerendesFNavn,String studerendesENavn, int studerendesAlder) {
        this.fnavn = studerendesFNavn;
        this.enavn = studerendesENavn;
        this.alder = studerendesAlder;
       System.out.println("Navn:" + "\n" + "\t\t" + fnavn + "\n" + "Alder:" + "\n" + "\t\t" + alder + " År");
    }

    //Constructor med alle parametre
    public Studerende(String studerendesNavn,String studerendesENavn, int studerendesAlder, String studerendesAdresse, int studerendesPostnummer, String studerendesBy) {
        this.fnavn = studerendesNavn;
        this.enavn = studerendesENavn;
        this.alder = studerendesAlder;
        this.adresse = studerendesAdresse;
        this.postnummer = studerendesPostnummer;
        this.by = studerendesBy;
       System.out.println("Navn:" + "\n" + "\t\t" + fnavn + "\n" + "Alder:" + "\n" + "\t\t" +  alder + " År" + "\n" + "Adresse: " + " \n" + "\t\t" + adresse + " \n" + "\t\t" + postnummer + " \n" + "\t\t" + by + "\n\n" +"-------------------------");
    }


        //Get&Set metoder



    public String getENavn() {
        return enavn;
    }

    public void setENavn(String enavn) {
        this.enavn = enavn;
    }

    public int getAlder() {
        return alder;
    }

    public void setAlder(int alder) {
        this.alder = alder;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public int getPostnummer() {
        return postnummer;
    }

    public void setPostnummer(int postnummer) {
        this.postnummer = postnummer;
    }

    public String getBy() {
        return by;
    }

    public void setBy(String by) {
        this.by = by;
    }




/*
    //Udskrivnings metode
    public void seedata() {


            System.out.println("Den studerende er en " + køn + " og hedder " + navn);
            System.out.println("Vedkommende er " + alder + " år gammel");
            System.out.println("Og bor på adressen: " + " \n" + adresse + " \n" + postnummer + " \n" + by);

    }*/

}