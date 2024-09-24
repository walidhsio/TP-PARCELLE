package sio.capdc.metier;

import java.time.LocalDate;

public class Pulverisation {

    //Attributs privées
    private String id;
    private double dosagePulverisation;
    private LocalDate datePulverisation;

    //Constructeur
    public Pulverisation(String unId, double unDosage, LocalDate uneDate){

        this.id = unId;
        this.dosagePulverisation = unDosage;
        this.datePulverisation = uneDate;
    }
    public double GetDosage(){
        return this.dosagePulverisation;
    }
}
