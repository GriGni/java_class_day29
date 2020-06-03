package org.comstudy21.peopleDto;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import org.comstudy21.peopleDao.PeopleDto;
import org.comstudy21.sqlconn.jdbc_test;

public class PeopleDao {
	
	private ArrayList<PeopleDto> selectAll() {
		ArrayList<PeopleDto> list = new ArrayList<PeopleDto>();
		// getConnection을 위해 jdbc접속을 위해 통로 개통.
		Connection conn = jdbc_test.getConnection(); 
		String sql = "select * from member";
		ResultSet rs = null;
		Statement stmt = null;
		
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				String code = rs.getString("CODE");
				String name = rs.getString("NAME");
				String id = rs.getString("ID");
				String password = rs.getString("PWD");
				int age = rs.getInt("AGE");
				list.add(new PeopleDto(code, name, id, password, age));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			jdbc_test.close(rs);
			jdbc_test.close(stmt);
			jdbc_test.close(conn);
		}
		
		jdbc_test.close(conn);
		return list;
	}
	
	public static void main(String[] args) {
		PeopleDao dao = new PeopleDao();
		//어레이 리스트에 피플 디티오 리스트는 dao안에 메서드 selectALl이다.
		ArrayList<PeopleDto> list = dao.selectAll();
		
		for(PeopleDto dto : list) {
			System.out.println(dto);
		}
		
	}
}
