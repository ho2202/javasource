package member;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MemberDAO {
    private Connection con = null;
    private PreparedStatement pstnt = null;
    private ResultSet rs = null;

    static {
        try {
            // 드라이버 로드
            Class.forName("oracle.jdbc.OracleDriver");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Connection getConnection() {
        // 객체 생성
        String url = "jdbc:oracle:thin:@localhost:1521:xe";
        String user = "scott";
        String password = "tiger";
        try {
            con = DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return con;
    }

    public MemberDTO selectRow(String id) {
        String sql = "select * from member where id=?";
        MemberDTO dto = null;
        try {
            con = getConnection();
            pstnt = con.prepareStatement(sql);
            pstnt.setString(1, id);
            rs = pstnt.executeQuery();
            // 결과 옮기기
            if (rs.next()) {
                dto = new MemberDTO(rs.getInt(1), rs.getString("id"), rs.getString("name"), rs.getString("addr"),
                        rs.getString("email"), rs.getInt("age"), null);

                // dto.setAddr(rs.getString("addr"));
                // dto.setAge(rs.getInt("age"));
                // dto.setEmail(rs.getString("email"));
                // dto.setName(rs.getString("name"));
                // dto.setId(id);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            close(con, pstnt, rs);
        }
        return dto;
    }

    public List<MemberDTO> selectList(String name) {
        MemberDTO dto = null;
        List<MemberDTO> list = new ArrayList<>();
        try {
            con = getConnection();
            String sql = "select * from member where name like ?";
            pstnt = con.prepareStatement(sql);
            pstnt.setString(1, "%" + name + "%");
            rs = pstnt.executeQuery();
            // 결과 옮기기
            while (rs.next()) {
                dto = new MemberDTO(rs.getInt(1), rs.getString("id"), rs.getString("name"), rs.getString("addr"),
                        rs.getString("email"), rs.getInt("age"), null);
                list.add(dto);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            close(con, pstnt, rs);
        }
        return list;
    }

    public List<MemberDTO> getALL() {
        MemberDTO dto = null;
        List<MemberDTO> list = new ArrayList<>();
        try {
            con = getConnection();
            String sql = "select * from member";
            pstnt = con.prepareStatement(sql);
            rs = pstnt.executeQuery();
            // 결과 옮기기
            while (rs.next()) {
                dto = new MemberDTO(rs.getInt(1), rs.getString("id"), rs.getString("name"), rs.getString("addr"),
                        rs.getString("email"), rs.getInt("age"), null);
                list.add(dto);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            close(con, pstnt, rs);
        }
        return list;
    }

    public int insert(MemberDTO dto) {
        int result = 0;
        try {
            String sql = "insert into member(no, id, name, addr, email, age) values(member_seq.nextval,?,?,?,?,?)";
            con = getConnection();
            pstnt = con.prepareStatement(sql);
            pstnt.setString(1, dto.getId());
            pstnt.setString(2, dto.getName());
            pstnt.setString(3, dto.getAddr());
            pstnt.setString(4, dto.getEmail());
            pstnt.setInt(5, dto.getAge());
            result = pstnt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            close(con, pstnt);
        }
        return result;
    }

    public int update(MemberDTO dto) {
        int result = 0;
        try {
            con = getConnection();
            String sql = "update member ";
            if (dto.getAddr() != null) {
                sql = "set addr=? where id=?";
                pstnt = con.prepareStatement(sql);
                pstnt.setString(1, dto.getAddr());

            } else {
                sql += "set email=? where id=?";
                pstnt = con.prepareStatement(sql);
                pstnt.setString(1, dto.getEmail());
            }
            pstnt.setString(2, dto.getId());
            result = pstnt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            close(con, pstnt);
        }
        return result;
    }

    public int delete(String id) {
        int result = 0;
        try {
            con = getConnection();
            String sql = "delete from member where id =?";
            pstnt = con.prepareStatement(sql);
            pstnt.setString(1, id);
            result = pstnt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            close(con, pstnt);
        }
        return result;

    }

    public void close(Connection con, PreparedStatement pstnt) {
        try {
            pstnt.close();
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void close(Connection con, PreparedStatement pstnt, ResultSet rs) {
        try {
            rs.close();
            pstnt.close();
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
