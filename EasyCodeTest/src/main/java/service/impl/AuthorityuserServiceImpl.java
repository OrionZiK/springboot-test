package

.service.impl;

import .entity.Authorityuser;
import .dao.AuthorityuserDao;
import .service.AuthorityuserService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * (Authorityuser)表服务实现类
 *
 * @author makejava
 * @since 2022-09-28 15:40:26
 */
@Service("authorityuserService")
public class AuthorityuserServiceImpl implements AuthorityuserService {
    @Resource
    private AuthorityuserDao authorityuserDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Authorityuser queryById(Integer id) {
        return this.authorityuserDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param authorityuser 筛选条件
     * @param pageRequest   分页对象
     * @return 查询结果
     */
    @Override
    public Page<Authorityuser> queryByPage(Authorityuser authorityuser, PageRequest pageRequest) {
        long total = this.authorityuserDao.count(authorityuser);
        return new PageImpl<>(this.authorityuserDao.queryAllByLimit(authorityuser, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param authorityuser 实例对象
     * @return 实例对象
     */
    @Override
    public Authorityuser insert(Authorityuser authorityuser) {
        this.authorityuserDao.insert(authorityuser);
        return authorityuser;
    }

    /**
     * 修改数据
     *
     * @param authorityuser 实例对象
     * @return 实例对象
     */
    @Override
    public Authorityuser update(Authorityuser authorityuser) {
        this.authorityuserDao.update(authorityuser);
        return this.queryById(authorityuser.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.authorityuserDao.deleteById(id) > 0;
    }
}
