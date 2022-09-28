package

.controller;

import .entity.Authoritypermission;
import .service.AuthoritypermissionService;
import entity.Authoritypermission;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Authoritypermission)表控制层
 *
 * @author makejava
 * @since 2022-09-28 15:40:23
 */
@RestController
@RequestMapping("authoritypermission")
public class AuthoritypermissionController {
    /**
     * 服务对象
     */
    @Resource
    private AuthoritypermissionService authoritypermissionService;

    /**
     * 分页查询
     *
     * @param authoritypermission 筛选条件
     * @param pageRequest         分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<Authoritypermission>> queryByPage(Authoritypermission authoritypermission, PageRequest pageRequest) {
        return ResponseEntity.ok(this.authoritypermissionService.queryByPage(authoritypermission, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<Authoritypermission> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.authoritypermissionService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param authoritypermission 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<Authoritypermission> add(Authoritypermission authoritypermission) {
        return ResponseEntity.ok(this.authoritypermissionService.insert(authoritypermission));
    }

    /**
     * 编辑数据
     *
     * @param authoritypermission 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<Authoritypermission> edit(Authoritypermission authoritypermission) {
        return ResponseEntity.ok(this.authoritypermissionService.update(authoritypermission));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.authoritypermissionService.deleteById(id));
    }

}

