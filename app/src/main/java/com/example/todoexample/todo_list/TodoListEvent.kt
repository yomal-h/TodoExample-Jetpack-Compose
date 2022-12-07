package com.example.todoexample.todo_list

sealed class TodoListEvent{
    data class DeleteTodo(val todo: DeleteTodo)
}
