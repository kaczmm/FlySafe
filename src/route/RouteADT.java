package route;

/**
 * A route ADT to hold the route's data
 * @author Daniel Brunton, Ben Giller, Matt Kaczmarek, Jiacheng Yang, Ray Winardi
 *
 */
public class RouteADT {
	
	AirportADT source;
	AirportADT destination;
	double price;
	double time;
	AirlineADT airline;
	
	
	/**
	 * The routeADT constructor
	 * @param source the source of the route
	 * @param destination the destination of the route
	 * @param safetyRank the safety rank of the route
	 * @param price the price of the route
	 * @param time the duration of the route
	 */
	public RouteADT(AirportADT source, AirportADT destination, AirlineADT airline, double price, double time) {
		this.source = source;
		this.destination = destination;
		this.airline = airline;
		this.price = price;
		this.time = time;
	}
	
	/**
	 * Returns the source of the route
	 * @return return the source of the route
	 */
	public AirportADT getSource() {
		return this.source;
	}
	
	/**
	 * Set the source of the route
	 * @param source the new source of the route
	 */
	public void setSource(AirportADT source) {
		this.source = source;
	}
	
	/**
	 * Returns the destination of the route
	 * @return return the destination of the route
	 */
	public AirportADT getDestination() {
		return this.destination;
	}
	
	/**
	 * Set the destination of the route
	 * @param destination the new destination
	 */
	public void setDestination(AirportADT destination) {
		this.destination = destination;
	}
	
	/**
	 * Get the price of the route
	 * @return return the price of the route
	 */
	public double getPrice() {
		return this.price;
	}
	
	/**
	 * Set the price of the route
	 * @param price the new price of the route
	 */
	public void setPrice(double price) {
		this.price = price;
	}
	
	/**
	 * Get the routes time
	 * @return returns the time of the route
	 */
	public double getTime() {
		return this.time;
	}
	
	/**
	 * Sets the route time
	 * @param time The new time
	 */
	public void setTime(double time) {
		this.time = time;
	}

}
