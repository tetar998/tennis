package tennis;

public class Joueur {
	private String nom;
	private int points;
	
	public Joueur(String _nom){
		nom=_nom;
	}
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getPoint() {
		return points;
	}
	public void setPoint(int point) {
		this.points = point;
	}
	
	public void marquer(){
		if(points == 0)
		{
			points=15;
		}
		
		if(points == 15)
		{
			points=30;
		}
		
		if(points == 30)
		{
			points=40;
		}
		
		if(points == 40)
		{
			
		}
	}
	
}
