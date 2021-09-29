package ia91.suyusanova;

public class Lab2 {
    public static void main(String[] args) {
        int zalicova = 9126;

        int z = zalicova % 5; //1
        int q = zalicova % 7; //5
        int x = zalicova % 11; //7

        System.out.println("С5 = " + z);
        System.out.println("С7 = " + q);
        System.out.println("С11 = " + x);
        System.out.println();

        //Используем тип данных char для элементов матрицы.
        char[][] matrix = {{'2', '5', '8', '1'}, {'1', '7', '3', '4'}, {'3', '9', '5', '2'}};
        char[][] A = new char[4][3];

        System.out.println("Изначальная матрица: ");
        for (int i = 0; i < matrix.length; i++) {  //идём по строкам
            for (int j = 0; j < matrix[i].length; j++) {//идём по столбцам
                System.out.print(" " + matrix[i][j] + " "); //вывод элемента
            }
            System.out.println();//перенос строки ради визуального сохранения табличной формы
        }

        //First task
        //Значения новой матрицы заполняются значениями из старой матрицы. Содержимое ячейки [i][j] записывается в ячейку [j][i]
        System.out.println("Транспонированная матрица: ");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                A[i][j] = matrix[j][i];
            }
        }
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(" " + A[i][j] + " ");
            }
            System.out.println();
        }

        //Second task
        int sum1 = 0;
        int sum2 = 0;

        for (int j = 0; j < matrix.length; j += 2) {
            char max = A[0][j];
            for (int i = 1; i < matrix.length; i++) {
                if (A[i][j] > max) {
                    max = A[i][j];
                }
            }
            sum1 += Character.getNumericValue(max);
        }

        for (int j = 1; j < matrix.length; j += 2) {
            char min = A[0][j];
            for (int i = 1; i < matrix.length; i++) {
                if (A[i][j] < min)
                    min = A[i][j];
            }
            sum2 += Character.getNumericValue(min);
        }

        System.out.println();
        System.out.println("Сумма наибольших элементов в столбцах матрицы с непарными номерами: " + sum1);
        System.out.println("Сумма наименьших элементов в столбцах матрицы с парными номерами: " + sum2);
    }
}
