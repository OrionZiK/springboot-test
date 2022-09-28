package

.dao;

import .entity.Authorityuserpermission;
import entity.Authorityuserpermission;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * (Authorityuserpermission)表数据库访问层
 *
 * @author makejava
 * @since 2022-09-28 15:40:26
 */
public interface AuthorityuserpermissionDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Authorityuserpermission queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param authorityuserpermission 查询条件
     * @param pageable                分页对象
     * @return 对象列表
     */
    List<Authorityuserpermission> queryAllByLimit(Authorityuserpermission authorityuserpermission, @Param("pageable") Pageable pageable);

    /**
     * 统计总行数
     *
     * @param authorityuserpermission 查询条件
     * @return 总行数
     */
    long count(Authorityuserpermission authorityuserpermission);

    /**
     * 新增数据
     *
     * @param authorityuserpermission 实例对象
     * @return 影响行数
     */
    int insert(Authorityuserpermission authorityuserpermission);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Authorityuserpermission> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Authorityuserpermission> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Authorityuserpermission> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<Authorityuserpermission> entities);

    /**
     * 修改数据
     *
     * @param authorityuserpermission 实例对象
     * @return 影响行数
     */
    int update(Authorityuserpermission authorityuserpermission);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}

