import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    

    public static List<Integer> gradingStudents(List<Integer> grades) {
        ArrayList<Integer> al =new ArrayList<>();
        for(int i=0; i<grades.size(); i++)
        {
            int marks =grades.get(i);
            if(marks<38){
                 al.add(marks);
                
            }
           else{
               int multiple = (marks/5)+1;
               int mulOf5 = multiple*5;
               int diff  = mulOf5-marks;
               
               if (diff<3){
                   al.add(mulOf5);
               }
               else{
                   al.add(marks);
               }
           }
        }
        return al;
    }
}   

 public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int gradesCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> grades = new ArrayList<>();

        for (int i = 0; i < gradesCount; i++) {
            int gradesItem = Integer.parseInt(bufferedReader.readLine().trim());
            grades.add(gradesItem);
        }

        List<Integer> result = Result.gradingStudents(grades);

        for (int i = 0; i < result.size(); i++) {
            bufferedWriter.write(String.valueOf(result.get(i)));

            if (i != result.size() - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
