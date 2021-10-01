import java.util.Locale;

/**
 * A program to carry on conversations with a human user.
 * This is the initial version that:  
 * <ul><li>
 *       Uses indexOf to find strings
 * </li><li>
 *          Handles responding to simple words and phrases 
 * </li></ul>
 * This version uses a nested if to handle default responses.
 * @author Laurie White
 * @version April 2012
 */
public class Magpie
{
    /**
     * Get a default greeting   
     * @return a greeting
     */
    public String getGreeting()
    {
        return "Hello, let's talk.";
    }
    
    /**
     * Gives a response to a user statement
     * 
     * @param statement
     *            the user statement
     * @return a response based on the rules given
     */
    public String getResponse(String statement)
    {
        String response = "";
        if (statement.indexOf("no") >= 0)
        {
            response = "Why so negative?";
        }
        else if (statement.indexOf("mother") >= 0
                || statement.indexOf("father") >= 0
                || statement.indexOf("sister") >= 0
                || statement.indexOf("brother") >= 0)
        {
            response = "Tell me more about your family.";
        }
        else if (statement.indexOf("dog") >= 0
                || statement.indexOf("cat") >=0)
        {
            response = "Tell me more about your pets.";
        }
        else if (statement.indexOf("Nathan") >= 0)
        {
            response = "Nathan is such a smart and powerful teacher";
        }
        else if (statement.equals(" ")){
            statement = statement.trim();
            if (statement.length()==0){
                response = "Say something, please";
            }
        }
        else if (statement.indexOf("yes") >= 0)
        {
            response = "Why so postive?";
        }
        else if (statement.indexOf("hi") >= 0)
        {
            response = "What do you want?";
        }
        else
        {
            response = getRandomResponse();
        }
        return response;
    }
    
    /**
     * Pick a default response to use if nothing else fits.
     * @return a non-committal string
     */
    public String getRandomResponse()
    {
        final int NUMBER_OF_RESPONSES = 6;
        double r = Math.random();
        int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
        String response = "";
        
        if (whichResponse == 0)
        {
            response = "Interesting, tell me more.";
        }
        else if (whichResponse == 1)
        {
            response = "Hmmm.";
        }
        else if (whichResponse == 2)
        {
            response = "Do you really think so?";
        }
        else if (whichResponse == 3)
        {
            response = "You don't say.";
        }
        else if (whichResponse == 4)
        {
            response = "Shut up stupid weirdo";
        }
        else if (whichResponse == 5)
        {
            response = "Do you talk to your mom with that mouth";
        }
    
        return response;
    }

    // Checks to see if the String word appears as a whole word
    // in the String str (in this case, a "whole word" means that 
    // word is not just a substring of some larger word in str)

    // This method should work regardless of the capitalization 
    // of str or word

    // The method returns the index of the first character in word
    // if it is found, and returns -1 otherwise. 
    public int findWord(String str, String word) {
        str = str.toLowerCase();
        word = word.toLowerCase();
        int flute = str.indexOf(word);
        int weak = word.length();
        //check to see if word is th3ere
        if (str.indexOf(word) == -1) {
            return -1;
        }
        //check to see if it is inbetween spaces
        if (str.charAt(flute - 1) == ' ' &&  str.charAt(flute + (weak-1)) == ' '){
            return flute;
        }
        //check to see if it is last word
        else if (str.charAt(flute - 1) == ' ' && str.charAt(flute + weak) == str.length()) {
            return flute;
        }
        //check to see if it is first word
        else if (flute == 0 && str.charAt(flute + (weak)) == ' ') {
            return flute;
        }
        return -1;
    }


    // We will work on the following methods later!

    /**
     * Take a statement with "I want <something>." and transform it into 
     * "Would you really be happy if you had <something>?"
     * @param statement the user statement, assumed to contain "I want"
     * @return the transformed statement
     */
    public String transformIWantStatement(String statement){
        statement = statement.toLowerCase();
        String str = "";
//        int last = str.indexOf(statement);
//        if (last - 1 == ' ' && last == statement.length()){
//            String finito =
//        }
        if (statement.indexOf("i want") >= 0){
            int last_word = findWord(statement, "i want");
            last_word = (statement.length() -1) - last_word;
        }
        return str;
    }

    /**
     * Take a statement with "I <something> you" and transform it into 
     * "Why do you <something> me?"
     * @param statement the user statement, assumed to contain "I" followed by "you"
     * @return the transformed statement
     */
    public String transformIYouStatement(String statement)
    {
        //your code here
        return "";
    }

    /**
     * Take a statement with "I want to <something>." and transform it into 
     * "What would it mean to <something>?"
     * @param statement the user statement, assumed to contain "I want to"
     * @return the transformed statement
     */
    public String transformIWantToStatement(String statement)
    {
        // your code here
        return "";
    }




    /**
     * Take a statement with "you <something> me" and transform it into 
     * "What makes you think that I <something> you?"
     * @param statement the user statement, assumed to contain "you" followed by "me"
     * @return the transformed statement
     */
    public String transformYouMeStatement(String statement)
    {
        // your code here
        return "";
    }
}
