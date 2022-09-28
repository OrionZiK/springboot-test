package

.dao;

import .entity.Authoritypermission;
import entity.Authoritypermission;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * (Authoritypermission)表数据库访问层
 *
 * @author makejava
 * @since 2022-09-28 15:40:24
 */
public interface AuthoritypermissionDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Authoritypermission queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param authoritypermission 查询条件
     * @param pageable            分页对象
     * @return 对象列表
     */
    List<Authoritypermission> queryAllByLimit(Authoritypermission authoritypermission, @Param("pageable") Pageable pageable);

    /**
     * 统计总行数
     *
     * @param authoritypermission 查询条件
     * @return 总行数
     */
    long count(Authoritypermission authoritypermission);

    /**
     * 新增数据
     *
     * @param authoritypermission 实例对象
     * @return 影响行数
     */
    int insert(Authoritypermission authoritypermission);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Authoritypermission> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Authoritypermission> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Authoritypermission> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<Authoritypermission> entities);

    /**
     * 修改数据
     *
     * @param authoritypermission 实例对象
     * @return 影响行数
     */
    int update(Authoritypermission authoritypermission);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}

