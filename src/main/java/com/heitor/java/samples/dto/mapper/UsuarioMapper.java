package com.heitor.java.samples.dto.mapper;

import com.heitor.java.samples.dto.OcupacaoDto;
import com.heitor.java.samples.dto.SetorDto;
import com.heitor.java.samples.dto.UsuarioDto;
import com.heitor.java.samples.entity.Ocupacao;
import com.heitor.java.samples.entity.Setor;
import com.heitor.java.samples.entity.Usuario;
import org.mapstruct.Context;
import org.mapstruct.Mapper;

@Mapper
public interface UsuarioMapper {

    UsuarioDto usuarioToUsuarioDto(Usuario usuario,  @Context CycleAvoidingMappingContext context);
    Usuario usuarioDtoToUsuario(UsuarioDto usuarioDto, @Context CycleAvoidingMappingContext context);

    SetorDto setorToSetorDto(Setor setor, @Context CycleAvoidingMappingContext context);

    Setor setorDtoToSetor(SetorDto setorDto, @Context CycleAvoidingMappingContext context);
    OcupacaoDto ocupacaoToOcupacaoDto (Ocupacao ocupacao, @Context CycleAvoidingMappingContext context);

    Ocupacao ocupacaoDtoToOcupacao (OcupacaoDto ocupacaoDto, @Context CycleAvoidingMappingContext context);
}
