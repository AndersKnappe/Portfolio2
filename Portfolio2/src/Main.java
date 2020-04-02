import java.sql.*; //from jdbc
import java.util.Scanner;

import static java.sql.DriverManager.*;

public class Main {

    public static void main(String[] args){
        Connection conn = null;
        try{
            String url = "jdbc:sqlite:C:/Users/Tunis/IdeaProjects/Portfolio2/src/Students.db";
            conn = getConnection(url);
            Statement stmt = conn.createStatement();

            String sql;
            sql = "SELECT * FROM Students";

            ResultSet rs = stmt.executeQuery(sql);

            Scanner scanner = new Scanner(System.in);

            System.out.println("Choose average grade for a semester and course");
            String AverageGradeSD2019 = scanner.nextLine();

            sql = "SELECT * FROM Semester_SD WHERE Grade="+AverageGradeSD2019;










        } catch (SQLException e){
            e.printStackTrace();
        } finally {
            if(conn != null){
                try {
                    conn.close();
                } catch (SQLException e){
                    e.printStackTrace();
                }
            }
        }


    }

}
