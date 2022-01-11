package com.java.base.enity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AbstractBase {

    private Instant createdAt;

    private Instant updatedAt;

    private String createdBy;

    private String updatedBy;
}