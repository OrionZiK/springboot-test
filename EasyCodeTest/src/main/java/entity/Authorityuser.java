package entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (Authorityuser)实体类
 *
 * @author makejava
 * @since 2022-09-28 15:40:25
 */
public class Authorityuser implements Serializable {
    private static final long serialVersionUID = -59036451292481668L;

    private Integer id;

    private String username;

    private String password;

    private String email;

    private Integer state;

    private Date createtime;

    private Date updatetime;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

