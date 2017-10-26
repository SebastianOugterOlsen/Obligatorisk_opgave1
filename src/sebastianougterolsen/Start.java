package sebastianougterolsen;

//Skal indeholde main() metoden, som bringer ovenstående 3 klasser i spil.


class Start {

    public static void main(String[] args) {


        System.out.println("------- BUNDEN FORUDSÆTNING -------\n");

        DatHoldet mitHold = new DatHoldet(); //Jeg opretter et nyt hold (objekt) ud fra min class "DatHoldet"
        mitHold.holdInfo();

        System.out.println("\n_____________________________________\n");


        MineMetoder methods = new MineMetoder(); //Jeg opretter et nyt objekt ud fra min class "MineMetoder"
        methods.altMuligt(); //Jeg kalder min metode "altMuligt", der indeholder noget af det jeg har lært.





    }
        }