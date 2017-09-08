package sample.mybatis;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.io.IOException;
import java.io.InputStream;

@Configuration
@MapperScan("sample.mybatis.mapper")  // 设置 Mybatis Mapper 扫描路径
public class AppConfig {

    @Autowired
    private SqlSessionFactory sqlSessionFactory;

    @Bean
    public SqlSessionFactory getSqlSessionFactoryForSQLServer() throws IOException {
        String resource = "mybatis-config.xml";  // 从 XML 文件中获取 DataSource 数据
        InputStream inputStream = Resources.getResourceAsStream(resource);
        return new SqlSessionFactoryBuilder().build(inputStream);
    }

    @Bean
    public SqlSession getSqlSession() {
        return sqlSessionFactory.openSession();
    }
}
