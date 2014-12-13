/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ahmetcelik.wintercamp.istanbul_2013.day1.problemF;

/**
 *
 * @author pc
 */
public class Goal extends Entity
{

    int X1, X2, Y;

    public Goal(String name, int id, int X1, int X2, int Y)
    {
        super(name, id);
        this.X1 = X1;
        this.X2 = X2;
        this.Y = Y;
    }
}
