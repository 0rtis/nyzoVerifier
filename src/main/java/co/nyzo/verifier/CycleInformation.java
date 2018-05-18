package co.nyzo.verifier;

public class CycleInformation {

    private int cycleLength;
    private int blockVerifierIndexInCycle;
    private int localVerifierIndexInCycle;

    public CycleInformation(int cycleLength, int blockVerifierIndexInCycle, int localVerifierIndexInCycle) {

        this.cycleLength = cycleLength;
        this.blockVerifierIndexInCycle = blockVerifierIndexInCycle;
        this.localVerifierIndexInCycle = localVerifierIndexInCycle;
    }

    public int getCycleLength() {
        return cycleLength;
    }

    public int getBlockVerifierIndexInCycle() {
        return blockVerifierIndexInCycle;
    }

    public int getLocalVerifierIndexInCycle() {
        return localVerifierIndexInCycle;
    }

    public boolean isNewVerifier() {
        return blockVerifierIndexInCycle < 0;
    }

    @Override
    public String toString() {
        return "[CycleInformation (cycleLength=" + cycleLength + ", blockVerifierIndexInCycle=" +
                blockVerifierIndexInCycle + ", localVerifierIndexInCycle=" + localVerifierIndexInCycle + ")]";
    }
}
