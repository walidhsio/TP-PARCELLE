import sio.capdc.metier.*;

import java.time.LocalDate;

public class Tests {
    public static void main(String[] args) {
        // instanciation objet Parcelle
        Parcelle maParcelle = new Parcelle("P1", "HAROLD", "Blé", LocalDate.of(2024, 3, 1),LocalDate.of(2024, 8, 22) , 5);
        ProduitPhytosanitaire unProduit = new ProduitPhytosanitaire("PP1","Savon");
        ProduitPhytosanitaire unProduit2 = new ProduitPhytosanitaire("PP2","javel");
        TaitementSemence TS1 = new TaitementSemence("TS1",unProduit,maParcelle,5);
        TaitementSemence TS2 = new TaitementSemence("TS2",unProduit2,maParcelle,10);
        TraitementEnChamp TEC1 = new TraitementEnChamp("TEC1",unProduit,maParcelle);
        Pulverisation PV1 = new Pulverisation("PV1",5,LocalDate.of(2024,3,10));
        Pulverisation PV2 = new Pulverisation("PV2",10,LocalDate.of(2024,3,11));
        Pulverisation PV3 = new Pulverisation("PV3",20,LocalDate.of(2024,3,12));
        Pulverisation PV4 = new Pulverisation("PV1",15,LocalDate.of(2024,3,13));
        TraitementPhytosanitaire TP1 = new TraitementPhytosanitaire("TP1",unProduit,maParcelle);
        
    }
}
