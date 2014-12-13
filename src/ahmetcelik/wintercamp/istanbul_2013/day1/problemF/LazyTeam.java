
package ahmetcelik.wintercamp.istanbul_2013.day1.problemF;

import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author ahmet-celik
 */
public class LazyTeam
{

    private boolean[][] valid;
    private Entity[] entities;
    private int found;
    private boolean processed = false;

    public LazyTeam(Scanner scanner)
    {
        final int N = readInput(scanner);
        calculateValidMoves(N);
    }

    ;
    
    public int findAll()
    {
        if (!processed)
        {
            LinkedList<Entity> sequence = new LinkedList<>();
            sequence.add(entities[0]);
            nextMove(entities[0],sequence);
        }
        return found;
    }

    private void nextMove(Entity start, LinkedList<Entity> sequence)
    {
        if (start.name.equals("Goal"))
        {
            ++found;
            System.out.println(sequence);
            return;
        }
        for (Entity p : entities)
        {
            if (p.used)
            {
                continue;
            }
            if (valid[start.id][p.id])
            {
                p.used = true;
                sequence.addLast(p);
                nextMove(p, sequence);
                sequence.removeLast();
                p.used = false;
            }
        }
    }

    private static boolean canPass(int R, int DX, int DY)
    {
        return R * R >= (DX * DX + DY * DY);
    }

    private static boolean canScore(Player p, Goal goal)
    {
        if (p.X > goal.X2)
        {
            return canPass(p.R, (p.X - goal.X2), (p.Y - goal.Y));
        } else if (p.X < goal.X1)
        {
            return canPass(p.R, (p.X - goal.X1), (p.Y - goal.Y));
        } else
        {
            return p.R >= Math.abs(p.Y - goal.Y);
        }
    }

    private void calculateValidMoves(final int N)
    {
        valid = new boolean[N][N + 1];
        for (int i = 0; i < N; ++i)
        {
            for (int j = 1; j < N; ++j)
            {
                if (i == j)
                {
                    valid[i][j] = false;
                } else
                {
                    valid[i][j] = canPass(((Player) entities[i]).R,
                            (((Player) entities[i]).X - ((Player) entities[j]).X),
                            (((Player) entities[i]).Y - ((Player) entities[j]).Y));
                }
            }
            valid[i][N] = canScore((Player) entities[i], (Goal) entities[N]);
            valid[i][0] = false;
        }
    }

    private int readInput(Scanner scanner)
    {
        Scanner lineScanner = new Scanner(scanner.nextLine());
        final int N = lineScanner.nextInt();
        entities = new Entity[N + 1];
        entities[0] = new Player("Goalkeeper", 0, 30, 1, lineScanner.nextInt());
        lineScanner.close();
        entities[N] = new Goal("Goal", N, 27, 33, 100);
        for (int i = 1; i < N; ++i)
        {
            lineScanner = new Scanner(scanner.nextLine());
            entities[i] = new Player("Player-" + i, i, lineScanner.nextInt(),
                    lineScanner.nextInt(), lineScanner.nextInt());
            lineScanner.close();
        }
        scanner.close();
        return N;
    }

    /**
     * Some Tests
     */
    public static void main(String[] args)
    {
        String[] testCases = new String[]
        {
            "4 50\r\n40 40 20\r\n20 40 40\r\n30 70 35\r\n"
        };
        for (String testCase : testCases)
        {
            LazyTeam lt = new LazyTeam(new Scanner(testCase));
            System.out.println(lt.findAll());
        }
    }
}
