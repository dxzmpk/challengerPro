package tk.mybatis.simple;

import org.apache.ibatis.session.SqlSession;
import org.testng.annotations.Test;
import tk.mybatis.simple.mapper.SysUserMapper;
import tk.mybatis.simple.model.SysUser;

import java.util.List;

public class UserMapperTest extends BaseMapperTest {

    @Test
    public void testSelectAllUsers(){
        SqlSession sqlSession = getSqlSession();
        try{
            List<SysUser> userList =
                    sqlSession.selectList("tk.mybatis.simple.mapper.SysUserMapper.selectAll");
            printUserList(userList);
        }finally {
            sqlSession.close();
        }

    }

    @Test
    public void testSelectOneUser(){
        SqlSession sqlSession = getSqlSession();
        try{
            SysUserMapper sysUserMapper = sqlSession.getMapper(SysUserMapper.class);
            SysUser sysUser = sysUserMapper.selectByPrimaryKey(1L);
            System.out.println(sysUser);
        }finally {
            sqlSession.close();
        }

    }

    public void printUserList(List<SysUser> users){
        for(SysUser user : users){
            System.out.println(users);
        }
    }
}
