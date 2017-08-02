package com.gaohuan;

import com.gaohuan.entity.Girl;
import com.gaohuan.mapper.GirlMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by gaohuan on 2017/7/20.
 */
@RestController
public class HelloController {

    @Autowired
    private GirlMapper girlMapper;

    @RequestMapping(value = "/hello",method = {RequestMethod.GET,RequestMethod.POST})
    public String Hello(){
        return "123";
    }

    /**
     * 查询列表
     * @return
     */
    @GetMapping(value = "/list")
    public List<Girl> findAll(){
        return girlMapper.findAll();
    }

    /**
     * 添加
     * @param girl
     * @return
     */
    @PostMapping(value = "/add")
    public Girl add(@RequestParam(value = "name" , required = true) String name, Integer age){
        Girl girl = new Girl();
        girl.setAge(age);
        girl.setName(name);
        return  girlMapper.save(girl);
    }

    /**
     * 删除
     * @param id
     */
    @DeleteMapping(value = "/delete/{id}")
    public void delete(@PathVariable(value = "id" ) Integer id){
        girlMapper.delete(id);
    }

    /**
     * 修改
     * @param girl
     */
    @PutMapping(value = "/update")
    public void update(Girl girl){
        girlMapper.save(girl);
    }
}
