package com.senai.backend.atemis.Configs;

import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@Configuration
@OpenAPIDefinition(
info = @Info(
title = "Artemis-Two-School",
version = "1.0",
description = "Insira a descrição da sua API"
)
)
public class Swagger {
    
}
