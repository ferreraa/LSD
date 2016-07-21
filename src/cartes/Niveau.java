package cartes;

public class Niveau {

	private int hauteur;
	private int largeur;
	private int id; //identifiant du niveau
	
	
	private ArrayList<Decor> liste_decors; //liste des décors se trouvant sur le niveau.   est-ce vraiment utile ?
	private ArrayList<Personnage> liste_personnages; //liste des personnages présents sur la carte.
	
	private int [][] carte; //on pourrait faire en sorte que la map soit lue dans un fichier texte par exemple
	//avec ça, suivant le caractere présent dans chaque case, le décor correspondant serait identifié.
	
	//pour l'affichage, on devrait gérer ça différemment, en adaptant le décor affiché en fonction du niveau.
	
	public Niveau() {
		// TODO Auto-generated constructor stub
	}

}
