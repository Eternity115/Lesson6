
public class GuessMachine {
    
    //3 instance vars: guess, num, numguess
    private int guess, num, numguess;
    
    public GuessMachine(){
        num = (int)(Math.random() *100+1);
        guess=0;
        numguess=0;
    }
    
    //other methods
    
    //giveHint -> String returns hint
    public String giveHint(){
        if (guess>num) return "You guessed " + guess + " , Too high, guess LOWER";
        else if (guess<num) return "You guessed " + guess + " , Too low, guess HIGHER";
        else return "You have Won!";
    }
    
    //setGuess -> boolean to set the guess and count valid guesses
    public boolean setGuess(int g){
        if (g>=1 && g<=100){
            guess=g;
            numguess+=1;
            return true;
        }
        else return false;
    }
    
    //getNumGuesses -> to return numguesses
    public int getNumGuesses(){
        return numguess;
    }
    
    //hasWon() -> return true if guess == num or false if it doesn't
        // return guess==num
    public boolean hasWon(){
        return guess==num;
    }
    
    
}
