package com.arextest.config.model.application;

import com.arextest.config.model.enums.ApplicationServiceOperationType;

/**
 * @author jmo
 * @since 2021/12/21
 */
public interface OperationDescription {
    String getOperationName();

    /**
     * {@link  ApplicationServiceOperationType}
     *
     * @return a code value
     */
    int getOperationType();
}
