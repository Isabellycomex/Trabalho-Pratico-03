import java.util.Scanner;

public class Hora {
    private int hora;
    private int min;
    private int seg;

    public Hora() {
        setHor();
        setMin();
        setSeg();
    }

    public Hora(int h, int m, int s) {
        setHor(h);
        setMin(m);
        setSeg(s);
    }

    public void setHor(int h) {
        if (h >= 0 && h < 24) {
            hora = h;
        } else {
            System.out.println("Hora inválida.");
            setHor();
        }
    }

    public void setMin(int m) {
        if (m >= 0 && m < 60) {
            min = m;
        } else {
            System.out.println("Minuto inválido.");
            setMin();
        }
    }

    public void setSeg(int s) {
        if (s >= 0 && s < 60) {
            seg = s;
        } else {
            System.out.println("Segundo inválido.");
            setSeg();
        }
    }

    public void setHor() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a hora: ");
        int h = sc.nextInt();
        setHor(h);
    }

    public void setMin() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o minuto: ");
        int m = sc.nextInt();
        setMin(m);
    }

    public void setSeg() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o segundo: ");
        int s = sc.nextInt();
        setSeg(s);
    }

    public int getHor() {
        return hora;
    }

    public int getMin() {
        return min;
    }

    public int getSeg() {
        return seg;
    }

    public String getHora1() {
        return String.format("%02d:%02d:%02d", hora, min, seg);
    }

    public String getHora2() {
        String ampm = (hora < 12) ? "AM" : "PM";
        int h = (hora < 12) ? hora : hora - 12;
        if (h == 0) {
            h = 12;
        }
        return String.format("%02d:%02d:%02d %s", h, min, seg, ampm);
    }

    public int getSegundos() {
        return hora * 3600 + min * 60 + seg;
    }

    public static void main(String[] args) {
        Hora h1 = new Hora(10, 45, 30);
        System.out.println(h1.getHora1());
        System.out.println(h1.getHora2());
        System.out.println(h1.getSegundos());

        Hora h2 = new Hora();
        System.out.println(h2.getHora1());
        System.out.println(h2.getHora2());
        System.out.println(h2.getSegundos());
    }
}
