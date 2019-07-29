package cn.edu.fudan.selab.edge.Utils;

import cn.edu.fudan.selab.edge.Enums.CallStatus;

public class CallResult {

    private CallStatus callStatus;

    private String ErrorMessage;

    public CallResult() {
        this.callStatus = CallStatus.SUCCESS;
        this.ErrorMessage = null;
    }

    public CallResult(String errorMessage) {
        this.callStatus = CallStatus.FAIL;
        this.ErrorMessage = errorMessage;
    }

    public CallStatus getCallStatus() {
        return callStatus;
    }

    public void setCallStatus(CallStatus callStatus) {
        this.callStatus = callStatus;
    }

    public String getErrorMessage() {
        return ErrorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        ErrorMessage = errorMessage;
    }
}
