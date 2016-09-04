package Speed_batch.Speed_batch.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.transaction.annotation.Transactional;

import Speed_batch.Speed_batch.dto.Todo;

@Mapper
@Transactional
public interface TodoMapper {


    //@Select("SELECT category_name , numbering , category_key , category_val FROM test.master WHERE category_name = #{category_name}")
    List<Todo> select(String category_name);


}