package Percabangan;

public class IfElse {
    public static void main(String[] args) {
        double totalBelanja = 120000;
        double uangDiDompet = 80000;

        if(uangDiDompet<totalBelanja){
            System.out.println("uang kamu kurang, belanja yang penting saja");
        }else if(uangDiDompet>totalBelanja) {
            double kembalian = uangDiDompet - totalBelanja;
            System.out.println("uang kamu bisa buat belanja, kembalian : " + kembalian);
        }else{
            System.out.println("uang kamu pas...yeyeyeyey");
        }
    }
}
