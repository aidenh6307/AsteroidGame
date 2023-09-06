/**
 * Extends a point to include an associated heading.
 * 
 * @author Your Name Here
 * @version 5/26/2023
 */
public class Position extends Point
{
	/**  The heading, or direction, of this position      */
	private double heading;

	/**
	 * Construct a Position.
	 * 
	 * @param x            the position on the X-axis
	 * @param y            the position on the Y-axis
	 * @param direction    the heading, or direction (in radians)
	 */


	/**
	 * Copy constructor.
	 * 
	 * @param other        the Position to copy
	 */


	/**
	 * @return the heading in radians
	 */


	/**
	 * Set the heading.
	 * 
	 * @param newHeading     the new heading in radians.
	 */


	/**
	 * @return String representation of this Position as
	 *         "Position[xPosition=x, yPosition=y, heading=h]"
	 */
	public String toString()
	{
		return "Position[xPosition=" + getX() + ", yPosition="
			+ getY() + ", heading=" + heading + "]";
	}
}