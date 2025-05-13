public class Nobel {
    private int ev;
    private String tipus;
    private String kNev;
    private String vNev;

    public Nobel(int ev, String tipus, String kNev, String vNev) {
        this.ev = ev;
        this.tipus = tipus;
        this.kNev = kNev;
        this.vNev = vNev;
    }

    public int getEv() {
        return ev;
    }

    public String getTipus() {
        return tipus;
    }

    public String getkNev() {
        return kNev;
    }

    public String getvNev() {
        return vNev;
    }

    @Override
    public String toString() {
        return "ev=" + ev +
                ", tipus=" + tipus +
                ", kNev=" + kNev +
                ", vNev=" + vNev;
    }
}
