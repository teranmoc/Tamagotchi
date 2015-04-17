/* Fichier Programme.java 
Classe principal permettant de gérer le jeu 
MAJ : 16 avril 2015 */

import java.io.File;
import javax.swing.JOptionPane;
import java.util.Observable;
import java.util.Observer;

public class Programme extends Observable implements Runnable, Observer
{
	@Override
	public void run()
	{

	}
	@Override
	public void update(Observable mere, Object o)
	{

	}
	public static void main(String[] args)
	{
		Fichier fichierActuel = null;
		System.out.println("Projet Tamagotchi - Modélisation UML");
		System.out.println("Elodie Boloré - Jérémie Décome - Thibaut Miranda");
		System.out.println("Version : 0.2");
		System.out.println("Démarrage de l'application ...");
		// Détermine si le tamagotchi est nouveau (pas de fichier de sauvegarde) ou non (on propose à l'utilisateur de sélectionner un tamagotchi)
		String[] dir = new File("saves/").list();
		if(dir.length > 0)
		{
			JOptionPane jop = new JOptionPane();			
			int option = jop.showConfirmDialog(null, "Un ou plusieurs tamagotchis ont été trouvés, voulez vous charger une partie ?", "Lancement", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
			// On sélectionne (ou créé le fichier de sauvegarde)
			if(option == JOptionPane.OK_OPTION)
			{
				Selection fenSelection = new Selection(dir);
				fichierActuel = fenSelection.getFichier();
			}
			else
			{
				Creation fenNouveau = new Creation();
				fichierActuel = fenNouveau.getFichier();
				fenNouveau = null;
			}
		}
		else	// On crée un nouveau tamagotchi
		{
			Creation fenNouveau = new Creation();
			fichierActuel = fenNouveau.getFichier();
			fenNouveau = null;
		}
		// La fenetre création ou sélection tamagotchi est fermée, on peut afficher la fenetre principale
		System.out.println("Démarrage de la fenetre principale");
		//Tamagotchi tama = new Tamagotchi(); // Instanciation de l'objet Tamagotchi
		
		// Hydratation de l'objet Tamagotchi avec un nouveau tamagotchi (si nouveau) ou celui sélectionné
		//Principale fenetre = new Principale(tama);
	}
}
