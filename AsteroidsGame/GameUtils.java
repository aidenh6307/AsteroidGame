/**
 * Utility methods for working with Positions, Points, and Vector2Ds in Asteroids.
 * 
 * @author Scott DeRuiter (and others)
 * @version 5/26/2023
 */
public class GameUtils
{
	/**
	 * Update the provided velocity according to the indicated thrust value and
	 * heading. The thrust will be applied so as to push the velocity value in
	 * the direction of the provided heading.
	 * 
	 * @param velocity        velocity vector to update
	 * @param heading         direction to push the velocity
	 * @param thrust          magnitude of the thrust
	 */
	public static void applyThrust(VelocityVector velocity, double heading, double thrust)
	{
		VelocityVector thrustVector = new VelocityVector(heading, thrust);
		velocity.setX(velocity.getX() + thrustVector.getX());
		velocity.setY(velocity.getY() + thrustVector.getY());
	}

	/**
	 * Draw an isosceles triangle at the location and heading of the provided
	 * Position. The triangle will be centered at the x,y position of the Position
	 * object.
	 *
	 * @param Position         location and heading for the triangle
	 * @param width            the width of the base of the triangle
	 * @param height           the height of the triangle
	 */
	public static void drawPositionAsTriangle(Position position, double width, double height)
	{
		Point llPoint = transformPositionToScreen(position, new Point(-.5 * height, -.5 * width));
		Point lrPoint = transformPositionToScreen(position, new Point(-.5 * height, .5 * width));
		Point endPoint = transformPositionToScreen(position, new Point(.5 * height, 0));

		double[] xs = new double[3];
		double[] ys = new double[3];

		xs[0] = llPoint.getX();
		xs[1] = endPoint.getX();
		xs[2] = lrPoint.getX();
		ys[0] = llPoint.getY();
		ys[1] = endPoint.getY();
		ys[2] = lrPoint.getY();

		StdDraw.filledPolygon(xs, ys);
	}

	/**
	 * A helper method, that performs a transform from the coordinate frame defined by 
	 * a Position object to screen coordinates.
	 * 
	 * @param Position          the coordinate frame to transform from
	 * @param point             the point to transform (in Position coordinates)
	 * @return                  the transformed point (in screen coordinates)
	 */
	private static Point transformPositionToScreen(Position position, Point point)
	{
		double newX;
		double newY;
		newX = point.getX() * Math.cos(position.getHeading()) - 
				point.getY() * Math.sin(position.getHeading()) + position.getX();
        newY = point.getX() * Math.sin(position.getHeading()) + 
				point.getY() * Math.cos(position.getHeading()) + position.getY();
        return new Point(newX, newY);
    }
}