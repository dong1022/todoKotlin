package com.example.todo.endpoint.todo.domain.repository

import com.example.todo.endpoint.todo.domain.model.TodoDto
import com.example.todo.mybatis.mapper.TodoMapper
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class TodoRepositoryImpl :TodoRepository{

    @Autowired
    private lateinit var todoMapper: TodoMapper

    override fun getTodoList(): MutableList<TodoDto> {
        return todoMapper.getTodoList()
    }

}