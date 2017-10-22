package sebastianougterolsen;

public class DatHoldet {

    public void holdInfo() {

    /*opret dig selv og nogle klassekammerater
    som objekter af typen Studerende.
     */


                // Opretter random studerende
       Studerende stud0001 = new Studerende("Sebastian Ougter");


        stud0001.setENavn("Olsen"); //Kalder metoden "setENavn" og tildeler et efternavn til objektet
        System.out.println(stud0001.getENavn());

        stud0001.setAlder(21); //Kalder metoden "setAlder" og tildeler en alder til objektet
        System.out.println("Alder:" + "\n" + "\t\t" + stud0001.getAlder() + " År");

        stud0001.setAdresse("Theklavej 11 1.Th"); //Kalder metoden "setAdresse" og tildeler en adresse til objektet
        System.out.println("Adresse:" + "\n" + "\t\t" +stud0001.getAdresse());

        stud0001.setPostnummer(2400); //Kalder metoden "setPostnummer" og tildeler et postnummer til objektet
        System.out.print("\t\t" + stud0001.getPostnummer()); //"getPostnummer" returnerer postnummer, skal sættes i SOUT for udprint

        stud0001.setBy("\n" + "\t\t" + "København NV"); //Kalder metoden "setBy" og tildeler objektet en by
        System.out.println(stud0001.getBy() + "\n\n" +"-------------------------" + "\n"); //"getBy" returnerer by. Skal sættes i SOUT for udprint


        //---------------
        Studerende stud0002 = new Studerende("Tobias","Olsen", 19);


        stud0002.setAdresse("Kirkevej 6A"); //Kalder metoden "setAdresse" og tildeler en adresse til objektet
        System.out.println("Adresse: " + "\n" + "\t\t" + stud0002.getAdresse());
        stud0002.setPostnummer(4672); //Kalder metoden "setPostnummer" og tildeler et postnummer til objektet
        System.out.print("\t\t" +stud0002.getPostnummer()); //"getPostnummer" returnerer postnummer, skal sættes i SOUT for udprint
        stud0002.setBy("\n" + "\t\t" + "Klippinge"); //Kalder metoden "setBy" og tildeler objektet en by
        System.out.println(stud0002.getBy()  + "\n\n" +"-------------------------"+  "\n"); //"getBy" returnerer by. Skal sættes i SOUT for udprint

        //---------------
        Studerende stud0003 = new Studerende("Louise","Frederiksen",21, "Theklavej 11 1.Th" ,2400 , "København NV" );

    }
}


