package io.mosip.certify.api.exception;

import io.mosip.certify.api.util.ErrorConstants;

/**
 * {@link DataProviderExchangeException} is thrown when the DataProvider
 *  plugin fails to return user data against a set of claims generated by
 *  an Authentication provider.
 */
public class DataProviderExchangeException extends Exception {
    private String errorCode;

    public DataProviderExchangeException() {
        super(ErrorConstants.VCI_DATAFETCH_FAILED);
        this.errorCode = ErrorConstants.VCI_DATAFETCH_FAILED;
    }

    public DataProviderExchangeException(String errorCode) {
        super(errorCode);
        this.errorCode = errorCode;
    }

    public DataProviderExchangeException(String errorCode, String errorMessage) {
        super(errorCode +  " -> " +  errorMessage);
        this.errorCode = errorCode;
    }

    public String getErrorCode() {
        return errorCode;
    }
}