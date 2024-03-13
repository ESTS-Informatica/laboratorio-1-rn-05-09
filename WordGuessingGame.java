
/**
 * Escreva uma descrição da classe WordGuessingGame aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class WordGuessingGame {
    private String hiddenWord;
    private String guessedWord;
    private int numberOfTries;
    private InputReader reader;
    private WordGenerator generator;
    
    public WordGuessingGame() {
        hiddenWord = "abc";
        guessedWord = "___";
        numberOfTries = 0;
        reader = new InputReader();
        generator = new WordGenerator();
    }
    
    public String getHiddenWord() {
        return hiddenWord;
    }
    
    public String getGuessedWord() {
        return guessedWord;
    }
    
    public int getNumberOfTries() {
        return numberOfTries;
    }
    
    private void showGuessedWord() {
        System.out.println("A sua palavra atual é: " + guessedWord);
    }
    
    public void play() {
        showWelcome();
        while (!guessedWord.equals(hiddenWord)) {
            showGuessedWord();
            guess();
        }
        showResult();
    }
    
    private void showWelcome() {
        System.out.println("Bem Vindo ao jogo!");
    }
    
    private void guess() {
        char[] guessArray = guessedWord.toCharArray();
        char[] hiddenArray = hiddenWord.toCharArray();
        String question = "Qual palavra deseja adivinhar?";
        char guess = reader.getChar(question);
        boolean found = false;
        
        for (int i = 0; i < hiddenArray.length ; i++) {
            if (hiddenArray[i] == guess) {
                guessArray[i] = guess;
                found = true;
            }
        }
        
        if (found) {
            guessedWord = new String(guessArray);
        }
        
        numberOfTries++;
    }
    
    private void showResult() {
        if (guessedWord.equals(hiddenWord)) {
            System.out.println("Número de tentativas: " + numberOfTries);
        }
    }
    
    public void generateHiddenWord() {
        hiddenWord = generator.generateWord();
    }
    
    public void initializeGuessedWord() {
        char[] dimension = hiddenWord.toCharArray();
        int size = dimension.length;
        char[] guess = guessedWord.toCharArray();
        for(int i = 0; i < size ; i++) {
            guess[i] = '_';
        }
        
    }
}
    
    