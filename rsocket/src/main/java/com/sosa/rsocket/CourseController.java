package com.sosa.rsocket;

import lombok.extern.slf4j.Slf4j;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.time.Duration;

@Slf4j
@Controller
public class CourseController {

    @MessageMapping("request-response")
    public Mono<Course> requestResponse(Course course) {
        log.info("Course: {}", course);
        return Mono.just(new Course("Your course: " + course.getCourseName()));
    }

    @MessageMapping("fire-and-forget")
    public Mono<Void> fireAndForget(Course course) {
        log.info("Course: {}", course);
        return Mono.empty();
    }

    @MessageMapping("request-stream")
    public Flux<Course> requestStream(final Course course) {
        log.info("Course: {}", course);
        return Flux
                .interval(Duration.ofSeconds(1))
                .map(index -> new Course("Your course name: " +
                         course.getCourseName() + ". Response #" + index))
                .log();
    }

    @MessageMapping("stream-stream")
    public Flux<Course> streamStream(final Flux<Course> courses) {
        return courses
                .map(course -> new Course("Your course name: " +
                        course.getCourseName() + ". Response #" + course.getCourseId()));
    }
}
