package

.service.impl;

import .entity.Authoritypermission;
import .dao.AuthoritypermissionDao;
import .service.AuthoritypermissionService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * (Authoritypermission)表服务实现类
 *
 * @author makejava
 * @since 2022-09-28 15:40:25
 */
@Service("authoritypermissionService")
public class AuthoritypermissionServiceImpl implements AuthoritypermissionService {
    @Resource
    private AuthoritypermissionDao authoritypermissionDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Authoritypermission queryById(Integer id) {
        return this.authoritypermissionDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param authoritypermission 筛选条件
     * @param pageRequest         分页对象
     * @return 查询结果
     */
    @Override
    public Page<Authoritypermission> queryByPage(Authoritypermission authoritypermission, PageRequest pageRequest) {
        long total = this.authoritypermissionDao.count(authoritypermission);
        return new PageImpl<>(this.authoritypermissionDao.queryAllByLimit(authoritypermission, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param authoritypermission 实例对象
     * @return 实例对象
     */
    @Override
    public Authoritypermission insert(Authoritypermission authoritypermission) {
        this.authoritypermissionDao.insert(authoritypermission);
        return authoritypermission;
    }

    /**
     * 修改数据
     *
     * @param authoritypermission 实例对象
     * @return 实例对象
     */
    @Override
    public Authoritypermission update(Authoritypermission authoritypermission) {
        this.authoritypermissionDao.update(authoritypermission);
        return this.queryById(authoritypermission.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.authoritypermissionDao.deleteById(id) > 0;
    }
}
