package com.store.dto;


import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class WeightLogDTO {
    private Long id;
    private Long userId;
    private Double weight;
    private LocalDateTime loggedAt;
}
