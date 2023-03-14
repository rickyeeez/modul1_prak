import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        int iAlas,iTinggi;
        double dAlas,dTinggi;

        Scanner input = new Scanner(System.in);

        System.out.println("======== HITUNG LUAS SEGITIGA===");
        System.out.println();
        System.out.println("1. Hasil to Integer");
        System.out.println("2. Hasil to Double");
        System.out.print("Masukkan pilihan 1 / 2 : ");
        int choose = input.nextInt();
        input.nextLine();
        if(choose==1){
            System.out.print("Masukkan Nilai Alas Dan Tinggi Secara Berurutan : ");
            String data = input.nextLine();
            String[] str = data.split(" ");
            Segitiga<Integer,Integer> intObj = new Segitiga<>(Integer.parseInt(str[0]),Integer.parseInt(str[1]));
            System.out.println("Luas Segitiga Dalam Integer : " + intObj.getResultAsInt());
        }

        if(choose==2){
            System.out.print("Masukkan Nilai Alas Dan Tinggi Secara Berurutan : ");
            String data = input.nextLine();
            String[] str = data.split(" ");
            Segitiga<Double,Double> doubleObj = new Segitiga<>(Double.parseDouble(str[0]),Double.parseDouble(str[1]));
            System.out.println("Luas Segitiga Dalam Integer : " + doubleObj.getResultAsDouble());
        }
    }
}
