package com.company;

public class Main {

    public static void main(String[] args) throws MyArraySizeException, MyArrayDataException {

//        String[][] testArray1 = new String[][]{
//                {"1","1","1","1"},
//                {"1","1","1","1"},
//                {"1","1","1","1"},
//                {"1","1","1","1"}
//        };
//        System.out.println(sumArrayElements(testArray1));

//        String[][] testArray2 = new String[][]{
//                {"1","1","1","1"},
//                {"1","1","1","1"},
//                {"1","1","1","1"}
//        };
//        System.out.println(sumArrayElements(testArray2));

//        String[][] testArray3 = new String[][]{
//                {"1","1","1"},
//                {"1","1","1","1"},
//                {"1","1","1","1"},
//                {"1","1","1","1"}
//        };
//        System.out.println(sumArrayElements(testArray3));

        String[][] testArray3 = new String[][]{
                {"1","1","1","f"},
                {"1","1","1","1"},
                {"1","1","1","1"},
                {"1","1","1","1"}
        };
        System.out.println(sumArrayElements(testArray3));

    }

    public static int sumArrayElements (String[][] inputArray) throws MyArraySizeException, MyArrayDataException {
        int sum = 0;

        if (inputArray.length != 4) {
            throw new MyArraySizeException("Массив неверного размера\nЧисло строк:" + inputArray.length +" (не равно 4)");
        }

        for (int i = 0; i < 4; i++) {
            if (inputArray[i].length != 4) {
                throw new MyArraySizeException("Массив неверного размера\nВ строке " + i + " число элементов: " + inputArray[i].length + " (не равно 4)");
            }
            for (int j = 0; j < 4; j++) {
                try {
                    sum += Integer.parseInt(inputArray[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Неверный формат элемента массива [" + i + "][" + j + "]");
                }
            }
        }
        return sum;
    }
}
