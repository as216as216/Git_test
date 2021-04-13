package com.example.demo.mappers;

import com.example.demo.dto.AuthorDTO;
import com.example.demo.models.Authors;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AuthorMapper {
   AuthorMapper INSTANCE = Mappers.getMapper( AuthorMapper.class );
    AuthorDTO toDTO(Authors author);
}
