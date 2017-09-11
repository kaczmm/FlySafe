package route;

import java.util.ArrayList;

public class RouteList {
	
	private static ArrayList<RouteADT> list = new ArrayList<RouteADT>();
	
	
	public static void addRoute(RouteADT route) {
		//TODO stop adding duplicates
		list.add(route);
	}
	
	public static void removeRoute(RouteADT route) {
		list.remove(route);
	}
	
	public static boolean contains(RouteADT route) {
		return list.contains(route);
	}
	
	public static int getIndex(RouteADT route) {
		return list.indexOf(route);
	}
	
	public static RouteADT getRoute(int index) {
		return list.get(index);
	}
	
	public static void sort() {
		// TODO bilateral sort with start and end together and then by safety ranking
		// TODO maybe have 1,2,3 transfer sort
	}
}
