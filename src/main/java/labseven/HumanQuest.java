package labseven;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/** Plays a high-stakes encounter of HumanQuest.
 *
 * @author Solution Repository
 */
public class HumanQuest {

  /** Entry point.
   *
   * @param args The command line arguments
   */
  public static void main(String[] args) {    
    // Set up file input
    File file = null;
    Scanner input = null;
    try {
      file = new File("input/quest.stats");
      input = new Scanner(file);
    } catch (FileNotFoundException noFile) {
      System.exit(0);
    }
    
    /*
     * TODO: Read file contents into appropriate variables/types
     */
    
    /*
     * TODO: Create Die object to represent monster roll
     */
    
    /*
     * TODO: Print the monster's roll
     */
    
    /*
     * TODO: Set up and roll each party member's dice
     */
    
    /*
     * TODO: Print the outcome of each party member's rolls
     */
    
    /*
     * TODO: Total all of the rolls
     */
    
    /* 
     * TODO: Create boolean to evaluate success
     */
    
    /*
     * TODO: Print total roll and outcome of encounter
     */
  }
}