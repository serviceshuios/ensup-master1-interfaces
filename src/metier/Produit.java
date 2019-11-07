package metier;

public class Produit {
	private int idProduit;
	private String nomProduit;
	private double prix;
	private int quantite;
	
	
	public Produit() {
		super();
	}
	public Produit(int idProduit, String nomProduit, double prix, int quantite) {
		super();
		this.idProduit = idProduit;
		this.nomProduit = nomProduit;
		this.prix = prix;
		this.quantite = quantite;
	}
	
	public int getIdProduit() {
		return idProduit;
	}
	public void setIdProduit(int idProduit) {
		this.idProduit = idProduit;
	}
	public String getNomProduit() {
		return nomProduit;
	}
	public void setNomProduit(String nomProduit) {
		this.nomProduit = nomProduit;
	}
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}
	public int getQuantite() {
		return quantite;
	}
	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}
	@Override
	public String toString() {
		return "Produit [idProduit=" + idProduit + ", nomProduit=" + nomProduit + ", prix=" + prix + ", quantite="
				+ quantite + "]";
	}
	
	
}
