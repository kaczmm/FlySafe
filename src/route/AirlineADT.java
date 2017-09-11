package route;

/**
 * An airline ADT
 * @author Daniel Brunton, Ben Giller, Matt Kaczmarek, Jiacheng Yang, Ray Winardi
 *
 */
public class AirlineADT {
	
	int safetyRank;
	String name;
	int airlineID;
	
	/**
	 * The airlineADT constructor
	 * @param safetyRank the airline's safety ranking
	 * @param name the airline's name
	 * @param airlineID the airline's ID
	 */
	public AirlineADT(int safetyRank, String name, int airlineID) {
		this.safetyRank = safetyRank;
		this.name = name;
		this.airlineID = airlineID;
	}
	
	/**
	 * Return the airline's safety ranking
	 * @return return the airline's safety ranking
	 */
	public int getSafetyRank() {
		return this.safetyRank;
	}
	
	/**
	 * Set a new safety ranking for the airline
	 * @param safetyRank the new safety ranking
	 */
	public void setSafetyRank(int safetyRank) {
		this.safetyRank = safetyRank;
	}
	
	/**
	 * Return the name of the airline
	 * @return return the name
	 */
	public String getName() {
		return this.name;
	}
	
	/**
	 * Set a new name for the airline
	 * @param name the new airline name
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * Return the airline's ID
	 * @return return the airline's ID
	 */
	public int getAirlineID() {
		return this.airlineID;
	}
	
	/**
	 * Set a new airline ID for the airline
	 * @param airlineID the new airline ID
	 */
	public void setAirlineID(int airlineID) {
		this.airlineID = airlineID;
	}
}
