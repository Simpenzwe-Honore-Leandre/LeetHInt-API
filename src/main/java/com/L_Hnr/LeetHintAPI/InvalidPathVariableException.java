package com.L_Hnr.LeetHintAPI;

abstract class InvalidPathVariableException extends Exception{
}
class GetException extends InvalidPathVariableException{
    public String toString()
    {
        return "Invalid get Path variable provided!";
    }
}class DeleteException extends InvalidPathVariableException{
    public String toString()
    {
        return "Invalid delete Path variable provided!";
    }
}
