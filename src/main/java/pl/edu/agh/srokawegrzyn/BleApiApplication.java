package pl.edu.agh.srokawegrzyn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;
import java.net.URI;
import java.net.URISyntaxException;

@SpringBootApplication
public class BleApiApplication {

//    @Bean
//    public DataSource postgresDataSource() {
//        String databaseUrl = System.getenv("DATABASE_URL");
//
//        URI dbUri;
//        try {
//            dbUri = new URI(databaseUrl);
//        }
//        catch (URISyntaxException e) {
//            return null;
//        }
//
//        String username = dbUri.getUserInfo().split(":")[0];
//        String password = dbUri.getUserInfo().split(":")[1];
//        String dbUrl = "jdbc:postgresql://" + dbUri.getHost() + ':'
//                + dbUri.getPort() + dbUri.getPath();
//
//        org.apache.tomcat.jdbc.pool.DataSource dataSource
//                = new org.apache.tomcat.jdbc.pool.DataSource();
//        dataSource.setDriverClassName("org.postgresql.Driver");
//        dataSource.setUrl(dbUrl);
//        dataSource.setUsername(username);
//        dataSource.setPassword(password);
//        dataSource.setTestOnBorrow(true);
//        dataSource.setTestWhileIdle(true);
//        dataSource.setTestOnReturn(true);
//        dataSource.setValidationQuery("SELECT 1");
//        return dataSource;
//    }

    public static void main(String[] args) {
		SpringApplication.run(BleApiApplication.class, args);
	}
}
