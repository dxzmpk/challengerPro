package test.model;

/**
 * Database Table Remarks:
 *   VIEW
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table schema_object_overview
 */
public class SchemaObjectOverview {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column schema_object_overview.db
     *
     * @mbg.generated
     */
    private String db;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column schema_object_overview.object_type
     *
     * @mbg.generated
     */
    private String objectType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column schema_object_overview.count
     *
     * @mbg.generated
     */
    private Long count;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column schema_object_overview.db
     *
     * @return the value of schema_object_overview.db
     *
     * @mbg.generated
     */
    public String getDb() {
        return db;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column schema_object_overview.db
     *
     * @param db the value for schema_object_overview.db
     *
     * @mbg.generated
     */
    public void setDb(String db) {
        this.db = db == null ? null : db.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column schema_object_overview.object_type
     *
     * @return the value of schema_object_overview.object_type
     *
     * @mbg.generated
     */
    public String getObjectType() {
        return objectType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column schema_object_overview.object_type
     *
     * @param objectType the value for schema_object_overview.object_type
     *
     * @mbg.generated
     */
    public void setObjectType(String objectType) {
        this.objectType = objectType == null ? null : objectType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column schema_object_overview.count
     *
     * @return the value of schema_object_overview.count
     *
     * @mbg.generated
     */
    public Long getCount() {
        return count;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column schema_object_overview.count
     *
     * @param count the value for schema_object_overview.count
     *
     * @mbg.generated
     */
    public void setCount(Long count) {
        this.count = count;
    }
}