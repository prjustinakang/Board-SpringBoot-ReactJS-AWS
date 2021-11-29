package com.example.back.comment.responseDto;


import com.example.back.comment.CommentDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
@AllArgsConstructor
public class CommentCreateResponseDto {
    private Long commentId;

    public static CommentCreateResponseDto of(CommentDto commentDto){
        return CommentCreateResponseDto.builder()
                .commentId(commentDto.getId())
                .build();
    }
}
