import scalikejdbc.ConnectionPool

trait Connection {
  Class.forName("com.mysql.jdbc.Driver").newInstance()
  ConnectionPool.add('sys, "jdbc:mysql://192.168.99.100/sys", "root", "")
}
