public class asdos extends mahasiswa{ //POLYMORPHISM
    
    private int JamNgasdos;

    public asdos(String nama, int SKS, int JamNgasdos){
        super(nama,SKS);
        JamSibuk = JamSibuk + JamNgasdos;
    }
    public void mailCheck(){
        System.out.println(getnama() + " adalah seorang asdos dengan jam sibuk" + getJamSibuk());
    }
    public int getJamSibuk(){
        return JamSibuk;
    }
}
