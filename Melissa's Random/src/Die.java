import java.util.Random;

public class Die
{
    private int sides;

    /**
       Constructs a die with a given number of sides.
       @param s the number of sides, e.g. 6 for a normal die
    */
    public Die(int s)
    {
        sides = s;
    }

    /**
       Simulates a throw of the die
       @return the face of the die
    */
    public int cast()
    {
        // TODO: Complete this method
        Random rnd = new Random();
        int cast = rnd.nextInt(this.sides);
        return cast + 1;
    }
}