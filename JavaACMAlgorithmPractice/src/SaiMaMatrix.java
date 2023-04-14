import java.io.*;
import java.util.*;

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
