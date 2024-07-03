package day13_0703_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JDBC_03 {
	private static void printData(ResultSet rs) throws SQLException {
			while (rs.next()) {
				System.out.print(rs.getString("STU_NAME"));
				System.out.print("\t|\t" + rs.getString("STU_NO"));
				System.out.println("\t|\t" + rs.getString("STU_DEPT"));
			}
		}

	public static void main(String[] args) {
		
		Connection conn;
		Statement stmt = null;
		Scanner scan = new Scanner(System.in);
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver"); 
			String db_url = "jdbc:oracle:thin:@localhost:1521:xe";
			String db_id = "SYSTEM";
			String db_pw = "test1234";
			conn = DriverManager.getConnection(db_url, db_id, db_pw);
			stmt = conn.createStatement();
			
			// 학번 입력후 해당 데이터 삭제
			while (true) {
				System.out.print("학번을 입력하세요 >> ");
				int stuNum = scan.nextInt();
				ResultSet rs 
				= stmt.executeQuery("DELETE FROM STUDENT WHERE STU_NO = " + stuNum);
				if (!rs.next()) {
					System.out.println("삭제되었습니다.");
					break;
				} else {
					System.out.println("해당 학번이 존재하지 않습니다. 다시 입력해주세요.");
					continue;
				}
			}
			
		} catch (ClassNotFoundException e) {
			System.out.println("JDBC 드라이버 로드 오류");
		} catch (SQLException e) {
			System.out.println("DB 연결 오류");
		}
		scan.close();
	}
}
