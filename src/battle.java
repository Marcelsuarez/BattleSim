import java.util.Scanner;
import java.lang.Math;
import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.Collections;
/*        
                                                                         

                                                                       
*/
public class battle extends index {
	
	public static void dexinfo(int dex) {	
		System.out.print( index.monsId(dex).getN() +" #");
		if(index.monsId(dex).getId() < 10) {
			System.out.print("00" + index.monsId(dex).getId());
		} else {
			System.out.print("0" + index.monsId(dex).getId());
		}
		System.out.print("     Class ");
		if(index.monsId(dex).getR() == 1) {
				System.out.println("B");
														  }
		if(index.monsId(dex).getR() == 2) {
			System.out.println("A");
													      }
		if(index.monsId(dex).getR() == 3) {
			System.out.println("S");
													      }
		System.out.println("-------------------------");
		System.out.println( "Type: " + index.monsId(dex).getType());
		System.out.println("Moves: " + index.monsId(dex).getMoves().getM1().getN() + ", " +  index.monsId(dex).getMoves().getM2().getN() + ", " +  index.monsId(dex).getMoves().getM3().getN() + ", " +  index.monsId(dex).getMoves().getM4().getN());
		//System.out.println("Stats");
		System.out.println("-----");
		System.out.println("HP : " + index.monsId(dex).getHp());
		System.out.println("Attack: " + index.monsId(dex).getAtk());
		System.out.println("Defense: " + index.monsId(dex).getDef());
		System.out.println("Special Attack: " + index.monsId(dex).getSpa());
		System.out.println("Special Defense: " + index.monsId(dex).getSpd());
		System.out.println("Speed: " + index.monsId(dex).getSpe());
		System.out.println("Base Stat Total: " + ( index.monsId(dex).getHp() + index.monsId(dex).getAtk() + index.monsId(dex).getDef() +  index.monsId(dex).getSpa() + index.monsId(dex).getSpd() + index.monsId(dex).getSpe()));
		System.out.println("--------------------------");
		System.out.println(index.monsId(dex).getDe());
		System.out.println(" ");
		System.out.println(" ");
													}
	

	

	

		
		
	
	
