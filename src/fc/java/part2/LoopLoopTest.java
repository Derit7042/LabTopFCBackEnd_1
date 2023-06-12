package fc.java.part2;

public class LoopLoopTest {
    public static void main(String[] args) {
        int index = 1;
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                System.out.println(index);
                index++;
            } // _j
        } // _i

        int[][] a = {
                {1, 2, 3, 4, 5},
                {5, 4, 3, 2, 1}
        };

        for(int i = 0; i < a.length; i++){     //i<2 대신 i<a.length 도 가능
            for(int j = 0; j < a[1].length; j++){    // j<5 대신 j<a[i].length 도 가능
                System.out.print(a[i][j] + "\t");
            }
            System.out.println(); // 줄바꿈
        }

        // 구구단 과제
        // Q. 이중 반복문을 이용하여 아래와 같은 구구단(9X9)을 출력하세요.

        for(int i = 2; i <= 9; i++){
            System.out.print(i + "단" + "\t\t");
        }

        System.out.println();

        for (int i = 1; i < 10; i++){
            for(int j = 2; j < 10; j++){
                System.out.print(j + "X" + i + "=" + j*i + "\t");
            }
            System.out.println();
        }

    }
}
