import java.util.regex.Matcher;
import java.util.regex.Pattern;

class RepetitionIndexFinder {

    RepetitionIndexFinder() {
        // do nothing
    }

    int findIndexOfRep(final String input) {

        final Pattern numbers = Pattern.compile("[1-9,0]+");
        final int positionOfLastLeftBracket = input.lastIndexOf('[');

        int positionOfRepetitionOfLastLeftBracket = positionOfLastLeftBracket - 1;
        Matcher matcher = numbers.matcher(charSequenceForSamePositions(input, positionOfRepetitionOfLastLeftBracket));

        while (matcher.matches()) {
            positionOfRepetitionOfLastLeftBracket = positionOfRepetitionOfLastLeftBracket - 1;
            matcher = numbers.matcher(charSequenceForSamePositions(input, positionOfRepetitionOfLastLeftBracket));
        }

        return positionOfRepetitionOfLastLeftBracket + 1;
    }

    private CharSequence charSequenceForSamePositions(final String input, final int position) {
        return input.substring(position < 0 ? 0 : position, position + 1);
    }
}
