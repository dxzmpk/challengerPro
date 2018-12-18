package test.model;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table INNODB_TABLES
 */
public class InnodbTables {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column INNODB_TABLES.TABLE_ID
     *
     * @mbg.generated
     */
    private Long tableId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column INNODB_TABLES.NAME
     *
     * @mbg.generated
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column INNODB_TABLES.FLAG
     *
     * @mbg.generated
     */
    private Integer flag;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column INNODB_TABLES.N_COLS
     *
     * @mbg.generated
     */
    private Integer nCols;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column INNODB_TABLES.SPACE
     *
     * @mbg.generated
     */
    private Long space;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column INNODB_TABLES.ROW_FORMAT
     *
     * @mbg.generated
     */
    private String rowFormat;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column INNODB_TABLES.ZIP_PAGE_SIZE
     *
     * @mbg.generated
     */
    private Integer zipPageSize;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column INNODB_TABLES.SPACE_TYPE
     *
     * @mbg.generated
     */
    private String spaceType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column INNODB_TABLES.INSTANT_COLS
     *
     * @mbg.generated
     */
    private Integer instantCols;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column INNODB_TABLES.TABLE_ID
     *
     * @return the value of INNODB_TABLES.TABLE_ID
     *
     * @mbg.generated
     */
    public Long getTableId() {
        return tableId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column INNODB_TABLES.TABLE_ID
     *
     * @param tableId the value for INNODB_TABLES.TABLE_ID
     *
     * @mbg.generated
     */
    public void setTableId(Long tableId) {
        this.tableId = tableId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column INNODB_TABLES.NAME
     *
     * @return the value of INNODB_TABLES.NAME
     *
     * @mbg.generated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column INNODB_TABLES.NAME
     *
     * @param name the value for INNODB_TABLES.NAME
     *
     * @mbg.generated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column INNODB_TABLES.FLAG
     *
     * @return the value of INNODB_TABLES.FLAG
     *
     * @mbg.generated
     */
    public Integer getFlag() {
        return flag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column INNODB_TABLES.FLAG
     *
     * @param flag the value for INNODB_TABLES.FLAG
     *
     * @mbg.generated
     */
    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column INNODB_TABLES.N_COLS
     *
     * @return the value of INNODB_TABLES.N_COLS
     *
     * @mbg.generated
     */
    public Integer getnCols() {
        return nCols;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column INNODB_TABLES.N_COLS
     *
     * @param nCols the value for INNODB_TABLES.N_COLS
     *
     * @mbg.generated
     */
    public void setnCols(Integer nCols) {
        this.nCols = nCols;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column INNODB_TABLES.SPACE
     *
     * @return the value of INNODB_TABLES.SPACE
     *
     * @mbg.generated
     */
    public Long getSpace() {
        return space;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column INNODB_TABLES.SPACE
     *
     * @param space the value for INNODB_TABLES.SPACE
     *
     * @mbg.generated
     */
    public void setSpace(Long space) {
        this.space = space;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column INNODB_TABLES.ROW_FORMAT
     *
     * @return the value of INNODB_TABLES.ROW_FORMAT
     *
     * @mbg.generated
     */
    public String getRowFormat() {
        return rowFormat;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column INNODB_TABLES.ROW_FORMAT
     *
     * @param rowFormat the value for INNODB_TABLES.ROW_FORMAT
     *
     * @mbg.generated
     */
    public void setRowFormat(String rowFormat) {
        this.rowFormat = rowFormat == null ? null : rowFormat.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column INNODB_TABLES.ZIP_PAGE_SIZE
     *
     * @return the value of INNODB_TABLES.ZIP_PAGE_SIZE
     *
     * @mbg.generated
     */
    public Integer getZipPageSize() {
        return zipPageSize;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column INNODB_TABLES.ZIP_PAGE_SIZE
     *
     * @param zipPageSize the value for INNODB_TABLES.ZIP_PAGE_SIZE
     *
     * @mbg.generated
     */
    public void setZipPageSize(Integer zipPageSize) {
        this.zipPageSize = zipPageSize;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column INNODB_TABLES.SPACE_TYPE
     *
     * @return the value of INNODB_TABLES.SPACE_TYPE
     *
     * @mbg.generated
     */
    public String getSpaceType() {
        return spaceType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column INNODB_TABLES.SPACE_TYPE
     *
     * @param spaceType the value for INNODB_TABLES.SPACE_TYPE
     *
     * @mbg.generated
     */
    public void setSpaceType(String spaceType) {
        this.spaceType = spaceType == null ? null : spaceType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column INNODB_TABLES.INSTANT_COLS
     *
     * @return the value of INNODB_TABLES.INSTANT_COLS
     *
     * @mbg.generated
     */
    public Integer getInstantCols() {
        return instantCols;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column INNODB_TABLES.INSTANT_COLS
     *
     * @param instantCols the value for INNODB_TABLES.INSTANT_COLS
     *
     * @mbg.generated
     */
    public void setInstantCols(Integer instantCols) {
        this.instantCols = instantCols;
    }
}