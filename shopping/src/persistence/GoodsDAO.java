package persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import static persistence.JDBCUtil.*;
import domain.GoodsVO;

public class GoodsDAO {
		
	public List<GoodsVO> getGoodsList(){
		List<GoodsVO> list = new ArrayList<GoodsVO>();
		
		String sql = "select num, category, name, price, amount, regdate from goodstbl where num > 0 order by num asc";
		
		ResultSet rs = null;
		try(Connection con = getConnection();
			PreparedStatement pstmt = con.prepareStatement(sql)) {
			
			rs = pstmt.executeQuery();
			
			
			while(rs.next()) {
				GoodsVO vo = new GoodsVO();
				vo.setNum(rs.getInt(1));
				vo.setCategory(rs.getString(2));
				vo.setName(rs.getString(3));
				vo.setPrice(rs.getInt(4));
				vo.setAmount(rs.getInt(5));
				vo.setRegdate(rs.getDate(6));
				
				list.add(vo);
			}
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(rs);
		}
		
		
		
		
		
		return list;
	}
	
	
	public int insertGoods(GoodsVO vo) {
		int result = 0;
		
		Connection con = null;
		PreparedStatement pstmt = null;
		String sql = "insert into goodstbl(num, category, name, price, color, amount, goodssize, content)  values(goods_seq.nextVal, ?, ? ,? ,? ,? ,? ,?)";
		
		
		try {
			con = getConnection();
			pstmt = con.prepareStatement(sql);
			
			pstmt.setString(1, vo.getCategory());
			pstmt.setString(2, vo.getName());
			pstmt.setInt(3, vo.getPrice());
			pstmt.setString(4, vo.getColor());
			pstmt.setInt(5, vo.getAmount());
			pstmt.setString(6, vo.getGoodssize());
			pstmt.setString(7, vo.getContent());
			
			result = pstmt.executeUpdate();
			
			if(result > 0) {
				commit(con);
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
			rollback(con);
		} finally {
			close(pstmt);
			close(con);
		}
		
		
		
		return result;
	}
	
	
	
	
	
	
}
