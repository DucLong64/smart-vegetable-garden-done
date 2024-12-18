package com.smartgarden.repository;

import com.smartgarden.model.HistoryAction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HistoryActionRepository extends JpaRepository<HistoryAction, Long> {
    // Có thể thêm các phương thức tùy chỉnh nếu cần
}