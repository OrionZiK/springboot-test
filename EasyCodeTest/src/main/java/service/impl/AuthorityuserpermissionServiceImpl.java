package

.service.impl;

import .entity.Authorityuserpermission;
import .dao.AuthorityuserpermissionDao;
import .service.AuthorityuserpermissionService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * (Authorityuserpermission)表服务实现类
 *
 * @author makejava
 * @since 2022-09-28 15:40:27
 */
@Service("authorityuserpermissionService")
public class AuthorityuserpermissionServiceImpl implements AuthorityuserpermissionService {
    @Resource
    private AuthorityuserpermissionDao authorityuserpermissionDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Authorityuserpermission queryById(Integer id) {
        return this.authorityuserpermissionDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param authorityuserpermission 筛选条件
     * @param pageRequest             分页对象
     * @return 查询结果
     */
    @Override
    public Page<Authorityuserpermission> queryByPage(Authorityuserpermission authorityuserpermission, PageRequest pageRequest) {
        long total = this.authorityuserpermissionDao.count(authorityuserpermission);
        return new PageImpl<>(this.authorityuserpermissionDao.queryAllByLimit(authorityuserpermission, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param authorityuserpermission 实例对象
     * @return 实例对象
     */
    @Override
    public Authorityuserpermission insert(Authorityuserpermission authorityuserpermission) {
        this.authorityuserpermissionDao.insert(authorityuserpermission);
        return authorityuserpermission;
    }

    /**
     * 修改数据
     *
     * @param authorityuserpermission 实例对象
     * @return 实例对象
     */
    @Override
    public Authorityuserpermission update(Authorityuserpermission authorityuserpermission) {
        this.authorityuserpermissionDao.update(authorityuserpermission);
        return this.queryById(authorityuserpermission.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.authorityuserpermissionDao.deleteById(id) > 0;
    }
}
