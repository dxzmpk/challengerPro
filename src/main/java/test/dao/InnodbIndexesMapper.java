package test.dao;

import java.util.List;
import test.model.InnodbIndexes;

public interface InnodbIndexesMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INNODB_INDEXES
     *
     * @mbg.generated
     */
    int insert(InnodbIndexes record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INNODB_INDEXES
     *
     * @mbg.generated
     */
    List<InnodbIndexes> selectAll();
}