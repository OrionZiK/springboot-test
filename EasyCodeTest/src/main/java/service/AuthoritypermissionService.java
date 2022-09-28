package

.service;

import .entity.Authoritypermission;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * (Authoritypermission)表服务接口
 *
 * @author makejava
 * @since 2022-09-28 15:40:25
 */
public interface AuthoritypermissionService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Authoritypermission queryById(Integer id);

    /**
     * 分页查询
     *
     * @param authoritypermission 筛选条件
     * @param pageRequest         分页对象
     * @return 查询结果
     */
    Page<Authoritypermission> queryByPage(Authoritypermission authoritypermission, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param authoritypermission 实例对象
     * @return 实例对象
     */
    Authoritypermission insert(Authoritypermission authoritypermission);

    /**
     * 修改数据
     *
     * @param authoritypermission 实例对象
     * @return 实例对象
     */
    Authoritypermission update(Authoritypermission authoritypermission);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
