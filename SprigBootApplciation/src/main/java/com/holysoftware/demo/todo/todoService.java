package com.holysoftware.demo.todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Objects;
import java.util.Optional;


@Service
public class todoService {
    @Autowired
    public todoService(todoRepo todoRepository) {
        this.todoRepository = todoRepository;
    }

    private final todoRepo todoRepository;

    public List<todo> getusername() {
        return todoRepository.findAll();

    }

    public void addNewtodo(todo todo) {
        Optional<todo> UsernameById = todoRepository
                .findtodoByUsername(todo.getUsername());
        if (UsernameById.isPresent()) {
            throw new IllegalStateException("Username Already Taken");
        }

        todoRepository.save(todo);
    }


    public void deletetodoId(Long todoId) {
        todoRepository.deleteById(todoId);

    }

   @Transactional
    public void updateId(Long todoId, String username, String description) {
        todo newtodo = todoRepository.findById(todoId)
                .orElseThrow(() -> new IllegalStateException(
                        "todo with id " + todoId + "deos not exists"

                ));
        if(username != null &&
                username.length() > 0 &&
                !Objects.equals(newtodo.getUsername(), username)){
            Optional<todo> todoOptional = todoRepository
                    .findtodoByUsername(username);

         

            if(todoOptional.isPresent()){
                throw new IllegalStateException("Username is taken ");
            }
            newtodo.setUsername(username);
        }


        if(description != null &&
                username.length() > 0 &&
                !Objects.equals(newtodo.getDescription(), description)){
            newtodo.setDescription(description);





        }

    }
}

