package day13_0703_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import javax.management.Query;

public class JDBC_02 {
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
			// 'student' 테이블에 / 이름 : 홍길동 / 학번 : 12345678 / 새로 삽입
			// 쿼리(sql) ver
			// INSERT INTO STUDENT (STU_NO, STU_NAME)
			// VALUES (12345678, '홍길동');
//			String query = "INSERT INTO STUDENT(STU_NO, STU_NAME) VALUES(12348765, '홍길준')";
//			stmt.executeUpdate(query);
			
			
			System.out.print("이름을 입력하세요 >> ");
			String name = scan.next();

			while (true) {
				System.out.print("학번을 입력하세요 >> ");
				int num = scan.nextInt();
				ResultSet rs 
				= stmt.executeQuery("SELECT * FROM STUDENT WHERE STU_NO = " + num);
				if (rs.next()) {
					System.out.println("이미 등록된 학번입니다. 다시 입력해주세요.");
				} else {
					String query 
					= "INSERT INTO STUDENT(STU_NO, STU_NAME) VALUES(" + num + ", '" + name + "')";
					stmt.executeUpdate(query);
					break;
				}
			}
			System.out.println("가입되었습니다!");
//			ResultSet rs 
//			= stmt.executeQuery("SELECT * FROM STUDENT");
//			printData(rs);
			
		} catch (ClassNotFoundException e) {
			System.out.println("JDBC 드라이버 로드 오류");
		} catch (SQLException e) {
			System.out.println("DB 연결 오류");
		}
		scan.close();
	}
}
