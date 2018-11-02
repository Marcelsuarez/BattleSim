 /*monsterIndex[0] = new Monsters(0, "testmon1", 20, 4, 4, 4, 4, 4, null, 0)
	 monsterIndex[1] = new Monsters(1, "testmon2", 22, 3, 6, 3, 6, 3, null, 0);
	 monsterIndex[2] = new Monsters(2, "testmon3", 22, 3, 6, 3, 6, 3, null, 0);
	 */
import java.util.ArrayList;
import java.util.Random;
import java.util.List;
public class index {
	


	public static Moves movId(int moveid) {
		// basepower, if it is physical, type, id, name, accuracy, pp, maximum pp
		// types Normal 1, Fire 2, Water 3, Grass 4, Ground 5, Rock 6, Ice 7, Electric 8, Flying 9, Steel 10
		
		Moves[] movId = new Moves[70];
		
		movId[0] = new Moves(30, true, "Normal", 0, "Scratch", 100, 10, 10, "A basic normal move.");
		movId[1] = new Moves(35, false, "Fire", 1, "Ember", 100, 10, 10, "A basic fire move.");
		movId[2] = new Moves(35, false, "Water", 2, "Water gun", 100, 10, 10, "A basic water move.");
		movId[3] = new Moves(40, true, "Grass", 3, "Vine Whip", 100, 10, 10, "A basic grass move.");
		movId[4] = new Moves(35, true, "Flying", 4, "Peck", 100, 10, 10, "A basic flying move.");
		movId[5] = new Moves(0, false, "Normal", 5, "Growl", 95, 20, 20, "Lowers the enemy's attack stat.");
		movId[6] = new Moves(0, false, "Normal", 6, "Leer", 95, 20, 20, "Lowers the enemy's defense stat.");
		movId[7] = new Moves(0, false, "Normal", 7, "Sing", 45, 10, 20, "Puts the enemy to sleep for 2 turns.");
		movId[8] = new Moves(0, false, "Fire", 8, "Will-o-Wisp", 55, 10, 10, "Burns the enemy.");
		movId[9] = new Moves(0, false, "Normal", 9, "Battle Cry", 100, 10, 10, "Raises the user's attack stat.");
		movId[10] = new Moves(30, false, "Normal", 10, "Normal Wave", 100, 10, 10, "A basic special normal move.");
		movId[11] = new Moves(0, false, "Normal", 11, "Defense Curl", 100, 10, 10, "Raises the user's defense stat.");
		movId[12] = new Moves(55, true, "Steel", 12, "Metal Claw", 90, 5, 5, "Has a chance to raise the user's attack stat.");
		movId[13] = new Moves(20, false, "Ground", 13, "Mud-Slap", 100, 10, 10, "Basic special ground move.");
		movId[14] = new Moves(40, true, "Normal", 14, "Pound", 90, 10, 10, "Basic normal move, more damage than Scratch.");
		movId[15] = new Moves(0, false, "Normal", 15, "Hasten", 100, 5, 5, "Raises the user's speed stat.");
		movId[16] = new Moves(45, false, "Electric", 16, "Shock Wave", 100, 10, 10, "Basic special electric move.");
		movId[17] = new Moves(0, false, "Normal", 17, "Sharpen Mind", 100, 5, 5, "Raises the user's special attack stat.");
		movId[18] = new Moves(25, false, "Grass", 18, "Drain", 100, 15, 15, "Recover half of the damage you dealt");
		movId[19] = new Moves(0, false, "Normal", 19, "Regenerate", 100, 5, 5, "Recover 1/3 of your health.");
		movId[20] = new Moves(0, false, "Fire", 20, "Fireify", 100, 10, 10, "Change the enemy's type to fire until they switch");
		movId[21] = new Moves(40, false, "Fire", 21, "Smog", 80, 10, 10, "Reset all the stat bonuses and type of the enemy.");
		movId[22] = new Moves(50, true, "Normal", 22, "Piercing Blow", 90, 10, 10, "Ignore all defense bonuses the enemy has");
		movId[23] = new Moves(50, true, "Grass", 23, "Vine Slash", 90, 10, 10, "Ignore all the defense bonuses the enemy has");
		movId[24] = new Moves(30, true, "Fire", 24, "Flame Charge", 100, 10, 10, "Has a chance to raise the user's speed stat.");
		movId[25] = new Moves(60, true, "Normal", 25, "Reckless Charge", 90, 10, 10, "Deals 1/3 of your health as recoil damage");
		movId[26] = new Moves(20, true, "Rock", 26, "Barricade", 95, 10, 10, "The enemy is unable to switch for 3 turns.");
		movId[27] = new Moves(0, false, "Normal", 27, "Relax", 100, 5, 5, "Recover 1/4 of your health.");
		movId[28] = new Moves(10, true, "Normal", 28, "Flail", 100, 10, 10, "More damage dealt if you are at 1/4 or less of your max health");
		movId[29] = new Moves(0, false, "Water", 29, "Soak", 100, 10, 10, "Change the enemy's type to water until they switch.");
		movId[30] = new Moves(50, true, "Steel", 30, "Armored Blow", 95, 10, 10, "Chance to raise your defense stat.");
		movId[31] = new Moves(0, false, "Steel", 31, "Armoralize", 100, 5, 5, "Change your type to steel until you switch.");
		movId[32] = new Moves(45, true, "Water", 32, "Water Wall", 90, 10, 10, "Chance to raise your defense stat.");
		movId[33] = new Moves(40, false, "Electric", 33, "Waking Jolt", 100, 15, 15, "If the user is asleep, this move will wake them up the turn it is used.");
		movId[34] = new Moves(0, false, "Normal", 34, "Self Exchange", 100, 5, 5, "Swap the values of your Attack and Defense stat.");
		movId[35] = new Moves(20, true, "Flying", 35, "Normal Block", 90, 10, 10, "Prevents the enemy from using any normal type moves for 4 turns");
		movId[36] = new Moves(20, false, "Grass", 36, "Soothing Aroma", 75, 10, 10, "Puts the enemy to sleep for 1 turn");
		movId[37] = new Moves(0, false, "Normal", 37, "Armor Swap", 100, 5, 5, "Swaps the user's defense and special defense stat.");
		movId[38] = new Moves(0, false, "Normal", 38, "Power Swap", 100, 5, 5, "Swaps the user's attack and special attack stat.");
		movId[39] = new Moves(0, false, "Normal", 39, "Splash", 100, 20, 20, "Does nothing");
		movId[40] = new Moves(0, false, "Normal", 40, "Splash Tutor", 100, 2, 2, "Turns a random move of the enemy to Splash for the rest of the battle.");
		movId[41] = new Moves(100, true, "Fire", 41, "True Flame", 80, 5, 5, "A very powerful fire move, has chance of burn and of missing.");
		movId[42] = new Moves(90, true, "Ground", 42, "Tremor", 100, 5, 5, "A very powerful ground move.");
		movId[43] = new Moves(125, true, "Normal", 43, "Grandmaster Slam", 90, 5, 5, "An extreme normal move, causes 1/3 of your max health in recoil.");
		movId[44] = new Moves(100, false, "Water", 44, "Tidal Wave", 95, 5, 5, "A very powerful water move");
		movId[45] = new Moves(60, false, "Water", 45, "Ebb & Flow", 90, 10, 10, "A water move that heals you for 1/8 of your max health.");
		movId[46] = new Moves(0, false, "Steel", 46, "Ultra Defense", 100, 10, 10, "Raises user's defense by a factor of 2");
		movId[47] = new Moves(40, false, "Grass", 47, "Entangle", 100, 5, 5, "Traps the enemy for 2 turns.");
		movId[48] = new Moves(80, false, "Grass", 48, "Whipping Vines", 100, 10, 10,"Ignores enemy special defense boosts.");
		movId[49] = new Moves(50, false, "Grass", 49, "Super Drain", 100, 5, 5, "Heals the user for 1/2 of damage dealt.");
		
		
		return movId[moveid];
	}
	
