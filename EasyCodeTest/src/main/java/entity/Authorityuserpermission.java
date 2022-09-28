package entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (Authorityuserpermission)实体类
 *
 * @author makejava
 * @since 2022-09-28 15:40:26
 */
public class Authorityuserpermission implements Serializable {
    private static final long serialVersionUID = 775088811103796535L;

    private Integer id;

    private Integer userid;

    private Integer permissionid;

    private Integer state;

    private Date createtime;

    private Date updatetime;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getPermissionid() {
        return permissionid;
    }

    public void setPermissionid(Integer permissionid) {
        this.permissionid = permissionid;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

}