	public static void battleFrame(ArrayList<Monsters> p1, ArrayList<Monsters> p2) {
		
	Monsters main = p1.get(0);
	Monsters enemy = p2.get(0);
	
	Moves m1 = main.getMoves().getM1();
	Moves m2 = main.getMoves().getM2();
	Moves m3 = main.getMoves().getM3();
	Moves m4 = main.getMoves().getM4();
	
	int mainhp = main.getHp();
	int enemhp = enemy.getHp();
	int cmainhp = main.getChp();
	int cenemhp = enemy.getChp();
	
	int m1pp = m1.getPP();
	int m1cpp = m1.getCpp();
	int m2pp = m2.getPP();
	int m2cpp = m2.getCpp();
	int m3pp = m3.getPP();
	int m3cpp = m3.getCpp();
	int m4pp = m4.getPP();
	int m4cpp = m4.getCpp();
	
	
	System.out.println("    ______________");  //code to check hp and appropriately size the health bars to make them look cool
	
	if (enemhp >= 100)				 {
	  if (cenemhp < 100 && cenemhp >= 10) {
			 System.out.print("    | 𝐇𝐏◣  0" + cenemhp + "/" + enemhp + " \\");
		 							  } 
	  if (cenemhp >= 100)   {
			 System.out.print("    | 𝐇𝐏◣  " + cenemhp + "/" + enemhp + " \\");
		 							  } 
	  if (cenemhp < 10)      {
		  System.out.print("    | 𝐇𝐏◣  00" + cenemhp + "/" + enemhp + " \\");
	  								  }
	  
		
												}    else
	if (enemhp < 100)					{
		if (cenemhp < 100 && cenemhp >= 10) {
			System.out.print("    | 𝐇𝐏◣   " + cenemhp + "/" + enemhp + "  \\");		
																	} 
		if (cenemhp < 10) 											{
			System.out.print("    | 𝐇𝐏◣    " + cenemhp + "/" + enemhp + "   \\");
																			}
		
												  }
	//System.out.print("    | 𝐇𝐏◣  100/100 \\");

	
	System.out.println("     " + enemy.getN() + " | 𝑻𝒚𝒑𝒆: " + enemy.getCtype() + "  | " + enemy.getCatk() + "/" + enemy.getCdef() + "/" + enemy.getCspa() + "/" + enemy.getCspd() + "/" + enemy.getCspe() );
	System.out.println("    ‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾");
	System.out.println("     _______________");
	
	if (mainhp >= 100)				 {
		  if (cmainhp < 100 && cmainhp >= 10) {
				 System.out.print("    /  ◢𝐇𝐏  0" + cmainhp + "/" + mainhp + " |");
			 							  } 
		  if (cmainhp >= 100)   {
				 System.out.print("    /  ◢𝐇𝐏  " + cmainhp + "/" + mainhp + " |");
			 							  } 
		  if (cmainhp < 10)      {
			  System.out.print("    /  ◢𝐇𝐏  00" + cmainhp + "/" + mainhp + " |");
		  								  }
		  
			
													}    else
		if (mainhp < 100)					{
			if (cmainhp < 100 && cmainhp >= 10) {
				System.out.print("    /  ◢𝐇𝐏   " + cmainhp + "/" + mainhp + "   |");		
																		} 
			if (cmainhp < 10) 											{
				System.out.print("    /  ◢𝐇𝐏    " + cmainhp + "/" + mainhp + "    |");
																				}
			
													  }
	
	
	//System.out.println("    /  ◢𝐇𝐏  100/100 |" + "    Testmon1 | 𝑻𝒚𝒑𝒆: Water"  );
	System.out.println("    " + main.getN() + " | " + "𝑻𝒚𝒑𝒆: " + main.getCtype() + "  | " + main.getCatk() + "/" + main.getCdef() + "/" + main.getCspa() + "/" + main.getCspd() + "/" + main.getCspe());
	System.out.println("    ‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾");
	
	
	//System.out.println("                                       𝐏𝐚𝐫𝐭𝐲: ◯◯✖◯✖✖");
	
	
	
	System.out.println("‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾");
	System.out.println("         5 ►Encyclopedia           6 ►Party  " );
	System.out.println("__________________________________________________________");
	System.out.println("  1 ► " + main.getMoves().getM1().getN() + " 𝙋𝙋:" + m1cpp +"/" + m1pp + "   |  2 ► " + main.getMoves().getM2().getN() + " 𝙋𝙋:" + m2cpp + "/" + m2pp);
	System.out.println("‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾");
	System.out.println("                  What will " + main.getN() + " do?");
	System.out.println("__________________________________________________________");
	System.out.println("  3 ► " + main.getMoves().getM3().getN() + " 𝙋𝙋:" + m3cpp + "/" + m3pp + "   |  4 ► " + main.getMoves().getM4().getN() + " 𝙋𝙋:" + m4cpp +"/" + m4pp);
	System.out.println("‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾");
	
	
		
		
	}
	
