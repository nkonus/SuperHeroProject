package Tuesday;

public abstract class Character {
	// These are private so need Getter and Setter 
	// Private attributes and public Get/Set in Encapsulation
	private String name;
	private int health;
	private boolean isAlive = true;
	private char action;
	
	
	// Getters and Setter for private attributes
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	public boolean isAlive() {
		return isAlive;
	}
	public void setAlive(boolean isAlive) {
		this.isAlive = isAlive;
	}
	
	// Abstract method that will need to be implemented by child
	public abstract void talk (String catchPhrase);
		
	public void displayHealth() {
		System.out.println(this.getName() + " has " + this.getHealth()+ " health points.");
	}
	public char getAction() {
		return action;
	}
	public void setAction(char action) {
		this.action = action;
	}
	}
	

