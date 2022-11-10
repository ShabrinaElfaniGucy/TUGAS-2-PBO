public class mahasiswa extends elemen { //POLYMORPHISM
    private int SKS;
    public int JamSibuk;

    public mahasiswa (String nama, int SKS){
        super(nama);
        JamSibuk = SKS * 3;
    }
    public void mailCheck(){
        System.out.println(getnama() + "adalah seorang mahasiswa dengan jam sibuk" + getJamSibuk());
    }
    public int getJamSibuk(){
        return JamSibuk;
    }
}
