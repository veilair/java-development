import java.sql.*;

public class JDBC{
        public static MySQL(){
                // Log in information
                String driver = "com.mysql.jdbc.Driver";
                String url = "jdbc:mysql://127.0.0.1:3306/mysql";
                String user = "root";
                String password = "";

                try{
                        // Building connections...
                        Class.forName(driver);
                        Connection conn = DriverManager.getConnection(url, user, password);
                        if (!conn.isClosed()) System.out.println("Succeeded connecting to the Database!");

                        Statement statement = conn.createStatement();
                        String sql = "select * from db limit 10 ";
                        ResultSet rs = statement.executeQuery(sql);
                        while (rs.next()){
                                String name = rs.getString("Host");
                                System.out.println(rs.getString("DB") + "\t" + name);
                        }
                        rs.close();
                        conn.close();
                }catch(ClassNotFoundException e){
                        System.out.println("Sorry,can`t find the Driver!");
                        e.printStackTrace();
                }catch(SQLException e){
                        e.printStackTrace();
                }catch(Exception e){
                        e.printStackTrace();
                }
        }

        public static JavaDB(){
                // Log in information
                String driver="org.apache.derby.jdbc.ClientDriver";
                String url="jdbc:derby://localhost:1527/sample";
                String user="app";
                String passwd="app";

                try{
                        Class.forName(driver);
                        Connection conn = DriverManager.getConnection(url, user, passwd);
                        if (!conn.isClosed()) System.out.println("Succeeded connecting to the Database!");

                        Statement stat = conn.createStatement();
                        ResultSet rs = stat.executeQuery("select * from CUSTOMER");
                        while (rs.next()) {
                                System.out.println("name = " + rs.getString("NAME"));
                                System.out.println("email = " + rs.getString("EMAIL"));
                        }
                        rs.close();
                        conn.close();
                } catch(ClassNotFoundException e) {
                        System.out.println("Sorry,can`t find the Driver!");
                        e.printStackTrace();
                } catch(SQLException e) {
                        e.printStackTrace();
                } catch(Exception e) {
                        e.printStackTrace();
        }


        public static SQLServer(){
                String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
                String url = "jdbc:sqlserver://localhost:1433;DatabaseName=TestDB;user=sa;password=xxxxxxxx";

                try{
                        Class.forName(driver);
                        Connection conn = DriverManager.getConnection(url);
                        if (!conn.isClosed()) System.out.println("Succeeded connecting to the Database!");

                        Statement statement = conn.createStatement();
                        String sql = "select * from Book";
                        ResultSet rs = statement.executeQuery(sql);

                        while (rs.next()) {
                                String name = rs.getString("ISBN");
                                System.out.println(rs.getString(2) + "\t" + name);
                        }
                        rs.close();
                        conn.close();
                } catch(ClassNotFoundException e) {
                        System.out.println("Sorry,can`t find the Driver!");
                        e.printStackTrace();
                } catch(SQLException e) {
                        e.printStackTrace();
                } catch(Exception e) {
                        e.printStackTrace();
                }
        }

        public static Sqlite(){
                String driver="org.sqlite.JDBC";
                String url="jdbc:sqlite:d:/test3.db";

                Class.forName(driver);
                Connection conn = DriverManager.getConnection(url);
                Statement stat = conn.createStatement();

                // Updates
                stat.executeUpdate("create table if not exists people (id char(10), name char(20), age int, gender bit ) ;");
                stat.executeUpdate("insert into people values ('001', 'Tom', 18, 1);");
                stat.executeUpdate("insert into people values ('002', 'Marry', 20, 0);");
                stat.executeUpdate("insert into people values ('003', 'Peter', 25, 1);");
                stat.executeUpdate("update people set age=age+1 whre id='003';");
                conn.commit();

                // Query
                String sql = "select * from people;";
                ResultSet rs = stat.executeQuery(sql);
                while (rs.next()) {
                        String name = rs.getString("name");
                        int age = rs.getString("age");
                        boolean gender = rs.getBoolean(4);
                        System.out.printf("name = %s; occupation = %s\n", name, occupation);
                }

                rs.close();
                conn.close();
        }
}