	public static void moveMethod(Monsters atk, Monsters def, Moves m, int dmg) { //switch that gives moves the cool effects
		int id = m.getId();
		//atk, def, spa, spd, spe
		// 0, 1, 2, 3, 4
		switch (id) {
		default:
			def.setChp(def.getChp() - dmg); //normal dmg no extra effect
			break;
		case 29:
			def.setCtype("Water");
			System.out.println(def.getN() + "'s type has been changed to Water!");
			break;
		case 17:
			atk.getMod().addNum(2, 1);
			atk.updateStats();
			System.out.println(atk.getN() + "'s Special Attack has increased by 1 stage!");
			break;
		case 39:
			System.out.println(atk.getN() + " splashed around and did nothing!");
			break;
		case 5:
			def.getMod().addNum(0, -1);
			def.updateStats();
			System.out.println(def.getN() + "'s Atack has been lowered by 1 stage!");
			break;
		case 6:
			def.getMod().addNum(1, -1);
			def.updateStats();
			System.out.println(def.getN() + "'s Defense has been lowered by 1 stage!");
			break;
		case 11:
			atk.getMod().addNum(1, 1);
			atk.updateStats();
			System.out.println(atk.getN() + "'s Defense has increased by 1 stage!");
			break;
		case 18:
			def.setChp(def.getChp() - dmg);
			if (atk.getHp() <= atk.getChp() + (dmg/2))
				{
				
				atk.setChp(atk.getHp());
				
				} else
				{
					atk.setChp(atk.getChp() + (dmg/2));
				}
			
			System.out.println(atk.getN() + " has restored " + (dmg/2) + " points of its HP!");
			break;
		case 19:
			if (atk.getHp() <= atk.getChp() + (atk.getChp()/3)) 
			{
				atk.setChp(atk.getHp());
				System.out.println(atk.getN() + "has regenerated " + (atk.getHp() - atk.getChp()) + " points of its HP!");
			} else
			{
				atk.setChp( atk.getChp() + (atk.getChp()/3));
				System.out.println(atk.getN() + "has regenerated " + (atk.getChp()/3) + " points of its HP!");
			}
			break;
			
			
		}//end of switch bracket
		
		
		
	}

