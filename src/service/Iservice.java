package service;

import java.util.List;

import metier.Produit;

public interface Iservice {
	public void ajouterProduit(Produit p);
	public void modifierProduit(Produit p);
	public void supprimerProduit(int idProduit);
	public List<Produit> listerTouslesProduits();
	public Produit listerUnProduit(int idProduit);
}
