
\\Exercício 01
\\Crie a classe Hora conforme especificado abaixo:
\\Hora
\\- hora: int
\\- min: int
\\- seg: int
\\+ Hora()
\\+ Hora(int h, int m, int s)
\\+ setHor(int h)
\\+ setMin(int m)
\\+ setSeg(int s)
\\+ setHor()
\\+ setMin()
\\+ setSeg()
\\+ getHor(): int
\\+ getMin(): int
\\+ getSeg(): int
\\+ getHora1(): String
\\+ getHora2(): String
\\+ getSegundos(): int

\\ O construtor Hora() deve permitir ao usuário digitar os valores de hora, minuto e
\\segundos e com eles inicializar os atributos da classe. Os valores digitados deverão ser
\\consistidos e só aceitos se válidos, caso contrário, exigir ao usuário redigitar;
\\ O construtor Hora(int h, int m, int s) deverá receber os valores de hora, minuto e
\\segundos e com eles inicializa as propriedades da classe;
\\ Os métodos setHor(int h), setMin(int m) e setSeg(int s) devem receber um valor e
\\atribuí-lo ao respectivo atributo;
\\ Os métodos setHor(), setMin() e setSeg() devem permitir que o usuário digite um
\\valor e atribuí-lo ao respectivo atributo. Os valores digitados deverão ser consistidos e
\\só aceitos se válidos, caso contrário, exigir ao usuário redigitar;
\\ Os métodos getHor(), getMin() e getSeg() devem devolver as respectivas
\\propriedades;
\\ O método getHora1() deve nos devolver a hora no formato: hh:mm:ss;
\\ O método getHora2() deve nos devolver a hora no formato: hh:mm:ss (AM/PM);
\\ O método getSegundos() deve nos devolver a quantidade de segundos expressa na
\\hora em questão, (exemplo: 01:00:01 = 3601 segundos) .
\\ Conveniente colocar tratamento de exceção para as possíveis inconsistências na
\\entrada de dados. 
        \\ Isabelly Barbosa Gonçalves
        \\Angelica Alves Andrade

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
