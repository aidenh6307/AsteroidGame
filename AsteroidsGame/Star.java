import java.awt.Color;

/**
 * Your description here.
 * 
 * @author Scott DeRuiter
 * @version 5/26/2023
 */
 
public class Star extends SpaceObject
{
	private double size;
	
	public Star ( )
	{
		super(new Position(Math.random() * GameConstants.SCREEN_WIDTH, 
					Math.random() * GameConstants.SCREEN_HEIGHT, 7 * Math.PI / 4),
					new VelocityVector(7 * Math.PI / 4, 0.5));
		size = 0.5 + Math.random();
	}
	
	public void draw ( )
	{
		
	}
}











