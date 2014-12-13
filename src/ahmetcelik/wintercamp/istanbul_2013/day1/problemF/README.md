Winter Camp, Istanbul, January 2013

Day 1 - Problem F
The Lazy Team 
The lazy soccer team has a practice session. Since the players of the lazy team are very lazy they won’t move during the trainings, thus each player has its fixed position on a game field. We consider them as points on a plain. The goalkeeper is always at a position (30, 1). The goal is the line segment connecting points (27, 100) and (33, 100).

There are N players in the team and each team player has a range parameter. A player can pass the ball to another player if his range parameter is not less than the distance between these players. Also a player can score if his range parameter is not less than the shortest distance from this player to the score.

The practice combination is a sequence of players starting with the goalkeeper. Each player is present at most once in the sequence. Every player in the sequence should be able to pass the ball to the next player of the sequence and the last one has to be able to score. You have to find the number of valid practice combinations. Note that each sequence has to contain at least one player, the goalkeeper.

Input: standard input

The first line contains two integer numbers N and R separated with a single space. Here R is the range parameter of the goalkeeper. Each of the following N-1 lines contains three integers Xj, Yj, Rj separated with single spaces. Here (Xj, Yj) is a position of the j-th player and Rj is his range parameter.

Output: standard output

The only integer that is the number of valid practice combinations.

Constraints:

3 ≤ N ≤ 11,
0 < Xj < 60, 0 < Yj < 100, 0 < R, Rj < 125.

Sample input:

4 50
20 40 40
40 40 20
30 70 35

Sample output:

2 

