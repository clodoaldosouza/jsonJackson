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
@JsonPropertyOrder({ "squadName", "homeTown", "formed", "secretBase", "active", "member" })
@JsonIgnoreProperties(ignoreUnknown = true)
public class SuperHeroes {

    @JsonProperty("squadName")
    private String squadName;
    @JsonProperty("homeTown")
    private String homeTown;
    @JsonProperty("formed")
    private int formed;
    @JsonProperty("secretBase")
    private String secretBase;
    @JsonProperty("active")
    private boolean active;
    @JsonProperty("members")
    private List<Member> memberList;

}
