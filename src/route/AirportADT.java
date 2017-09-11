package route;

/**
 * An airportADT that holds the data for an airport
 * @author Daniel Brunton, Ben Giller, Matt Kaczmarek, Jiacheng Yang, Ray Winardi
 *
 */
public class AirportADT {

	String airportCode;
	String city;
	String country;
	long longitude;
	long latitude;
	
	/**
	 * The airportADT constructor
	 * @param airportCode a 3 letter airport code
	 * @param city a city name for the airport
	 * @param country a country for the airport
	 */
	public AirportADT(String airportCode, String city, String country, long longitude, long latitude){
		this.airportCode = airportCode;
		this.city = city;
		this.country = country;
		this.longitude = longitude;
		this.latitude = latitude;
	}
	
	/**
	 * Return the airport's code
	 * @return return the airport's code
	 */
	public String getAirportCode() {
		return this.airportCode;
	}
	
	/**
	 * Set a new airport code for the airport
	 * @param airportCode the new airport code
	 */
	public void setAirportCode(String airportCode) {
		this.airportCode = airportCode;
	}
	
	/**
	 * Return the airport's city
	 * @return return the airport's city
	 */
	public String getCity() {
		return this.city;
	}
	
	/**
	 * Set a new city for the airport
	 * @param city the new city
	 */
	public void setCity(String city) {
		this.city = city;
	}
	
	/**
	 * Return the airport's country
	 * @return return the airport's country
	 */
	public String getCountry() {
		return this.city;
	}
	
	/**
	 * Set a new country for the airport
	 * @param country the new country
	 */
	public void setCountry(String country) {
		this.country = country;
	}
	
	/**
	 * Return the longitude of the airport
	 * @return return the longitude
	 */
	public long getLongitude() {
		return this.longitude;
	}
	
	/**
	 * Set a new longitude for the airport
	 * @param longitude the new longitude
	 */
	public void setLongitude(long longitude) {
		this.longitude = longitude;
	}
	
	/**
	 * Return the latitude of the airport
	 * @return return the latitude
	 */
	public long getLatitude() {
		return this.latitude;
	}
	
	/**
	 * Set a new latitude for the airport
	 * @param latitude the new latitude
	 */
	public void setLatitude(long latitude) {
		this.latitude = latitude;
	}
	
}
