package

.service;

import .entity.Authorityuserpermission;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * (Authorityuserpermission)表服务接口
 *
 * @author makejava
 * @since 2022-09-28 15:40:27
 */
public interface AuthorityuserpermissionService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Authorityuserpermission queryById(Integer id);

    /**
     * 分页查询
     *
     * @param authorityuserpermission 筛选条件
     * @param pageRequest             分页对象
     * @return 查询结果
     */
    Page<Authorityuserpermission> queryByPage(Authorityuserpermission authorityuserpermission, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param authorityuserpermission 实例对象
     * @return 实例对象
     */
    Authorityuserpermission insert(Authorityuserpermission authorityuserpermission);

    /**
     * 修改数据
     *
     * @param authorityuserpermission 实例对象
     * @return 实例对象
     */
    Authorityuserpermission update(Authorityuserpermission authorityuserpermission);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
