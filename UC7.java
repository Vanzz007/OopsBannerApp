

public class UC7 {


    
    static class CharacterPatternMap {

        private char character;

       
        private String[] pattern;
        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public char getCharacter() {
            return character;
        }

        /** Getter for pattern */
        public String[] getPattern() {
            return pattern;
        }
    }
    public static CharacterPatternMap[] createCharacterPatternMaps() {

        return new CharacterPatternMap[] {

            new CharacterPatternMap('O', new String[]{
                "  OOO  ",
                " O   O ",
                " O   O ",
                " O   O ",
                " O   O ",
                " O   O ",
                "  OOO  "
            }),

            new CharacterPatternMap('P', new String[]{
                " PPPP  ",
                " P   P ",
                " P   P ",
                " PPPP  ",
                " P     ",
                " P     ",
                " P     "
            }),

            new CharacterPatternMap('S', new String[]{
                "  SSSS ",
                " S     ",
                " S     ",
                "  SSS  ",
                "     S ",
                "     S ",
                " SSSS  "
            }),

            new CharacterPatternMap(' ', new String[]{
                "       ",
                "       ",
                "       ",
                "       ",
                "       ",
                "       ",
                "       "
            })
        };
    }


    public static String[] getCharacterPattern(char ch, CharacterPatternMap[] charMaps) {

        for (CharacterPatternMap map : charMaps) {

            if (Character.toUpperCase(map.getCharacter()) ==
                Character.toUpperCase(ch)) {

                return map.getPattern();
            }
        }

       
        if (ch != ' ') {
            return getCharacterPattern(' ', charMaps);
        }

        return null;
    }


     
    public static void printMessage(String message,
                                    CharacterPatternMap[] charMaps) {

        for (int i = 0; i < 7; i++) {

            StringBuilder line = new StringBuilder();

            for (char ch : message.toCharArray()) {

                String[] pattern = getCharacterPattern(ch, charMaps);

                if (pattern != null) {
                    line.append(pattern[i]).append("  ");
                }
            }

            System.out.println(line.toString());
        }
    }

    public static void main(String[] args) {

        
        CharacterPatternMap[] charMaps = createCharacterPatternMaps();

        
        String message = "OOPS";

        printMessage(message, charMaps);
    }
}