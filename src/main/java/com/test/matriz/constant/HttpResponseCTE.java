package com.test.matriz.constant;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum HttpResponseCTE {
    ROTATION_SUCCESS("00","La matriz se roto correctamente."),

    EMPTY_ARRAY("01", "La matriz enviada esta vacia."),
    NOT_NXN_MATRIX("02", "La matriz enviada no cumple el formato fijado [NxN]."),

    GENERIC_ERROR("100", "Ocurrio un error al procesar la peticion.")
    ;

    private String code;
    private String message;
}
