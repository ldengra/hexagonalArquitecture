package com.hexagonal.tasks.domain.ports.in;

import com.hexagonal.tasks.domain.models.Task;

import java.util.Optional;

public interface UpdateTaskUserCase {

    Optional<Task> updateTask(Long id, Task updateTask);
}
