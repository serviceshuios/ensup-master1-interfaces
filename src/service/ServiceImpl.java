package service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import metier.Produit;

public class ServiceImpl implements Iservice {

	public static List<Produit> base = new ArrayList<Produit>();
	@Override
	public void ajouterProduit(List<Produit> list,Produit p) {
		list.add(p);
	}
    
	@Override
	public void modifierProduit(List<Produit> list,Produit p,String nom, 
			double prix, int quantite) {
		for (Produit produit : list) {
			if(produit.getIdProduit()==p.getIdProduit()) {
				produit.setNomProduit(nom);
				produit.setPrix(prix);
				produit.setQuantite(quantite);
				// pour arrêter la boucle dès qu'on trouve le produit
				break;
			}
			
		}

	}

	@Override
	public void supprimerProduit(List<Produit> list,int idProduit) {
		for (Produit produit : list) {
			if(produit.getIdProduit()==idProduit) {
				list.remove(produit);
				// pour arrêter la boucle dès qu'on trouve le produit
				break;
			}
		}
	}

	@Override
	public List<Produit> listerTouslesProduits() {
		/*List<Produit> produits = new ArrayList<Produit>();
		for (Produit produit : base) {
			produits.add(produit);
		}*/
		return (List<Produit>)base;
	}

	@Override
	public Produit listerUnProduit(List<Produit> list,int idProduit) {
		for (Produit produit : list) {
			if(produit.getIdProduit()==idProduit) {
				return produit;
			}			
		}
		return null;
	}

	@Override
	public void afficher(List<Produit> produits) {
		System.out.println(produits);
		
	}

}
