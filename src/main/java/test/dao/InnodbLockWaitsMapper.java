package test.dao;

import java.util.List;
import test.model.InnodbLockWaits;

public interface InnodbLockWaitsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table innodb_lock_waits
     *
     * @mbg.generated
     */
    int insert(InnodbLockWaits record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table innodb_lock_waits
     *
     * @mbg.generated
     */
    List<InnodbLockWaits> selectAll();
}