	public static Monsters monsId(int monsterid) {
		
	//Monsters testmon2 = new Monsters(2, "testmon2", 22, 3, 6, 3, 6, 3, null, 0);
	// id, name, hp, current hp, atk,current atk, def, current def, spa, current spa, spd, current spd, spe, current spe,  class, modifier object, moveset, type, description
 int[] armod = { 0, 0, 0, 0, 0};		
 Modifier mod = new Modifier(armod, 0);
 Monsters[] monsId = new Monsters[20];
 
 
	 
	monsId[0] = new Monsters(1, "Testmon1", 100, 100, 50, 50, 40, 40, 60, 60, 50, 50, 60,  60, 1, mod,  msId(0), "Fire", "Fire", "A good all-around Monster. It focuses on debuffing the enemy to gain an advantage.");
	monsId[1] = new Monsters(2, "Testmon2", 110, 110, 40, 40, 50, 50, 70, 70, 50, 50, 40, 40, 1, mod,  msId(1), "Water", "Water", "A slow Monster with varying attacks, has a stat boost to develop it's offensive capabilities.");
	monsId[2] = new Monsters(3, "Testmon3", 100, 100, 45, 45, 65, 65, 40, 40, 50, 50, 50, 50, 1, mod,  msId(2), "Grass", "Grass", "A defensive Monster that focuses on tanking through its abilities. Has decent speed");
	monsId[3] = new Monsters(4, "Testmon4", 95, 95, 75,  75, 70, 70, 75, 75, 70, 70, 45, 45, 2, mod, msId(3), "Fire", "Fire", "A highly volatile Fire monster that starts off slow but can gain back HP and Speed");
	monsId[4] = new Monsters(5, "Testmon5", 120, 120, 60, 60, 90, 90, 60, 60, 70, 70, 30, 30, 2, mod, msId(4), "Water", "Water", "A tanky Water monster that can transform to steel and bolster its defenses");
	monsId[5] = new Monsters(6, "Testmon6", 100, 100, 55, 55, 60, 60, 80, 80, 50, 50, 85, 85, 2, mod, msId(5), "Grass", "Grass", "Fast and offensive Grass monster that can put opponents to sleep and break through defenses");
	monsId[6] = new Monsters(7, "Testmon7", 135, 135, 90, 90, 65, 65, 60, 60, 70, 70, 80, 80, 3, mod, msId(6), "Fire", "Fire",  "A very powerful Fire monster that has access to recovery but has recoil");
	monsId[7] = new Monsters(8, "Testmon8", 180, 180, 30, 30, 140, 140, 70, 70, 50, 50, 30, 30, 3, mod, msId(7), "Water", "Water",  "An extremely tanky Water monster, can swap its defense values and regain health.");
	monsId[8] = new Monsters(9, "Testmon9", 70, 70, 80, 80, 80, 80, 100, 100, 80, 80, 90, 90, 3, mod, msId(8), "Grass", "Grass", "An agile Grass monster that traps enemies and turns them into Water types.");
	
	
	return monsId[monsterid];
	
						
	}
	
