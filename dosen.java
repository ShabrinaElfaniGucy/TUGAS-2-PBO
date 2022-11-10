public class dosen extends elemen { //POLYMORPHISM
    private int JumlahHariKerja;
    private int JamSibuk;

    public dosen (String nama, int JumlahHariKerja){
        super(nama);
        JamSibuk = JumlahHariKerja * 8;
    }
    public void mailCheck(){ //UPCASTING
        System.out.println(getnama() + "adalah seorang dosen dengan jam sibuk" + getJamSibuk()); 
    }
    public int getJamSibuk(){
        return JamSibuk;
    }
    
}
