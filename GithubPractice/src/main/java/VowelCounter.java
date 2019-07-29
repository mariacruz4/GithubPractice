public class VowelCounter {

    public int vowel(String word ){

        int vowels = 0;

        word = word.toLowerCase();

        for(int x = 0; x < word.length(); ++x){
            char ch = word.charAt(x);
            if(ch == 'a'){

                ++vowels;

            }
            if(ch == 'e'){

                ++vowels;

            }
            if(ch == 'i'){

                ++vowels;

            }
            if(ch == 'o'){

                ++vowels;

            }
            if(ch == 'u'){

                ++vowels;

            }
        }
        return vowels;
    }
}
