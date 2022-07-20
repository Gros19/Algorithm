package Dstructure;

import java.io.*;

public class ArrayEqual {
    public static boolean equals(int[] a, int[] b) {
        int asize = a.length;
        // 다르다면
        if (asize != b.length) {
            return false;
        }
        // 같다면
        else {
            for (int i = 0; i < asize; i++) {
                if (a[i] == b[i]) {
                    continue;
                }
                // 특정 요소 하나라도 다르면
                else {
                    return false;
                }
            }
        }
        // 모든 요소가 같으면
        return true;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        System.out.println("arr A Len :");
        int na = Integer.parseInt(br.readLine());
        int[] ia = new int[na];
        System.out.println("arr A :");
        String[] a = br.readLine().split(" ");

        for(int i = 0; i < na; i++){
            ia[i] = Integer.parseInt(a[i]);
        }


        System.out.println("arr B Len :");
        int nb = Integer.parseInt(br.readLine());
        int[] ib = new int[nb];
        System.out.println("arr B :");
        String[] b = br.readLine().split(" ");

        for(int i = 0; i < nb; i++){
            ib[i] = Integer.parseInt(b[i]);
        }

        if (equals(ia, ib)) {
            System.out.println("같은 배열입니다.");
        } else {
            System.out.println("서로 다른 배열입니다.");
        }
    }
}
