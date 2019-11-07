package service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import metier.Produit;

public class ServiceImpl implements Iservice {

	Collection<Produit> base = new ArrayList<Produit>();
	
	public void init() {
		base.add(new Produit(1, "clavier", 12, 14));
		base.add(new Produit(2, "souris", 5, 30));
		base.add(new Produit(3, "disque dur", 127, 45));
		base.add(new Produit(4, "clé usb", 65, 12));
		base.add(new Produit(5, "ecran", 36, 70));
	}
	@Override
	public void ajouterProduit(Produit p) {
		base.add(p);
	}
    
	@Override
	public void modifierProduit(Produit p,String nom, 
			double prix, int quantite) {
		for (Produit produit : base) {
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
	public void supprimerProduit(int idProduit) {
		for (Produit produit : base) {
			if(produit.getIdProduit()==idProduit) {
				base.remove(produit);
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
	public Produit listerUnProduit(int idProduit) {
		for (Produit produit : base) {
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
