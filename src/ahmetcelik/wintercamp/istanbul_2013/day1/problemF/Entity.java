/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ahmetcelik.wintercamp.istanbul_2013.day1.problemF;

/**
 *
 * @author ahmet-celik
 */
public class Entity
{

    String name;
    int id;
    boolean used;

    public Entity(String name, int id)
    {
        this.name = name;
        this.id = id;
        this.used = false;
    }
    
    @Override
    public String toString()
    {
         return name;
    }
}
