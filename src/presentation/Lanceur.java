package presentation;

import java.util.Collection;
import java.util.List;

import metier.Produit;
import service.Iservice;
import service.ServiceImpl;

public class Lanceur {

	public static void init() {
		ServiceImpl.base.add(new Produit(1, "clavier", 12, 14));
		ServiceImpl.base.add(new Produit(2, "souris", 5, 30));
		ServiceImpl.base.add(new Produit(3, "disque dur", 127, 45));
		ServiceImpl.base.add(new Produit(4, "clé usb", 65, 12));
		ServiceImpl.base.add(new Produit(5, "ecran", 36, 70));
	}
	public static void main(String[] args) {
		Iservice service = new ServiceImpl();
		 init();
		 System.out.println("Avant ajout");
		System.out.println(ServiceImpl.base);

		Produit p = new Produit(6, "batterie", 12, 45);
		
		service.ajouterProduit(ServiceImpl.base,p);
		System.out.println("Après ajout");
		System.out.println(ServiceImpl.base);
	}

}
