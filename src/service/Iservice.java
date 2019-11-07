package service;

import java.util.List;

import metier.Produit;

public interface Iservice {
	public void ajouterProduit(Produit p);
	public void modifierProduit(Produit p, String nom, double prix, int quantite);
	public void supprimerProduit(int idProduit);
	public List<Produit> listerTouslesProduits();
	public Produit listerUnProduit(int idProduit);
	public void afficher(List<Produit> produits);
}
