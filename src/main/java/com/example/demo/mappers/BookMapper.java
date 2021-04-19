package com.example.demo.mappers;

import com.example.demo.dto.BooksDTO;
import com.example.demo.models.Books;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface BookMapper {
    BookMapper INSTANCE = Mappers.getMapper( BookMapper.class );
    List<BooksDTO> toBookListDTO (List<Books> books);
}
