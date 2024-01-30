package com.umust.umustbe.image.exception;

import com.umust.umustbe.common.exception.BadRequestException;

public class UnsupportedImageFileTypeException extends BadRequestException {

    public UnsupportedImageFileTypeException() {
    }

    public UnsupportedImageFileTypeException(final String extension) {
        super(String.format("[%s]", extension));
    }

}