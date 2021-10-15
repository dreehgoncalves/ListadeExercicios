package ex.estruturaderepeticao;

public class ExibirNum {
    public static void main(String[] args) {

        System.out.printf("um abaixo do outro\n");
        for (int a = 1; a <= 20; a++) {
            System.out.printf("%d\n", a);
        }

        System.out.printf("\num ao lado do outro\n");
        for (int a = 1; a <= 20; a++) {
            System.out.printf("%d ", a);
        }

    }
}
