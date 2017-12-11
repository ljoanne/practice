class Decompressor {

    Decompressor() {
        //nothing
    }

    String process(String input) {

        if (!input.contains("[")) {
            // base case
            return input;
        } else {
            final RepetitionIndexFinder repetitionIndexFinder = new RepetitionIndexFinder();
            final int position = repetitionIndexFinder.findIndexOfRep(input);

            final String entireSequence = input.substring(position, input.indexOf("]", position) + 1);

            final Integer noOfReps = Integer.valueOf(input.substring(position, input.indexOf("[", position)));
            final String repeatedSequence = input.substring(input.indexOf("[", position) + 1, input.indexOf("]", position));
            final String replacingSequence = makeReplacingSequence(noOfReps, repeatedSequence);

            final String result = input.replace(entireSequence, replacingSequence);
            return process(result);
        }
    }

    private String makeReplacingSequence(final int noOfReps, final String repeatedSequence) {
        String replacingSequence = "";
        for (int i = 0; i < noOfReps; i++) {
            replacingSequence = replacingSequence.concat(repeatedSequence);
        }
        return replacingSequence;
    }
}
