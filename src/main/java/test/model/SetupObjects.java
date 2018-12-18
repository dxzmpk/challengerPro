package test.model;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table setup_objects
 */
public class SetupObjects {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column setup_objects.OBJECT_TYPE
     *
     * @mbg.generated
     */
    private String objectType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column setup_objects.OBJECT_SCHEMA
     *
     * @mbg.generated
     */
    private String objectSchema;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column setup_objects.OBJECT_NAME
     *
     * @mbg.generated
     */
    private String objectName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column setup_objects.ENABLED
     *
     * @mbg.generated
     */
    private String enabled;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column setup_objects.TIMED
     *
     * @mbg.generated
     */
    private String timed;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column setup_objects.OBJECT_TYPE
     *
     * @return the value of setup_objects.OBJECT_TYPE
     *
     * @mbg.generated
     */
    public String getObjectType() {
        return objectType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column setup_objects.OBJECT_TYPE
     *
     * @param objectType the value for setup_objects.OBJECT_TYPE
     *
     * @mbg.generated
     */
    public void setObjectType(String objectType) {
        this.objectType = objectType == null ? null : objectType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column setup_objects.OBJECT_SCHEMA
     *
     * @return the value of setup_objects.OBJECT_SCHEMA
     *
     * @mbg.generated
     */
    public String getObjectSchema() {
        return objectSchema;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column setup_objects.OBJECT_SCHEMA
     *
     * @param objectSchema the value for setup_objects.OBJECT_SCHEMA
     *
     * @mbg.generated
     */
    public void setObjectSchema(String objectSchema) {
        this.objectSchema = objectSchema == null ? null : objectSchema.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column setup_objects.OBJECT_NAME
     *
     * @return the value of setup_objects.OBJECT_NAME
     *
     * @mbg.generated
     */
    public String getObjectName() {
        return objectName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column setup_objects.OBJECT_NAME
     *
     * @param objectName the value for setup_objects.OBJECT_NAME
     *
     * @mbg.generated
     */
    public void setObjectName(String objectName) {
        this.objectName = objectName == null ? null : objectName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column setup_objects.ENABLED
     *
     * @return the value of setup_objects.ENABLED
     *
     * @mbg.generated
     */
    public String getEnabled() {
        return enabled;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column setup_objects.ENABLED
     *
     * @param enabled the value for setup_objects.ENABLED
     *
     * @mbg.generated
     */
    public void setEnabled(String enabled) {
        this.enabled = enabled == null ? null : enabled.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column setup_objects.TIMED
     *
     * @return the value of setup_objects.TIMED
     *
     * @mbg.generated
     */
    public String getTimed() {
        return timed;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column setup_objects.TIMED
     *
     * @param timed the value for setup_objects.TIMED
     *
     * @mbg.generated
     */
    public void setTimed(String timed) {
        this.timed = timed == null ? null : timed.trim();
    }
}