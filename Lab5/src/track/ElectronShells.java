package track;

public class ElectronShells extends CircleTrack {
    public ElectronShells(int n) {
        super(n);
    }

    @Override
    public int hashCode() {
        //base 7
        int reInt = 0;
        reInt += noNumber.hashCode();
        reInt += 7 * Type.hashCode();
        reInt += 7 * 7 * radius.hashCode();
        return reInt;
    }

    @Override
    public boolean equals(Object o) {
        return o.hashCode() == this.hashCode();
    }
}
