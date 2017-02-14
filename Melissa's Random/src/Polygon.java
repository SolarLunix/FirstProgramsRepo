//Create a Polygon class. A polygon is a closed shape with lines joining the corner points.
//You will keep the points in an array list. Use object of java.awt.Point for the point.

//Polygon will have as an instance variable an ArrayList of Points to hold the points
//The constructor takes no parameters but initializes the instance variable.  The
//Polygon class also has the following methods:
//    add: adds a Point to the polygon
//    perimeter: returns the perimeter of the polygon
//    draw: draws the polygon by connecting consecutive points and then
//          connecting the last point to the first.
//
//No methods headers or javadoc is provided this time. You get to try your hand at writing
//a class almost from scratch

// Need help starting this question? In the lesson titled 
// "Starting points: Problem Set Questions", go to the
// problem titled "Problem Set 6 - Question 3" for some tips on 
// how to begin.

import java.util.ArrayList;
import java.awt.Point;

public class Polygon{
	
	ArrayList<Point> points;
	
	/*
	 * Constructs an empty ArrayList that will contain all of the points in a Polygon
	 */
	Polygon(){
		 points = new ArrayList<Point>();
	}
	
	/*
	 * Adds a point to the polygon. Make sure the x,y, values go around the edge of the Polygon in a continuous line.
	 * @param int x - the x value of the current point being examined
	 * @param int y - the y value of the current point being examined
	 */
	public void add(int x, int y){
		Point p = new Point(x,y);
		this.points.add(p);
	}
	
	/*
	 * Calculates the perimeter of the current polygon
	 * @return the double value of the perimeter of the polygon
	 */
	public double perimeter(){
		double perm = 0;
		Point start = points.get(0);
		Point end = points.get(points.size()-1);
		int xstart = start.x;
		int ystart = start.y;
		int xend = start.x;
		int yend = start.y;
		
		perm += Math.sqrt((xstart - xend) * (xstart - xend) + (ystart - yend) * (ystart - yend));
		
		for(int i = 1; i < points.size(); i ++){
			int xbefore = points.get(i-1).x;
			int xafter = points.get(i).x;
			int ybefore = points.get(i-1).y;
			int yafter = points.get(i).y;
			
			perm += Math.sqrt((xbefore-xafter) * (xbefore - xafter) - (ybefore - yafter) * (ybefore - yafter));
		}
		
		return perm;
	}
	
	/*
	 * Draws the polygon from the points in the ArrayList using 
	 */
	public void draw(){
		
	}
	
}

