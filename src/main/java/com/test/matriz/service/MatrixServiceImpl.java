package com.test.matriz.service;

import com.test.matriz.models.Details;
import com.test.matriz.util.Util;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Log4j2
public class MatrixServiceImpl implements MatrixService{

    @Override
    public Object rotate(List<List<Integer>> inputArrays) {
        Details responseError;

        try {
            Util.validateArray(inputArrays);
            return Util.rotateMatrix(inputArrays);
        } catch (Exception e) {
            responseError = Util.findByCode(e.getMessage());
            log.error("Error en el proceso de rotacion. [{}]", responseError.getMessage());
        }

        return responseError;
    }

}
