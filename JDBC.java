import java.sql.*;

class DB {
    public static void main(String[] args) {
        try {
            Class.forName("oracle.jdbc.OracleDriver");

            Connection con = DriverManager.getConnection(
                "jdbc:oracle:thin:@localhost:1521:xe",
                "system",
                "password"
            );

            PreparedStatement ps = con.prepareStatement(
                "insert into emp values(?, ?)"
            );

            ps.setInt(1, 1);
            ps.setString(2, "Hemanth");

            ps.executeUpdate();

            System.out.println("Inserted!");

            con.close();

        } catch(Exception e) {
            System.out.println(e);
        }
    }
}