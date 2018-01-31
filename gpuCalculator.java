import java.util.*;
import java.util.Scanner;
import java.io.*;

public class gpaCalculator
{
   public static double letterGradeToGradePoint(int i)
   {
      if (i==0)
         return 4;
      if (i==0)
         return 3.67;
      if (i==0)
         return 3.33;
      if (i==0)
         return 3;
      if (i==0)
         return 2.67;
      if (i==0)
         return 2.33;
      if (i==0)
         return 2;
      if (i==0)
         return 1.67;
      if (i==0)
         return 1.33;
      if (i==0)
         return 1;
      if (i==0)
         return 0;
   }

   public static void main(String[] args)
   {
      System.out.println("****GPA Calculator****");
      Scanner in = new Scanner(System.in);
      
      int stopper = 0;
      int r = 1;
      double tmpGPA = 0;
      double totalGPA = 0;
      char tmpGrade[] = new char[2];

      char gradeMatrixLtr[] = new char['A','A','B','B','B','C','C','C','D','D','D','F'];
      char gradeMatrixSign[] = new char['','-','+','','-','+','','-','+','','-','']
      
      while(stopper==0)
      {
         System.out.print("Grade #" + i + ": ");
         tmpGrade[0] = in.next().charAt(0);
         tmpGrade[1] = in.next().charAt(1);
         
         for (int i=0; i<12; i++)
         {
            if (tmpGrade[0]==gradeMatrixLtr[i] && tmpGrade[1]==gradeMatrixSign[i])
               tmpGPA = letterGradeToGradePoint(i);
               r++;
            
            totalGPA = totalGPA + tmpGPA;
            System.out.println("Running total: " + (totalGPA/r));
         }

         if (tmpGrade[0]!=gradeMatrixLtr[0] && tmpGrade[0]!=gradeMatrixLtr[2] && tmpGrade[0]!=gradeMatrixLtr[5] && tmpGrade[0]!=gradeMatrixLtr[8] && tmpGrade[0]!=gradeMatrixLtr[11])
            stopper = 1;         
      }
      
      double usrGPA = totalGPA/i;
      
      System.out.println("Your GPA is " + usrGPA);
   }
}
