/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee;

import java.io.BufferedReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author yangkunying
 */
public class EmployeeService {

    /**
     *
     * @param CSVFile
     * @return
     * @throws java.io.FileNotFoundException
     */
    public List<Employee> getDataFrom(String CSVFile) throws FileNotFoundException, IOException {
        List<Employee> data = new ArrayList<>();
        //  CSVFile = "C:\\Users\\yangkunying\\Desktop\\EMPLOYEEx.csv";

        //System.out.println(f.exists());
        FileReader fr = new FileReader(CSVFile);
        BufferedReader br = new BufferedReader(fr);

        String line;
        String[] emp;
        for (; (line = br.readLine()) != null;) {
            emp = line.split(",");
            Employee tmp = new Employee();
            tmp.seteSex(emp[2]);
            tmp.seteName(emp[1]);
            tmp.setePos(emp[3]);
            tmp.seteEntrydate(emp[4]);
            data.add(tmp);
            //System.out.println(model);
        }

        return data;
    }

    /**
     * EmployeeデータをDB一括登録
     *
     * @param datas 社員リスト
     * @return 結果
     * @throws java.sql.SQLException
     * @throws java.lang.ClassNotFoundException
     */
    public boolean saveToDB(List<Employee> datas) throws SQLException, ClassNotFoundException {
        Class.forName("org.postgresql.Driver");
        Connection connection = DriverManager.getConnection(
                "jdbc:postgresql://192.168.1.23:2408/sample_test",
                "postgres",
                "postgres");

        //Statement stmt = connection.createStatement();
        //Loop
         String[] a = new String[5];
        String sql = null;
        PreparedStatement pstmt = connection.prepareStatement(sql);
        for(Employee e : datas){
            a[1] = e.eName;
            a[2] = e.eSex;
            a[3] = e.ePos;
            a[4] = e.eEntrydate;
//             sql = "insert into EMPLOYEE" + "VALUES('a[1]', 'a[2]','a[3]','a[4]')";
             pstmt.setString(1, a[1]);
             pstmt.setString(2, a[2]);
             pstmt.setString(3, a[3]);
             pstmt.setString(4, a[4]);
             pstmt.executeQuery();
        }
        
//       sql = "CREATE TABLE EMPLOYEE "
//                + "(ID INT PRIMARY KEY     NOT NULL,"
//                + " NAME           TEXT    NOT NULL, "
//                + " SEX           INT     NOT NULL, "
//                + " POS        CHAR(50), "
//                + " ENTRYDATE         REAL)";
        //stmt.executeUpdate(sql);
//        sql
//                = "insert into EMPLOYEE (eName, eSex, ePos, eEntrydate) "
//                + "values ('石井', '1', 'HR', '2010-09-21')";
//        int count = stmt.executeUpdate(sql);
//        System.out.println("insert文を実行しました...");
//        System.out.println(" 行数: " + count);
       // stmt.close();
        connection.close();

        
        
        return false;
    }

    /**
     * Employeeを追加する<br>
     * 追加成功の場合TRUE,名前重複の場合、追加失敗、falseを返却する
     *
     * @param eName 名前
     * @param eSex 性別
     * @param ePos 職位
     * @return 追加結果
     */
    public static boolean addEmployee(
            String eName,
            String eSex,
            String ePos) {
        if (eName.isEmpty()) {
            System.out.println("名前を入力してください");
        } else if (eName.contentEquals(eName)) {
            System.out.println("名前が存在してます");
        } else {
            System.out.println("追加成功");
            return true;

        }
        return false;

    }

    /**
     * 指定された社員ID紐付くデータを削除
     *
     * @param eId 社員ID
     * @return 削除結果
     * @throws java.io.IOException
     */
    public static boolean removeEmployee(String eId) throws IOException {
        EmployeeService es = new EmployeeService();
        es.getDataFrom(eId).remove(eId);

        return false;
    }

}
