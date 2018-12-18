package test.model;

/**
 * Database Table Remarks:
 *   Time zones
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table time_zone
 */
public class TimeZone {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column time_zone.Time_zone_id
     *
     * @mbg.generated
     */
    private Integer timeZoneId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column time_zone.Use_leap_seconds
     *
     * @mbg.generated
     */
    private String useLeapSeconds;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column time_zone.Time_zone_id
     *
     * @return the value of time_zone.Time_zone_id
     *
     * @mbg.generated
     */
    public Integer getTimeZoneId() {
        return timeZoneId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column time_zone.Time_zone_id
     *
     * @param timeZoneId the value for time_zone.Time_zone_id
     *
     * @mbg.generated
     */
    public void setTimeZoneId(Integer timeZoneId) {
        this.timeZoneId = timeZoneId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column time_zone.Use_leap_seconds
     *
     * @return the value of time_zone.Use_leap_seconds
     *
     * @mbg.generated
     */
    public String getUseLeapSeconds() {
        return useLeapSeconds;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column time_zone.Use_leap_seconds
     *
     * @param useLeapSeconds the value for time_zone.Use_leap_seconds
     *
     * @mbg.generated
     */
    public void setUseLeapSeconds(String useLeapSeconds) {
        this.useLeapSeconds = useLeapSeconds == null ? null : useLeapSeconds.trim();
    }
}