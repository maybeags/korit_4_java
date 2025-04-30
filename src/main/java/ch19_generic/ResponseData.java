package ch19_generic;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class ResponseData<T> {
    private String message;
//    private String data1;
//    private int data2;
//    private double data3;
    private T data;

    @Override
    public String toString() {
        return message + data;
    }
}
