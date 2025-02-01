package com.store.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "weight_entries")
public class WeightEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long userId; // 여러 사용자를 지원할 경우

    @Column(nullable = false)
    private Double weight;

    @Column(nullable = false)
    private LocalDate date;

    private String note; // 선택적 메모

    // 생성자, Getter, Setter 추가
}

