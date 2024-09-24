package sio.capdc.metier;

public class TaitementSemence extends TraitementPhytosanitaire {
    private double dosageTraitementSemence;

    public TaitementSemence(String unId, ProduitPhytosanitaire unProduit, Parcelle uneParcelle,double unDosage) {
        super(unId, unProduit, uneParcelle);
        this.dosageTraitementSemence = unDosage;
    }

    @Override
    public double QuantiteAppliquee() {
        double superficie = super.GetLaParcelle().GetSurface();
        double quantite = superficie * dosageTraitementSemence;
        return quantite;
    }
}
