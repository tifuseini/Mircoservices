package com.sosa.rsocket;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.ZonedDateTime;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Course {

    private UUID courseId = UUID.randomUUID();

    private ZonedDateTime createdDate = ZonedDateTime.now();

    private String courseName;
}
