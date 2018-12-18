package test.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import test.model.TimeZoneTransitionType;

public interface TimeZoneTransitionTypeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table time_zone_transition_type
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(@Param("timeZoneId") Integer timeZoneId, @Param("transitionTypeId") Integer transitionTypeId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table time_zone_transition_type
     *
     * @mbg.generated
     */
    int insert(TimeZoneTransitionType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table time_zone_transition_type
     *
     * @mbg.generated
     */
    TimeZoneTransitionType selectByPrimaryKey(@Param("timeZoneId") Integer timeZoneId, @Param("transitionTypeId") Integer transitionTypeId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table time_zone_transition_type
     *
     * @mbg.generated
     */
    List<TimeZoneTransitionType> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table time_zone_transition_type
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(TimeZoneTransitionType record);
}