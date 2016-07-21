package personnages;

import java.awt.Point;

public abstract class Personnage {

	/////////////////////////////
	//
	//il faut qu'on voit ensemble comment gérer la vitesse. (j'ai une meilleur idée que ce que j'ai fait là)
	//
	/////////////////////////////
	
	
	private Niveau niveau; //niveau dans lequel se trouve le personnage (la carte quoi)
	
	private int hauteur; // hauteur de la hitbox
	private int largeur; // largeur de la hitbox
	
	private Point position; //désigne la position du personnage sur la carte
	private Point vitesse;  //désigne le déplacement effectué entre chaque maj du personnage
	private Point acceleration;  //désigne la différence de vitesse lors de la prochaine maj du personnage
	
	private int vitesse_max_x; //vitesse maximale que le personnage peut atteindre
	private int vitesse_max_y;
	
	public void set_acceleration(Point acceleration)
	{
		this.acceleration = acceleration;
	}
	
	private void maj_vitesse()
	{
		vitesse.x += acceleration.x;
		if(vitesse.x>vitesse_max_x)	 vitesse.x = vitesse_max_x;
			
		vitesse.y += acceleration.y;
		if(vitesse.y>vitesse_max_y)  vitesse.y = vitesse_max_y;
	}
	
	public void maj_position()
	{
		//dépend de la maniere dont on va gérer les collisions
	}
}
