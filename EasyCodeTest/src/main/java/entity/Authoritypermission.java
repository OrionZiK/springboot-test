package entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (Authoritypermission)实体类
 *
 * @author makejava
 * @since 2022-09-28 15:40:24
 */
public class Authoritypermission implements Serializable {
    private static final long serialVersionUID = 633591490531039713L;

    private Integer id;

    private String name;

    private String description;

    private Integer state;

    private Date createtime;

    private Date updatetime;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

