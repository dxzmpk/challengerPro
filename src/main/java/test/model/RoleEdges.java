package test.model;

/**
 * Database Table Remarks:
 *   Role hierarchy and role grants
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table role_edges
 */
public class RoleEdges {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column role_edges.FROM_HOST
     *
     * @mbg.generated
     */
    private String fromHost;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column role_edges.FROM_USER
     *
     * @mbg.generated
     */
    private String fromUser;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column role_edges.TO_HOST
     *
     * @mbg.generated
     */
    private String toHost;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column role_edges.TO_USER
     *
     * @mbg.generated
     */
    private String toUser;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column role_edges.WITH_ADMIN_OPTION
     *
     * @mbg.generated
     */
    private String withAdminOption;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column role_edges.FROM_HOST
     *
     * @return the value of role_edges.FROM_HOST
     *
     * @mbg.generated
     */
    public String getFromHost() {
        return fromHost;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column role_edges.FROM_HOST
     *
     * @param fromHost the value for role_edges.FROM_HOST
     *
     * @mbg.generated
     */
    public void setFromHost(String fromHost) {
        this.fromHost = fromHost == null ? null : fromHost.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column role_edges.FROM_USER
     *
     * @return the value of role_edges.FROM_USER
     *
     * @mbg.generated
     */
    public String getFromUser() {
        return fromUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column role_edges.FROM_USER
     *
     * @param fromUser the value for role_edges.FROM_USER
     *
     * @mbg.generated
     */
    public void setFromUser(String fromUser) {
        this.fromUser = fromUser == null ? null : fromUser.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column role_edges.TO_HOST
     *
     * @return the value of role_edges.TO_HOST
     *
     * @mbg.generated
     */
    public String getToHost() {
        return toHost;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column role_edges.TO_HOST
     *
     * @param toHost the value for role_edges.TO_HOST
     *
     * @mbg.generated
     */
    public void setToHost(String toHost) {
        this.toHost = toHost == null ? null : toHost.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column role_edges.TO_USER
     *
     * @return the value of role_edges.TO_USER
     *
     * @mbg.generated
     */
    public String getToUser() {
        return toUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column role_edges.TO_USER
     *
     * @param toUser the value for role_edges.TO_USER
     *
     * @mbg.generated
     */
    public void setToUser(String toUser) {
        this.toUser = toUser == null ? null : toUser.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column role_edges.WITH_ADMIN_OPTION
     *
     * @return the value of role_edges.WITH_ADMIN_OPTION
     *
     * @mbg.generated
     */
    public String getWithAdminOption() {
        return withAdminOption;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column role_edges.WITH_ADMIN_OPTION
     *
     * @param withAdminOption the value for role_edges.WITH_ADMIN_OPTION
     *
     * @mbg.generated
     */
    public void setWithAdminOption(String withAdminOption) {
        this.withAdminOption = withAdminOption == null ? null : withAdminOption.trim();
    }
}