	public static Moveset msId(int movesetid) {
		
		Moveset [] msId = new Moveset[10];
		
		msId[0] = new Moveset(movId(0), movId(1), movId(5), movId(8));
		msId[1] = new Moveset(movId(2), movId(13), movId(10), movId(17));
		msId[2] = new Moveset(movId(14), movId(18), movId(11), movId(3));
		msId[3] = new Moveset(movId(18), movId(21), movId(24), movId(25));
		msId[4] = new Moveset(movId(32), movId(26), movId(31), movId(12));
		msId[5] = new Moveset(movId(36), movId(18), movId(23), movId(17));
		msId[6] = new Moveset(movId(19), movId(41), movId(42), movId(43));
		msId[7] = new Moveset(movId(37), movId(44), movId(45), movId(46));
		msId[8] = new Moveset(movId(47), movId(48), movId(29), movId(49));
		
		return msId[movesetid];	
		
	}

	public static Monsters copy(Monsters id) {
		Monsters copy = new Monsters(id);
		
		
		
		return copy;
	}
	
	public static ArrayList<Monsters> enemy(int id) {
		//method to select a certain configuration of team with random monsters. can be picked randomly or not.
		
		
		ArrayList<ArrayList<Monsters>> party = new ArrayList<ArrayList<Monsters>>();
		
			ArrayList<Monsters> p1 = new ArrayList<Monsters>(); //1b 1a 1s
			p1.add(randm(1));
			p1.add(randm(2));
			p1.add(randm(3));
				party.add(p1);
				
			ArrayList<Monsters> p2 = new ArrayList<Monsters>(); //3b
			p2.add(randm(2));
			p2.add(randm(2));
			p2.add(randm(2));
				party.add(p2);
				
			ArrayList<Monsters> p3 = new ArrayList<Monsters>(); //2s
			p3.add(randm(3));
			p3.add(randm(3));
				party.add(p3);
				
			ArrayList<Monsters> p4 = new ArrayList<Monsters>(); //2b 2a
			p4.add(randm(1));
			p4.add(randm(1));
			p4.add(randm(2));
			p4.add(randm(2));
				party.add(p4);
				
			ArrayList<Monsters> p5 = new ArrayList<Monsters>(); //1s //3b
			p5.add(randm(3));
			p5.add(randm(1));
			p5.add(randm(1));
			p5.add(randm(1));
				party.add(p5);
		
		
		
		return party.get(id);
	}
	public static Monsters randm(int rank) {
		Monsters m;
		Random rand = new Random();
		
		Monsters[] rankB = new Monsters[10];
		
		rankB[0] = monsId(0);
		rankB[1] = monsId(1);
		rankB[2] = monsId(2);
		
		Monsters[] rankA = new Monsters[10];
		
		rankA[0] = monsId(3);
		rankA[1] = monsId(4);
		rankA[2] = monsId(5);
		
		Monsters[] rankS = new Monsters[10];
		
		rankS[0] = monsId(6);
		rankS[1] = monsId(7);
		rankS[2] = monsId(8);
		
		if (rank == 1) {
			m = rankB[rand.nextInt(3)];
			return m;
		} else
		
		if (rank == 2) {
			
			m = rankA[rand.nextInt(3)];
			return m;
		} else
			
		if (rank == 3) {
			
			m = rankS[rand.nextInt(3)];
			return m;
		}
		
		
		
		
		return null;
		
	}
	
	
	public static int ai(Monsters player, Monsters ai) {
		int move = 0;
		Random rand = new Random();
		move = rand.nextInt(4) + 1;     //returns number from 0-3 then adds 1
		
		
		return move;
		
	}
	
