public class compile {
    public static void main(String[] args){
        int hitung;
        // POLYMORPHISM
        asdos p = new asdos ("Fairuzikun", 24, 1);
        asdos q = new asdos ("Angel-Chan", 21, 1);
        dosen r = new dosen ("Raja OP Damanik", 5);
        dosen s = new dosen ("Nivotko", 3);
        mahasiswa t = new mahasiswa ("Firman", 20);
        mahasiswa u = new mahasiswa ("Nid to pass this sem", 23);

        p.mailCheck();
        q.mailCheck();
        r.mailCheck();
        s.mailCheck();
        t.mailCheck();
        u.mailCheck();

        hitung = p.JamSibuk + r.getJamSibuk() + q.JamSibuk + t.JamSibuk + u.JamSibuk + s.getJamSibuk();
        System.out.println("Total jam sibuk elemen Fasilkom adalah" + hitung);
    }
    
}
