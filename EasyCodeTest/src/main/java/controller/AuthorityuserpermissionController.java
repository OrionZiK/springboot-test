package

.controller;

import .entity.Authorityuserpermission;
import .service.AuthorityuserpermissionService;
import entity.Authorityuserpermission;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Authorityuserpermission)表控制层
 *
 * @author makejava
 * @since 2022-09-28 15:40:26
 */
@RestController
@RequestMapping("authorityuserpermission")
public class AuthorityuserpermissionController {
    /**
     * 服务对象
     */
    @Resource
    private AuthorityuserpermissionService authorityuserpermissionService;

    /**
     * 分页查询
     *
     * @param authorityuserpermission 筛选条件
     * @param pageRequest             分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<Authorityuserpermission>> queryByPage(Authorityuserpermission authorityuserpermission, PageRequest pageRequest) {
        return ResponseEntity.ok(this.authorityuserpermissionService.queryByPage(authorityuserpermission, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<Authorityuserpermission> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.authorityuserpermissionService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param authorityuserpermission 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<Authorityuserpermission> add(Authorityuserpermission authorityuserpermission) {
        return ResponseEntity.ok(this.authorityuserpermissionService.insert(authorityuserpermission));
    }

    /**
     * 编辑数据
     *
     * @param authorityuserpermission 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<Authorityuserpermission> edit(Authorityuserpermission authorityuserpermission) {
        return ResponseEntity.ok(this.authorityuserpermissionService.update(authorityuserpermission));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.authorityuserpermissionService.deleteById(id));
    }

}

