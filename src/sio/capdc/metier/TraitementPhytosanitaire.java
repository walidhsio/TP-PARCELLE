package sio.capdc.metier;

public abstract class TraitementPhytosanitaire {
    // attributs privés
    private String id;
    private ProduitPhytosanitaire leProduitPhyto;
    private Parcelle laParcelleCultivee;

    //Constructeur
    public TraitementPhytosanitaire(String unId,ProduitPhytosanitaire unProduit,Parcelle uneParcelle){
        this.id = unId;
        this.leProduitPhyto = unProduit;
        this.laParcelleCultivee = uneParcelle;
    }
    public Parcelle GetLaParcelle(){
        return this.laParcelleCultivee;
    }
    public abstract double QuantiteAppliquee();
}

