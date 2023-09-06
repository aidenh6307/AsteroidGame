/**
 * Creates an instance of the Asteroids game and runs it.
 * 
 * @author Scott DeRuiter (and others)
 * @version 5/26/2023
 */
public class GameDriver
{
	/**
	 *  Create a game object and a display screen and execute the main update loop.
	 * 
	 * @param args      command line arguments (ignored)
	 */
	public static void main(String[] args)
	{
		AsteroidsGame game = new AsteroidsGame();

		StdDraw.setCanvasSize(GameConstants.SCREEN_WIDTH, GameConstants.SCREEN_HEIGHT);
		StdDraw.setXscale(0, GameConstants.SCREEN_WIDTH);
		StdDraw.setYscale(0, GameConstants.SCREEN_HEIGHT);
		StdDraw.enableDoubleBuffering();

		while(true)
		{
			StdDraw.clear(GameConstants.SCREEN_COLOR);
			game.update();
			game.draw();
			StdDraw.show();
			StdDraw.pause(GameConstants.DRAW_DELAY);
		}
	}
}