	public static double effect(String atk, String def) {
		double effect = 0;
		int atk2 = 0;
		int def2 = 0;
switch (atk) {
		case "Fire" :
			atk2 = 0;
			break;
		case "Water" :
			atk2 = 1;
			break;
		case "Grass" :
			atk2 = 2;
			break;
		case "Ground" :
			atk2 = 3;
			break;
		case "Flying" :
			atk2 = 4;
			break;
		case "Ice" :
			atk2 = 5;
			break;
		case "Electric" :
			atk2 = 6;
			break;
		case "Steel" :
			atk2 = 7;
			break;
		case "Rock" :
			atk2 = 8;
			break;
		case "Normal" :
			atk2 = 9;
			break;
		case "Light":
			atk2 = 10;
			break;	
		}
switch (def) {
case "Fire" :
	def2 = 0;
	break;
case "Water" :
	def2 = 1;
	break;
case "Grass" :
	def2 = 2;
	break;
case "Ground" :
	def2 = 3;
	break;
case "Flying" :
	def2 = 4;
	break;
case "Ice" :
	def2 = 5;
	break;
case "Electric" :
	def2 = 6;
	break;
case "Steel" :
	def2 = 7;
	break;
case "Rock" :
	def2 = 8;
	break;
case "Normal" :
	def2 = 9;
	break;
case "Light":
	def2 = 10;
	break;	
}
		
		// 0 means immune, 1 means normal effective, 2 means super effective, 3 means ineffective
		//making this table was painful
// Fire, Water, Grass, Ground, Flying, Ice, Electric, Steel, Rock, Normal, Light
// 0     1         2            3        4         5      6          7        8       9           10
		// 
		int [] [] t = new int [11][11];
		//fire attacking
		t[0][0] = 3; t[0][1] = 3; t[0][2] = 2; t[0][3] = 1; t[0][4] = 1; t[0][5] = 2; t[0][6] = 1; t[0][7] = 2; t[0][8] = 3; t[0][9] = 1; t[0][10] = 3;
		//Water attacking
		t[1][0] = 2; t[1][1] = 3; t[1][2] = 3; t[1][3] = 2; t[1][4] = 1; t[1][5] = 1; t[1][6] = 1; t[1][7] = 1; t[1][8] = 2; t[1][9] = 1; t[1][10] = 3;	
		//Grass attacking
		t[2][0] = 3; t[2][1] =2; t[2][2] = 3; t[2][3] = 2; t[2][4] = 3; t[2][5] = 1; t[2][6] = 1; t[2][7] = 3; t[2][8] = 2; t[2][9] = 1; t[2][10] = 3;
		//Ground attacking
		t[3][0] = 2; t[3][1] = 1; t[3][2] = 3; t[3][3] = 1; t[3][4] = 0; t[3][5] = 1; t[3][6] = 2; t[3][7] = 2; t[3][8] = 2; t[3][9] = 1; t[3][10] = 1;
		//Flying attacking
		t[4][0] = 1; t[4][1] = 1; t[4][2] = 2; t[4][3] = 1; t[4][4] = 1; t[4][5] = 1; t[4][6] = 3; t[4][7] = 3; t[4][8] = 3; t[4][9] = 1; t[4][10] = 1;
		//Ice attacking
		t[5][0] = 3; t[5][1] = 3; t[5][2] = 2; t[5][3] = 2; t[5][4] = 2; t[5][5] = 3; t[5][6] = 1; t[5][7] = 3; t[5][8] = 1; t[5][9] = 1; t[5][10] = 2;
		//Electric attacking
		t[6][0] = 1; t[6][1] = 2; t[6][2] = 3; t[6][3] = 0; t[6][4] = 2; t[6][5] = 1; t[6][6] = 3; t[6][7] = 1; t[6][8] = 1; t[6][9] = 1; t[6][10] = 1;
		//Steel attacking
		t[7][0] = 3; t[7][1] = 3; t[7][2] = 1; t[7][3] = 3; t[7][4] = 1; t[7][5] = 2; t[7][6] = 3; t[7][7] = 3; t[7][8] = 2; t[7][9] = 1; t[7][10] = 1;
		//Rock attacking
		t[8][0] = 2; t[8][1] = 1; t[8][2] = 1; t[8][3] = 3; t[8][4] = 2; t[8][5] = 2; t[8][6] = 1; t[8][7] = 3; t[8][8] = 1; t[8][9] = 1; t[8][10] = 1;
		//Normal attacking
		t[9][0] = 1; t[9][1] = 1; t[9][2] = 1; t[9][3] = 1; t[9][4] = 0; t[9][5] = 1; t[9][6] = 1; t[9][7] = 1; t[9][8] = 3; t[9][9] = 1; t[9][10] = 1;
		//Light Attacking
		t[10][0] = 2; t[10][1] = 2; t[10][2] = 3; t[10][3] = 1; t[10][4] = 1; t[10][5] = 3; t[10][6] = 3; t[10][7] = 2; t[10][8] = 1; t[10][9] = 0; t[10][10] = 2;
		
switch ( t[atk2][def2])	 {
			case 0:
				effect = 0;
				break;
			case 1:
				effect = 1;
				break;
			case 2:
				effect = 1.5;  //tried using 2 but i didnt want it being as one shotty as pokemon is, too much fucking damage
				break;
			case 3:
				effect = 0.5;
				break;
			}
				
				
				return effect;
	}
	