	public static String partyType(Monsters m1) {
		String type = m1.getCtype();
		String result = "";
		
		switch (type) {
		
		case "Fire" :
			result = "🅕🅡🅔";
			break;
		case "Water" :
			result = "🅦🅣🅡";
			break;
		case "Grass" :
			result = "🅖🅡🅢";
			break;
		case "Ground" :
			result = "🅖🅡🅓";
			break;
		case "Ice" :
			result = "🅘🅒🅔";
			break;
		case "Steel" :
			result = "🅢🅣🅛";
			break;
		case "Electric" :
			result = "🅔🅛🅒";
			break;
		case "Normal" :
			result = "🅝🅡🅜";
			break;
		case "Rock" :
			result = "🅡🅒🅚 ";
			break;
		case "Flying" :
			result = "🅕🅛🅖";
			break;
		case "Light":
			result = "🅛🅖🅣";
			break;	
		}
		return result;
	}
	
	
	public static void partyFrame(ArrayList<Monsters> p1) {
		
		
		//this shit took me 3 days lol fuck UIs in text, never bother to do it again, too much time doing nothing
		System.out.println("𝑷𝒂𝒓𝒕𝒚 ");
		System.out.println("____________________________");
			if (p1.size() == 1) {
				System.out.println("1►" + p1.get(0).getN() + " 𝐇𝐏: " + p1.get(0).getChp() + "/" + p1.get(0).getHp()  +" " + partyType(p1.get(0)));
				System.out.println("‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾");
		} else 
			if (p1.size() == 2) {
				System.out.println("1►" + p1.get(0).getN() + " 𝐇𝐏: " + p1.get(0).getChp() + "/" + p1.get(0).getHp()  +" " + partyType(p1.get(0)));
				System.out.println("‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾");
				System.out.println("2►" + p1.get(1).getN() + " 𝐇𝐏: " + p1.get(1).getChp() + "/" + p1.get(1).getHp()  + " " +partyType(p1.get(1)));
				System.out.println("‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾");
		} else 
			if (p1.size() == 3) {
				System.out.println("1►" + p1.get(0).getN() + " 𝐇𝐏: " + p1.get(0).getChp() + "/" + p1.get(0).getHp()  + " " +partyType(p1.get(0)));
				System.out.println("‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾");
				System.out.println("2►" + p1.get(1).getN() + " 𝐇𝐏: " + p1.get(1).getChp() + "/" + p1.get(1).getHp()  + " " +partyType(p1.get(1)));
				System.out.println("‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾");
				System.out.println("3►" + p1.get(2).getN() + " 𝐇𝐏: " + p1.get(2).getChp() + "/" + p1.get(2).getHp()  +" " + partyType(p1.get(2)));
				System.out.println("‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾");
		} else
			if 	(p1.size() == 4) {
				System.out.println("1►" + p1.get(0).getN() + " 𝐇𝐏: " + p1.get(0).getChp() + "/" + p1.get(0).getHp()  + " " +partyType(p1.get(0)));
				System.out.println("‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾");
				System.out.println("2►" + p1.get(1).getN() + " 𝐇𝐏: " + p1.get(1).getChp() + "/" + p1.get(1).getHp()  +" " + partyType(p1.get(1)));
				System.out.println("‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾");
				System.out.println("3►" + p1.get(2).getN() + " 𝐇𝐏: " + p1.get(2).getChp() + "/" + p1.get(2).getHp()  + " " +partyType(p1.get(2)));
				System.out.println("‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾");
				System.out.println("4►" + p1.get(3).getN() + " 𝐇𝐏: " + p1.get(3).getChp() + "/" + p1.get(3).getHp()  +" " + partyType(p1.get(3)));
				System.out.println("‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾");
		} else if (p1.size() == 5) {
			System.out.println("1►" + p1.get(0).getN() + " 𝐇𝐏: " + p1.get(0).getChp() + "/" + p1.get(0).getHp()  + " " +partyType(p1.get(0)));
			System.out.println("‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾");
			System.out.println("2►" + p1.get(1).getN() + " 𝐇𝐏: " + p1.get(1).getChp() + "/" + p1.get(1).getHp()  + " " +partyType(p1.get(1)));
			System.out.println("‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾");
			System.out.println("3►" + p1.get(2).getN() + " 𝐇𝐏: " + p1.get(2).getChp() + "/" + p1.get(2).getHp()  +" " + partyType(p1.get(2)));
			System.out.println("‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾");
			System.out.println("4►" + p1.get(3).getN() + " 𝐇𝐏: " + p1.get(3).getChp() + "/" + p1.get(3).getHp()  +" " + partyType(p1.get(3)));
			System.out.println("‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾");
			System.out.println("5►" + p1.get(4).getN() + " 𝐇𝐏: " + p1.get(4).getChp() + "/" + p1.get(4).getHp()  + " " +partyType(p1.get(4)));
			System.out.println("‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾");

		} else if (p1.size() == 6) {
			System.out.println("1►" + p1.get(0).getN() + " 𝐇𝐏: " + p1.get(0).getChp() + "/" + p1.get(0).getHp()  + " " +partyType(p1.get(0)));
			System.out.println("‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾");
			System.out.println("2►" + p1.get(1).getN() + " 𝐇𝐏: " + p1.get(1).getChp() + "/" + p1.get(1).getHp()  + " " +partyType(p1.get(1)));
			System.out.println("‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾");
			System.out.println("3►" + p1.get(2).getN() + " 𝐇𝐏: " + p1.get(2).getChp() + "/" + p1.get(2).getHp()  + " " +partyType(p1.get(2)));
			System.out.println("‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾");
			System.out.println("4►" + p1.get(3).getN() + " 𝐇𝐏: " + p1.get(3).getChp() + "/" + p1.get(3).getHp()  + " " + partyType(p1.get(3)));
			System.out.println("‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾");
			System.out.println("5►" + p1.get(4).getN() + " 𝐇𝐏: " + p1.get(4).getChp() + "/" + p1.get(4).getHp()  + " " + partyType(p1.get(4)));
			System.out.println("‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾");
			System.out.println("6►" + p1.get(5).getN() + " 𝐇𝐏: " + p1.get(5).getChp() + "/" + p1.get(5).getHp()  + " " + partyType(p1.get(5)));
			System.out.println("‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾");
		}
		
			System.out.println("         7. ⬅ Back" );
		
		
		
	}
	


	

	
	public static void effective(Moves m1, Monsters def) {
		//check for supereffective and inneffective bonuses
		
		if (effect(m1.getType(), def.getType()) == 0) {
			
			System.out.println(def.getN() + " is immune!");
			
		} else if (effect(m1.getType(), def.getType()) == 1.5) {
			
			System.out.println("It's supereffective!");
			
		} else if (effect(m1.getType(), def.getType()) == 0.5) {
			
			System.out.println("It's inneffective!");
			
		}
		
		
		
	}
  	
