package test.dao;

import java.util.List;
import test.model.XProcesslist;

public interface XProcesslistMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table x$processlist
     *
     * @mbg.generated
     */
    int insert(XProcesslist record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table x$processlist
     *
     * @mbg.generated
     */
    List<XProcesslist> selectAll();
}