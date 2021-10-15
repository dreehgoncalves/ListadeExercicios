package ex.estruturaderepeticao;

public class ExibirNumIpar {
    public static void main(String[] args) {

        for (int a = 1; a <= 50; a++) {

            if (a % 2 == 1) {
                System.out.printf("%d\n", a);
            }
        }

    }
}
