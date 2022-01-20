package br.com.clodoaldo.souza.json.decoder.core.pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "name", "age", "secretIdentity", "secretBase", "powers" })
@JsonIgnoreProperties(ignoreUnknown = true)
public class Member {
    @JsonProperty("name")
    private String name;
    @JsonProperty("age")
    private int age;
    @JsonProperty("secretIdentity")
    private String secretIdentity;
    @JsonProperty("powers")
    private List<String> powerList;

}
