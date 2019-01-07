

public class ProsesNilai {


    double[][] mNilai;

    public ProsesNilai(double mNilai[][]){
        this.mNilai = mNilai;
    }

    public void tampilNilai(int mapel, int siswa){
        System.out.println(""+mNilai[mapel][siswa]);
    }

    double getRataRataPelajaran(int mapel){
        double hasil = 0;
        hasil = (mNilai[mapel][0]+mNilai[mapel][1]+mNilai[mapel][2])/mNilai[mapel].length;
        return hasil;
    }

    double getRataRataSiswa(int siswa){
        double hasil = 0;
        hasil = (mNilai[0][siswa]+mNilai[1][siswa]+mNilai[2][siswa]+mNilai[3][siswa])
        /mNilai.length;
        return hasil;
    }

    int getTertinggi(double tinggi[]){
        int hasil = 0;
        int a;
        double tertinggi = tinggi[0];
        for (a = 0;a<tinggi.length;a++){
            if (tinggi[a]>tertinggi){
                tertinggi = tinggi[a];
                hasil = a;
            }
        }
        return hasil;
    }
    int getTerendah(double rendah[]){
        int hasil = 0;
        int a;
        double terendah = rendah[0];
        for (a = 0;a<rendah.length;a++){
            if (rendah[a]<terendah){
                terendah= rendah[a];
                hasil = a;
            }
        }
        return hasil;
    }


}
