/*
 * You are developing a simple application to manage the player lineup for a
 * football
 * (soccer) match. The coach needs to maintain a list of the starting 11 players
 * for the match. After
 * finalizing the lineup, the coach wants to:
 * Display the names of all the players in the starting lineup.
 * Check if a specific player is in the starting lineup.
 * Update the lineup by replacing a player who got injured during the warm-up
 * with a substitute.
 * Task:
 * Create a String[] array to store the names of the 11 starting players.
 * Implement a method to display all players in the lineup.
 * Implement a method to check if a specific player is in the starting lineup.
 * Implement a method to replace an injured player with a substitute.
 * Starting Lineup:
 * Player 1: John
 * Player 2: David
 * Player 3: Mike
 * Player 4: Chris
 * Player 5: Alex
 * Player 6: Ryan
 * Player 7: James
 * Player 8: Sam
 * Player 9: Robert
 * Player 10: Daniel
 * Player 11: Steve
 * Substitute:
 * Substitute Player: Luke (to replace injured player James)
 */
public class Football {
    static String[] lineup = { "john", "david", "dike", "dhris", "alex", "ayan", "james", "sam", "robert", "daniel",
            "steve" };

    public static void main(String[] args) {

    }

    static boolean find(String name) {
        for (String i : lineup) {
            if (i == name) {
                return true;
            }

        }
        return false;
    }

    void display() {
        int j = 1;
        for (String i : lineup) {
            System.out.println("Player " + j + " : " + i);
            j++;
        }
    }
}