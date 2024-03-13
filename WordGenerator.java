/**
 * Escreva uma descrição da classe WordGenerator aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */

import java.util.ArrayList;
import java.util.Random;
public class WordGenerator {
    private ArrayList<String> words;
    private Random random;
    
    public WordGenerator() {
        words = new ArrayList<String>();
        random = new Random();
    }
    
    private void fillArrayList() {
        String[] wordsToAdd = {"boolean", "break", "byte", "case", "char", "class", "continue", "do", "double", "else", "enum", "for", "if", "import", "int"};
        for (String add : wordsToAdd) {
            words.add(add);
        }
    }
    
    public String generateWord() {
        int index = random.nextInt(words.size() + 1);
        return words.get(index);
    }
    
    public void addWord(String add) {
        words.add(add);
    }
}