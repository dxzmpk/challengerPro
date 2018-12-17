package tk.mybatis.simple.mapper;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import tk.mybatis.simple.model.Country;

import javax.annotation.Resource;
import java.io.IOException;
import java.io.Reader;
import java.util.List;

public class CountryMapperTest {

    private static SqlSessionFactory sqlSessionFactory;

    @BeforeClass
    public static void init(){
        try{
            Reader reader = Resources.getResourceAsReader("mybatis-config.xml");
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
            reader.close();
        } catch (IOException ignore){
            ignore.printStackTrace();
        }
    }

    @Test
    public void testSelectAll(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        try{
            List<Country> countryList = sqlSession.selectList("selectAll");
            printCountryList(countryList);
        } finally {
            sqlSession.close();
        }
    }

    @Test
    public void testSelectOneById(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        try{
            List<Country> countryList = sqlSession.selectList("selectOneById");
            printCountryList(countryList);
        } finally {
            sqlSession.close();
        }
    }

    private void printCountryList(List<Country> countryList){
        for(Country country : countryList){
            System.out.println(country.toString());
        }
    }
}
