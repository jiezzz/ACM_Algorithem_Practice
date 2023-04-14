import java.io.*;
import java.util.*;
/*
【输入】读取未给出行列数的矩阵
时间限制： 3000MS
内存限制： 589824KB
题目描述：
【输入问题】在考试时，有些时候没有给出数据的行数n，对于矩阵，可能行数n和列数m都未给出，本题就是为了训练这类题目的输入。
（做题前可以先阅读：https://labfiles.acmcoder.com/ojhtml/index.html#/?id=%e6%b2%a1%e6%9c%89%e7%bb%99%e5%87%ba%e7%9f%a9%e9%98%b5%e7%9a%84%e8%a1%8c%e5%88%97%e6%95%b0）
对于给定的一个二维矩阵，请转置后进行输出。
对于一个n*m的矩阵，输入有n行，每行是m个以空格分隔的数字。
n*m矩阵的转置矩阵。输出m行，每行是n个空格分隔的数据。
样例输入
1 2 3
4 5 6

样例输出
1 4
2 5
3 6
* * * * * * * */
class Solution {
    public void myFunc(ArrayList<ArrayList<Integer>> arr) {
        // 使用自测数据按钮时调试用，正式提交时要删掉。
        int n = arr.size();
        int m = arr.get(0).size();
        for(int j = 0; j < m; j++){
            for(int i = 0; i < n; i++) {
                System.out.print(arr.get(i).get(j));
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}

public class SaiMaMatrix {
    public static void main(String args[])
    {
        Scanner cin = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> arr = new ArrayList<ArrayList<Integer>>();
        while(cin.hasNextLine())
        {
            ArrayList<Integer> row = new ArrayList<Integer>();
            String line = cin.nextLine();
            if (line.length() > 0) {
                String[] arrLine = line.split(" ");
                for (int i=0; i<arrLine.length; i++) {
                    row.add(Integer.parseInt(arrLine[i]));
                }
                arr.add(row);
            }
        }

        new Solution().myFunc(arr);
    }
}
