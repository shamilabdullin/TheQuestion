package com.shamil.the_question.dto;

import com.shamil.the_question.models.Question;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class QuestionDto {
    private Long id;
    private String body;
    private Long userId;


    public static QuestionDto from(Question question) {
        return QuestionDto.builder()
                .id(question.getId())
                .body(question.getBody())
                .userId(question.getUser().getId())
                .build();
    }

    public static List<QuestionDto> from(List<Question> question) {
        return question.stream()
                .map(QuestionDto::from)
                .collect(Collectors.toList());
    }
}