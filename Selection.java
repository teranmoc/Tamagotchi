/* Fichier Selection.java
Crée le dimanche 12 avril 2015
MAJ : dimanche 12 avril 2015
Description : Permet de créer une fenetre de sélection de Tamagotchi */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.WindowListener;

public class Selection extends Interface
{
	private Fichier fichier;
	// liste contient la liste des fichiers de sauvegarde
	public Selection(String[] liste)
	{
		super(300, 200);	// on dessine la fenetre en elle meme (via la classe mère Interface)
		super.configFenetre("Sélection d'un tamagotchi");
		super.fenetre.setContentPane(this.principal);
		super.fenetre.setVisible(true);	// obligatoire pour afficher la fenetre
	}
	public Fichier getFichier()
	{
		return this.fichier;
	}
}