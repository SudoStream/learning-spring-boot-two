package io.sudostream.learning.springboot.two.learningspringboot;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
@RequiredArgsConstructor
public class Image {

    @Id
    private final String id;
    private final String name;


}
