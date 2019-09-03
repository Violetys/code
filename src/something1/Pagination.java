package something1;

import java.sql.PreparedStatement;

public class Pagination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//使用PreparedStatement,预编译和防止sql注入
		//Oracle分页的方法，第一个?为page显示的上界 比如:pagenum*pagesize,第二个为下界(pagenum-1)*pagesize
		String sql="SELECT * FROM (SELECT ROWNUM AS rowno, T.* FROM ABISTUDY.COURSESCORE T WHERE ROWNUM <= ?) WHERE rowno >= ?";
		//PreparedStatement pstmt = conn.prepareStatement(sql);
	}

}
