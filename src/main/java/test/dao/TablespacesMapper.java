package test.dao;

import java.util.List;
import test.model.Tablespaces;

public interface TablespacesMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TABLESPACES
     *
     * @mbg.generated
     */
    int insert(Tablespaces record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TABLESPACES
     *
     * @mbg.generated
     */
    List<Tablespaces> selectAll();
}