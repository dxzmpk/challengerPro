package test.dao;

import java.util.List;
import test.model.InnodbCmp;

public interface InnodbCmpMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INNODB_CMP
     *
     * @mbg.generated
     */
    int insert(InnodbCmp record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INNODB_CMP
     *
     * @mbg.generated
     */
    List<InnodbCmp> selectAll();
}