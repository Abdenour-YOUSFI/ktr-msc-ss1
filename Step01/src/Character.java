
public abstract class Character {
	protected String name;
	protected int life=50;
	protected int agility=2;
	protected int strength=2;
	protected int wit=2;
	protected final String RPGClass;
	
public Character (String name, String RPGClass ) {
	this.name=name;
	this.RPGClass = RPGClass;
	
}

public String getName() {
	return name;
}

public int getLife() {
	return life;
}

public int getAgility() {
	return agility;
}

public int getStrength() {
	return strength;
}

public int getWit() {
	return wit;
}

public String getRPGClass() {
	return RPGClass;
}

public void attack(String attackType) {
	System.out.println(name +  " Rrrrrrrrr.... "  );
	
}

}
