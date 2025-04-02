package io.chrissalerno.demo.offer.infrastructure.mappers;

import org.mapstruct.MapperConfig;
import org.mapstruct.extensions.spring.SpringMapperConfig;

@MapperConfig(componentModel = "spring")
@SpringMapperConfig(
    conversionServiceAdapterPackage = "io.chrissalerno.demo.offer.infrastructure.mappers")
public interface MapperSpringConfig {}
