public class Customer implements Comparable<Customer> {
    private String fornavn;
    private String efternavn;
    private int alder;

    public Customer(String fornavn, String efternavn, int alder) {
        this.fornavn = fornavn;
        this.efternavn = efternavn;
        this.alder = alder;
    }

    public String getFornavn() {
        return fornavn;
    }

    public void setFornavn(String fornavn) {
        this.fornavn = fornavn;
    }

    public String getEfternavn() {
        return efternavn;
    }

    public void setEfternavn(String efternavn) {
        this.efternavn = efternavn;
    }

    public int getAlder() {
        return alder;
    }

    public void setAlder(int alder) {
        this.alder = alder;
    }

    //@Override
    /* public int compareTo(Customer other) {
        if(this.efternavn.compareTo(other.getEfternavn()) == 0){
            return this.fornavn.compareTo(other.getFornavn());
        }
        if (this.efternavn.compareTo(other.getEfternavn()) == 0 && this.fornavn.compareTo(other.getFornavn()) == 0){
            return new Integer(alder).compareTo(other.alder);
        }
        return this.efternavn.compareTo(other.getEfternavn());
    } */
    public int compareTo(Customer other) {
        if (this.efternavn.compareTo(other.getEfternavn()) == 0) {
            if (this.fornavn.compareTo(other.getFornavn()) == 0) {
                // return this.alder - other.getAlder();
                return new Integer(this.alder).compareTo(other.getAlder());
            }
            return this.getFornavn().compareTo(other.getFornavn());
        }
        return this.efternavn.compareTo(other.getEfternavn());
    }
}

