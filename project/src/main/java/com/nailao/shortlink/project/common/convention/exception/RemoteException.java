package com.nailao.shortlink.project.common.convention.exception;


import com.nailao.shortlink.project.common.convention.errorcode.IErrorCode;
import com.nailao.shortlink.project.common.convention.errorcode.BaseErrorCode;

/**
 * 远程服务调用异常
 * @author nailao
 */
public class RemoteException extends AbstractException {

    public RemoteException(String message) {
        this(message, null, BaseErrorCode.REMOTE_ERROR);
    }

    public RemoteException(String message, IErrorCode errorCode) {
        this(message, null, errorCode);
    }

    public RemoteException(String message, Throwable throwable, IErrorCode errorCode) {
        super(message, throwable, errorCode);
    }

    @Override
    public String toString() {
        return "RemoteException{" +
                "code='" + errorCode + "'," +
                "message='" + errorMessage + "'" +
                '}';
    }
}