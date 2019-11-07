package service;

import java.util.Collection;
import java.util.List;

import metier.Produit;

public interface Iservice {
	public void ajouterProduit(List<Produit> list,Produit p);
	public void modifierProduit(List<Produit> list,Produit p, String nom, double prix, int quantite);
	public void supprimerProduit(List<Produit> list,int idProduit);
	public List<Produit> listerTouslesProduits();
	public Produit listerUnProduit(List<Produit> list,int idProduit);
	public void afficher(List<Produit> produits);
}