	public static void battlestart(ArrayList<Monsters> p1, ArrayList<Monsters> p2) throws InterruptedException   {  //Actual battle method, gets two parties(array lists) as input
		Scanner scnr = new Scanner(System.in);
		boolean l1 = false, l2 = false, l3 = false, l4 = false, l5 = false;
		int i, input, turn = 1, input2, sentout = 0, dmgp, dmge,  modenem, modp;
		Moves cm = null;
		Moves ecm = null;
		Monsters player = p1.get(0);
		Monsters enemy = p2.get(0);
	
		
		
		System.out.println("Battle start!");
		System.out.println("");
		
		Thread.sleep(1000);
		
		System.out.println("The enemy's party size is " + p2.size());
		System.out.println("");
		
		Thread.sleep(1000);
		
		System.out.println("The monsters on the enemy's party are: ");
		for (i = 0; i < p2.size(); ++i)
		{
			Thread.sleep(200);
			System.out.print("     |" + p2.get(i).getN());
		}
		
		
		System.out.println("");
		
		Thread.sleep(1000);
		
		System.out.println("You have sent out " + player.getN() + "!");
		System.out.println("");
		
		Thread.sleep(1000);
		
		System.out.println("The enemy has sent out " + enemy.getN() + "!");
		System.out.println("");
		
		Thread.sleep(1000);
		
		while (l1 == false) { //turn start
		System.out.println("Turn: " + turn);
		sentout = 0;
		l2 = false;
		l3 = false;
		player = p1.get(0);
 		enemy = p2.get(0);
 		player.updateStats();
 		enemy.updateStats();
 	
 			
 		
		
		while (l2 == false)  {
		battleFrame(p1, p2);
		input = scnr.nextInt();
		
		switch (input) {
		case 1:
			cm = player.getM(1);
			l2 = true;
			break;
		case 2:
			cm = player.getM(2);
			l2 = true;
			break;
		case 3:
			cm = player.getM(3);
			l2 = true;
			break;
		case 4:
			cm = player.getM(4);
			l2 = true;
			break;
		default:
			System.out.println("Invalid choice, input again");
			Thread.sleep(1600);
			break;
		case 6:									//switch case for switching instead of moves
			System.out.println("Switch with who?");
			partyFrame(p1);
			input2 = scnr.nextInt();
			switch (input2) {  //selecting who to switch out with
			case 1:
				System.out.println("Invalid choice");
				break;
			case 2:
				System.out.println("You have sent out " + p1.get(1).getN());
				Collections.swap(p1, 0, 1);
				sentout = 1;
				player = p1.get(0);
				player.reset();
				l2 = true;
				break;
			case 3:
				if (p1.size() >= 3) {
					System.out.println("You have sent out " + p1.get(2).getN());
					Collections.swap(p1, 0, 2);
					player = p1.get(0);
					sentout = 1;
					player.reset();
					l2 = true;
						} else { System.out.println("Invalid choice, input again.");  }
				break;
			case 4:
				if (p1.size() >= 4) {
					System.out.println("You have sent out " + p1.get(3).getN());
					Collections.swap(p1, 0, 3);
					player = p1.get(0);
					sentout = 1;
					player.reset();
					l2 = true;
						} else { System.out.println("Invalid choice, input again"); }
				break;
			case 5:
				if (p1.size() >= 5) {
					System.out.println("You have sent out " + p1.get(4).getN());
					Collections.swap(p1, 0, 4);
					player = p1.get(0);
					sentout = 1;
					player.reset();
					l2 = true;
						} else { System.out.println("Invalid choice, input again"); }
				break;
			case 6:
				if (p1.size() == 6) {
					System.out.println("You have sent out " + p1.get(5).getN());
					Collections.swap(p1, 0, 4);
					player = p1.get(0);
					player.reset();
					sentout = 1;
					l2 = true;
						} else { System.out.println("Invalid choice, input again"); }
				break;
			default:
				System.out.println("Invalid choice, input again");
				break;
									} // second switch
			
		} //first switch
		
		}//second loop for input on cases
		
		if (player.getSpd() >= enemy.getSpd() && sentout == 0) {  //checking speed, if player is faster then execute turn with player going first then enemy
		
		System.out.println(player.getN() + " used " + cm.getN() + "!");
		
		Thread.sleep(1600);
		
		cm.setCpp(cm.getCpp() -1);  //lower pp
		
		if (cm.isPhysical() == true)
		{  //dmg calc
			
			dmgp = physcalc(player, enemy, cm); //setting single instance of dmg per turn
			Thread.sleep(500);
			moveMethod(player, enemy, cm, dmgp);
			if (dmgp > 0) {
			effective(cm, enemy);
			System.out.println("It dealt " + dmgp + " damage to " + enemy.getN() );
								}
			
		} else if (cm.isPhysical() == false)
			
		{
			dmgp = specialcalc(player, enemy, cm);
			Thread.sleep(500);
			moveMethod(player, enemy, cm, dmgp);
			if (dmgp > 0) {
			effective(cm, enemy);
			System.out.println("It dealt " + dmgp + " damage to " + enemy.getN() );
								}
			
		}
		
		
		
		
		// enemy turn next
		
		if ( enemy.getChp() > 0 && p2.size() > 0)  {  //check if dead
		ecm = enemy.getM(ai(player, enemy));  //enemy goes second here, enemy's turn
		
		Thread.sleep(1600);
		
		System.out.println(enemy.getN() + " used " +ecm.getN() + "!");
		
		Thread.sleep(1600);
		
		
		ecm.setCpp(ecm.getCpp() -1);
		
		if ( ecm.isPhysical() == true )
		{
			dmge = physcalc(enemy, player, ecm);
			Thread.sleep(500);
			moveMethod(enemy, player, ecm, dmge);
			if (dmge > 0) {
			effective(ecm, player);
			System.out.println("It dealt " + dmge + " damage to " + player.getN() );
								}
		} else if ( ecm.isPhysical() == false)
			
		{
			dmge = specialcalc(enemy, player, ecm);
			Thread.sleep(500);
			moveMethod(enemy, player, ecm, dmge);
			if (dmge > 0) {
			effective(ecm, player);
			System.out.println("It dealt " + dmge + " damage to " + player.getN() );
								}
			
		}
		
		
		if ( p1.size() > 0 && player.getChp() <= 0)   //player dead check after enemy attacks second 
		{
			System.out.println(player.getN() + " has fainted!");
			Thread.sleep(1600);
			p1.remove(0);
			if (p1.size() == 0) 
			{
				System.out.println("end");
				l1 = true;
				l2 = true;
			} else
			{
				while (l4 == false)
				{
			System.out.println("Who will you send out?");
			partyFrame(p1);
			input2 = scnr.nextInt();
			switch (input2) {  //selecting who to switch out with
			case 1:
				System.out.println("You have sent out " + p1.get(0).getN());
				p1.get(0).reset();
				l4 = true;
				break;
			case 2:
				System.out.println("You have sent out " + p1.get(1).getN());
				Collections.swap(p1, 0, 1);
				player = p1.get(0);
				player.reset();
				l4 = true;
				break;
			case 3:
				if (p1.size() >= 3) {
					System.out.println("You have sent out " + p1.get(2).getN());
					Collections.swap(p1, 0, 2);
					player = p1.get(0);
					player.reset();
					sentout = 1;
					l4 = true;
						} else { System.out.println("Invalid choice, input again.");  }
				break;
			case 4:
				if (p1.size() >= 4) {
					System.out.println("You have sent out " + p1.get(3).getN());
					Collections.swap(p1, 0, 3);
					player = p1.get(0);
					player.reset();
					l4 = true;
						} else { System.out.println("Invalid choice, input again"); }
				break;
			case 5:
				if (p1.size() >= 5) {
					System.out.println("You have sent out " + p1.get(4).getN());
					Collections.swap(p1, 0, 4);
					player = p1.get(0);
					player.reset();
					l4 = true;
						} else { System.out.println("Invalid choice, input again"); }
				break;
			case 6:
				if (p1.size() == 6) {
					System.out.println("You have sent out " + p1.get(5).getN());
					Collections.swap(p1, 0, 4);
					player = p1.get(0);
					player.reset();
					l4 = true;
						} else { System.out.println("Invalid choice, input again"); }
				break;
			default:
				System.out.println("Invalid choice, input again");
				break;
									}
			
					}// l4 while bracket
				
			} 
			
		}
		++turn;
		
		Thread.sleep(1600);
		} else if ( p2.size() > 0)  //dead check statement
			{ 
			System.out.println(enemy.getN() + " has fainted!");
			Thread.sleep(1600);
			p2.remove(0);
			if (p2.size() == 0)
			{
				System.out.println("end");
				l1 = true;
				l2 = true;
			} else {
			enemy = p2.get(0);
			System.out.println("Enemy has sent out " + enemy.getN() + "!");
			enemy.reset();
			++turn;
					}
			
			}
		} //if statement speed bracket
		
		else						 {  //enemy goes first here then player turn, THE ELSE STATEMENT OF THE FIRST IF SPEEDCHECK
			ecm = enemy.getM(ai(player, enemy));  // enemy's turn
			
			Thread.sleep(1600);
			
			System.out.println(enemy.getN() + " used " +ecm.getN() + "!");
			
			Thread.sleep(1600);
			
			
			ecm.setCpp(ecm.getCpp() -1);
			
			if ( ecm.isPhysical() == true )
			{
				dmge = physcalc(enemy, player, ecm);
				Thread.sleep(500);
				moveMethod(enemy, player, ecm, dmge);
				if (dmge > 0) {
				effective(ecm, player);
				System.out.println("It dealt " + dmge + " damage to " + player.getN() );
									}
			} else if ( ecm.isPhysical() == false)
				
			{
				dmge = specialcalc(enemy, player, ecm);
				Thread.sleep(500);
				moveMethod(enemy, player, ecm, dmge);
				if (dmge > 0) {
				effective(ecm, player);
				System.out.println("It dealt " + dmge + " damage to " + player.getN() );
									}
				
			}
			
			
			//player turn next
			if (player.getChp() > 0 && p1.size() > 0) { //dead check player
				
			
			if (sentout != 1) {
			System.out.println(player.getN() + " used " + cm.getN() + "!");
			
			Thread.sleep(1600);
			
			cm.setCpp(cm.getCpp() -1);  //lower pp
			
			if (cm.isPhysical() == true)
			{  //dmg calc
				
				dmgp = physcalc(player, enemy, cm); //setting single instance of dmg per turn
				Thread.sleep(500);
				moveMethod(player, enemy, cm, dmgp);
				if (dmgp > 0) {
				effective(cm, enemy);
				System.out.println("It dealt " + dmgp + " damage to " + enemy.getN() );
									}
				
			} else if (cm.isPhysical() == false)
				
			{
				dmgp = specialcalc(player, enemy, cm);
				Thread.sleep(500);
				moveMethod(player, enemy, cm, dmgp);
				if (dmgp > 0) {
				effective(cm, enemy);
				System.out.println("It dealt " + dmgp + " damage to " + enemy.getN() );
									}
				
			}
			if ( p2.size() > 0  && enemy.getChp() <= 0)  //dead check statement for enemy after player attacks second
			{ 
			System.out.println(enemy.getN() + " has fainted!");
			Thread.sleep(1600);
			p2.remove(0);
			if (p2.size() == 0 && enemy.getChp() <= 0)
			{
				System.out.println("end");
				l1 = true;
				l2 = true;
			} else {
			enemy = p2.get(0);
			System.out.println("Enemy has sent out " + enemy.getN() + "!");
			enemy.reset();
			++turn;
					}
			}
			
			}// if sent out bracket
			++turn;
			
			} else if ( p1.size() > 0)  //dead check statement for player
			{ 
			System.out.println(player.getN() + " has fainted!");
			Thread.sleep(1600);
			p1.remove(0);
			if (p1.size() == 0)
			{
				System.out.println("end");
				l1 = true;
				l2 = true;
			} else                                            //switch for switching out when monster has fainted for player
			{
				while (l3 == false)
				{
			System.out.println("Who will you send out?");
			partyFrame(p1);
			input2 = scnr.nextInt();
			switch (input2) {  //selecting who to switch out with
			case 1:
				System.out.println("You have sent out " + p1.get(0).getN());
				player.reset();
				l3 = true;
				break;
			case 2:
				System.out.println("You have sent out " + p1.get(1).getN());
				Collections.swap(p1, 0, 1);
				player = p1.get(0);
				player.reset();
				l3 = true;
				break;
			case 3:
				if (p1.size() >= 3) {
					System.out.println("You have sent out " + p1.get(2).getN());
					Collections.swap(p1, 0, 2);
					player = p1.get(0);
					player.reset();
					l3 = true;
						} else { System.out.println("Invalid choice, input again.");  }
				break;
			case 4:
				if (p1.size() >= 4) {
					System.out.println("You have sent out " + p1.get(3).getN());
					Collections.swap(p1, 0, 3);
					player = p1.get(0);
					player.reset();
					l3 = true;
						} else { System.out.println("Invalid choice, input again"); }
				break;
			case 5:
				if (p1.size() >= 5) {
					System.out.println("You have sent out " + p1.get(4).getN());
					Collections.swap(p1, 0, 4);
					player = p1.get(0);
					player.reset();
					l3 = true;
						} else { System.out.println("Invalid choice, input again"); }
				break;
			case 6:
				if (p1.size() == 6) {
					System.out.println("You have sent out " + p1.get(5).getN());
					Collections.swap(p1, 0, 4);
					player = p1.get(0);
					player.reset();
					l3 = true;
						} else { System.out.println("Invalid choice, input again"); }
				break;
			default:
				System.out.println("Invalid choice, input again");
				break;
									}
			
					}
						} //while loop 3 bracket
			++turn;
			}
			
			
			
		} //end of if statement for speed check
		Thread.sleep(1600);
		System.out.println("t1");
		} //turn loop 1st loop
		//battleFrame(p1, p2);
		
		System.out.println("t2");
		
		
		

		
		
	}
	
	
	public static ArrayList<Monsters> assemble(){
		
		Scanner scnr = new Scanner(System.in);
		
		ArrayList<Monsters> party = new ArrayList<Monsters>();
		System.out.println("Select which monsters you would like for your party");
		
		int i, rankt;
		rankt = 0;
		for (i = 0; i < 10; i++)
		{
			
			System.out.println((i + 1) + ". " + monsId(i).getN() + " Rank: " + monsId(i).getR() );
			
			
		}
		
		while (rankt >= 6)
		{
			
			
		}
		
		
		return party;
	}
	
	
	public static void main(String[] args) throws InterruptedException {
		
	Random rand = new Random();
	
	
		
ArrayList<Monsters> party1 = new ArrayList<Monsters>();
party1.add(monsId(1));
party1.add(monsId(7));
party1.add(monsId(1));

battlestart(party1, enemy(rand.nextInt(5)));

System.out.println("t3");
	
		
		
		
		
		
		
		
	
		
		
	
		
		

		
		
	
		
	}

}
