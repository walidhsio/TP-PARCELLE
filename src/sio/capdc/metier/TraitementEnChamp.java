package sio.capdc.metier;

import java.util.ArrayList;

public class TraitementEnChamp extends TraitementPhytosanitaire{

    //Attributs
    private ArrayList<Pulverisation>lesPulverisations;
    public TraitementEnChamp(String unId, ProduitPhytosanitaire unProduit, Parcelle uneParcelle) {
        super(unId, unProduit, uneParcelle);
        this.lesPulverisations=new ArrayList<Pulverisation>();
    }

    @Override
    public double QuantiteAppliquee() {
        double quantite = 0;
        double superficie = super.GetLaParcelle().GetSurface();
        for (Pulverisation pulverisation : lesPulverisations) {
            quantite += pulverisation.GetDosage() * superficie;
        }
        return quantite;
    }
    public void AjouteUnePulverisation(Pulverisation unePulverisation) {
        this.lesPulverisations.add(unePulverisation);
    }
}
