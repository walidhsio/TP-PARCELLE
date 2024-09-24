package sio.capdc.metier;

import java.time.LocalDate;
import java.util.ArrayList;

public class Parcelle {
    // attributs privés
    private String id;
    private String nomExploitant;
    private String especeCultivee;
    private LocalDate dateSemis;
    private LocalDate dateRecoltePrevue;
    private double surface;
    private ArrayList<TraitementPhytosanitaire> lesTraitementsPhyto;

    // constructeur
    public Parcelle(String unId, String unExploitant, String uneEspece, LocalDate uneDateSemis, LocalDate uneDateRecolte, double uneSurface){
        this.id = unId;
        this.nomExploitant = unExploitant;
        this.especeCultivee = uneEspece;
        this.dateSemis = uneDateSemis;
        this.dateRecoltePrevue = uneDateRecolte;
        this.surface = uneSurface;
        this.lesTraitementsPhyto = new ArrayList<TraitementPhytosanitaire>();
    }
    // méthodes
    public double GetSurface() {
        return this.surface;
    }
    public ArrayList<TraitementPhytosanitaire> GetLesTraitementsPhytosanitaires(){
        return this.lesTraitementsPhyto;
    }
    public void AjouteUnTraitement(TraitementPhytosanitaire unTraitement){
        this.lesTraitementsPhyto.add(unTraitement);
    }
    public double GetTauxTraitementSemence(){

        double t = 0;

        for (TraitementPhytosanitaire traitement : lesTraitementsPhyto) {
            if (traitement instanceof TaitementSemence) { // Vérifie si le traitement est un traitement de semence
               t++;
            }
        }
        // Calculer le taux en pourcentage
        return ( t / this.lesTraitementsPhyto.size()) * 100; // Retourner le taux en pourcentage
    }

}
