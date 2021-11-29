package cn.luoyudi;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidDataSourceFactory;
import com.alibaba.druid.pool.DruidPooledConnection;
import org.junit.Test;

import javax.sql.DataSource;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

public class DateSourceTest {
    @Test
    public void DruidTest() throws SQLException {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/db1");
        dataSource.setUsername("root");
        dataSource.setPassword("mysql");
        DruidPooledConnection connection = dataSource.getConnection();
        System.out.println(connection);
    }

    @Test
    public void DruidTest2() throws Exception {

        Properties pro = new Properties();
        //使用ClassLoader加载配置文件，获取字节输入流
        InputStream is = DateSourceTest.class.getClassLoader().getResourceAsStream("jdbc.properties");
        pro.load(is);
        DataSource ds = DruidDataSourceFactory.createDataSource(pro);
        Connection connection = ds.getConnection();
        System.out.println(connection);
    }
}
