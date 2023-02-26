package school.mjc.stage0.loops.task2;

public class WordsBuilder {
//    Write a program that will build a phrase from given chars (char...). !HINT check length method in google!
    public void buildPhrase(char... chars) {
        int len = chars.length;
        int curr = 0;
        String phrase = "";
        while(curr<len){
//            System.out.println(chars[curr]);
            phrase+=chars[curr];
            curr++;
        }
        System.out.println(phrase);
    }
    public static void main(String[] args){
        WordsBuilder n = new WordsBuilder();
        n.buildPhrase('a', 'b', 'c');
    }
}
