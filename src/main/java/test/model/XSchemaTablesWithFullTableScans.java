package test.model;

/**
 * Database Table Remarks:
 *   VIEW
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table x$schema_tables_with_full_table_scans
 */
public class XSchemaTablesWithFullTableScans {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column x$schema_tables_with_full_table_scans.object_schema
     *
     * @mbg.generated
     */
    private String objectSchema;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column x$schema_tables_with_full_table_scans.object_name
     *
     * @mbg.generated
     */
    private String objectName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column x$schema_tables_with_full_table_scans.rows_full_scanned
     *
     * @mbg.generated
     */
    private Long rowsFullScanned;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column x$schema_tables_with_full_table_scans.latency
     *
     * @mbg.generated
     */
    private Long latency;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column x$schema_tables_with_full_table_scans.object_schema
     *
     * @return the value of x$schema_tables_with_full_table_scans.object_schema
     *
     * @mbg.generated
     */
    public String getObjectSchema() {
        return objectSchema;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column x$schema_tables_with_full_table_scans.object_schema
     *
     * @param objectSchema the value for x$schema_tables_with_full_table_scans.object_schema
     *
     * @mbg.generated
     */
    public void setObjectSchema(String objectSchema) {
        this.objectSchema = objectSchema == null ? null : objectSchema.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column x$schema_tables_with_full_table_scans.object_name
     *
     * @return the value of x$schema_tables_with_full_table_scans.object_name
     *
     * @mbg.generated
     */
    public String getObjectName() {
        return objectName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column x$schema_tables_with_full_table_scans.object_name
     *
     * @param objectName the value for x$schema_tables_with_full_table_scans.object_name
     *
     * @mbg.generated
     */
    public void setObjectName(String objectName) {
        this.objectName = objectName == null ? null : objectName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column x$schema_tables_with_full_table_scans.rows_full_scanned
     *
     * @return the value of x$schema_tables_with_full_table_scans.rows_full_scanned
     *
     * @mbg.generated
     */
    public Long getRowsFullScanned() {
        return rowsFullScanned;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column x$schema_tables_with_full_table_scans.rows_full_scanned
     *
     * @param rowsFullScanned the value for x$schema_tables_with_full_table_scans.rows_full_scanned
     *
     * @mbg.generated
     */
    public void setRowsFullScanned(Long rowsFullScanned) {
        this.rowsFullScanned = rowsFullScanned;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column x$schema_tables_with_full_table_scans.latency
     *
     * @return the value of x$schema_tables_with_full_table_scans.latency
     *
     * @mbg.generated
     */
    public Long getLatency() {
        return latency;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column x$schema_tables_with_full_table_scans.latency
     *
     * @param latency the value for x$schema_tables_with_full_table_scans.latency
     *
     * @mbg.generated
     */
    public void setLatency(Long latency) {
        this.latency = latency;
    }
}