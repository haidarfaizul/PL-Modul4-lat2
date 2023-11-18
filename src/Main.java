import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String[] kata = new String[1];
        String cari;
        int pilih;

        do {
            System.out.println("");
            System.out.println("== MENU TEKS ANALYZER ==");
            System.out.println("1. Masukan teks");
            System.out.println("2. Hitung jumlah karakter");
            System.out.println("3. Hitung Jumalah kata");
            System.out.println("4. Cari kata dalam teks");
            System.out.println("5. Keluar");
            System.out.print("Masukan pilihan anda : ");
            pilih = input.nextInt();

            if (pilih == 1) {
                input.nextLine();
                System.out.print("Masukan Teks : ");
                kata[0] = input.nextLine();
                if (kata[0].isEmpty()) {
                    System.out.println("teks yang di masukan tidak boleh kosong");
                } else {
                    System.out.println("Teks telah di masukan!");
                }
            } else if(pilih == 2){
                System.out.println("Jumlah Karakter dalam teks : "+kata[0].length());
            } else if(pilih == 3){
                System.out.println("Jumlah kata dalam teks : "+kata[0].split("\\s+").length);
            } else if (pilih == 4){
                input.nextLine();
                int hitung = 0;
                System.out.print("Masukan kata yang ingin di cari : ");
                cari = input.nextLine().toLowerCase();
                String all = kata[0].toLowerCase();
                String[] words = all.split("\\s+");
                for (String word : words) {
                    if (word.equalsIgnoreCase(cari)) {
                        hitung++;
                    }
                }
                System.out.println("Kata \""+cari+"\" ditemukan sebanyak "+hitung);
            } else if (pilih == 5) {
                System.out.println("Terimakasih sudah menggunakan program ini");
            } else {
                System.out.println("Pilihan tidak tersedia ");
            }
        } while (pilih != 5);

        input.close();

    }
}