public class Asmuo {

    public Asmuo(){};
    public Asmuo(String vardas,String pavarde){
        this.vardas = vardas; this.pavarde = pavarde;
    }

    protected String vardas;
    private String pavarde;

    public void setVardas(String vardas){
        this.vardas = vardas;
    }
    public void setPavarde(String pavarde){
        this.pavarde = pavarde;
    }
    public String getVardas(){
        return vardas;
    }
    public String getPavarde(){
        return pavarde;
    }

    public void spausdinkv(){
        System.out.println(vardas);
    }
    public void spausdinkp(){
        System.out.println(pavarde);
    }

}
