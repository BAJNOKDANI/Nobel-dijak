public class Nobel {
    private int ev;
    private String tipus;
    private String kNev;
    private String vNev;
    private String teljesNev;
    public Nobel(int ev, String tipus, String kNev, String vNev) {
        this.ev = ev;
        this.tipus = tipus;
        this.kNev = kNev;
        this.vNev = vNev;
    }

    public Nobel(String sor) {
        String[] reszek = sor.split(";");
        this.ev = Integer.parseInt(reszek[0]);
        this.tipus = reszek[1];
        this.kNev = reszek[2];
        if (reszek.length==4){
            this.vNev = reszek[3];
        }
        else {
            this.vNev="";
        }
        this.teljesNev = this.kNev+" "+this.vNev;
    }

    public String getTeljesNev() {
        return teljesNev;
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
