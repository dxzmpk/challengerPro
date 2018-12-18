package test.model;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table mutex_instances
 */
public class MutexInstances {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mutex_instances.OBJECT_INSTANCE_BEGIN
     *
     * @mbg.generated
     */
    private Long objectInstanceBegin;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mutex_instances.NAME
     *
     * @mbg.generated
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mutex_instances.LOCKED_BY_THREAD_ID
     *
     * @mbg.generated
     */
    private Long lockedByThreadId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mutex_instances.OBJECT_INSTANCE_BEGIN
     *
     * @return the value of mutex_instances.OBJECT_INSTANCE_BEGIN
     *
     * @mbg.generated
     */
    public Long getObjectInstanceBegin() {
        return objectInstanceBegin;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mutex_instances.OBJECT_INSTANCE_BEGIN
     *
     * @param objectInstanceBegin the value for mutex_instances.OBJECT_INSTANCE_BEGIN
     *
     * @mbg.generated
     */
    public void setObjectInstanceBegin(Long objectInstanceBegin) {
        this.objectInstanceBegin = objectInstanceBegin;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mutex_instances.NAME
     *
     * @return the value of mutex_instances.NAME
     *
     * @mbg.generated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mutex_instances.NAME
     *
     * @param name the value for mutex_instances.NAME
     *
     * @mbg.generated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mutex_instances.LOCKED_BY_THREAD_ID
     *
     * @return the value of mutex_instances.LOCKED_BY_THREAD_ID
     *
     * @mbg.generated
     */
    public Long getLockedByThreadId() {
        return lockedByThreadId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mutex_instances.LOCKED_BY_THREAD_ID
     *
     * @param lockedByThreadId the value for mutex_instances.LOCKED_BY_THREAD_ID
     *
     * @mbg.generated
     */
    public void setLockedByThreadId(Long lockedByThreadId) {
        this.lockedByThreadId = lockedByThreadId;
    }
}