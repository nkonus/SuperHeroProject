package Tuesday;

public class Villian extends Character implements Moves{
	
	private String motive = "World domination!";
	
		public String getMotive() {
				return motive;
			}

		public void setMotive(String motive) {
				this.motive = motive;
			}
	
			
	// have to implement because MOves interface says so
	
	public int fight(String move) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int heal(String move) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void talk(String catchPhrase) {
		System.out.print(this.getName() + " says,");
		System.out.print("\""+ catchPhrase +"\"" );
		System.out.println(", with a sneer.");
	}

	

	
	
	
}
