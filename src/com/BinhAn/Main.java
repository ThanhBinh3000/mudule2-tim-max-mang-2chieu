package com.BinhAn;

public class Main {

    public static void main(String[] args) {
	int [][] newArray=createArray(4,3);
    print2Array(newArray);
    int max=MaximumArray(newArray);
    System.out.println("giá trị lớn nhất mảng hai chiều phái trên là: "+max);
    }
    public static int[][] createArray(int Rowlength,int Columlength){
        int[][] Arr = new int[Rowlength][Columlength];
        for (int row = 0;row<Rowlength;row++){
            for (int colum=0; colum<Columlength;colum++){
                Arr[row][colum]= (int) (Math.random()*1000);
            }
        }
        return Arr;
    }
    public static void print2Array(int[][] arr){
        for (int row = 0; row<arr.length;row++){
            for (int colum=0;colum<arr[row].length;colum++){
                System.out.print(arr[row][colum]+" ");
            }
            System.out.print("\n");
        }
    }
    public static int MaximumArray(int[][] arr){
        int maximum= arr[0][0];
        for (int row=0; row<arr.length;row++){
            for (int colum=0;colum<arr[row].length;colum++){
                if (arr[row][colum]>maximum){
                    maximum=arr[row][colum];
                }
            }
        }
        return maximum;
    }
}
