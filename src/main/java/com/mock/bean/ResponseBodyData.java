package com.mock.bean;

import lombok.Setter;

/**
 * @author wjl
 */
@Setter
public class ResponseBodyData {
    @Setter
    private String ovulationDate;
    private String pregnantCode;
    private String name;
    private String birth;
    private String dignosticCode;

    @Override
    public String toString() {
        return "{" +
                "\"ovulationDate\": \"" + ovulationDate + "\"," +
                "\"pregnantCode\": \"" + pregnantCode + "\"," +
                "\"name\": \"" + name + "\"," +
                "\"birth\": \"" + birth + "\"," +
                "\"dignosticCode\": \"" + dignosticCode + "\"" +
                "}";

    }
}
