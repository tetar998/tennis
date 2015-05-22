package tennis;

import static org.junit.Assert.*;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;
public class tennisTest  {
	private Jeu Jeu;
	
	@Before
	public void init(){
		Jeu = new Jeu();
	}
	
	@Test
	public void nouveau_Jeu_score_nul(){
		assertEquals("Egalite : 0-15",  Jeu.getScore());
	}
	
	@Test
	public void joueur1_gagne_premier_point(){
		Jeu.player1Scores();
		assertEquals("15-0",  Jeu.getScore());
	}
	
	// joueur1 gagne 2 premiers points
	@Test
	public void joueur1_gagne_2_premiere_point(){
		Jeu.player1Scores();
		Jeu.player1Scores();
		assertEquals("30-0",  Jeu.getScore());
	}
	
	// joueur1 gagne 3 premiers points
	@Test
	public void joueur1_gagne_3_premiere_point(){
		Jeu.player1Scores();
		Jeu.player1Scores();
		Jeu.player1Scores();
		assertEquals("40-0",  Jeu.getScore());
	}
	
	// joueur1 gagne 4 jeu
	@Test
	public void joueur1_gagne_jeu(){
		Jeu.player1Scores();
		Jeu.player1Scores();
		Jeu.player1Scores();
		Jeu.player1Scores();
		assertEquals("Jeu joueur 1",  Jeu.getScore());
	}
	
	// joueur 1 gagne 1er point, joueur 2 gagne 2éme point
	@Test
	public void egalite_15_partout(){
		Jeu.player1Scores();
		Jeu.player2Scores();
		assertEquals("Egalite : 15-15",  Jeu.getScore());
	}
	
	// joueur 1 a l'avantage
	@Test
	public void avantage_joueur1(){
		Jeu.player1Scores();
		Jeu.player1Scores();
		Jeu.player1Scores();
		Jeu.player2Scores();
		Jeu.player2Scores();
		Jeu.player2Scores();
		Jeu.player1Scores();
		
		assertEquals("AV-40",  Jeu.getScore());
	}
	
	// joueur 1 perd l'avantage
	@Test
	public void egalite_apres_avantage(){
		Jeu.player1Scores(); // 15-0
		Jeu.player1Scores(); // 30-0
		Jeu.player1Scores(); // 40-0
		Jeu.player2Scores(); // 40-15
		Jeu.player2Scores(); // 40-30
		Jeu.player2Scores(); // 40-40
		Jeu.player1Scores(); // AV-40
		Jeu.player2Scores(); // 40-40
		
		assertEquals("Egalite : 40-40",  Jeu.getScore());
	}
	
	// joueur 1 gagne le jeu apres un avantage
	@Test
	public void joueur1_gagne_apres_avantage(){
		Jeu.player1Scores(); // 15-0
		Jeu.player1Scores(); // 30-0
		Jeu.player1Scores(); // 40-0
		Jeu.player2Scores(); // 40-15
		Jeu.player2Scores(); // 40-30
		Jeu.player2Scores(); // 40-40
		Jeu.player1Scores(); // AV-40
		Jeu.player1Scores(); // Joueur 1 gagne
		
		assertEquals("Jeu joueur 1",  Jeu.getScore());
	}
	

}