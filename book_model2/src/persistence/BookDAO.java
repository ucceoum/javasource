package persistence;
import static persistence.JDBCUtil.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import domain.BookVO;


public class BookDAO {
	
	
	//insert
	public int book_insert(BookVO vo) {
		int result = 0;
		
		String sql = "insert into book(code, title, writer, price) values(?, ?, ?, ?)";
		try (Connection con = getConnection();
			 PreparedStatement pstmt = con.prepareStatement(sql)) {
			
			pstmt.setString(1, vo.getCode());
			pstmt.setString(2, vo.getTitle());
			pstmt.setString(3, vo.getWriter());
			pstmt.setInt(4, vo.getPrice());
			
			result = pstmt.executeUpdate();	
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
	 
	
	
	//전체목록 조회
	
	public ArrayList<BookVO> getList(){
		
		String sql = "select * from book";
		ArrayList<BookVO> list = new ArrayList<BookVO>();
		try(Connection con = getConnection();
			PreparedStatement pstmt = con.prepareStatement(sql)){
			
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				BookVO vo = new BookVO(rs.getString(1),rs.getString(2),rs.getString(3),rs.getInt(4));
				list.add(vo);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	
	
	
	//도서목록삭제
	public int book_delete(String code) {
		int result = 0;
		String sql = "delete from book where code=?";
		try(Connection con = getConnection();
			PreparedStatement pstmt = con.prepareStatement(sql)) {
			
			pstmt.setString(1, code);
			result = pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
	
	
	public int book_update(String code, int price) {
		int result = 0;
		
		String sql = "update book set price=? where code=?";
		try(Connection con = getConnection();
			PreparedStatement pstmt = con.prepareStatement(sql)	) {
			
			pstmt.setInt(1, price);
			pstmt.setString(2, code);
			
			result = pstmt.executeUpdate();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		return result;
	}
	
	
	
	
	//도서 검색
	
	public ArrayList<BookVO> searchAll(String criteria, String keyword ){
		ArrayList<BookVO> list = new ArrayList<BookVO>();
		
		String sql = "select * from book where "+criteria+" = ?";
		
		try(Connection con = getConnection();
			PreparedStatement pstmt = con.prepareStatement(sql)) {
			pstmt.setString(1, keyword);
			ResultSet rs = pstmt.executeQuery();
			
			
			while(rs.next()) {
				BookVO vo = new BookVO();
				
				vo.setCode(rs.getString(1));
				vo.setTitle(rs.getString(2));
				vo.setWriter(rs.getString(3));
				vo.setPrice(rs.getInt(4));
				list.add(vo);
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
}
