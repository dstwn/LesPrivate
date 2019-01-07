

import java.text.DecimalFormat;
import java.util.Scanner;

public class IO_Nilai {

    Scanner inpt;
    double[][] mNilai = new double[4][3];
    double rataRataMapel[] = new double[4];
    double rataRataSiswa[] =  new double[3];
    DecimalFormat decimalFormat = new DecimalFormat("#.##");

    protected IO_Nilai(){
        inpt = new Scanner(System.in);
        masukNilai();
        tampilNilai();
        olahNilai();

    }

    void tampilNilai(){
        garis();
        System.out.print("No Siswa | ");
        System.out.print("Pelajaran 1 | ");
        System.out.print("Pelajaran 2 | ");
        System.out.print("Pelajaran 3 | ");
        System.out.println("Pelajaran 4 | ");
        garis();
        dataAll();

    }

    void dataAll(){
      int i;
      for (i = 0;i < 3 ; i++ ) {
        System.out.println("Siswa "+(i+1)+"  |"+mNilai[0][i]+"          |"
        +mNilai[1][i]+"          |"+mNilai[2][i]+"          |"+mNilai[3][i]+"          |");
      }
    }



    void garis (){
      System.out.println("=====================================");
    }

    void olahNilai() {
        garis();
        ProsesNilai prosesNilai = new ProsesNilai(mNilai);
        System.out.println("=========Rata-rata Pelajaran=========");
        garis();
        System.out.print("| Mata Pelajaran |");
        System.out.println(" Rata - Rata");
        garis();
        rataRataMapel(prosesNilai);
        garis();
        System.out.println("======Rata- rata menurut Siswa=======");
        garis();
        System.out.print("|      Siswa     |");
        System.out.println(" Rata - Rata");
        garis();
        rataRataSiswa(prosesNilai);
        garis();
        System.out.println("Rata-rata pelajaran Tertinggi   : Pelajaran "+(decimalFormat.format(prosesNilai.getTertinggi(rataRataMapel)+1)));
        System.out.println("Rata-rata pelajaran Terendah    : Pelajaran "+(decimalFormat.format(prosesNilai.getTerendah(rataRataMapel)+1)));
        System.out.println("Rata-rata Siswa Tertinggi       : Siswa "+(decimalFormat.format(prosesNilai.getTertinggi(rataRataSiswa)+1)));
        System.out.println("Rata-rata Siswa Terendah        : Siswa "+(decimalFormat.format(prosesNilai.getTerendah(rataRataSiswa)+1)));
    }


    void rataRataSiswa(ProsesNilai prosesNilai) {
        int a;
        for (a = 0 ; a < 3; a++){
            rataRataSiswa[a] = prosesNilai.getRataRataSiswa(a);
            System.out.println("| Siswa     "+(a+1)+"    | "
            +decimalFormat.format(rataRataSiswa[a]));
        }
    }

    void rataRataMapel(ProsesNilai prosesNilai) {
        int a;
        for (a=0;a<4;a++){
            rataRataMapel[a] = prosesNilai.getRataRataPelajaran(a);
            System.out.println("| Pelajaran "+(a+1)+"    | "
            +decimalFormat.format(rataRataMapel[a]));
        }
    }


    void masukNilai() {
        int a,b;
        for (a = 0;a < mNilai.length; a++){
            for (b = 0 ; b<mNilai[a].length;b++){
                System.out.print("Masukkan nilai Pelajaran "+(a+1)+" Siswa "+(b+1)+" = ");
                mNilai[a][b] = (double) Double.parseDouble(String.valueOf(inpt.nextInt()));
            }
        }
    }

}
