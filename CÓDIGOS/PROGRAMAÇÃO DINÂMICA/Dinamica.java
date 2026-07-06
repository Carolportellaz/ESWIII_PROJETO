import java.io.*;

public class Dinamica {

    public static void main(String[] args) throws IOException {

        int n, max = Integer.parseInt(args[0]);
        int d[] = new int[max + 1];
        int m[][] = new int[max][max];

        BufferedReader in =
                new BufferedReader(
                        new InputStreamReader(System.in));

        System.out.print("Numero de matrizes: ");
        n = Integer.parseInt(in.readLine());

        System.out.println("Dimensoes das matrizes:");
        for (int i = 0; i <= n; i++) {
            System.out.print("d[" + i + "] = ");
            d[i] = Integer.parseInt(in.readLine());
        }

        for (int i = 0; i < n; i++) {
            m[i][i] = 0;
        }

        for (int h = 1; h <= n - 1; h++) {
            for (int i = 1; i <= n - h; i++) {

                int j = i + h;

                m[i - 1][j - 1] = Integer.MAX_VALUE;

                for (int k = i; k < j; k++) {

                    int temp =
                            m[i - 1][k - 1]
                            + m[k][j - 1]
                            + d[i - 1] * d[k] * d[j];

                    if (temp < m[i - 1][j - 1]) {
                        m[i - 1][j - 1] = temp;
                    }
                }

                System.out.print(
                        "m[" + i + "][" + j + "] = "
                                + m[i - 1][j - 1]
                );
            }

            System.out.println();
        }
    }
}