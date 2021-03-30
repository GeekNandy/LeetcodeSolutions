class Solution {
    public boolean halvesAreAlike(String s) {
        int n = s.length(), fp = 0, lp = 0;
        Set<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        vowels.add('A');
        vowels.add('E');
        vowels.add('I');
        vowels.add('O');
        vowels.add('U');
        for(int i=0, j = n-1; i<j; i++, j--) {
            if(vowels.contains(s.charAt(i))) fp++;
            if(vowels.contains(s.charAt(j))) lp++;
        }
        return (fp==lp);
    }
}
