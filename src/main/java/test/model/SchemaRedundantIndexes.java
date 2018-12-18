package test.model;

/**
 * Database Table Remarks:
 *   VIEW
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table schema_redundant_indexes
 */
public class SchemaRedundantIndexes {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column schema_redundant_indexes.table_schema
     *
     * @mbg.generated
     */
    private String tableSchema;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column schema_redundant_indexes.table_name
     *
     * @mbg.generated
     */
    private String tableName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column schema_redundant_indexes.redundant_index_name
     *
     * @mbg.generated
     */
    private String redundantIndexName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column schema_redundant_indexes.redundant_index_non_unique
     *
     * @mbg.generated
     */
    private Integer redundantIndexNonUnique;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column schema_redundant_indexes.dominant_index_name
     *
     * @mbg.generated
     */
    private String dominantIndexName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column schema_redundant_indexes.dominant_index_non_unique
     *
     * @mbg.generated
     */
    private Integer dominantIndexNonUnique;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column schema_redundant_indexes.subpart_exists
     *
     * @mbg.generated
     */
    private Integer subpartExists;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column schema_redundant_indexes.sql_drop_index
     *
     * @mbg.generated
     */
    private String sqlDropIndex;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column schema_redundant_indexes.redundant_index_columns
     *
     * @mbg.generated
     */
    private String redundantIndexColumns;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column schema_redundant_indexes.dominant_index_columns
     *
     * @mbg.generated
     */
    private String dominantIndexColumns;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column schema_redundant_indexes.table_schema
     *
     * @return the value of schema_redundant_indexes.table_schema
     *
     * @mbg.generated
     */
    public String getTableSchema() {
        return tableSchema;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column schema_redundant_indexes.table_schema
     *
     * @param tableSchema the value for schema_redundant_indexes.table_schema
     *
     * @mbg.generated
     */
    public void setTableSchema(String tableSchema) {
        this.tableSchema = tableSchema == null ? null : tableSchema.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column schema_redundant_indexes.table_name
     *
     * @return the value of schema_redundant_indexes.table_name
     *
     * @mbg.generated
     */
    public String getTableName() {
        return tableName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column schema_redundant_indexes.table_name
     *
     * @param tableName the value for schema_redundant_indexes.table_name
     *
     * @mbg.generated
     */
    public void setTableName(String tableName) {
        this.tableName = tableName == null ? null : tableName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column schema_redundant_indexes.redundant_index_name
     *
     * @return the value of schema_redundant_indexes.redundant_index_name
     *
     * @mbg.generated
     */
    public String getRedundantIndexName() {
        return redundantIndexName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column schema_redundant_indexes.redundant_index_name
     *
     * @param redundantIndexName the value for schema_redundant_indexes.redundant_index_name
     *
     * @mbg.generated
     */
    public void setRedundantIndexName(String redundantIndexName) {
        this.redundantIndexName = redundantIndexName == null ? null : redundantIndexName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column schema_redundant_indexes.redundant_index_non_unique
     *
     * @return the value of schema_redundant_indexes.redundant_index_non_unique
     *
     * @mbg.generated
     */
    public Integer getRedundantIndexNonUnique() {
        return redundantIndexNonUnique;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column schema_redundant_indexes.redundant_index_non_unique
     *
     * @param redundantIndexNonUnique the value for schema_redundant_indexes.redundant_index_non_unique
     *
     * @mbg.generated
     */
    public void setRedundantIndexNonUnique(Integer redundantIndexNonUnique) {
        this.redundantIndexNonUnique = redundantIndexNonUnique;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column schema_redundant_indexes.dominant_index_name
     *
     * @return the value of schema_redundant_indexes.dominant_index_name
     *
     * @mbg.generated
     */
    public String getDominantIndexName() {
        return dominantIndexName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column schema_redundant_indexes.dominant_index_name
     *
     * @param dominantIndexName the value for schema_redundant_indexes.dominant_index_name
     *
     * @mbg.generated
     */
    public void setDominantIndexName(String dominantIndexName) {
        this.dominantIndexName = dominantIndexName == null ? null : dominantIndexName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column schema_redundant_indexes.dominant_index_non_unique
     *
     * @return the value of schema_redundant_indexes.dominant_index_non_unique
     *
     * @mbg.generated
     */
    public Integer getDominantIndexNonUnique() {
        return dominantIndexNonUnique;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column schema_redundant_indexes.dominant_index_non_unique
     *
     * @param dominantIndexNonUnique the value for schema_redundant_indexes.dominant_index_non_unique
     *
     * @mbg.generated
     */
    public void setDominantIndexNonUnique(Integer dominantIndexNonUnique) {
        this.dominantIndexNonUnique = dominantIndexNonUnique;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column schema_redundant_indexes.subpart_exists
     *
     * @return the value of schema_redundant_indexes.subpart_exists
     *
     * @mbg.generated
     */
    public Integer getSubpartExists() {
        return subpartExists;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column schema_redundant_indexes.subpart_exists
     *
     * @param subpartExists the value for schema_redundant_indexes.subpart_exists
     *
     * @mbg.generated
     */
    public void setSubpartExists(Integer subpartExists) {
        this.subpartExists = subpartExists;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column schema_redundant_indexes.sql_drop_index
     *
     * @return the value of schema_redundant_indexes.sql_drop_index
     *
     * @mbg.generated
     */
    public String getSqlDropIndex() {
        return sqlDropIndex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column schema_redundant_indexes.sql_drop_index
     *
     * @param sqlDropIndex the value for schema_redundant_indexes.sql_drop_index
     *
     * @mbg.generated
     */
    public void setSqlDropIndex(String sqlDropIndex) {
        this.sqlDropIndex = sqlDropIndex == null ? null : sqlDropIndex.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column schema_redundant_indexes.redundant_index_columns
     *
     * @return the value of schema_redundant_indexes.redundant_index_columns
     *
     * @mbg.generated
     */
    public String getRedundantIndexColumns() {
        return redundantIndexColumns;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column schema_redundant_indexes.redundant_index_columns
     *
     * @param redundantIndexColumns the value for schema_redundant_indexes.redundant_index_columns
     *
     * @mbg.generated
     */
    public void setRedundantIndexColumns(String redundantIndexColumns) {
        this.redundantIndexColumns = redundantIndexColumns == null ? null : redundantIndexColumns.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column schema_redundant_indexes.dominant_index_columns
     *
     * @return the value of schema_redundant_indexes.dominant_index_columns
     *
     * @mbg.generated
     */
    public String getDominantIndexColumns() {
        return dominantIndexColumns;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column schema_redundant_indexes.dominant_index_columns
     *
     * @param dominantIndexColumns the value for schema_redundant_indexes.dominant_index_columns
     *
     * @mbg.generated
     */
    public void setDominantIndexColumns(String dominantIndexColumns) {
        this.dominantIndexColumns = dominantIndexColumns == null ? null : dominantIndexColumns.trim();
    }
}