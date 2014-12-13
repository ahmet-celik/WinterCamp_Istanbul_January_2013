/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ahmetcelik.wintercamp.istanbul_2013.day1.problemF;

/**
 *
 * @author ahmet-celik
 */
public class Player extends Entity
{

    int X, Y, R;

    public Player(String name, int id, int X, int Y, int R)
    {
        super(name, id);
        this.X = X;
        this.Y = Y;
        this.R = R;
    }
}
