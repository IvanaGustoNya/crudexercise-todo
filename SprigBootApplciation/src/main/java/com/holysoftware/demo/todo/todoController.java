package com.holysoftware.demo.todo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Description;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "todo")
public class todoController {

        private final todoService todoService;

        @Autowired
        public todoController(todoService todoService){
            this.todoService = todoService;
        }
        @GetMapping(path = "{todoId}")
        public List<todo> gettodo() {
            return todoService.getusername ();
        }

        @PostMapping
        public void registerNewtodo(@RequestBody todo todo){
            todoService.addNewtodo(todo);
        }

        @DeleteMapping(path = "{todoId}")
        public void deleteId(@PathVariable("todoId") Long todoId){
              todoService.deletetodoId(todoId);
        }

        @PutMapping(path = "{todoId}")
        public void updatenew(
                @PathVariable("todoId") Long todoId,
                @RequestParam(required = false) String username,
                @RequestParam(required = false) String description){
            todoService.updateId(todoId, username, description);
        }








        }