	public static int specialcalc(Monsters atk, Monsters def, Moves m1) {  //special move dmg calc method
		Random randsp = new Random();
		int base = m1.getBase();
		double mod = 1;
		double ad =  (double)atk.getCspa()/def.getCspd();
		double dmg;
		int roundmg;
		double luck = (double)(randsp.nextInt(16) + 85)/100;
		double effect = effect(m1.getType(), def.getCtype());
		
		
		if (atk.getCtype().equals(m1.getType())) {
			mod = mod * 1.5;
		}
		
		mod = mod * luck;
		mod = mod * effect;
		
		dmg = ((  ((22 * m1.getBase()) * ( ad)   )/50) + 2) * mod;
		roundmg = (int) Math.round(dmg);
			
		if (base != 0) {
		return roundmg;
		} else
		{ return 0;}
	}
	
	
	
	
	
	public static int physcalc(Monsters atk, Monsters def, Moves m1) {  //physical move dmg calc method
		Random randph = new Random();
		int base = m1.getBase();
		double mod = 1;
		double ad =  (double)atk.getCatk()/def.getCdef();
		double dmg;
		int roundmg;
		double luck = (double)(randph.nextInt(16) + 85)/100;
		double effect = effect(m1.getType(), def.getCtype());
		
		if (atk.getCtype().equals(m1.getType())) {
			mod = 1.5;
		}
		
		mod = mod * luck;
		mod = mod * effect;
		
		dmg = ((((22 * m1.getBase()) * ( ad ) )/50) + 2) * mod;
		
		roundmg = (int) Math.round(dmg);
			
		if (base != 0) {
			return roundmg;
			} else
			{ return 0;}
	}
}





