import java.util.Scanner;

public class TesteHora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h, m, s;
        System.out.print("Digite a hora: ");
        h = sc.nextInt();
        System.out.print("Digite os minutos: ");
        m = sc.nextInt();
        System.out.print("Digite os segundos: ");
        s = sc.nextInt();
        Hora hora1 = new Hora(h, m, s);
        System.out.println("Hora1: " + hora1.getHora1());
        System.out.println("Hora2: " + hora1.getHora2());
        System.out.println("Segundos: " + hora1.getSegundos());

        System.out.print("\nDigite a hora novamente: ");
        hora1.setHor(sc.nextInt());
        System.out.print("Digite os minutos novamente: ");
        hora1.setMin(sc.nextInt());
        System.out.print("Digite os segundos novamente: ");
        hora1.setSeg(sc.nextInt());
        System.out.println("Hora1 atualizada: " + hora1.getHora1());
        System.out.println("Hora2 atualizada: " + hora1.getHora2());
        System.out.println("Segundos atualizados: " + hora1.getSegundos());

        Hora hora2 = new Hora();
        hora2.setHor();
        hora2.setMin();
        hora2.setSeg();
        System.out.println("\nHora2: " + hora2.getHora1());
        System.out.println("Segundos: " + hora2.getSegundos());
    }
}
