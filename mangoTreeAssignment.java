package com.tw;
import java.util.Scanner;
public class CheckMangoTree {

    public static boolean isMangoTree(int rows, int cols, int tree_num){

        if(tree_num<=cols || tree_num%cols==1 || tree_num%cols==0)
            return true;
        else
            return false;
        
    }

    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter number of rows");
        int rows= sc.nextInt();
        System.out.println("Enter number of columns");
        int cols= sc.nextInt();
        System.out.println("Enter number of tree you want to check");
        int tree_num= sc.nextInt();

        if(rows<0 ||  cols<0 || tree_num<0){
            System.out.println("Invalid input");
        }

        if(isMangoTree(rows, cols, tree_num)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
