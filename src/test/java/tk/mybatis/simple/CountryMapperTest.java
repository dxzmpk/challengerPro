package tk.mybatis.simple;

import org.apache.ibatis.session.SqlSession;
import org.testng.annotations.Test;
import tk.mybatis.simple.model.Country;

import java.util.List;

public class CountryMapperTest extends BaseMapperTest{
    @Test
    public void testSelectAll(){
        SqlSession sqlSession = getSqlSession();
        try{
            List<Country> countryList = sqlSession.selectList("selectAll");
            printCountryList(countryList);
        } finally {
            sqlSession.close();
        }
    }

    @Test
    public void testSelectOneById(){
        SqlSession sqlSession = getSqlSession();
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
