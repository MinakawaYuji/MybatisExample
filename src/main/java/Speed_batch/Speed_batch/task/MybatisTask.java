package Speed_batch.Speed_batch.task;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import Speed_batch.Speed_batch.App;
import Speed_batch.Speed_batch.dto.Todo;
import Speed_batch.Speed_batch.mapper.TodoMapper;



public class MybatisTask extends App{


    @Autowired
    TodoMapper todoMapper; // Mapperをインジェクションする


	@Override
    public void run(String... arg0) throws Exception {

		System.out.println("開始します-----------------");

        //Todo newTodo = new Todo();


        // インサートしたTodoを取得して標準出力する
        List<Todo> loadedTodo = todoMapper.select("T0001");



        System.out.println(loadedTodo.get(0).getCategory_key());


		System.out.println("終了します-----------------");
	}

}
