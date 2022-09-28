package

.controller;

import .entity.Authorityuser;
import .service.AuthorityuserService;
import entity.Authorityuser;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Authorityuser)表控制层
 *
 * @author makejava
 * @since 2022-09-28 15:40:25
 */
@RestController
@RequestMapping("authorityuser")
public class AuthorityuserController {
    /**
     * 服务对象
     */
    @Resource
    private AuthorityuserService authorityuserService;

    /**
     * 分页查询
     *
     * @param authorityuser 筛选条件
     * @param pageRequest   分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<Authorityuser>> queryByPage(Authorityuser authorityuser, PageRequest pageRequest) {
        return ResponseEntity.ok(this.authorityuserService.queryByPage(authorityuser, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<Authorityuser> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.authorityuserService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param authorityuser 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<Authorityuser> add(Authorityuser authorityuser) {
        return ResponseEntity.ok(this.authorityuserService.insert(authorityuser));
    }

    /**
     * 编辑数据
     *
     * @param authorityuser 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<Authorityuser> edit(Authorityuser authorityuser) {
        return ResponseEntity.ok(this.authorityuserService.update(authorityuser));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.authorityuserService.deleteById(id));
    }

}

