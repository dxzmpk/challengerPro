package test.dao;

import java.util.List;
import test.model.Collations;

public interface CollationsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table COLLATIONS
     *
     * @mbg.generated
     */
    int insert(Collations record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table COLLATIONS
     *
     * @mbg.generated
     */
    List<Collations> selectAll();
}