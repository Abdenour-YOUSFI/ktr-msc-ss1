
public abstract class Character implements Movable  {
	
	protected String name;
	protected int life;
	protected int agility;
	protected int strength;
	protected int wit;
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

public abstract void attack(String weapon);

public void moveRight() {
    
}

public void moveLeft() {
    
}

public void moveForward() {
    
}

public void moveBack() {
    
}

public final void unsheathe () {
	System.err.println(name +": unsheathes his weapon ." );

	
}

}





