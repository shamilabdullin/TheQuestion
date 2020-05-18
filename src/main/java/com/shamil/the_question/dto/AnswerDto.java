package com.shamil.the_question.dto;

import com.shamil.the_question.models.Answer;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class AnswerDto {
    private Long id;
    private Long userId;
    private String body;
    private String date;

    public static AnswerDto from(Answer answer) {
        return AnswerDto.builder()
                .id(answer.getId())
                .userId(answer.getUser().getId())
                .body(answer.getBody())
                .date(answer.getDate())
                .build();
    }

    public static List<AnswerDto> from(List<Answer> answers) {
        return answers.stream()
                .map(AnswerDto::from)
                .collect(Collectors.toList());
    }
}